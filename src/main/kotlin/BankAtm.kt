class BankAtm {
    var pinCode: Int = 0
    var balance:Float = 0f
    var selectedOperation:Int = 0
    var money:Float= 0f
    var selectedChoice:Int = 0
    fun enterYourCard() {
        println("Welcome to our bank")
        println("Please enter your PIN Code")
        pinCode = readLine()!!.toInt() // Saving the pinCode
        println("Please enter your balance")
        balance = readLine()!!.toFloat() // Saving the balance
        selectOperation()
    }
    fun selectOperation(){
        println("Please select your operation")
        println("1: For Deposit, 2: For Withdraw, 3: For Check Balance, 4: For Exit")
        selectedOperation =  readLine()!!.toInt()
        when(selectedOperation){
            1 -> deposit()
            2 -> withDraw()
            3 -> checkBalance()
            4 -> {
                println("Thanks for using our bank ATM")
                System.exit(0)
            }
        }
    }
    private fun checkBalance() {
        println("Your current balance is $balance")
        doYouNeedAnyThingElse()
    }
    private fun withDraw() {
        println("Please enter the amount you want to withdraw")
        money =readLine()!!.toFloat()
        if (money <=balance){
            balance -=money
            println("Withdraw done successfully")
            checkBalance()
        }else{
            println("Sorry you don't have enough money")
        }
        doYouNeedAnyThingElse()

    }
    private fun deposit() {
        println("Please enter the amount of money you want to deposit")
        money =readLine()!!.toFloat()
        balance += money
        println("Deposit Done successfully")
        checkBalance()
    }
    private fun doYouNeedAnyThingElse() {
        println("Do you need anything else ?!")
        println("1: Yes, 2: No")
        selectedChoice =  readLine()!!.toInt()
        when(selectedChoice){
            1 -> selectOperation()
            2 -> {
                println("Thanks for using our bank ATM")
                System.exit(0)
            }
        }
    }
}