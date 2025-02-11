/*
Task:
Write a program that assigns a letter grade based on a student's score.
Steps:
Define an integer variable score.
Use an if-else if-else statement to determine the grade:
If score is 90 or above, print "Grade: A".
If score is 80-89, print "Grade: B".
If score is 70-79, print "Grade: C".
If score is 60-69, print "Grade: D".
Otherwise, print "Grade: F".
Expected Output Example:
*/
fun main(args: Array<String>) {

    var score=65;

    //postive
    var conditionA = score > 90;
    var conditionB = (score >= 80 || score <= 89);
    var conditionC = (score >= 70 || score <= 79);
    var conditionD = (score >= 60 || score <= 69);



    var message = "The largest number is";

    // .javaClass.kotlin

    if (conditionA){
        println("Grade: A" );
    }
    else if(conditionB) {
        println("Grade: B" );
    }
    else if(conditionC) {
        println("Grade: C" );
    }
    else if(conditionD) {
        println("Grade: D" );
    }
    else {
        println("Grade: F" );
        }
    }



