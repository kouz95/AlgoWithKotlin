package boj.level1

import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.Double.parseDouble
import java.util.*

fun main() {
    val bufferedReader = BufferedReader(InputStreamReader(System.`in`))
    val input = bufferedReader.readLine()
    val tokens = StringTokenizer(input, " ");
    val a = parseDouble(tokens.nextToken());
    val b = parseDouble(tokens.nextToken());

    print(a / b);
}