//grade_evaluation
fun main() {
    var score = 69

    if (score >= 90){
        println("Grade: A")
    }
    else if (89 >= score && score >= 80){
        println("Grade: B")
    }
    else if (79 >= score && score >= 70){
        println("Grade: C")
    }
    else if (69 >= score && score >= 60){
        println("Grade: D")
    }
    else {
        println("Grade: F")
    }
}