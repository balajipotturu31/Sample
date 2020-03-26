package com.example.balajip.kotlinapp

@FunctionalInterface
interface Employees {

//    List employeeSalaryDetails()
    fun calculate()
    fun min(s:String, d: Int)
    fun get()
    fun persons(){
        print("test")
    }
}