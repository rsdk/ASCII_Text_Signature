import java.util.Scanner
import kotlin.random.Random

fun main() {
    // write your code here
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()
    val n = scanner.nextInt()

    var aIdx = 0
    var bIdx = 0
    var cIdx = 0

    val chList: Array<Char> = Array(n) { _ -> ' '}
    var lastChar = ' '
    var idx = 0
    do {
        if (aIdx < a) {
            val newChar = getNewUpper(lastChar)
            lastChar = newChar
            chList[idx++] = newChar
            aIdx++
        }
        if (bIdx < b) {
            val newChar = getNewLower(lastChar)
            lastChar = newChar
            chList[idx++] = newChar
            bIdx++
        }
        if (cIdx < c) {
            val newChar = getNewDigit(lastChar)
            lastChar = newChar
            chList[idx++] = newChar
            cIdx++
        } else if (aIdx >= a && bIdx >= b && idx < n) {
            val newChar = getNewDigit(lastChar)
            lastChar = newChar
            chList[idx++] = newChar
        }

    } while (idx < n)


    print(chList.joinToString(""))
}

fun rndItem(list: List<Char>): Char {
    val rndPos = Random.nextInt(0, list.size)
    return list[rndPos]
}

fun getUpper(): Char {
    val upper = ('A'..'Z').toList()
    return rndItem(upper)
}

fun getNewUpper(c: Char): Char {
    var newC: Char
    do {
        newC = getUpper()
    } while (c == newC)
    return newC
}

fun getLower(): Char {
    val lower = ('a'..'z').toList()
    return rndItem(lower)
}

fun getNewLower(c: Char): Char {
    var newC: Char
    do {
        newC = getLower()
    } while (c == newC)
    return newC
}

fun getDigit(): Char {
    val digits = ('0'..'9').toList()
    return rndItem(digits)
}

fun getNewDigit(c: Char): Char {
    var newC: Char
    do {
        newC = getDigit()
    } while (c == newC)
    return newC
}

fun getSymbol(): Char {
    val symbols = listOf('!', ':', '#', '+', '(', ')')
    return rndItem(symbols)
}

fun getNewSymbol(c: Char): Char {
    var newC: Char
    do {
        newC = getSymbol()
    } while (c == newC)
    return newC
}
