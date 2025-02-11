fun main(){
    val a = 36
    val b = 60
    val c = 10
    val largest = if (a > b && a > c){
        a
    } else if (b > a && b > c){
        b
    } else {
        c
    }
    println("The largest number is $largest")
}