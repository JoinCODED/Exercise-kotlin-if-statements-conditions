//**Task:**
//
//Write a program that assigns a letter grade based on a student's score.
//
//**Steps:**
//
//1. Define an integer variable `score`.
//2. Use an `if-else if-else` statement to determine the grade:
//- If `score` is 90 or above, print `"Grade: A"`.
//- If `score` is 80-89, print `"Grade: B"`.
//- If `score` is 70-79, print `"Grade: C"`.
//- If `score` is 60-69, print `"Grade: D"`.
//- Otherwise, print `"Grade: F"`.
//
//**Expected Output Example:**

fun main() {
 var score: Int = 89;

    if (score >= 90) {
        println("Grade: A");
    } else if (score >= 80 ) {
        println("Grade: B");
    } else if (score >= 70) {
        println("Grade: C");
    } else if (score >= 60) {
        println("Grade: D")
    } else {
        println("Grade: F");
    }
}