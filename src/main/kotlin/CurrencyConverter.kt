import kotlin.math.round

class CurrencyConverter {

    var PLNtoUSD = 0.0
    var EURtoPLN = 0.0


    constructor(){
        this.PLNtoUSD=0.26
        this.EURtoPLN=4.53
    }


    constructor(PLNtoUSD:Double,EURtoPLN:Double){
        this.PLNtoUSD=PLNtoUSD
        this.EURtoPLN=EURtoPLN
    }




    fun convertPLNtoUSD(currency: Double): Double {

        var convertedCurrency = (currency * PLNtoUSD).round(2)

        return convertedCurrency;
    }

    fun convertUSDtoPLN(currency: Double): Double {

        var convertedCurrency = (currency * 1 / PLNtoUSD).round(2)

        return convertedCurrency;
    }


    fun convertEURtoPLN(currency: Double): Double {

        var convertedCurrency = (currency * EURtoPLN).round(2)

        return convertedCurrency
    }


    fun convertPLNtoEUR(currency: Double): Double {

        var convertedCurrency = (currency * (1 / EURtoPLN)).round(2)

        return convertedCurrency;
    }


    fun convertEURtoUSD(currency: Double): Double {

        var convertedCurrency = convertPLNtoUSD(convertEURtoPLN(currency)).round(2)

        return convertedCurrency
    }


    fun convertUSDtoEUR(currency: Double): Double {

        var convertedCurrency = convertPLNtoEUR(convertUSDtoPLN(currency)).round(2)

        return convertedCurrency;
    }


    fun Double.round(decimals: Int): Double {
        var multiplier = 1.0
        repeat(decimals) { multiplier *= 10 }
        return round(this * multiplier) / multiplier
    }
}