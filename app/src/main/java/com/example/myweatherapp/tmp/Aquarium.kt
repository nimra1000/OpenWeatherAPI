package com.example.myweatherapp.tmp

class Aquarium(var length: Int = 100, var width: Int = 20, var height: Int = 40) {
    // Dimensions in cm


    fun printSize() {
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm ")
    }
}