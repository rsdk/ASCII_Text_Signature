import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val n = scanner.nextInt()
    val array: IntArray = IntArray(n)
    repeat(array.size) {
        array[it] = scanner.nextInt()
    }
    val m = scanner.nextInt()
    print(count(array, m))
}

fun count(a: IntArray, m: Int): Int {
    var sum = 0
    for (e in a) {
        if (e == m) sum++
    }
    return sum
}