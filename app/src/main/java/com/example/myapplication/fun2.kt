fun main() {
    square(20, 34)
}

fun foo3(i: Int, j: Boolean) {
    println("i = $i,j =$j")
}

fun square(i: Int, j: Int): Int {
    return i * j
}

fun square(i: Int) = i * i