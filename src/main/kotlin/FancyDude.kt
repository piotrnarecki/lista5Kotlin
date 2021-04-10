class FancyDude {  // dwa secondary constructor

    //pola
    var name: String = ""
    var age: Int = 0


    constructor(name: String, age: Int) {

        this.name = name
        this.age = age

    }

    constructor() {

        this.name = "Jeff"
        this.age = 25

    }


    //przykladowa metoda
    fun introduceMyself() {
        println("I'm $name and I'm $age old")
    }


}