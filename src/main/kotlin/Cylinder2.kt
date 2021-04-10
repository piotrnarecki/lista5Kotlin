class Cylinder2(var height: Double, var radius: Double) {

    init {
        if (height > 0 && radius > 0) {
            this.height = height
            this.radius = radius
        } else {
            this.height = 1.0
            this.radius = 1.0
        }
    }

}