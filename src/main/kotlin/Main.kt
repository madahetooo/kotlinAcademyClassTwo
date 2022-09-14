fun main() {

    var juniorKotlinDeveloper = KotlinDeveloper()
    juniorKotlinDeveloper.salary()
    juniorKotlinDeveloper.daysOff()
    juniorKotlinDeveloper.workingHours()
    juniorKotlinDeveloper.benefits()



    var seniorAndroidDeveloper = AndroidDeveloper()
    seniorAndroidDeveloper.salary()
    seniorAndroidDeveloper.workingHours()
    seniorAndroidDeveloper.daysOff()
    seniorAndroidDeveloper.benefits()

}











//
//var name: String? = "Eslam"
//if (name != null) {
//    println(name.length)
//}




//
//try {
//    val data = 20 / 2
//    println(data)
//}
//catch (exception : ArithmeticException){
//    println("You cannot divide by zero")
//}
//finally {
//    println("This finally block will always executed")
//}

//
//// Calling the sum function
//var result = sum(5,6)
//println(result)
//}
//fun sum(number1:Int, number2:Int) : Int{
//    return  number1 + number2
//}


//
//var names = arrayOf("Eslam","Ayman","Yazan","Rofaida","Fateen","Nesma","Atieh","Mahmoud","Yassin")
//
//for (listOfNames in names){
//    println(listOfNames)
//}


//    var name = "Eslam Medhat"
//    println("Eslam Medhat")
//    println("Eslam \n Medhat")
//    println("Eslam \t Medhat") // Eslam      Medhat
//    println("Eslam \bMedhat") // EslamMedhat
//    println("Eslam \r Medhat") // Medhat
//    println("Eslam \" Medhat") // Eslam " Medhat
//    println("Eslam \' Medhat") // Eslam ' Medhat
//    println("Eslam \\ Medhat") // Eslam \ Medhat
//    var number2:Byte =23
//    var number1:Short =1034
//    var number3:Int =1042343334
//    number3.toLong()
//    var number4:Long =10234
//    var number5:Float =101042343.3f
//    var number6:Double =102342342523445.424
//    val value1 = 'A'
//    val isValidated :Boolean = false
//    val numbers = arrayOf(10,20,30,40,50)
//    for (number in numbers){
//        println(number)
//    }


//
//var x = 5
//var y = 6
//var z = 7
//
//if (x > y && x > z){
//    println("X is the greatest number")
//}

//
//println("What is your name")
//var name = readLine()
//println("Welcome $name")


//
//
//var x = 20
//var y = 20
//if (x > y){
//    println("X is greater than y")
//}
//else if(x < y){
//    println("X is smaller than y")
//}
//else{
//    println("X is equal to y")
//}

//
//var x = 5
//var y =6
//if (x>y) println("x is greater than y") else println("x is smaller")
//


//var x = 5
//var y = 4
//var z = 2
//if(x>y){
//    if (x > z){
//        println("X is the largest number")
//    }
//    println("x is larger than y but not with z")
//}


//
//var season = 9
//when(season){
//    12,1,2 ->{
//        println("Winter")
//    }
//    3,4,5 -> {
//        println("noraml")
//    }
//    6,7 ->{
//        println("Autumn")
//    }
//    8,9,10,11 ->{
//        println("summer")
//    }
//}


//println("Welcome to calculator application")
//println("Please enter first number")
//var firstNumber = readLine()!!.toFloat()
//
//println("Please enter second number")
//var secondNumber = readLine()!!.toFloat()
//
//println("Please choose operator")
//println("1: + , 2: -, 3: *, 4: /")
//var operator = readLine()!!.toInt()
//when(operator){
//    1 -> println(firstNumber + secondNumber)
//    2 -> println(firstNumber - secondNumber)
//    3 -> println(firstNumber * secondNumber)
//    4 -> println(firstNumber / secondNumber)
//}