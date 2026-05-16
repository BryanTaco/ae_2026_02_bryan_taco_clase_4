fun main() {
    val name: String = "Bryan"
    val lastName: String = "Taco"
    println("Hola $name $lastName")
}

data class Student (
	val id:Long,
    val name: String,
    val email: String
)

fun main (){
    val student = Studen (
    id = 1,
    name = "Ana",
    email = "ana@gmail.com"
    )
    println(student)
}