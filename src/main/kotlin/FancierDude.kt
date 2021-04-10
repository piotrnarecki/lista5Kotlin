class FancierDude(var name: String, var age: Int) { // pola w primary consructor

    //pole dodatkowe
    var favMovie = ""

    init {
        this.name = name
        this.age = age
    }

    //secondary constructor
    constructor(name: String, age: Int, favMovieInput: String) : this(name, age) {

        this.name = name
        this.age = age
        favMovie = favMovieInput

    }

    //przykladowa metoda
    fun introduceMyself() {

        if (favMovie != "") {
            println("I'm $name and I'm $age old. My favourite movie is $favMovie")
        } else {
            println("I'm $name and I'm $age old.")
        }


    }


}