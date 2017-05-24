package com.juanq.kotlin.example6

/**
 *
 * 抽象类,抽象方法
 * Created by jq on 2017/5/24.
 */
abstract class Person(var name : String, var age : Int) : Any() {

    abstract var addr : String
    abstract val weight : Float

    abstract fun doSwim()

    fun doFly() {
        println("doFly")
    }

    fun doEach() {
        println("doEach")
    }

}