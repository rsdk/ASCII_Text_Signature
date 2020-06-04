fun main() {
    // write your code here
    val input = readLine()!!.toLowerCase()
    if (!input.contains("the")) print(-1)
    else print(input.findAnyOf(listOf("the"))!!.first)
}