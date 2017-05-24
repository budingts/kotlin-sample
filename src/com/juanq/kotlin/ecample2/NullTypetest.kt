package com.juanq.kotlin.ecample2

/**
 * 空类型判断
 * Created by jq on 2017/5/23.
 */
fun main(args: Array<String>) {

    nullableTest()

    println("------------------")
    println(orInt("20"))
    println(orInt(""))
    println("------------------")
    println(onlyInt("20"))
    println(onlyInt(""))

    println("------------------")

    println(th(null))
}

fun nullableTest() {
    //在变量类型后面加上问号，代表该变量是可空变量
    var name: String? = "zhangsan"
    name = null //可以将null赋值给name变量
    var newName :String = name + "000"

    println(newName)

    var person: String = "tom"  //不带问号，说明不可空
    //person = null  //这句代码会报错，不可以将null赋值给一个不可空变量
}

//可以返回空，或者整行
fun orInt(s: String): Int? {
    if(s == null || s == "")
        return null;
    return Integer.parseInt(s);
}

//可以返回空，或者整行
fun onlyInt(s: String): Int {
    if(s == null || s == "")
        return 0;
    return Integer.parseInt(s);
}
//叹号 对于可空对象，进行操作的时候，要进行
fun th(aa:Int?):Float{
    return aa !!.toFloat(); //aa 是可空变量，饮用的时候必须双引号
}