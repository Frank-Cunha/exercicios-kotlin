fun main() {
    val myFirstDice = Dice(6, "Blue")
    println("Your ${myFirstDice.color}, ${myFirstDice.numSides} sided dice rolled ${myFirstDice.roll()}!")
    
    val mySecondDice = Dice(20, "Black")
    println("Your ${mySecondDice.color}, ${mySecondDice.numSides} sided dice rolled ${mySecondDice.roll()}!")
}

class Dice(val numSides: Int, val color: String) {
    
    fun roll(): Int {
        return (1..numSides).random()
    }
}