package com.example.balajip.kotlinapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(), Employees {
    override fun min(s: String, d: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun calculate() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun get() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //persons()
    }
open fun det(){

}

    interface exp {
        fun calculate()
        fun min(s:String, d: Int)
    }
}
