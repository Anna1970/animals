class Herbivores(
    override val id: Int,
    override val name: String,
    override val height: Int,
    override val weight: Double,
    val areal: String,
    val color: String,
):Animal(id, name, height, weight)
{
    override fun toString(): String {
        return "herbivore (id=$id, name='$name', height = $height, weight = $weight, areal = $areal, color = $color )"
    }

    override fun moving() {
        println("$name передвигается в пределах $areal")
    }
    fun whatColor(){
        println("$name имеет окрас $color")
    }
}