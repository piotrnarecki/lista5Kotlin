fun main() {

    var cylinder1 = Cylinder(2.0, 5.7)
    cylinder1.printDimensions()
    println("volume : ${cylinder1.calculateVolume()}")
    println("total surface : ${cylinder1.calculateTotalSurface()}")
    println("side surface : ${cylinder1.calculateSideSurface()}")
    println("base surface : ${cylinder1.calculateBaseSurface()}")


}