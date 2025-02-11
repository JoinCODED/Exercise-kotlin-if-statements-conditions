fun main() {
    var a = 11
    var b = 29
    var c = 4

    if (a > b && a > c)
    {
        println("The largest number is ${a}")

    }
    else if (b > a && b > c){
        println("The largest number is ${b}")
    }
    else if (c > a && c > b){
        println("The largest number is ${c}")

    }

}