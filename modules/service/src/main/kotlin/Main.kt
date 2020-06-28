import spark.Spark.get

fun main() {

   Main().start()
}

class Main() {
   fun start() {
      get("/service") { _, _ ->
         val message = helloWorld("from common")
         """
            {"message", "$message"}
         """.trimIndent()
      }
   }
}

fun helloWorldService(name: String = "World"): String {
   return "Hello, ${name}!"
}