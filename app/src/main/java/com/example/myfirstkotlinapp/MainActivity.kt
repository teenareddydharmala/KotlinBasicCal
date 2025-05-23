package com.example.myfirstkotlinapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() , View.OnClickListener {

    lateinit var btnadd: Button
    lateinit var btnsub: Button
    lateinit var btnmul: Button
    lateinit var btndiv: Button
    lateinit var eta: EditText
    lateinit var etb: EditText
    lateinit var resulttv: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        btnadd=findViewById(R.id.btn_add)
        btnsub=findViewById(R.id.btn_sub)
        btnmul=findViewById(R.id.btn_mul)
        btndiv=findViewById(R.id.btn_div)
        eta=findViewById(R.id.et_a)
        etb=findViewById(R.id.et_b)
        resulttv=findViewById(R.id.result_t)

        btnadd.setOnClickListener(this)
        btnsub.setOnClickListener(this)
        btnmul.setOnClickListener(this)
        btndiv.setOnClickListener(this)


        }

    override fun onClick(v: View?) {
        var a = eta.text.toString().toDouble()
        var b = etb.text.toString().toDouble()
        var result = 0.0
       when(v?.id) {
           R.id.btn_add -> {
               result = a+b
           }
           R.id.btn_sub -> {
               result = a-b
           }
           R.id.btn_mul -> {
               result = a*b
           }
           R.id.btn_div -> {
               result = a/b
           }

       }
        resulttv.text = "Result is" +result
    }
}
