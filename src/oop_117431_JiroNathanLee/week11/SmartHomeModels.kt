package oop_117431_JiroNathanLee.week11

data class SmartDevice(var name: String, var category: String, var isOnline: Boolean = false, var powerLoad: Int = 0)

fun SmartDevice.diagnose(): String {
    return "[DiAGNOSTIK] $name | Kategori: $category | Status: ${if (isOnline) "Online" else "Offline"} | Daya: $powerLoad Watt"
}