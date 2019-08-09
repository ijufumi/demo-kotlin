package micronaut.sample.controller

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import micronaut.sample.service.HelloService

@Controller("/hello")
class HelloController (val helloService: HelloService){

    @Get
    fun sayHello(): String {
        return helloService.greeting()
    }
}