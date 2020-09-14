package com.ihsanuslu.kotlinogrenme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("Merhaba Kotlin")
        //Degişkenler //

        var sayi1 = 10
        var sayi2 = 20

        var toplam = sayi1 + sayi2
        println(toplam)

        val x = 30
        val y = 30

        toplam = x + y
        println(toplam)
        
    }
}