package Recursion


import java.util.Scanner

class Fibonacci {


    fun fibonacci(n: Int): Int {

        if (n == 0 || n == 1) {
            return n
        }

        return fibonacci(n - 1) + fibonacci(n - 2)
    }

    companion object {


        @JvmStatic fun main(args: Array<String>) {

            val n: Int
            val scan = Scanner(System.`in`)
            n = scan.nextInt()
            val fib = Fibonacci()
            println(fib.fibonacci(n))

        }
    }


}
