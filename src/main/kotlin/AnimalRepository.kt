class AnimalRepository constructor(private val appDataBaseMock: AppDataBaseMock) {
    fun getAll(): MutableList<Animal> {
        return appDataBaseMock.list
    }

    fun findById(id: Int): Animal? {
        return appDataBaseMock.list.find { it.id == id}
    }

    fun insert(animal: Animal): Unit{
        appDataBaseMock.list.add(animal)
    }

    fun delete(animal: Animal){
        appDataBaseMock.list.remove(animal)
    }

    fun update(animal: Animal){
        val animalF = findById(animal.id)
        if (animalF != null){
            val index = appDataBaseMock.list.indexOf(animalF)
            appDataBaseMock.list[index] = animal
        }
    }
}