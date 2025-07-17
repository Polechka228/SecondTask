package com.example.secondtask

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.android.material.textfield.TextInputEditText

class InputFragment : Fragment(R.layout.fragment_for_input) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val input = view.findViewById<TextInputEditText>(R.id.numberInput)
        val button = view.findViewById<Button>(R.id.btn)

        input.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {}

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                button.isEnabled = checkInput(input.text.toString())
            }
        })

        button.setOnClickListener {
            val num = input.text.toString().toInt()
            Models.generateList(num)
            findNavController().navigate(R.id.action_inputFragment_to_listFragment)
        }
    }

    private fun checkInput(str: String): Boolean {
        val n = str.toIntOrNull()
        return n != null && n in 1..11
    }
}
