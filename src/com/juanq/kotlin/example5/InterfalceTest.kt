package com.juanq.kotlin.example5

/**
 * Created by jq on 2017/5/25.
 */
object InterfalceTest {


    @JvmStatic fun main(args: Array<String>) {
        val callBack = object : CallBack {
            override fun sayHello() {

            }
        }
    }

}

internal interface CallBack {
    fun sayHello()
}
