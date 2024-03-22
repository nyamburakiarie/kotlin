import java.time.LocalDateTime
import java.util.Scanner
   fun main() {
      val current = LocalDateTime.now()
      println("Current Date and Time is: $current")

//      integertest()

      homework()

      inputfield()

      lcm()

   }

//   variables

//   val name:String = "Sylvia"

//   val cannot be reassigned
//
//   var age:Int = 30
//
//   age = 49
//
//   var am_good:Boolean = false
//   var mean:Double = 60.0
//   var subject:Char = 'b'
//
//
//
//
//   var name:String = "Sylvia"
//   val school:String = "Emobilis"
//   var year:Int = 2024
//   var course:String = "MIT"
//
//print("My name is " +      name  )
//   print(" and am currently taking the " + course)
//   print(" course at " + school)
//   println(" year " + year)
//
//   println("My name is $name and I am currently in $school taking the $course course in the year $year.")
//
//
//   operators()
//   if_statements()
//
//}
//fun operators(){
//
//   var physics = 70
//   var geography = 60
//   var sum = physics + geography
//   var remainder = physics%geography
//   var subtraction = physics - geography
//   var multiplication = physics * geography
//
//
//   println(physics + geography)
//   println("The sum of physics and geography is $sum.")
//   println(sum)
//   println(remainder)
//   println(subtraction)
//   println(multiplication)
//
//
//
//}
//
//fun if_statements(){
//
//   var mean = 17
//   var age = 3
//
//   if (mean > age){
//
//      println("mean > age")
//
//   }
//   else if (mean < age){
//      println("mean < maths")
//   }
//   else{
//      println("mean == age")
//   }
//
//   var number = -39
//
//   if (number > 0){
//      println("positive")
//   }
//
//   else if (number < 0){
//      println("negative")
//   }
//   else {
//      print("number == zero")
//   }
//
//
//   var math = readLine()!!.toInt()
//   var english =  readLine()!!.toInt()
//   var geography =  readLine()!!.toInt()
//   var cre =  readLine()!!.toInt()
//
//   var average = (math +english +geography + cre )/4
//
//   println(average)
//
////   mygradingsystem
//   0 - 34
//   35 - 40
//   41 - 50
//   51 - 60
//   61 - 70
//   71 - 80
//   81- 100
//
//
//    if (average < 0){
//       println("invalid")
//   }
//
//   else if (average > 100){
//      println("invalid")
//   }
//
//
//
//   else if (average > 80  ){
//      println("A")
//   }
//
//   else if (average > 70 ){
//      println("B")
//   }
//
//   else if (average > 60 ){
//      println("C")
//   }
//
//   else if (average > 50 ){
//      println("D")
//   }
//
//   else if (average > 40  ){
//      println("E")
//   }
//
//   else if (average > 0 ){
//      println("F")
//   }
//
//   else {
//      println("G")
//   }

//fun integertest(){

//

//   var int1 = 56
//   var int2 = 89
//   var int3 = 70
//
//   if (int1>int2 ){
//      println("$int1 is the greatest number")
//   }
//
//   else if (int2>int3 ){
//      println("$int2 is the greatest number")
//   }
//
//   else if (int3>int1 ){
//      println("$int3 is the greatest number")
//   }
//
//   else{
//      println("all three integers are equal")
//   }
//
//   var grade = 5
//   while (grade < 10){
//      println(grade)
//      grade++
//
//   }
//
//var text = 366
//   if (text<10){
//      println(" $text is a one-digit number ")
//   }
//   else if (text<100){
//      println("$text is a two-digit number")
//   }
//   else if (text<1000){
//      println("$text is a three-digit number")
//   }
//   else if (text<10000){
//      println("$text is a four-digit number")
//   }
//
//
//   var input = Scanner(System.`in`)
//   print("Enter mark scored: ")
//   var mark = input.nextInt()

//}

fun homework(){

   val int1 = readLine()!! .toInt()
   val int2 = readLine()!! .toInt()
   val int3 = readLine()!! .toInt()

   if (int1<int2){
      println("$int1 is the least number")
   }

   else if (int2<int3){
      println("$int2 is the least number")
   }

   else if (int3<int1){
      println("$int3 is the least number")
   }

   else {
      println("all three digits have the same value")
   }

}

fun inputfield(){
   print("what is your name?  ")
   var name = readLine()!!
   print("what is the name of your school?  ")
   var school = readLine()!!
   println("which year is it?  ")
   var year = readLine()!! .toInt()

   print("My name is $name and am currently taking the MIT course in $school in the year $year.")
}

fun lcm(){

}














































