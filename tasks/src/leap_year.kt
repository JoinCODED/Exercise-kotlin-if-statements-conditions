fun main() {
    var year: Int = 2020;
    if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
        println("the year is a leap year");
    } else {
        println("the year is not a leap year");
    }
}