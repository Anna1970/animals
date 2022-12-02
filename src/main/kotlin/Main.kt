fun main(args: Array<String>) {

    val appDataBaseMock = AppDataBaseMock()
    val repository = AnimalRepository(appDataBaseMock)

    repository.insert(Herbivores(0, "Лошадь", 100, 120.0,"Степь", "Гнедая"))
    repository.insert(Herbivores(1, "Корова", 150, 300.0, "Луг", "Пятнистая"))
    repository.insert(Carnivores(2,"Волк", 65, 50.0, "корова", "Ууу"))
    repository.insert(Carnivores(3,"Лиса", 45, 9.0, "заяц", "Тяф"))

    val list = repository.getAll()
    list.add(Herbivores(0, "Лошадь", 100, 120.0,"Степь", "Гнедая"))
    list.add(Herbivores(1, "Корова", 150, 300.0, "Луг", "Пятнистая"))
    list.add(Carnivores(2,"Волк", 65, 50.0, "корова", "Ууу"))
    list.add(Carnivores(3,"Лиса", 45, 9.0, "заяц", "Тяф"))

    list.forEach() {
        println(it.toString())
        if (it is Herbivores)
            with (it as Herbivores)
            {
               moving()
               whatColor()
            }
        else
            with (it as Carnivores)
            {
                makesSound()
                eat()
            }
    }
}