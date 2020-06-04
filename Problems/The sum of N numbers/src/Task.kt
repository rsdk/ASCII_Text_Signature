import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val len = scanner.nextInt()
    var sum: Int = 0
    for (i in 0 until len) {
        sum += scanner.nextInt()
    }
    print(sum)
}