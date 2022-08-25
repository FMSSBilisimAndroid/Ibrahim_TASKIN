package com.example.homework2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        main()

    }
    /*fun main(){
        var mathResult = 1 + 1
        println(mathResult)
    }*/

    /*fun main(){
        var mathResult = 2.0 * 3.5
        println(mathResult)
    }*/

    /*fun main(){
        var mathResult = 2.times(3)
        println(mathResult)
    }*/

    /*fun main(){
        var mathResult = 2.plus(3)
        println(mathResult)
    }*/

    /*fun main(){
        var mathResult = 2.0.div(3)
        println(mathResult)
    }*/

    /*fun main(){
        var mathResult = 5.minus(3)
        println(mathResult)
    }*/

    /*fun main(){
        var mathResult:Int = 2
        var b:Byte = mathResult.toByte()
        var c: Int = b.toInt()
        var d:Double = c.toDouble()

        var e:Any = d.toDouble()
        e = d.toInt()

        println(b)
    }*/

    /*fun main(){
        val s1 = """
           |Patika
| Kotlin Bootcamp
                    | Fmss Bilişim
          
        """
        println(s1)
    }*/

    /*fun main(){
        val numberofdogs = 3
        val numberofcats = 2
        println("I have $numberofdogs dogs and $numberofcats cats.")
    }*/

    /*fun main(){
        val str = "Patika"
        println("${str.length}")
    }*/

    /*fun main(){
        val i = 1
        println("${i.plus(1)}")
    }*/

    /*fun main(){
        val guests = 30
        if (guests == 0){
            println("No guests")
        }
        else if (guests < 20) {
            println("Small group of people")
        }
        else {
            println("Large group of people!")
        }
    }*/

    /*fun main(){
        val numberOfStudent = 50
        if(numberOfStudent in 1..50){
            println(numberOfStudent)
        }
    }*/

/*    fun main(){
        val result = 50
        when (result){
            0 -> println("No results")
            in 1..39 -> println("Got results!")
            else -> println("That's a lot of results!")
        }

    }*/

/*   fun main(){
       val pets = arrayOf("dog","cat","bird")
       for(item in pets){
           println(item)
       }
   }*/

/*    fun main(){
        val pets = arrayOf("dog","cat","bird")
        for((index,item) in pets.withIndex()){
            println("item = $item, index = $index")
        }
    }*/

/*    fun main() {
        *//*for (i in 1..5) print("$i\n")*//*
        *//*for (i in 5 downTo 1) print("$i\n")*//*
        *//*for (i in 3..6 step 2) println(i)*//*
        for (i in 'a'..'d') println(i)
    }*/

/*    fun main(){
        var count = 0

        while(count < 20){
            count++
        }
        println(count)

        do{
            count--
        }while(count > 20)

        println("$count")
    }*/

/*    fun main(){
        repeat(3){
            println("patika")
        }
    }*/

/*    fun main(){
        val inst = listOf("trumpet","piano","violin")
        inst = inst2
        println(inst)
    }*/

 /*   fun main(){
        val inst = mutableListOf("trumpet","piano","violin")
        inst.set(0,"deneme")
        println(inst)
    }*/

/*    fun main(){
        val inst = mutableListOf("trumpet","piano","violin")
        inst.removeAt(0,)
        println(inst)
    }*/

/*    fun main(){
        val inst = arrayOf("trumpet","piano","violin")
        println(inst)
    }*/

 /*   fun main(){
        var inst:ArrayList<String> = ArrayList()
        inst = arrayListOf("trumpet","piano","violin")
        println(inst)
    }
*/
/*       fun main(){
        val inst:Array<String> = arrayOf("trumpet","piano","violin")
        println(inst)
    }*/

 /*   fun main(){
        val inst:Array<String> = arrayOf("trumpet","piano","violin")
        println(java.util.Arrays.toString(inst))
    }*/

/*    fun main() {
        var inst = arrayOf("trumpet",4,4.7)
        var arrayInt = intArrayOf(1,3,4)
        println(java.util.Arrays.toString(arrayInt))

    }*/

/*    fun main() {
        var inst = intArrayOf(3,4)
        var arrayInt = intArrayOf(1,2)
        println(java.util.Arrays.toString(inst+arrayInt))

    }*/

/*    fun main(){
        var inst:   Int? = null

        println(inst)
    }*/

/*    fun main(){
        var number:   Int? = 6
        number = number?.dec()

        println(number)
    }*/

/*    fun main(){
        var number:   Int? = 6
        var number2:   Int = 4
        number = number?.let(){
            number2 = number2.dec()
            it.dec()}

        println(number2)
    }*/

/*    fun main() {
        var text: String? = null

        println(text!!.length)
    }*/

/*    fun main () {
        var text: String? = null

        println( text ?: "Secondary Not-Null String")
    }*/

  /*  fun main() {
        var num: Int = 1

        println((num > 2) ?: "positive")
    }*/

}