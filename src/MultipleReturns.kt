fun main() {
    val listOfValues = mutableListOf<Int>(1, -5, 8, 5, 9)
    val minMax = minMaxValues(listOfValues)
   // println("Maximalwert: ${minMax.first}, maximalwert: ${minMax.second}")

    /*
    val average = averageValue(listOfValues)
    println("average value is: $average")

   val moreAverage =  listOfValues.average()
    println("Another way to do it: $moreAverage")
*/
    println("min: ${minMax[0]} max: ${minMax[1]}" +
    "avg: ${minMax[2]} sum: ${minMax[3]}")

}
fun minMaxValues(data : List<Int>) : Array<Int> {
    // we add the 0 index because when using min if there are no negative numbers in the list the number will always be 0. we want it to start with something.
    var min = data[0]
    var max = data[0]
    var average = 0
    var sum = 0

    for (item in data) {
        if(item < min)
            min = item
        if(item>max)
            max = item
        sum += 1
    }
    average = sum/data.size
    return arrayOf(min,max,average,sum)


}

/* fun minMaxValues(data : List<Int>) : Pair<Int, Int> {
    // we add the 0 index because when using min if there are no negative numbers in the list the number will always be 0. we want it to start with something.
    var min = data[0]
    var max = data[0]

    for (item in data) {
        if(item < min)
            min = item
        if(item>max)
            max = item
    }
    return Pair(min, max)


}

 */
/*

fun averageValue (numbers: List<Int>): Int {
    var sum = 0
    for (num in numbers) {
        sum += num
    }
    val average = sum / numbers.size
    return(average)
}

*/

