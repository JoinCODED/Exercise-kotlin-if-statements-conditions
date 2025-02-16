fun main() {

    //task1
    val num = 0

    if (num > 0) {
        println("The number $num is postive")
    } else if (num < 0) {

        println("The number $num is negative")
    } else
        println("The number is zero")

    val num2 = 9

    if (num2 % 2 == 0) {
        println("The number is even")
    } else {
        println("The number is odd")
    }

    val a = 6
    val b = 4
    val c = 5

    if (a>b &&  a>c ) {
        println("The largest number is $a")

    }else if (b > a && b > c) {
        println("The largest number is $b")
    }else
        println("The largest number is $c")

    val score = 65

    if (score >= 90 ||  score >= 100) {
        println("Grade: A")
    } else if (score >= 80 ||  score >= 89) {
        println("Grade: B")
    } else if (score >= 70 ||  score >= 79) {
        println("Grade: C")
    } else if (score >= 60 ||  score >= 69) {
        println("Grade: D")
    } else
        println("Grade: F")


    val year = 2

    if (year % 4 ==0 && (year % 100 != 0 || year % 400 == 0)) {
        println("$year leap year.")
    } else {
        println("$year not a leap year.")
    }
}


