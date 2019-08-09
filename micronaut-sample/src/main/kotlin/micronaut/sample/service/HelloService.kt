package micronaut.sample.service

import javax.inject.Singleton

@Singleton
class HelloService {
    fun greeting() : String {
        return "hello, world!"
    }
}