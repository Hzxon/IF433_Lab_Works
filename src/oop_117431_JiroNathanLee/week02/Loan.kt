package oop_117431_JiroNathanLee.week02

import java.util.Scanner

class Loan (
    val bookTitle: String,
    var borrower: String,
    var loanDuration: Int = 1
) {
    fun calculateFine() = if (loanDuration > 3) (loanDuration - 3) * 2000 else 0
}

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- LIBRARY FINE SYSTEM ---")

    print("Masukkan Judul: ")
    val bookTitle = scanner.nextLine()

    print("Masukkan Peminjam: ")
    val borrower = scanner.nextLine()

    print("Masukkan Lama Pinjam (hari): ")
    var loanDuration = scanner.nextInt()

    scanner.nextLine()

    if (loanDuration < 0) loanDuration = 1;

    val obj1 = Loan(bookTitle, borrower, loanDuration)
    println("Book Title: $bookTitle \nBorrower: $borrower \nloanDuration: $loanDuration \nTotal Denda: ${obj1.calculateFine()}")

}