package oop_117431_JiroNathanLee.week05

fun main() {
    val dosen1 = Dosen("Pak Alex", "0123456")
    val admin1 = Admin("Bu Siti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKITIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        pegawai.bekerja()

        when (pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }

            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.bekerja()
            }
        }
        println("--------------------------")
    }

    val m1 = MathHelper()
    println("With sisi: ${m1.hitungLuas(10)} ")
    println("With panjang * Lebar: ${m1.hitungLuas(10 * 8)} ")
    println("With jari2: ${m1.hitungLuas(10.4)} ")

    println("==============================")

    val EW1 = EWallet("Jiro", 50_000.0)
    val CC1 = CreditCard("Jiro", 100_000.0)

    val paymentMethods: List<PaymentMethod> = listOf(EW1, CC1)
    val paymentAmount = 75_000.0

    for (method in paymentMethods) {
        method.processPayment(paymentAmount)

        if (method is EWallet) {
            println("EWallet, saldo kurang. Auto Top-UP...")
            method.topUp(50_000.0)

            println("Mencoba kembali proses pembayaran...")
            method.processPayment(paymentAmount)
        }
        println()
    }
}