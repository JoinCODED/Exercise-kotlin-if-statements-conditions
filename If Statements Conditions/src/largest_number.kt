fun main() {
    var a = 10
    var b = 100
    var c = 1000
    if (a > c && a > b) {
            println("The largest number is $a")
        }  else if (b > a && b > c) {
            println("The largest number is $b")
    } else {
        println("The largest number is $c")
    }
}