package jp.ijufumi.kotlin.sample.micronaut

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("micronaut.sample")
                .mainClass(Application.javaClass)
                .start()
    }
}