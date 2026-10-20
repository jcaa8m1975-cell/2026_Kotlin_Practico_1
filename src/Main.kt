//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {


    fun imprimirNombre() {
        println("mi nombre es juan carlos aucachi ")
        println("procedimiento basico")
    }

    //declarar procedimiento que recibe en parametro
    fun fibonaccci(n: Int) {
        var sem1: Int = 0
        var sem2: Int = 1
        var sem3: Int = 1
        for (i in 1..n) {
            println("serie[${1}]:  ${sem1}")
            sem1 = sem2
            sem2 = sem3
            sem3 = sem1 + sem2
        }

    }

    fun factorial(n: Int): Long {
        require(n >= 0)
            var result = 1L
            for (i in 2..n) {
                result *= i

            }
            return result
        }



        fun fibonacciArray(n: Int): IntArray {
            var result: IntArray = IntArray(size = n)
            result[0] = 0
            result[1] = 1
            for (i in 2..n - 1) {
                result[i] = result[i - 1] * result[1 - 2]
            }
            return result

        }
    }



