package example.myapp

import java.lang.Math.PI

open class Aquarium(open var width: Int = 20, open var height: Int = 40, open var length: Int =100) {
    open val shape = "rectangle"
    open var water: Double = 0.0
        get() = volume * 0.9
    open var volume: Int
        get() = width * height * length / 1000
        set(value) {
            height = (value * 1000) / (width * length)
        }  // 1000 cm^3 pour 1 litre
    constructor(numberOfFish: Int) : this() {
        // 2,000 cm^3 par poisson + epaces sup pour que l'eau ne se renverse pas
        val tank = numberOfFish * 2000 * 1.1
        // calcule de la hauteur nécessaire
        height = (tank / (length * width)).toInt()
    }
    init {
        println("initialisation de l'aquarium")
    }

    fun printSize(){
        println(shape)
        println("Width: $width cm "+
                "Length: $length cm " +
                "Height: $height cm ")
        // affichage du volume
        println("Volume: $volume liters,  Water : $water liters (${water / volume * 100.0}% full)\")")
    }

}

class TowerTank (override var height: Int, var diameter: Int): Aquarium(height = height, width = diameter, length = diameter) {
    override val shape = "cylinder"
    override var water = volume * 0.8
    override var volume: Int
        // ellipse area = π * r1 * r2
        get() = (width/2 * length/2 * height / 1000 * PI).toInt()
        set(value) {
            height = ((value * 1000 / PI) / (width/2 * length/2)).toInt()
        }
}