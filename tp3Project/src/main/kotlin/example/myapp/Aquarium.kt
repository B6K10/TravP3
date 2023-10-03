package example.myapp

class Aquarium(var width: Int = 20, var height: Int = 40, var length: Int =100) {
    var volume: Int
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
        println("Width: $width cm "+
                "Length: $length cm " +
                "Height: $height cm ")
        // affichage du volume
        println("Volume: $volume liters")
    }

}

