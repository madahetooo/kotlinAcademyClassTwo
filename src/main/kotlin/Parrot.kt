class Parrot : Bird() {
    override var color = "Orange"
    override fun fly(){
        super.fly() // Bird can Fly
        println("Parrot can fly") // parrot can fly
    }
    fun printColors(){
        println(color) //Orange
        println(super.color) // Yellow
    }
}