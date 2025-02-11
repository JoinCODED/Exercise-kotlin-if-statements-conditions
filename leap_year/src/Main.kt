fun main() {
var year = 1996
if (year % 4 == 0 && (year %100 != 0 || year %400 != 0))
{
    println("Leap year")
}
    else {
        println("Not a Leap Year")
    }
}