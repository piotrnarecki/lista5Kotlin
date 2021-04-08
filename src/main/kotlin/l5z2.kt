fun main() {

    var bankAccount1 = BankAccount()
    println(bankAccount1.id)
    bankAccount1.showBalance()
    bankAccount1.depositMoney(100.0)
    bankAccount1.showBalance()
    bankAccount1.withdrawMoney(50.75)
    bankAccount1.showBalance()
    println(bankAccount1.isPositive())
    bankAccount1.withdrawMoney(200.0)
    println(bankAccount1.isPositive())


    var bankAccount2 = BankAccount("1a", 90.0)
    bankAccount2.depositMoney(123.45)
    println(bankAccount2.id)
    println(bankAccount1.isPositive())
    bankAccount2.depositMoney(35.20)



}
