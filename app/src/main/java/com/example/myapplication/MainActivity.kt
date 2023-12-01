
fun main (){

    foo(10, j = true)
    val sum = sumIntegers (1000,500)
    println(sum)
}
// параметр лист
fun foo (i:Int, j: Boolean) {
    println(" i = $i, j = $j")

}
//сложение
fun sumIntegers (int1: Int, int2: Int) : Int {
    return int1 + int2
}
//fun sumIntegers (int1: Int, int2: Int) : Int {
   // return int1 + int2
   // fun sumInterdgersShugared(int1: Int, int2:Int)= int1+int2



