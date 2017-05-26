package com.juanq.kotlin.example5

/**
 * Created by jq on 2017/5/24.
 */
fun main(args: Array<String>) {
    var ff:FirstKotlinDelegate = FirstKolinImp();
    var result = ff.add(12,4)
    println("结果；--$result")

    ff.sayHello("sssss--------")

    //匿名内部方式
    println("##################################")
    var real  = object : FirstKotlinDelegate{
        override fun add(aa: Int, b: Int): Int {
            return aa+b;
        }

        override fun sayHello(str: String) {
            println("匿名方式打印：$str")
        }
    }
    real.sayHello("sdfs")


}
