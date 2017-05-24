package com.juanq.kotlin.example6

/**
 *
 *抽象类 ,
 *
 * Created by jq on 2017/5/24.
 */
class PersonImp3(name:String,age:Int) :Person(name,age ){

    constructor(_name:String,_age:Int,_addr:String):this(_name,_age){

       // this.weight = _weight;//这行行不通，说明抽象属性，只能在构造方法里面初始化，其他地方不能复制
        addr = _addr;
    }

    override val weight: Float = 100.toFloat()
        get() = field //To change initializer of created properties use File | Settings | File Templates.
    override var addr: String = ""
        get() =  field//To change initializer of created properties use File | Settings | File Templates.
        set(value) {field = value}
    override fun doSwim() {
        println("doSwim--------------")
    }

    fun doAll(){

        println(this.name+"--"+this.age+"--"+this.addr+"------"+this.weight)
    }
}


