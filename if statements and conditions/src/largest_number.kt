fun main() {

    var a: Int = 4
    var b: Int = 2
    var c: Int = 3

    if ( a >= b && a >= c ) {
        println("The largest number is $a")
    } else if ( b >= a && b >= c ) {
        println("The largest number is $b")
    } else {
        println("The largest number is $c")
    }

}