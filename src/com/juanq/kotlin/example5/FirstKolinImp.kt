package com.juanq.kotlin.example5

/**
 * 接口test
 * Created by jq on 2017/5/24.
 */
class FirstKolinImp : FirstKotlinDelegate{
    override fun sayHello(str: String) {

        println(str)
    }

    override fun add(aa: Int, b: Int): Int {
        return aa+b;

    }

}