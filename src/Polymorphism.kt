fun main() {
   /* val dog1 = WachHund()
    dog1.bellen()

    var dog2 : Hund
    dog2 = dog1

    dog2.bellen()

    */

    val k1 = Kontakt("Benn","benn@gmail.com", alter=22)
    val k2 = KontaktDaten("Matthias", email = "matthias@gmail.com", alter = 23)

    println(k1.toString())
    println(k2.toString())
}
open class Hund() {
  open fun bellen() {
        println("Wuff Wuff")
    }
}
 class Kontakt(val name:String, val email:String, val alter: Int) {

}
data class KontaktDaten(val name:String, var email:String, var alter:Int) {

}

/*
class WachHund() : Hund() {
    override fun bellen() {
        println("Wuff Wuff Wuff")
    }


 */