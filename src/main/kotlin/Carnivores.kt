class Carnivores(override val id: Int,
                 override val name: String,
                 override val height: Int,
                 override val weight: Double,
                 val food: String,
                 val sound: String
) : Animal(id, name, height, weight)
{
    override fun toString(): String {
        return "Carnivore (id=$id, name='$name', height = $height, weight = $weight, food = $food, sound = $sound )"
    }

    override fun eat() {
        println("$name ест $food")
    }
    fun makesSound(){
        println("$name издает звук $sound")
    }
}