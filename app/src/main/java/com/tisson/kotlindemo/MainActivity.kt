package com.tisson.kotlindemo

import android.graphics.Point
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.tisson.kotlindemo.annotion.HasTempFolder
import com.tisson.kotlindemo.bean.Color
import com.tisson.kotlindemo.strings.lastchar

import java.lang.Exception


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn = findViewById<Button>(R.id.btn)
        val list = arrayListOf("2", "pp","kkk","hehe")
        print(list.joinToString {""})
        val p = Point(10,2)
        val (x,y) = p
        btn.setOnClickListener {
            for (i in 0 until list.size) {
                val  c = "ppP".lastchar()
                btn.text = c.toString()
            }
        }
    }
}
@HasTempFolder(9)




fun getInfo(): String = "wtf?"

fun getMnemonic(color: Color): String {
    return when (color) {
        Color.RED -> "红色"
        Color.YELLOW -> "黄色"
        Color.WHITE -> "白色"
    }
}

fun mix(color_0: Color, color_1: Color) = when (setOf(color_0, color_1)) {
    setOf(Color.RED, Color.YELLOW) -> "红色"
    Color.YELLOW -> "黄色"
    Color.WHITE -> "白色"
    else -> throw Exception("Dirty Color")
}

fun fizzBuzz(): Int {
    var k = 0
    for (i in 1..100) {
        k = i
        Log.d("", "$i")
    }
    return k
}

