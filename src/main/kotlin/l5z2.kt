fun main() {

    var bankAccount1 = BankAccount()
    println(bankAccount1.id)
//    bankAccount1.showBalance()
//    bankAccount1.depositMoney(100.0)
//    bankAccount1.showBalance()
//    bankAccount1.withdrawMoney(50.75)
//    bankAccount1.showBalance()
//    println(bankAccount1.isPositive())
//    bankAccount1.withdrawMoney(200.0)
//    println(bankAccount1.isPositive())


    var bankAccount2 = BankAccount("1a", 3000.0)
    println(bankAccount2.id)
    bankAccount2.showBalance()
    bankAccount2.withdrawMoney(500.0)
    bankAccount2.showBalance()
    bankAccount2.depositMoney(300.0)
    bankAccount2.showBalance()


    var abc = bankAccount2.isPositive()
    println(abc)

    bankAccount2.withdrawMoney(5000.0)
    bankAccount2.showBalance()
    println(bankAccount2.isPositive())






//    bankAccount2.depositMoney(123.45)
//    println(bankAccount2.id)
//    println(bankAccount1.isPositive())
//    bankAccount2.depositMoney(35.20)



}
