import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    // put your code here
    val letter = input.next()
    for (c in 'a' until letter.toCharArray().first()) print(c)
}