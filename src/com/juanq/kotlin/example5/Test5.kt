package com.juanq.kotlin.example5

/**
 * Created by jq on 2017/5/24.
 */
fun main(args: Array<String>) {
    var ff:FirstKotlinDelegate = FirstKolinImp();
    var result = ff.add(12,4)
    println("结果；--$result")

    ff.sayHello("sssss--------")
}
