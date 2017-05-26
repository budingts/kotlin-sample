package com.juanq.kotlin.example7

/**
 *  继承
 * Created by jq on 2017/5/25.
 */
open class User{

    open fun study(){
        println("user-study")
    }
    //没有被open修饰的，子类无法重写
    fun noopen(){

    }
}

interface Reading{
    fun study(){
        println("Reading-study")

    }
}
interface Reading2{
    fun study()

}


//能被继承的类，必须abstract 或者open 修饰
//能被冲重写，覆盖的方法，也都必须abstract 或者open 修饰
class Student:User(),Reading{
    override fun study(){ //遇到接口和父类都相同的情况
        super<User>.study()
        super<Reading>.study() //与上者至少二选其一

        println("asdfadsfasd")
    }

}
class Student2:Reading{
    //此处不必重写，因为接口中有实现

}
class Student3:Reading2{
    override fun study() {//此方法必须重写，因为接口只是生命，没有实现
        println(" Student3---study")
    }

}

fun main(args: Array<String>) {
    var s = Student();
    s.noopen()
    s.study()

    println("#################################")

    var s2 = Student2();
    s2.study()

    println("#################################")

    var s3 = Student3();
    s3.study()
}