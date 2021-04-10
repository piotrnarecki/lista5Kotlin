class SimpleDude(var name: String, var age: Int) {// klasa z primary constructor

    //init przypisuje wartosci ktore podal uzytkownik
    init {
        this.name = name
        this.age = age
    }

    //przykladowa metoda
    fun introduceMyself(){
        println("I'm $name and I'm $age old")
    }
}