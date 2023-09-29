package com.sametersoyoglu.hiltkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    //  @AndroidEntryPoint başlangıç noktamızı belirtiyor.
    @Inject
    lateinit var kargo: Kargo
    @Inject
    lateinit var internet: Internet
    // hilt ile dagger ile çalışırken burda ki değişkenler private olmamalı.

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        kargo.gonder()

        internet.basvuruYap()

    }
}