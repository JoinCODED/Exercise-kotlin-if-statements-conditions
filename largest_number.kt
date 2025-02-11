fun main() {
    var a: Int = 44
    var b: Int = 55
    var c: Int = 66
    if (a > b && a > c) {
        println("The largest number is $a")
    } else if (b > a && b > c) {
        println("The largest number is $b")
    } else {
        println("The largest number is $c")
    }
}