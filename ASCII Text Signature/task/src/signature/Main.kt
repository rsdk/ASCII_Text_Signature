package signature

import java.io.File
import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)
    print("Enter name and surname: ")
    val nameString = scanner.nextLine()
    print("Enter person's status: ")
    val job = scanner.nextLine()

/*
    val nameString = "Ian One"
    val job = "VIP"
    */

    val myc = AsciiText()
    myc.loadFromFile()
    //myc.testPrintABC()
    myc.add(nameString)
    myc.addJ(job)
    myc.makeWithSize()
    myc.testPrint()
    /*
    myc.add(nameString)
    myc.addJob(job)
    myc.makeWithSize()
    myc.testPrint()
     */
}

class AsciiText {
    private val asciiTranslate: MutableMap<Char, AsciiCharRoman> = mutableMapOf()

    private val asciiSimple: Map<Char, AsciiChar> = mapOf(
            'A' to AsciiChar("A", "____", "|__|", "|  |"),
            'B' to AsciiChar("B", "___ ", "|__]", "|__]"),
            'C' to AsciiChar("C", "____", "|   ", "|___"),
            'D' to AsciiChar("D", "___ ", "|  \\", "|__/"),
            'E' to AsciiChar("E", "____", "|___", "|___"),
            'F' to AsciiChar("F", "____", "|___", "|   "),
            'G' to AsciiChar("G", "____", "| __", "|__]"),
            'H' to AsciiChar("H", "_  _", "|__|", "|  |"),
            'I' to AsciiChar("I", "_", "|", "|"),
            'J' to AsciiChar("J", " _", " |", "_|"),
            'K' to AsciiChar("K", "_  _", "|_/ ", "| \\_"),
            'L' to AsciiChar("L", "_   ", "|   ", "|___"),
            'M' to AsciiChar("M", "_  _", "|\\/|", "|  |"),
            'N' to AsciiChar("N", "_  _", "|\\ |", "| \\|"),
            'O' to AsciiChar("O", "____", "|  |", "|__|"),
            'P' to AsciiChar("P", "___ ", "|__]", "|   "),
            'Q' to AsciiChar("Q", "____", "|  |", "|_\\|"),
            'R' to AsciiChar("R", "____", "|__/", "|  \\"),
            'S' to AsciiChar("S", "____", "[__ ", "___]"),
            'T' to AsciiChar("T", "___", " | ", " | "),
            'U' to AsciiChar("U", "_  _", "|  |", "|__|"),
            'V' to AsciiChar("V", "_  _", "|  |", " \\/ "),
            'W' to AsciiChar("W", "_ _ _", "| | |", "|_|_|"),
            'X' to AsciiChar("X", "_  _", " \\/ ", "_/\\_"),
            'Y' to AsciiChar("Y", "_   _", " \\_/ ", "  |  "),
            'Z' to AsciiChar("Z", "___ ", "  / ", " /__"),
            ' ' to AsciiChar(" ", "    ", "    ", "    "),
            '1' to AsciiChar("1 space", " ", " ", " "),
            '2' to AsciiChar("2 spaces", "  ", "  ", "  "),
            '4' to AsciiChar("4 spaces", "    ", "    ", "    "),
            '6' to AsciiChar("6 spaces", "      ", "      ", "      ")
    )

    private val header = mutableListOf<String>()

    private val line1 = mutableListOf<String>()
    private val line2 = mutableListOf<String>()
    private val line3 = mutableListOf<String>()
    private val line4 = mutableListOf<String>()
    private val line5 = mutableListOf<String>()
    private val line6 = mutableListOf<String>()
    private val line7 = mutableListOf<String>()
    private val line8 = mutableListOf<String>()
    private val line9 = mutableListOf<String>()
    private val line10 = mutableListOf<String>()

    private val job1 = mutableListOf<String>()
    private val job2 = mutableListOf<String>()
    private val job3 = mutableListOf<String>()

    private val footer = mutableListOf<String>()


    fun testPrintABC() {
        for (value in asciiTranslate.values) value.testPrint()
    }

    fun loadFromFile() {
        val scanner = Scanner(File("C:/Users/rnkbl/IdeaProjects/ASCII Text Signature/ASCII Text Signature/task/src/signature/roman.txt"))
        val n1 = scanner.nextLine()
        //println("n1 $n1")
        repeat(52) {
            val n2 = scanner.nextLine()

            val l1 = scanner.nextLine()
            val l2 = scanner.nextLine()
            val l3 = scanner.nextLine()
            val l4 = scanner.nextLine()
            val l5 = scanner.nextLine()
            val l6 = scanner.nextLine()
            val l7 = scanner.nextLine()
            val l8 = scanner.nextLine()
            val l9 = scanner.nextLine()
            val l10 = scanner.nextLine()

            val n: Char = n2.split(" ")[0].toCharArray()[0]
            asciiTranslate[n] = AsciiCharRoman(n.toString(), l1, l2, l3, l4, l5, l6, l7, l8, l9, l10)
        }
        asciiTranslate[' '] = AsciiCharRoman(" ", "          ", "          ", "          ", "          ", "          ", "          ", "          ", "          ", "          ", "          ")
    }

