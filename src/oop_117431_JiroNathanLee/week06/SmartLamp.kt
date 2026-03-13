package oop_117431_JiroNathanLee.week06

class SamrtLamp(override val id: String, override val name: String) : SmartDevice, Switchable {
    override fun turnOn() {
        println("Lampu $name dinyalakan.")
    }

    override fun turnOff() {
        println("Lampu $name dimatikan.")
    }
}