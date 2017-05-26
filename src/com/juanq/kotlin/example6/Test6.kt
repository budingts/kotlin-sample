package com.juanq.kotlin.example6

/**
 * 抽象继承
 * Created by jq on 2017/5/24.
 */

fun main(args: Array<String>) {
    var person:Person = PersonImp("xupy",20,"yy",6.toFloat());
    person.doSwim()

    println("第二波测试#################################################")
    var person2:PersonImp2 = PersonImp2("juanqiang",60);
    person2.addr ="二当家地址"
    person2.doAll()
    var tempAddr = person2.addr;
    println("单独打印addr：--$tempAddr")

    println("第三波测试#################################################")
    var person3:PersonImp3 = PersonImp3("juanqiang",60,"老三家在山西");
    person3.doAll()

    println("直接#################################################")

    var per :Person = object : Person("直接来的",20){
        override var addr: String
            get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
            set(value) {}
        override val weight: Float
            get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.

        override fun doSwim() {
            println("匿名内部类直接使用");
        }

    }
    per.doSwim()

}
