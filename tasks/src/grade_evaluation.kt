fun main(){
    val score = 50
    val grade = if ( score >= 90){
        "A"
    } else if (score >= 80){
        "B"
    } else if (score >= 70){
        "C"
    } else if (score >= 60){
        "D"
    } else {
        "F"
    }
    println("Grade: $grade")
}