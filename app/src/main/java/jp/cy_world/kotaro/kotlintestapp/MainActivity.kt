package jp.cy_world.kotaro.kotlintestapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val label: TextView = findViewById(R.id.textView) as TextView

        label.text = "kotlin楽しい"

        // 動的に型付けるよ
        var helloWorld = "aaaaa"
        var switch = 1;
        var teisu = 1

        Log.v("helloWold",helloWorld)

        // ${}で文字列に変数を挿入できるんです！
        Log.v("hello","挿入 ${helloWorld}")

        Log.v("teisu = ",  teisu.toString())

        teisu = 2

        Log.v("teisu = ", teisu.toString())
        // for range
        for(a in 1..10){
                println(a)
        }

        // when(javaでいうswitch)
        when(switch) {
            0 -> println("aaa")
            1 -> println("bbb")
            2 -> println("ccc")
        }


    }
}
