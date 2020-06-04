fun main() {
    val input = readLine()!!.toLowerCase()

    var ctr_gc = 0
    for (char in input) {
        if (char in charArrayOf('g', 'c')) ctr_gc++
    }
    print(ctr_gc.toDouble() / input.length * 100)
}