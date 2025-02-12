fun main() {
    val a = 1
    val b = 5
    val c = 10

    val largest: Int

    if (a >= b && a >= c) {
        largest = a
    } else if (b >= a && b >= c) {
        largest = b
    } else {
        largest = c
    }

    println("The largest number is $largest")
}