package oop_117431_JiroNathanLee.week08

class ApiParser {
    fun parseProduct(rawJson: Map<String, Any?>): Product? {
        val id = requireNotNull(rawJson["id"]) { "API Invalid: Missing ID" }
        val name = requireNotNull(rawJson["name"]) { "API Invalid: Missing NAME" }

        val type = rawJson["type"] as? String

        return when (type) {
            "ELECTRONIC" -> {
                val warranty = rawJson["warranty"] as? Int ?: 12
                Electronic(
                    id = id as String,
                    name = name as String,
                    warrantyMonths = warranty as Int
                )
            }
            "CLOTHING" -> {
                val size = rawJson["size"] as? String ?: "All Size"
                Clothing(
                    id = id as String,
                    name = name as String,
                    size = size as String
                )
            }
            else -> null
        }
    }
}