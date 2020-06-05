fun main() {
    val words = mutableMapOf<String, Int>()

    do {
        val input = readLine()!!
        if (input != "stop") {
            if (words.containsKey(input)) {
                words[input] = words[input]!!.plus(1)
            } else {
                words[input] = 1
            }
        }
    } while (input != "stop")

    if (words.isEmpty()) {
        print("null")
    } else {
        var lastWord = ""
        var lastNum = 0
        for (entry in words) {
            if (entry.value > lastNum) {
                lastWord = entry.key
                lastNum = entry.value
            }
        }
        print(lastWord)
    }
}