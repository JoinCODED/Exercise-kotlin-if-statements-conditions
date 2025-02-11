fun main() {
    //### **Bonus Challenge: Leap Year Checker**
    //
    //📌 **Create a new file named** `leap_year.kt`
    //
    //**Task:**
    //
    //Write a program that checks if a given year is a leap year.
    //
    //**Steps:**
    //
    //1. Define an integer variable `year`.
    //2. Use an `if` statement to check if:
    //    - The year is divisible by 4 **and** (not divisible by 100 **or** divisible by 400).
    //    - If the condition is true, print `"Leap Year"`.
    //    - Otherwise, print `"Not a Leap Year"`.
    //
    //**Expected Output Examples:**


    var year = 1992
    if (score > 90) {
        println("Leap Year\n")

    } else if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
        println("Not a Leap Year\n")
    }
}