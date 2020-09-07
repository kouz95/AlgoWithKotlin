package boj.simulation

import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.Integer.parseInt
import java.util.*
import java.util.stream.Collectors.joining
import java.util.stream.Collectors.toList

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = br.readLine().split(" ");
    val numbers = input.stream()
        .map { s: String -> parseInt(s) }
        .collect(toList());

    while (!isFin(numbers)) {
        for (i in 0..3) {
            if (numbers[i] > numbers[i + 1]) {
                Collections.swap(numbers, i, i + 1);
                println(numbers.stream()
                    .map { number: Int -> number.toString() }
                    .collect(joining(" ")))
            }
        }
    }
}

fun isFin(numbers: List<Int>): Boolean {
    return numbers == listOf(1, 2, 3, 4, 5);
}
