import java.util.Scanner;
fun main(){

    /*
     * This is a block comment. Below is information about printing
     */

    /**
     * This is also a block comment.
     */
    println("-------------------------")
    println("Printing to the console in Kotlin:")
    println("printing to current line: \"print()\" ")
    println("Printing to new line: \"println()\"")
    println("-------------------------")

    /*
        Data Types:

        Boolean: True or False

        Char: 'A' , 'B' , 'C'

        String: "Hello World"

        Integer data types:
        - Byte: -127 to 128
        - Short: -32768 to 32767
        - Int: -2147483648 to 2147483647
        - Long: -9223372036854775807 to 9223372036854775807

        Floating-point:
        - Float: ~6 or 7 decimal places (Single precision)
        - Double: ~15 decimal places (Double precision)   (More Accurate then float, but takes up more memory)
     */


    /*
        Variables:
        val or var
        var: Variable that can change.
        val: Constant variable. Cannot be changed later.
     */
    println()
    println("-------------------------")
    println("Printing variables to the console:")

    // int
    var favoriteNumber = 10
    println(favoriteNumber)

    // updating favoriteNumber
    favoriteNumber = 11
    println(favoriteNumber)

    // updating favoriteNumber
    favoriteNumber = 12
    println(favoriteNumber)

    // int
    val permanentNumber = 2
    println(permanentNumber)

    // boolean
    var t : Boolean = true
    println(t)

    // byte
    val aByte : Byte = 22;
    println(aByte)

    // short
    val aShort : Short = 1000;
    println(aShort)

    // int
    val aInt : Int = -33
    println(aInt)

    // long
    val aLong : Long = 2345678244556
    println(aLong)

    // another way to declare a long val
    val bLong = 232423L;
    println(bLong)

    // char
    val firstCharOfName : Char = 'N'
    println(firstCharOfName)

    // string
    val fullName : String = "Nicholai"
    println(fullName)

    // float
    val aFloat : Float = 1.2345F
    println(aFloat)

    // double
    val aDouble : Double = 1.23456789
    println(aDouble)

    // E or e notation
    val scientificNotation = 3.1459E10
    println(scientificNotation)

    println("-------------------------")
    println()

    println("-------------------------")
    println("Input & Output Section:")

    val employeeId : Int = 19
    println("The employee ID is $employeeId.")

    var employeeAge : Int = 25
    println("The employee age is $employeeAge.")

    // use readLine() to get user input
    // returns a string
    // "!!" indicates that the value cannot be null
    print("Enter your name: ")
    val employeeName = readLine();
    println("Welcome to the company, $employeeName!")

    // Reading two numbers and outputting the sum
    print("Enter any number: ")
    var firstUserNumber = readLine()!!
    var firstNumericValue = firstUserNumber.toInt()

    print("Enter a second number: ")
    var secondUserNumber = readLine()!!
    var secondNumericValue = secondUserNumber.toInt()
    println("The sum of your two numbers is ${firstNumericValue + secondNumericValue}")


    // Using a Scanner Object to read input
    val s = Scanner(System.`in`)

    print("Enter your pets name: ")
    var petName = s.next()
    println("Your pets name is $petName.")

    print("Enter your pets age: ")
    var petAge = s.nextInt()
    println("Your pets age is $petAge.")

    println("-------------------------")
    println()

}