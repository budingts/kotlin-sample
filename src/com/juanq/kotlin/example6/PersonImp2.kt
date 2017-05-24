package com.juanq.kotlin.example6

/**
 *
 *抽象类 ,
 *
 * Created by jq on 2017/5/24.
 */
class PersonImp2(name:String,age:Int) :Person(name,age ){

    override val weight: Float
        get() = 6.toFloat()  //To change initializer of created properties use File | Settings | File Templates.
    override var addr: String = ""
        get() = field//To change initializer of created properties use File | Settings | File Templates.
        set(value) {
            println("xxxx")
            field = value
        }
    override fun doSwim() {
        println("doSwim--------------")
    }

    fun doAll(){

        println(this.name+"--"+this.age+"--"+this.addr+"------"+this.weight)
    }
}


