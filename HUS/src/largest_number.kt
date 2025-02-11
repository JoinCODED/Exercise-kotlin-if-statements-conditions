fun main(){
    var a = 5
    var b = 2
    var c = 6

    if((a > b) && (a > c)){
        var X = a
    }else if((b > a) && (b > c)) {
        var X = b
    }else if((c > a) && (c > b)) {
        var X = c
    }
        println("The largest number is $X")
    }
