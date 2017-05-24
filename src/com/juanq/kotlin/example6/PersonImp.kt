package com.juanq.kotlin.example6

/**
 *
 *抽象类
 * Created by jq on 2017/5/24.
 */
class PersonImp(name:String,age:Int,override var addr: String, override val weight: Float) :Person(name,age ){
    override fun doSwim() {
        println("doSwim--------------")
    }

    fun doAll(){

        println(this.name+"--"+this.age+"--"+this.addr+"------"+this.weight)
    }


}
