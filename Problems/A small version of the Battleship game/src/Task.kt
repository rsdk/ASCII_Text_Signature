import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val field = Field()
    repeat(3) {
        val x = input.nextInt()
        val y = input.nextInt()
        val ship = Ship(x, y)
        field.addShip(ship)
    }
    println()
    //field.printField()
    field.checkX()
    field.checkY()
}

class Ship(val x: Int, val y: Int)

class Field {
    private val field = Array(5) { IntArray(5) }

    fun addShip(ship: Ship) {
        field[ship.y - 1][ship.x - 1] = 1
    }

    fun printField() {
        for (row in field.reversed()) {
            println(row.joinToString(" "))
        }
    }

    fun checkX() {
        val resultRow = IntArray(5)
        var p = 0
        for (row in field) {
            for (pos in row.indices) {
                if (row[pos] == 1) resultRow[pos] = 1
            }
        }
        //println(resultRow.joinToString(" "))
        for (i in resultRow.indices) {
            if (resultRow[i] == 0) {
                if (p == 0) {
                    print("${i + 1}")
                    p++
                }
                else print(" ${i + 1}")
            }
        }
        println()
    }

    fun checkY() {
        var p = 0
        for (row in field.indices) {
            if (!field[row].contains(1)) {
                if (p == 0) {
                    print("${row + 1}")
                    p++
                }
                else print(" ${row + 1} ")
            }
        }
    }
}