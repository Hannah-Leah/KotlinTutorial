fun main() {
    CompanionObject.ausgabeKontenAnzahl()

    var konto1 = CompanionObject()
    var konto2 = CompanionObject()

    CompanionObject.ausgabeKontenAnzahl()
    konto1.print()
    konto2.print()

    konto1.test()
    konto2.test()

    konto1.print()
    konto2.print()
}