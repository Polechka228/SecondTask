package com.example.secondtask

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class ListFragment : Fragment(R.layout.fragment_list) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recycler = view.findViewById<RecyclerView>(R.id.list)
        val items = Models.getGeneratedList()

        val adapter = Adapters(
            items = items,
            glide = Glide.with(this),
            onItemClick = { pos ->
                val selectedItem = items[pos]
                val bundle = Bundle()
                bundle.putParcelable("item", selectedItem)
                findNavController().navigate(R.id.action_listFragment_to_detailFragment, bundle)
            },
            onImageClick = { pos ->
                val item = items[pos]
                item.changeImage()
                val holder = recycler.findViewHolderForAdapterPosition(pos) as? ViewHolder
                holder?.bindImage(item)
            }
        )

        recycler.adapter = adapter
        recycler.layoutManager = LinearLayoutManager(requireContext())
    }
}
