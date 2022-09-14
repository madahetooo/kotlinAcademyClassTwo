class KotlinDeveloper : Google(), Contract, NDA {
    override fun salary() {
        println("My salary is 10K USD per month")
    }
    override fun workingHours() {
        println("You have to work 8hrs per day")
    }
    override fun daysOff() {
        println("10 days off per year")
    }
    override fun benefits() {
        println("you can get 2K USD as a bonus every 4 months")
    }
    override fun term1() {
        println("you have 2 months notice period")
    }
    override fun term2() {
        println("we will let you know 1 month before letting you leave.")
    }
    override fun term3() {
        println("you have to pay 500 USD")
    }
    override fun term4() {
        println("i will not let anyone know anything about this project")
    }
    

}