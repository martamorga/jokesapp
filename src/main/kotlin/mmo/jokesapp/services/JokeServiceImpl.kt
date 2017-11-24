package mmo.jokesapp.services

import guru.springframework.norris.chuck.ChuckNorrisQuotes
import org.springframework.stereotype.Service

@Service
class JokeServiceImpl : JokeService {

    private val chuckNorrisQuotes: ChuckNorrisQuotes

    init {
        this.chuckNorrisQuotes = ChuckNorrisQuotes()
    }

    override fun getJoke(): String {
        return chuckNorrisQuotes.randomQuote
    }
}