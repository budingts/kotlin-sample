package com.juanq.kotlin.example3

/**
 * Created by jq on 2017/5/23.
 */

fun main(args: Array<String>) {
    iftest()
    whentest()
    cases("juan")
    cases(100)
}

//if
fun iftest() {
    if (2 == 1) {
        println("sssss")
    }
    val b = 2;
    var a = if (b > 1) {
        2
    } else {
        3
    }
    println("此时打印a：$a")
}

//java 的switch  在这用when
fun whentest(){
    val a = 100;
    when(a){
        100 -> println("我是100")
        200 -> println("我是200")
    }
}
fun cases(obj: Any) {
    when (obj) {
        1       -> println("第一项")
        "hello" -> println("这个是字符串hello")
        is Long -> println("这是一个Long类型数据")
        !is String -> println("这不是String类型的数据")
        else    -> println("else类似于Java中的default")
    }
}