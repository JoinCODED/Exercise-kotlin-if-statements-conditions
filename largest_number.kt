fun main(args: Array<String>) {

    var a = 30;
    var b = 50;
    var c = 10;

    //postive
    var condition1 = a > b;
    var condition2 = b > c;

    var message = "The largest number is";

    // .javaClass.kotlin

    if (condition1 && condition2){
        println("$message $a" );
    }
    else if(!condition1 && condition2) {
        println("$message $b" );
    }
    else {
        println("$message $c" );
    }


}