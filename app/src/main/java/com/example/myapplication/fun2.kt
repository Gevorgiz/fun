fun main() {
}
////not null
//
//   // val message: String = "hellow world"
//    val nullableMessage: String? = null
//
//  //  showDialog(message)
//
//    showDialog(nullableMessage)
//}
//
//fun showDialog(message: String?) {
//  val result1 =  println(message?.lowercase()?: "hellow world")
//
//
//    println(message?.lowercase())
//
//   val result2 = if (message != null) {
//       message.lowercase()
//   } else {
//       println(message)//smart cast преобразовывает в тип
//    }
    fun test() {
        val message: String = "Hello world"

        fun showDialog(){
            val result = if (message != null) {
                message.lowercase()
            } else {
                "hello world"
        }
    }
}
