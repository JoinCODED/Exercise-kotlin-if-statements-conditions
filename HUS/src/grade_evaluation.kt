fun main(){
    var score = 70

    //- If `score` is 90 or above, print `"Grade: A"`.
    //- If `score` is 80-89, print `"Grade: B"`.
    //- If `score` is 70-79, print `"Grade: C"`.
    //- If `score` is 60-69, print `"Grade: D"`.
    //- Otherwise, print `"Grade: F"`.


    if(score > 90){
        println("Grade: A\n")

    }else if(score > 80 && score < 89){
        println("Grade: B\n")

    }else if(score > 70 && score < 79){
        println("Grade: C\n")

    }else if(score > 60 && score < 69){
        println("Grade: D\n")
    }else{
        println("Grade: F\n")
    }

}
