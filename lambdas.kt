val isEven: (Int) -> Boolean = { it % 2 == 0 }
fun containsEven(collection: Collection<Int>): Boolean = collection.any(isEven)

fun main(args: Array<String>) {
  val isEven: (Int) -> Boolean = {it % 2 == 0 }
  val zeroToTen = 0..10
  val odds = listOf( 1,3,5,7,9 )

  val tryMap = zeroToTen.map(isEven)
  
  val tryAny = odds.any(isEven)

  println(tryAny)
}
