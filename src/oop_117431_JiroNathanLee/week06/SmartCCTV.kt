package oop_117431_JiroNathanLee.week06

class SmartCCTV(override val id: String, override val name: String) : SmartDevice, Switchable, Recordable {
    override fun turnOn() {
        println("CCTV $name menyala.")
        startRecord()
    }

    override fun turnOff() {
        println("CCTV $name dimatikan.")
        stopRecord()
    }

    override fun startRecord() {
        println("CCTV $name mulai merekam video.")
    }
}