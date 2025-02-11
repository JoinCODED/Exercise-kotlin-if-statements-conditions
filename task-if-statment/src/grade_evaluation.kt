fun main() {
    var grade: Int = 1

    if (grade >= 90) {
        println("Grade: A")

    } else if (grade < 90 && grade >= 80) {
        println("Grade: B")


    } else if (grade < 80 && grade >= 70) {

        println("Grade: C")

    } else if (grade < 70 && grade >= 60) {

        println("Grade: D")

    } else {
        println("Grade: F")
    }


}