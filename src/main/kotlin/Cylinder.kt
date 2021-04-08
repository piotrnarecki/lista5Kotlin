import java.lang.Math.pow

class Cylinder {
    var height = 0.0
    var radius = 0.0

    constructor() {
        this.height = 0.0
        this.radius = 0.0
    }

    constructor(height: Double, radius: Double) {
        this.height = height
        this.radius = radius
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


}