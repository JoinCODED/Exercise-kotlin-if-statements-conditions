fun main(args: Array<String>) {

    var num =30;

    //postive
    var condition1 = num > 0;
    var condition2 = num < 0;

    var message1 = "The number is positive";
    var message2 = "The number is negative";
    var message3 = "The number is zero";
    // .javaClass.kotlin


    if (condition1){
        println("${message1}" );
    }
    else if(condition2) {
        println("${message2}" );
    }
    else {
        println("${message3}" );
    }


}