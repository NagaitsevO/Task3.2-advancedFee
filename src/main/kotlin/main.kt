fun main() {
    val fee = 56000              //560 руб.
    val comission = 0.075       //0.75%
    val minComission = 3500     //35 руб.

    val sumOfComission: Double
    if (fee < minComission / comission) {
        sumOfComission = 3500.00
    } else {
        sumOfComission = fee * 0.075
    }

    println("Сумма комиссии $sumOfComission")
}