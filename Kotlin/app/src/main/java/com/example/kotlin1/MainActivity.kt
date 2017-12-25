package com.example.kotlin1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.jetbrains.anko.*

class MainActivity : AppCompatActivity() {
    lateinit var tv:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//        tv=findViewById<View>(R.id.tv) as TextView
//        tv.text="dasdsadd"
        verticalLayout{
            val textView=textView("我是一个textview"){
                textSize= sp(17).toFloat()
            }.lparams{
                margin=dip(10)
                height=dip(40)
                width= matchParent
            }
            val name=editText("EditText")
            button("Button"){
                onClick { toast("${name.text}") }
            }
        }
    }
}
