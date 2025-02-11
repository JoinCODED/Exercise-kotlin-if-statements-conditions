fun main() {


    var year: Int = 2001


    if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
        println("leap year ")
    } else {
        println("not leap year ")
    }


}