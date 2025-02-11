fun main() {
    var score: Int
score = 59

    if (score >= 90 ){
        println("Grade: A")
    } else if (score < 90 && score > 79){
        println("Grade: B")

    } else if (score < 80 && score > 69){
        println("Grade: C")

    } else if (score < 70 && score > 59){
        println("Grade: D")

    } else {
        println("Grade: F")
    }
}