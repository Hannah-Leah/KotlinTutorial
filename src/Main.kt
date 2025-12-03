//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var looping = true
    val countries: MutableList<String> = mutableListOf("germany", "japan", "austria", "Poland")

    while (looping == true) {


        println("1- add element 2-show list 3-remove element")
        val userInput = readLine()!!.toInt()

        if (userInput == 1) {

            println("give me a country name!")
            val countryName = readLine().toString()
            countries.add(countryName)

        } else if (userInput == 2) {
            for (country in countries) {
                println(country)
            }
        } else if (userInput == 3) {
            println(countries)
            println("give me the index!")
            val userInput = readLine()!!.toInt()
            countries.removeAt(userInput)
        }
    }
}

