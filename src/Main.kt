fun main(){
    println("Enter your number")
    val number = readln().toInt()
    for (i in 1..10){
        val result = number * i
        println("$number * $i = $result")
    }
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
}