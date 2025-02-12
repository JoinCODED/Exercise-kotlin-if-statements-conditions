fun main (){
    val a = 10
    val b = 2
    val c = 300

    if(a > b && a > c){
        println("a is the biggest numer with a value of $a")
    }else if(b > a && b > c){
        println("b is the biggest numer with a value of $b")
    }else if(c > b && c > a){
        println("c is the biggest numer with a value of $c")
    }
}