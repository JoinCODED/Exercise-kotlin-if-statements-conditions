fun main(){

    var years: Int = 2030

    if(years % 4 == 0 && years % 100 != 0 || years % 400 != 0){
        println("Leap year")
    }else{
        println("not a Leap year")
    }
}