package com.example.balajip.kotlinapp

class Sample : Test("Balaji",23) ,SampleInterface {

    override var names: String
        get() = super.names
        set(value) {}
    override fun details() : String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getDetails() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun MutableList<Int>.swep(index1: Int, index2: Int) {
        val tmp = this[index1] // 'this' corresponds to the list
        this[index1] = this[index2]
        this[index2] = tmp
    }

}