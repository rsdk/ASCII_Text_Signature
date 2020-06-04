import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val len = scanner.nextLine().toInt()
    val arr: IntArray = IntArray(len)
    val inStr = scanner.nextLine()
    val strList: List<String> = inStr.split(' ')
    for (i in strList.indices) {
        arr[i] = strList[i].toInt()
    }
    val inStr2 = scanner.nextLine()
    val strList2: List<String> = inStr2.split(' ')

    val n = strList2[0].toInt()
    val m = strList2[1].toInt()

    if (checkNear(arr, n, m)) print("YES") else print("NO")
}

fun checkNear(array: IntArray, n: Int, m: Int): Boolean {
    if (array.contains(n) && array.contains(m)) {
        for (i in array.indices) {
            if (array[i] == n) {
                if (i > 0 && array[i - 1] == m) return true
                if (i < array.size && array[i + 1] == m) return true
                return false
            }
        }
    }
    return false
}
