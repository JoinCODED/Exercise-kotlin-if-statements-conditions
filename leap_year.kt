fun main(){
    var year = 2020
    if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
        println("Leap year")
    }
    else{
        println("Not a Leap Year")
    }
}