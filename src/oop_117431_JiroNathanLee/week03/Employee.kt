package oop_117431_JiroNathanLee.week03

class Employee(val name: String) {
    var salary: Int = 0
        set(value) {
            if (value < 0) {
                println("Mencoba set gaji ke: $value")
                this.salary = value
            } else {
                field = value
            }
        }

    private var performanceRating: Int = 3

    fun increasePerformanceRating() {
        performanceRating++
        println("Kinerja $name meningkat! Rating: $performanceRating")
    }

    fun printStatus() {
        println("Karyawan: $name, Rating: $performanceRating")
    }
}