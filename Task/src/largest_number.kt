fun main() {
    var a: Int = 4;
    var b: Int = 4;
    var c: Int = 4;

    if (a > b && a > c) {
        println("The largest number is $a");
    } else if (b > a && b > c) {
        println("The largest number is $b");
    } else if (c > a && c > b) {
        println("The largest number is $c");
    } else {
        println("All Equal: $a");
    }

}