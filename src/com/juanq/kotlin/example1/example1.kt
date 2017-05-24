package com.juanq.kotlin.example1

/**
 *
 * 基本类型
 * Created by jq on 2017/5/23.
 */
fun main(args: Array<String>) {
    print("Viva chnys")
    test0()
}

//不支持隐氏,拓宽
fun test1() {

    //https://www.kotlincn.net/docs/reference/basic-types.html
    // 假想的代码，实际上并不能编译：
    val a: Int? = 1 // 一个装箱的 Int (java.lang.Integer)
    val b: Long? = a?.toLong()// 隐式转换产生一个装箱的 Long (java.lang.Long)
   // print(a === b) // 惊！这将打印 "false" 鉴于 Long 的 equals() 检测其他部分也是 Long

}

fun test0(){

    //注意数字装箱不必保留同一性:
    val a: Int = 10000
    print(a === a) // 输出“true”
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a
    println(boxedA === anotherBoxedA) // ！！！输出“false”！！！



    //另一方面，它保留了相等性:


  /*  val a: Int = 10000
    print(a == a) // 输出“true”
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a
    println(boxedA == anotherBoxedA) // 输出“true”

    */
}


