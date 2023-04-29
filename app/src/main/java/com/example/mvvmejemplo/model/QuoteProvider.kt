package com.example.mvvmejemplo.model

class QuoteProvider {
    companion object {

        fun random(): QuoteModel {
            val position = (0..10).random()
            return quotes[position]
        }

        private val quotes = listOf(
            QuoteModel(
                quote = "Este es un ejemplo de MVVM, DA CLICK!",
                author = "Santos Ronaldo Lemus Torres"
            ),
            QuoteModel(
                quote = "“LANISTER” – GOT",
                author = "Santos Ronaldo Lemus Torres"
            ),
            QuoteModel(
                quote = "ZzzZz",
                author = "Santos Ronaldo Lemus Torres"
            ),
            QuoteModel(
                quote = "1+1=2",
                author = "Santos Ronaldo Lemus Torres"
            ),
            QuoteModel(
                quote = "UDB",
                author = "Santos Ronaldo Lemus Torres"
            ),
            QuoteModel(
                quote = "LOREM IPSUM",
                author = "Santos Ronaldo Lemus Torres"
            ),
            QuoteModel(
                quote = "No se que mas poner",
                author = "Santos Ronaldo Lemus Torres"
            ),
            QuoteModel(quote = "Los datos son aleatorios", author = "Santos Ronaldo Lemus Torres"),
            QuoteModel(quote = "PA PO PE POO PARAPARA PA POPEPO POPEPO POPEPO", author = "Santos Ronaldo Lemus Torres"),
            QuoteModel(
                quote = "Ya es noche no se que mas poner",
                author = "Santos Ronaldo Lemus Torres"
            ),
            QuoteModel(quote = "Carnet: LT191211, DSM", author = "Santos Ronaldo Lemus Torres")
        )
    }
}