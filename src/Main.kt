fun main(){
//Multiplication table
    println("Enter your number")
    val number = readln().toInt()
    for (i in 1..10){
        val result = number * i
        println("$number * $i = $result")
    }

//Some of Natural Number
    println("Enter your numbber: ")
    var n = readln().toInt()
    var sum = 0
    for (i in 1..n){
        sum += i
    }
    println("Sum = $sum ")

//Factorial Number
    println("Enter your factorial Number:")
    var num = readln().toInt()
    var summ = 1
    for (i in 1..5){
        summ *= i
    }
    println("sum = $summ")

//Reverse Number with builtin method or without builtin method
//Builtin Method:
    var mainNum = 54321
    var newNum = mainNum.toString().reversed().toInt()
    println("New Num = $newNum")

//Without builtin method

    var nummm = 54321
    var reveerse = 0

    while (nummm != 0) {
        val digit = nummm % 10

        reveerse = reveerse * 10 + digit

        nummm /= 10
    }
    println("Reverse Number: $reveerse")
}

