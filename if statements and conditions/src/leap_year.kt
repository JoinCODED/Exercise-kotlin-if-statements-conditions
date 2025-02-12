fun main() {

    var year: Int = 1990

    if (year % 4 == 0 && (year % 100 != 0 || year % 400 != 0)) {
        println("Leap Year")
    } else {
        println("No a Leap year")
    }

}