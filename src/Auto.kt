class Auto(val autoMarke : String) {
    public var autoFarbe = "Default"
    public var motorGestartet = false
    public var kennzeichen = "Default"
    public var fahrzeugAufbau = "Default"
    public var Eigengewicht = -1
    public val internalPassCode = 12345


    fun druckeZulassung() {
        println("Automarke: $autoMarke \n" +
        "Autofarbe: $autoFarbe \n +" +
                "$motorGestartet \n +" +
                "$kennzeichen \n +" +
                "$fahrzeugAufbau \n +" +
                "$Eigengewicht \n +" +
                "$internalPassCode \n +" +
                "---------------\n")
    }
    fun motorStartenStoppen() {
        if (motorGestartet != true) {
          motorGestartet = true;

        }
        else {
            motorGestartet = false
        }
    }

    fun tuerenOeffnen(passCode : Int) {
        if (passCode == internalPassCode) {
            println("you are in!")
        }
        else {
            println("you cannot get in!")
        }
    }
}