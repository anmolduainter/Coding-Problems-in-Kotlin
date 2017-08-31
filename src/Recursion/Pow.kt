package Recursion

import java.util.Scanner

object Pow {

    internal fun power(a: Int, b: Int): Int {
        if (b == 0) {
            return 1
        }
        var value = power(a, b / 2)
        value = value * value
        if (b and 1 > 0) {
            value = a * value
        }
        return value
    }

    @JvmStatic fun main(args: Array<String>) {

        val scan = Scanner(System.`in`)
        val a: Int
        val b: Int
        a = scan.nextInt()
        b = scan.nextInt()
        println(power(a, b))

    }


}
