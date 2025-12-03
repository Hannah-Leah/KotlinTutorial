import java.lang.reflect.Field

class CompanionObject {
    var kontoNummer: Int = 0
        get() = field
        private set(value) {
            field = value
        }

    constructor() {
        anzahlKonten++
        kontoNummer = anzahlKonten
    }

    companion object {
        var anzahlKonten: Int = 0
        var currentSteuersatz: Double = 0.14

        fun ausgabeKontenAnzahl() {
            println("Anzahl der Konten: $anzahlKonten")
        }

    }
    fun test() {
        currentSteuersatz = 4.0
    }
    fun print() {
        println("Die Kontonummer $kontoNummer hat den Steuersatz $currentSteuersatz und es gibt $anzahlKonten Konten ")
}
}