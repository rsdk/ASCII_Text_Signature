import java.util.*
import kotlin.math.pow

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()
    val d = scanner.nextInt()

    for (i in 0..1000){
        if ((a * i.toDouble().pow(3) + b * i.toDouble().pow(2) + c * i + d) == 0.0) println(i)
    }
}