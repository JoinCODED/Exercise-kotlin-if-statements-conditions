fun main(){
    var year: Int = 2016
    if((year % 4 == 0) && (!(year % 100 == 0) || !(year % 400 == 0)))
        println("Leap year")
    else
        println("Not Leap year")


}