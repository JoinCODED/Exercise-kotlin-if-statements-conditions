fun main(){
val a = 4
val b = 444
val c = 4444
var largestNumber: Int

if ((a > b) && (a > c))
    largestNumber = a
    else if((b > a) && (b > c))
        largestNumber = b
    else
        largestNumber = c
println("The largest number is $largestNumber")


}