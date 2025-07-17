package com.example.secondtask

object Models {

    private var generatedList : List<ItemModel> = emptyList()

    fun getModelsList(): List<ItemModel> {
        return listOf(
            ItemModel(
                title = "Сфинкс",
                description = "Сфинксы - это порода лысых кошек, известных своим характерным внешним видом и дружелюбным нравом. Они среднего размера, с мускулистым, но изящным телом, большими ушами и морщинистой кожей. Несмотря на отсутствие шерсти, у них может быть тонкий пушок на теле, особенно на морде, ушах и лапах. ",
                imageUrls = listOf("https://i.pinimg.com/736x/15/06/c7/1506c79478ca5ecb083c9e719cc6b976.jpg",
                    "https://i.pinimg.com/1200x/53/80/74/5380743d83256b340c6ccb6043c0f5d0.jpg",
                    "https://i.pinimg.com/736x/01/2b/bb/012bbbb0855f3b3b6637e0c3927160bd.jpg",
                    "https://i.pinimg.com/1200x/0c/89/19/0c89192818689a443f4c0cdef180bdef.jpg",
                    "https://i.pinimg.com/736x/90/4f/91/904f919863e591867db1269c09d0dba1.jpg")
            ),
            ItemModel(
                title = "Британская кошка",
                description = "Британская короткошерстная кошка - порода, известная своим спокойным, уравновешенным характером и плюшевой шерстью. Они дружелюбны, но независимы, любят находиться рядом с хозяином, но не навязчивы. Британцы хорошо уживаются с детьми и другими животными, не склонны к излишней активности и хорошо подходят для жизни в квартире. ",
                imageUrls = listOf("https://i.pinimg.com/736x/fd/c2/a3/fdc2a38378473979ba6c7b7b3fc14f7b.jpg",
                    "https://i.pinimg.com/736x/25/c2/db/25c2db8b2f413cb625ebb0cc648c49c1.jpg",
                    "https://i.pinimg.com/736x/b3/2d/1c/b32d1ccfb0245cb9e280ac67a41ebd16.jpg",
                    "https://i.pinimg.com/736x/d2/3a/34/d23a345dfd26e1420df18f88b5f676fe.jpg",
                    "https://i.pinimg.com/1200x/1b/44/d3/1b44d3f14ad432fbcf68da5082da680a.jpg")
            ),
            ItemModel(
                title = "Метис",
                description = "Беспородные кошки, также известные как кошки без породы или домашние кошки, представляют собой разнообразную группу кошачьих, не относящихся к конкретной породе. Они часто являются результатом смешения кровей разных пород и обладают уникальным сочетанием характеристик. В целом, беспородные кошки славятся своей выносливостью, крепким здоровьем и приспособленностью к различным условиям. ",
                imageUrls = listOf("https://i.pinimg.com/736x/66/86/ae/6686ae04340f0125502a1fc08bf482da.jpg",
                    "https://i.pinimg.com/736x/48/be/f2/48bef24088378aa9e99b5ec3063420a7.jpg",
                    "https://i.pinimg.com/736x/83/00/f5/8300f5e432ad54e9dd11dd661d6feab3.jpg",)
            ),
            ItemModel(
                title = "Сиамская кошка",
                description = "Сиамские кошки - порода с ярко выраженным характером и уникальной внешностью. Они известны своей общительностью, привязанностью к хозяевам и громким голосом. Внешне отличаются клиновидной головой, голубыми глазами и окрасом колор-пойнт. ",
                imageUrls = listOf("https://i.pinimg.com/736x/fd/b2/5a/fdb25a739783932d326376b43c51e0fb.jpg",
                    "https://i.pinimg.com/1200x/de/e9/27/dee92706a59890371937a91868ebb11e.jpg",
                    "https://i.pinimg.com/1200x/2f/ba/20/2fba200eba172f2fe14d7a5fd6ecb99a.jpg",
                    "https://i.pinimg.com/1200x/4a/b6/7e/4ab67e6f8ae12548deee02b1c29e7b72.jpg",
                    "https://i.pinimg.com/736x/80/95/bf/8095bf3e84df6a17cf097115d4fde968.jpg")
            ),
            ItemModel(
                title = "Ориентал",
                description = "Ориентальная кошка - порода, известная своей общительностью, игривостью и привязанностью к хозяину. Они нуждаются во внимании и плохо переносят одиночество. Ориенталы умны, любопытны и активны, любят исследовать окружающее пространство и играть. Они также известны своей \"разговорчивостью\" и могут издавать различные звуки. ",
                imageUrls = listOf("https://i.pinimg.com/1200x/aa/ac/af/aaacaf766644c81c62d43c8ab21ada0f.jpg",
                    "https://i.pinimg.com/1200x/6b/e7/9f/6be79f00fd9c33a4e6f19f94e17fc2b3.jpg",
                    "https://i.pinimg.com/736x/19/b8/5c/19b85c6d1e16384d51f36a30ea4fb155.jpg",
                    "https://i.pinimg.com/736x/5f/79/25/5f79255bb2cef69e6ef6fece8cc30f1d.jpg",
                    "https://i.pinimg.com/1200x/c8/44/9f/c8449f82391857b17aa229dcf4530811.jpg",
                    "https://i.pinimg.com/1200x/4e/79/34/4e79341f385267c1699b76faed1b1315.jpg")
            ),
            ItemModel(
                title = "Бенгальские кошки",
                description = "Бенгальские кошки – это порода, выведенная путем скрещивания диких азиатских леопардовых кошек с домашними. Они отличаются своей яркой внешностью, напоминающей леопарда, и активным, игривым характером. Бенгалы очень умны, общительны и нуждаются во внимании хозяина, но при этом хорошо уживаются с другими животными и детьми. \n",
                imageUrls = listOf("https://i.pinimg.com/1200x/e7/e6/a8/e7e6a81bcf8c28d4d641f58190a5e5d0.jpg",
                    "https://i.pinimg.com/736x/22/f4/1f/22f41f9e9ebd0b2e33da1f2eca8b90d9.jpg",
                    "https://i.pinimg.com/736x/67/b4/e8/67b4e879b03faca501894ea0e25c42c2.jpg",
                    "https://i.pinimg.com/736x/cc/1a/46/cc1a468f6b2b84f7098fac5deb5c8981.jpg",
                    "https://i.pinimg.com/736x/83/22/57/83225703c4932e876ee2b53346d5a2b8.jpg")
            ),ItemModel(
                title = "Персидская кошка",
                description = "Персидская кошка - порода среднего размера, с массивной головой, короткими, сильными лапами и длинной, густой шерстью. Они известны своим спокойным, дружелюбным характером и любовью к комфорту, предпочитая размеренный образ жизни. ",
                imageUrls = listOf("https://i.pinimg.com/736x/fa/5f/7e/fa5f7ec251db32d9ad99a8409cade76e.jpg",
                    "https://i.pinimg.com/1200x/cb/21/a4/cb21a41ae05e58f4dd9c367b1a086ba6.jpg",
                    "https://i.pinimg.com/736x/b5/0d/50/b50d50aec58c52a364a4c14e9dfcd854.jpg")
            ),ItemModel(
                title = "Мейн-кун",
                description = "Мейн-кун – это порода крупных домашних кошек, известная своей внушительной внешностью, дружелюбным характером и игривостью. Они отличаются длинной, густой шерстью, кисточками на ушах и хвостом, напоминающим енота. Мейн-куны хорошо ладят с детьми и другими животными, а также поддаются обучению. \n",
                imageUrls = listOf("https://i.pinimg.com/736x/41/c7/43/41c7439ddc48727d030e4a1a02d9a088.jpg",
                    "https://i.pinimg.com/736x/5c/2b/07/5c2b072c8dc4e495f31797a1a218c473.jpg",
                    "https://i.pinimg.com/736x/ad/af/92/adaf92913783055d08485dcb9e176bc4.jpg",
                    "https://i.pinimg.com/736x/92/c3/5c/92c35c2502e8f99726fb41d70ab5fe88.jpg")
            ),ItemModel(
                title = "Рэгдолл ",
                description = "Рэгдолл - крупная порода кошек, известная своим спокойным, ласковым характером и \"тряпичным\" расслаблением в руках, за что и получили свое название (ragdoll - тряпичная кукла). Они дружелюбны, неконфликтны и хорошо ладят с детьми и другими животными. Шерсть рэгдоллов полудлинная, мягкая и шелковистая, с характерным окрасом колор-пойнта или биколор. \n",
                imageUrls = listOf("https://i.pinimg.com/1200x/cc/46/50/cc4650dda16cc1d71d2e84e1ccd00498.jpg",
                    "https://i.pinimg.com/736x/aa/fe/b3/aafeb38bfc74f52023da69c28b1eaa26.jpg",
                    "https://i.pinimg.com/736x/cf/6a/9b/cf6a9b4f5affbcafa7709cdac3145319.jpg",
                    "https://i.pinimg.com/736x/b4/c0/6f/b4c06fa4e8e42ccfef1893d3626a9ca8.jpg")
            ),ItemModel(
                title = "Шотландская вислоухая кошка",
                description = "Шотландская вислоухая кошка (Скоттиш-фолд) - порода, известная своим необычным внешним видом, обусловленным генетической мутацией, вызывающей складку ушей. Они отличаются спокойным, дружелюбным характером и хорошо адаптируются к разным условиям. \n",
                imageUrls = listOf("https://i.pinimg.com/1200x/81/79/59/8179599517593a665213b6f94d722063.jpg",
                    "https://i.pinimg.com/1200x/9f/75/bb/9f75bb36be3e90d9d11092748fbbad85.jpg")
            ),ItemModel(
                title = "ИИ-котики",
                description = "ИИ-Котики — это не игра. Это цифровая эпилепсия с усами. Каждый кот — это: 8-битный шаман на нейро-меховой базе, Сверхразум в коробке из-под обуви, Лапкой пишет хэши на блокчейн тишины. Геймплей? Да ты гонишь. Это геймтрип!",
                imageUrls = listOf("https://i.pinimg.com/736x/ca/70/41/ca704170ab8f68b3a63101869921421d.jpg",
                    "https://i.pinimg.com/736x/74/84/4a/74844a92bf8bcd1be3743ea2c0cc734c.jpg",
                    "https://i.pinimg.com/736x/40/d7/6d/40d76db091d8cab4aa93e121c67cba5f.jpg",
                    "https://i.pinimg.com/736x/f1/71/2e/f1712ea094e72de1165f05db0e010cce.jpg",
                    "https://i.pinimg.com/736x/04/2c/1b/042c1b6a0b05ff8ab3a6fed36334978c.jpg",
                    "https://i.pinimg.com/1200x/c6/d7/75/c6d775483da6baa66d08137ac45e4413.jpg",
                    "https://i.pinimg.com/736x/05/8d/14/058d143748751973bcde980651c78b39.jpg")
            )
        )
    }

    fun generateList(number: Int) {
        generatedList = getModelsList().shuffled().take(number)
    }

    fun getGeneratedList() : List<ItemModel> {
        return generatedList
    }

}