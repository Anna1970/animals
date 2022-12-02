open class Animal (
    open val id: Int,
    open val name: String,
    open val height: Int,
    open val weight: Double
)
{
    override fun toString(): String {
        return "Animal (id=$id, name='$name', height = $height, weight = $weight )"
    }
    open fun eat(){
        println("$name ест")
    }
    open fun moving(){
        println("$name передвигается")
    }
}