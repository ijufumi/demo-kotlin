package jp.ijufumi.kotlin.sample.micronaut.controller

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import jp.ijufumi.kotlin.sample.micronaut.service.HelloService

@Controller("/hello")
class HelloController (val helloService: HelloService){

    @Get
    fun sayHello(): String {
        return helloService.greeting()
    }
}