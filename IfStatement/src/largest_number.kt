fun main() {
    var a:Int = 5
    var b:Int = 10
    var c:Int = 8
    if ( a > b && a > c ){
        println("The largest number is $a")
    } else if ( b > a && b > c ){
        println("The largest number is $b")
    } else if ( c > a && c > b ){
        println("The largest number is $c")
    }
}
