import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    // put your code here
    val str = input.next()
    val lc = 'a'..'z'
    val l: MutableSet<Char> = lc.toSet().toMutableSet()
    for (char in str) l.remove(char)
    print(l.joinToString(""))
}