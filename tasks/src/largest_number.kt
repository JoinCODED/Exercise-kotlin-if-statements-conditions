fun main() {
    var a: Int = 7;
    var b: Int = 6;
    var c: Int = 5;

    if(a > b && a > c) {
        println("The largest number is $a");
    }
    else if(b > a && b > c) {
        println("The largest number is $b");
    }
    else {
        println("The largest number is $c");
    }
}