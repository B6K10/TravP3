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

}

fun main(){
    buildAquarium()
}