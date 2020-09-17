fun toFindTheComission (
    previousSummOfPay: Double,
    currentSummOfPay: Double,
    userTypeOfCount: typeOfCount): Double {

    var minComission = 3500.00     // 35 руб.
    var summOfComission = 0.0
    when (userTypeOfCount) {
        typeOfCount.VK_PAY -> summOfComission = 0.0
        typeOfCount.MAESTRO -> {
            if (previousSummOfPay <= 7500000) { //75 т.р.
                summOfComission = 0.0
            } else {
                summOfComission = 0.06 * currentSummOfPay + 2000
            }
        }
        typeOfCount.MASTERCARD -> {
            if (previousSummOfPay <= 7500000) { //75 т.р.
                summOfComission = 0.0
            } else {
                summOfComission = 0.06 * currentSummOfPay + 2000
            }
        }
        typeOfCount.VISA -> {
            summOfComission = currentSummOfPay * 0.075
            if (currentSummOfPay < minComission / summOfComission) {
                summOfComission = 3500.00
            } else {
                summOfComission = currentSummOfPay * 0.075
            }
        }
        typeOfCount.MIR -> {
            summOfComission = currentSummOfPay * 0.075
            if (currentSummOfPay < minComission / summOfComission) {
                summOfComission = 3500.00
            } else {
                summOfComission = currentSummOfPay * 0.075
            }
        }
    }
    return summOfComission
}

