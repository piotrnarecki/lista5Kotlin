import java.lang.Math.pow

class Cylinder {

    var height = 0.0
    var radius = 0.0


    constructor(height: Double, radius: Double) {
        if (height > 0 && radius > 0) {
            this.height = height
            this.radius = radius
        }

    }

    constructor() {

        this.height = 1.0
        this.radius = 1.0

    }

    constructor(height: Double, radius: Double, conversion:Double) {
        if (height > 0 && radius > 0) {
            this.height = height*conversion
            this.radius = radius*conversion
        }

    }



    fun calculateVolume(): Double {
        var volume = calculateBaseSurface() * height
        return volume
    }

    fun calculateTotalSurface(): Double {
        var totalSurface = calculateSideSurface() + 2 * calculateBaseSurface()
        return totalSurface
    }

    fun calculateSideSurface(): Double {
        var sideSurface = 2 * Math.PI * radius * height
        return sideSurface
    }

    fun calculateBaseSurface(): Double {
        var baseSurface = Math.PI * pow(radius, 2.0)
        return baseSurface
    }

    fun printDimensions() {
        println("radius: $radius")
        println("height: $height")
    }
}
