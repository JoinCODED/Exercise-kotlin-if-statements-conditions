fun main()
{
    var year:Int = 1998

    //The year is divisible by 4 and (not divisible by 100 or divisible by 400).
    if((year % 4 == 0 && year != 0) || (year % 400 == 0))
    {
        println("Leap Year")

    }
    else
    {
        println("Not a Leap Year")

    }

}