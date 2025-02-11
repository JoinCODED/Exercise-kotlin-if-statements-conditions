fun main() {
    var year: Int

    year = 50
    if (year % 4 > 0 && year % 100 != 0 && year % 400 != 0){
        println("Leap year")
    } else {
        println("Not a leap year")
    }
}