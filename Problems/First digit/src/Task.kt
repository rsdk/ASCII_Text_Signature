fun main() {
    // put your code here
    val input = readLine()!!
    for (char in input) {
        if (char in '0'..'9') {
            print(char)
            break
        }
    }
}