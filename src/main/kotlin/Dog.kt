class Dog : Animal() {
    override var color:String = "White"
    fun printColor(){
        println(super.color) // WHite
    }
}