fun main() {


    var coversion1 = CurrencyConverter()
    var currency = 100.0

    println("$currency EUR = ${coversion1.convertEURtoPLN(currency)} PLN")
    println("$currency PLN = ${coversion1.convertPLNtoEUR(currency)} EUR")

    println("$currency PLN = ${coversion1.convertPLNtoUSD(currency)} USD")
    println("$currency USD = ${coversion1.convertUSDtoPLN(currency)} PLN")

    println("$currency EUR = ${coversion1.convertEURtoUSD(currency)} USD")
    println("$currency USD = ${coversion1.convertUSDtoEUR(currency)} PLN")

    println()

    var coversion2 = CurrencyConverter(0.3, 4.4)

    println("$currency EUR = ${coversion2.convertEURtoPLN(currency)} PLN")
    println("$currency PLN = ${coversion2.convertPLNtoEUR(currency)} EUR")

    println("$currency PLN = ${coversion2.convertPLNtoUSD(currency)} USD")
    println("$currency USD = ${coversion2.convertUSDtoPLN(currency)} PLN")

    println("$currency EUR = ${coversion2.convertEURtoUSD(currency)} USD")
    println("$currency USD = ${coversion2.convertUSDtoEUR(currency)} EUR")


}