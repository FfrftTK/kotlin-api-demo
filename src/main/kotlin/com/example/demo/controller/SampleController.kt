package com.example.demo.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/sampleApi")
class SampleController {
    @RequestMapping(value = ["/helloWorld", "/hellWorld"], method = [(RequestMethod.GET)])
    fun getHelloWorldMessage(): ResponseEntity<String> = ResponseEntity.ok("Hello World")

    @RequestMapping(value = ["/helloWorld/{name}"], method = [(RequestMethod.GET)])
    fun getHelloWorldMessageWithName(
        @PathVariable("name") name: String
    ): ResponseEntity<Any> =
        if(name != "Cris"){
            ResponseEntity.ok(
                HelloResponse(
                    message = "Hello $name",
                    name = name
                )
            )
        } else {
            ResponseEntity.badRequest().body("I am Cirs")
        }
}

data class HelloResponse(
    val message: String,
    val name: String
)