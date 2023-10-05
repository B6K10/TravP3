package example.myapp

fun buildAquarium() {
    // création de l'aquarium1 avec les valeurs (dimension) par défaut
    val aquarium1 = Aquarium()
    aquarium1.printSize()
    // création de l'aquarium2 avec largeur définit et le reste par défaut
    val aquarium2 = Aquarium(width = 25)
    aquarium2.printSize()
    // aquarium3 avec largeur par défaut
    val aquarium3 = Aquarium(height = 35, length = 110)
    aquarium3.printSize()
    // aquarium4 avec toutes les dimensions définies
    val aquarium4 = Aquarium(width = 25, height = 35, length = 110)
    aquarium4.printSize()

    val aquarium5 = Aquarium(numberOfFish = 29)
    aquarium5.printSize()
    aquarium5.volume = 70
    aquarium5.printSize()
    // code pour créer un Aquarium avec width = 25, length = 25et height = 40
    val aquarium6 = Aquarium(length = 25, width = 25, height = 40)
    aquarium6.printSize()
    //création un TowerTankd'un diamètre de 25 cm et d'une hauteur de 45 cm.
    val myTower = TowerTank(diameter = 25, height = 40)
    myTower.printSize()

}

fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()

    println("Shark: ${shark.color}")
    shark.eat()
    println("Plecostomus: ${pleco.color}")
    pleco.eat()
}

fun main(){
    buildAquarium()
    makeFish()
}