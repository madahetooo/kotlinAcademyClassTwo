class AndroidDeveloper : Google(), Contract, NDA {
    override fun salary() {
        println("you have 15K USD Per month")
    }
    override fun workingHours() {
        println("7 hrs per day")
    }
    override fun daysOff() {
        println("you have 21 days off per year")
    }
    override fun benefits() {
        println("you have 5K USD as a bonus every 6 months.")
    }
    override fun term1() {
        println("you have a 1 month notice period")
    }
    override fun term2() {
        println("we give you a 1 week as a notice period before telling you to leave")
    }
    override fun term3() {
        println("you have to pay 1K USD if you left without letting us know")
    }
    override fun term4() {
        println("I Confirm that i will not let anyone know anything")
    }
}