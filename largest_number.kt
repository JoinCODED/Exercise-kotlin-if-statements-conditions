fun main() {
    var a = 74
    var b = 4
    var c = 10
    var x: Int = 0

    if (a > b && a > c) {
        x = a
    } else if (b > a && b > c) {
       x = b
    } else if (c > a && c > b) {
        x = c
    }

    println("The largest number is $x")
}