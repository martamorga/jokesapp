package mmo.jokesapp

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class JokesappApplication

fun main(args: Array<String>) {
    SpringApplication.run(JokesappApplication::class.java, *args)
}
