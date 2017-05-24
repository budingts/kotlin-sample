package com.juanq.kotlin.databean

/**
 * Created by jq on 2017/5/23.
 */
fun main(args: Array<String>) {
    var person :Person? = Person(name = "aa",age = 23);
    println(person)

    person!!.name = "sdf";
    println(person)
    person.sex = "sss";

    println(person)
    println(person.sex+"--"+person.name+"---"+person.age)
}