package Collection

fun main(){
    /** filter  */
//    val numberList = listOf(1,2,3,4,5,6,7,8,9,10)
//    val evenList = numberList.filter{ it % 2 == 0}
    /** filternot */
//    val notEvenList = numberList.filterNot { it % 2 == 0 }

    /** map */
//    val numberList = listOf(1,2,3,4,5,6,7,8,9,10)
//    val multipliedBy5 = numberList.map { it * 5 }

    /** count */
//    val numberList = listOf(1,2,3,4,5)
//    println(numberList.count())
//    println(numberList.count{ it % 2 == 0})

    /** find(), firstOrNull(), lastOrNull */
    val numberList =  listOf(1,2,3,4,5)
    val firstOddNumber = numberList.find { it % 2 ==1}
    val firstOrNullNumber = numberList.firstOrNull { it % 2 == 3}

    println(firstOddNumber)
    println(firstOrNullNumber)

}