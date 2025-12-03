class Auto(val autoMarke : String) {
    public var autoFarbe = "Default"
    public var motorGestartet = false
    public var kennzeichen = "Default"
    public var fahrzeugAufbau = "Default"
    public var Eigengewicht = -1
        get() = field
        set(value) {
            if (value > 0)
                field = value
            else {
                field = 1
                println("The weight should not be 0!")
            }
        }
    public var testingGetSet = 23
        get() = field;
        set(value) {
            if (value > 0)
                field = value
            else {
                field = 1
                println("The value of $value is not allowed because it should be bigger than 0")
            }
        }

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