import java.util.*

class BankAccount {
    var id: String = ""
    var balance: Double = 0.0

    constructor() {
        this.id = getUniqueId()
        this.balance = 0.0
    }

    constructor(id: String, balance: Double) {
        this.id = id
        this.balance = balance
    }



    fun withdrawMoney(amount: Double) {
        balance = balance - amount

    }

    fun depositMoney(amount: Double) {
        balance = balance + amount

    }

    fun showBalance() {
        println( "balance: $balance PLN")
    }

    fun isPositive(): Boolean {
        if (balance > 0) {
            return true
        } else {
            return false
        }
    }

    private fun getUniqueId(): String {
        var id = UUID.randomUUID().toString()
        return id
    }

}