    fun testPrint() {
        println(header.joinToString(""))

        println(line1.joinToString(""))
        println(line2.joinToString(""))
        println(line3.joinToString(""))
        println(line4.joinToString(""))
        println(line5.joinToString(""))
        println(line6.joinToString(""))
        println(line7.joinToString(""))
        println(line8.joinToString(""))
        println(line9.joinToString(""))
        println(line10.joinToString(""))

        println(job1.joinToString(""))
        println(job2.joinToString(""))
        println(job3.joinToString(""))

        println(footer.joinToString(""))
    }

    private fun add(char: Char) {
        val aChar = asciiTranslate[char]
        line1.add(aChar!!.l1)
        line2.add(aChar.l2)
        line3.add(aChar.l3)
        line4.add(aChar.l4)
        line5.add(aChar.l5)
        line6.add(aChar.l6)
        line7.add(aChar.l7)
        line8.add(aChar.l8)
        line9.add(aChar.l9)
        line10.add(aChar.l10)
    }

    private fun addBack() {
        line1.add(" ")
        line2.add(" ")
        line3.add(" ")
        line4.add(" ")
        line5.add(" ")
        line6.add(" ")
        line7.add(" ")
        line8.add(" ")
        line9.add(" ")
        line10.add(" ")
    }

    private fun addFront() {
        line1.add(0, " ")
        line2.add(0, " ")
        line3.add(0, " ")
        line4.add(0, " ")
        line5.add(0, " ")
        line6.add(0, " ")
        line7.add(0, " ")
        line8.add(0, " ")
        line9.add(0, " ")
        line10.add(0, " ")
    }

    private fun addJ(char: Char) {
        val aChar = asciiSimple[char]
        job1.add(aChar!!.l1)
        job2.add(aChar.l2)
        job3.add(aChar.l3)
        job1.add(" ")
        job2.add(" ")
        job3.add(" ")
    }

    private fun addFrontJ() {
        job1.add(0, " ")
        job2.add(0, " ")
        job3.add(0, " ")
    }

    private fun addBackJ() {
        job1.add(" ")
        job2.add(" ")
        job3.add(" ")
    }

    fun addJ(str: String) {
        val input = str.toUpperCase()
        for (c in input) {
            addJ(c)
        }
    }

    fun add(str: String) {
        for (c in str) {
            add(c)
        }
    }

    fun makeWithSize() {
        addFront()
        addFront()
        addFrontJ()
        addFrontJ()
        addBack()
        addBack()
        addBackJ()
        addBackJ()


        val nameLen = len()
        val jobLen = jobLen()
        val endLen: Int
        endLen = if (nameLen >= jobLen) nameLen else jobLen

        if (jobLen() < endLen) addBackJ()
        while (jobLen() < endLen) {
            addFrontJ()
            if (jobLen() >= endLen) break
            addBackJ()
        }

        while (len() < endLen) {
            addBack()
            if (len() >= endLen) break
            addFront()
        }

        repeat(endLen + 4) {
            header.add("8")
            footer.add("8")
        }


        line1.add(0, "88")
        line2.add(0, "88")
        line3.add(0, "88")
        line4.add(0, "88")
        line5.add(0, "88")
        line6.add(0, "88")
        line7.add(0, "88")
        line8.add(0, "88")
        line9.add(0, "88")
        line10.add(0, "88")

        job1.add(0, "88")
        job2.add(0, "88")
        job3.add(0, "88")

        line1.add("88")
        line2.add("88")
        line3.add("88")
        line4.add("88")
        line5.add("88")
        line6.add("88")
        line7.add("88")
        line8.add("88")
        line9.add("88")
        line10.add("88")

        job1.add("88")
        job2.add("88")
        job3.add("88")
    }

    private fun jobLen(): Int {
        var sum = 0
        for (e in job1) {
            sum += e.length
        }
        return sum
    }

    private fun len(): Int {
        var sum = 0
        for (e in line1) {
            sum += e.length
        }
        return sum
    }
}

class AsciiChar(val letter: String, val l1: String, val l2: String, val l3: String) {
    fun testPrint() {
        println(l1)
        println(l2)
        println(l3)
        println()
    }
}

class AsciiCharRoman(val letter: String, val l1: String, val l2: String, val l3: String, val l4: String, val l5: String, val l6: String, val l7: String, val l8: String, val l9: String, val l10: String) {
    fun testPrint() {
        println(l1)
        println(l2)
        println(l3)
        println(l4)
        println(l5)
        println(l6)
        println(l7)
        println(l8)
        println(l9)
        println(l10)
        println()
    }
}

