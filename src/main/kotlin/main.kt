fun main() {
    var userTypeOfCount = typeOfCount.VK_PAY
    var previousSummOfPay = 0.0
    var currentSummOfPay = 56000.0             //560 руб.

    // Test 1
    if (isLimit(previousSummOfPay, currentSummOfPay, userTypeOfCount) == true) {
        println("Сумма платежа " + currentSummOfPay / 100 + " руб.")
        println("сумма оплат за предыдущий период " + previousSummOfPay / 100 + " руб.")
        println("тип карты $userTypeOfCount")
        println("Превышен лимит для $userTypeOfCount")
        println()
    } else {
        println("Сумма платежа " + currentSummOfPay / 100 + " руб.")
        println("сумма оплат за предыдущий период " + previousSummOfPay / 100 + " руб.")
        println("тип карты $userTypeOfCount")
        println("Сумма комиссии " + toFindTheComission(previousSummOfPay, currentSummOfPay, userTypeOfCount) / 100 + " руб.")
        println()
        }
    // Test 2
    userTypeOfCount = typeOfCount.MIR
    previousSummOfPay = 0.0
    currentSummOfPay = 56000.0             //560 руб.
    if (isLimit(previousSummOfPay, currentSummOfPay, userTypeOfCount) == true) {
        println("Сумма платежа " + currentSummOfPay / 100 + " руб.")
        println("сумма оплат за предыдущий период " + previousSummOfPay / 100 + " руб.")
        println("тип карты $userTypeOfCount")
        println("Превышен лимит для $userTypeOfCount")
        println()
    } else {
        println("Сумма платежа " + currentSummOfPay / 100 + " руб.")
        println("сумма оплат за предыдущий период " + previousSummOfPay / 100 + " руб.")
        println("тип карты $userTypeOfCount")
        println("Сумма комиссии " + toFindTheComission(previousSummOfPay, currentSummOfPay, userTypeOfCount) / 100 + " руб.")
        println()
    }
    // Test 3
    userTypeOfCount = typeOfCount.MASTERCARD
    previousSummOfPay = 500000000.0
    currentSummOfPay = 56000.0             //560 руб.
    if (isLimit(previousSummOfPay, currentSummOfPay, userTypeOfCount) == true) {
        println("Сумма платежа " + currentSummOfPay / 100 + " руб.")
        println("сумма оплат за предыдущий период " + previousSummOfPay / 100 + " руб.")
        println("тип карты $userTypeOfCount")
        println("Превышен лимит для $userTypeOfCount")
        println()
    } else {
        println("Сумма платежа " + currentSummOfPay / 100 + " руб.")
        println("сумма оплат за предыдущий период " + previousSummOfPay / 100 + " руб.")
        println("тип карты $userTypeOfCount")
        println("Сумма комиссии " + toFindTheComission(previousSummOfPay, currentSummOfPay, userTypeOfCount) / 100 + " руб.")
        println()
    }
    // Test 4
    userTypeOfCount = typeOfCount.MASTERCARD
    previousSummOfPay = 7800000.0
    currentSummOfPay = 7800000.0             //78 000 руб.
    if (isLimit(previousSummOfPay, currentSummOfPay, userTypeOfCount) == true) {
        println("Сумма платежа " + currentSummOfPay / 100 + " руб.")
        println("сумма оплат за предыдущий период " + previousSummOfPay / 100 + " руб.")
        println("тип карты $userTypeOfCount")
        println("Превышен лимит для $userTypeOfCount")
        println()
    } else {
        println("Сумма платежа " + currentSummOfPay / 100 + " руб.")
        println("сумма оплат за предыдущий период " + previousSummOfPay / 100 + " руб.")
        println("тип карты $userTypeOfCount")
        println("Сумма комиссии " + toFindTheComission(previousSummOfPay, currentSummOfPay, userTypeOfCount) / 100 + " руб.")
        println()
    }
}