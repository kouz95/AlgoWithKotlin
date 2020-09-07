package boj.level2

import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.Integer.parseInt

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val year = parseInt(br.readLine())
    print(if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) 1 else 0)
}