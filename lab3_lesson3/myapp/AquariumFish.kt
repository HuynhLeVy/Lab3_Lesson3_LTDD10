package com.example.lab3_lesson3.myapp

/*
abstract class AquariumFish {
    abstract val color: String
    class Shark: AquariumFish(), FishAction {
        override val color = "grey"
        override fun eat() {
            println("hunt and eat fish")
        }
    }

    class Plecostomus: AquariumFish(), FishAction {
        override val color = "gold"
        override fun eat() {
            println("eat algae")
        }
    }

    interface FishAction  {
        fun eat()
    }

}*/
interface FishAction {
    fun eat()
}

interface FishColor {
    val color: String
}
class Plecostomus(fishColor: FishColor = GoldColor): FishAction , FishColor by fishColor {
    // override val color = "gold"
    override fun eat() {
        println("eat algae")
    }

}

class Shark: FishAction, FishColor {
    override val color = "grey"
    override fun eat() {
        println("hunt and eat fish")
    }
}




object GoldColor : FishColor {
    override val color = "gold"
}