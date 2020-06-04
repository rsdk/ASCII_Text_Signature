import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val n = scanner.nextInt()
    val a = IntArray(n)
    repeat(n) {
        a[it] = scanner.nextInt()
    }
    val shift = scanner.nextInt()
    print(shiftRight(a, shift).joinToString(" "))
}

fun shiftRight(a: IntArray, n: Int): IntArray {
    val n2 = n % a.size
    val new: IntArray = IntArray(a.size)

    var i = 0
    for (idx in a.size - n2 until a.size) {
        new[i++] = a[idx]
    }
    for (idx in 0 until a.size - n2) {
        new[i++] = a[idx]
    }
    return new
}
