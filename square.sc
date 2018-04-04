def square(x: Int) = x * x

square(2)

case class Dog(name: String, breed: String)
val d1 = Dog("Scooby", "Doberman")
val x = d1.toString()

case class Dog(var name: String, breed: String) // you can rename a dog, but change its breed? nah!
val d1 = Dog("Scooby", "Doberman")
d1.name = "Scooby Doo"
val y = d1.name


val doubleEvens: PartialFunction[Int, Int] = {
  case x if (x % 2) == 0 ⇒ x * 2
}
val tripleOdds: PartialFunction[Int, Int] = {
  case x if (x % 2) != 0 ⇒ x * 3
}

val whatToDo = doubleEvens orElse tripleOdds //Here we chain the partial functions together