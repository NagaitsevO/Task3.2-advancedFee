fun isLimit (
    previousSummOfPay: Double,
    currentSummOfPay: Double,
    userTypeOfCount: typeOfCount): Boolean {

    var isLimit: Boolean = false
    if (((userTypeOfCount == typeOfCount.VK_PAY) && (previousSummOfPay >= 4000000)) ||  // 40 т.р.
        ((userTypeOfCount == typeOfCount.VK_PAY) && (currentSummOfPay >= 1500000))) {   // 15 т.р.
        isLimit = true
    }
    if (((userTypeOfCount == typeOfCount.MAESTRO) ||
                (userTypeOfCount == typeOfCount.VISA) ||
                (userTypeOfCount == typeOfCount.MASTERCARD) ||
                (userTypeOfCount == typeOfCount.MIR)) &&
        (previousSummOfPay >= 60000000))    // 600 т.р.
    {
        isLimit = true
    }
    if (((userTypeOfCount == typeOfCount.MAESTRO) ||
                (userTypeOfCount == typeOfCount.VISA) ||
                (userTypeOfCount == typeOfCount.MASTERCARD) ||
                (userTypeOfCount == typeOfCount.MIR)) &&
        (currentSummOfPay >= 15000000))    // 150 т.р.
    {
        isLimit = true
    }
    return isLimit
}
