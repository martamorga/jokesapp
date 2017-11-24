package mmo.jokesapp.controllers

import mmo.jokesapp.services.JokeService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class JokeController {

    @Autowired
    private lateinit var jokeService: JokeService

    @RequestMapping("/", "")
    fun showJoke(model: Model): String {
        model.addAttribute("joke", jokeService.getJoke())
        return "chucknorris"
    }
}