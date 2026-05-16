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
    val student = Student (
    id = 1,
    name = "Ana",
    email = "ana@gmail.com",
    grade = 8,
    isActive = false
    )
    println(student)
    if (student.isActive){
        println("El estudiante ${student.name} esta activo")
    } else{
        println("El estudiante ${student.name} NO esta activo")
        
    }
    
    val status: String =if(student.isActive){
        "Activo"
    } else {
        "Inactivo"
    }
    println("El estudiante ${student.name} esta $status")

    val student2 = Student(
    id = 2,
    name = "Juan",
    email = "juan@gmail.com",
    grade = 5,
    isActive = true
    )
    
    val student3 = Student(
    id = 3,
    name = "Joaquin",
    email = "joaquin@gmail.com",
    grade = 10,
    isActive = true
    )
    
    val students = listOf(student, student2, student3)
    println(students)
    
    for (student in students){
        if (student.isActive){
            println("${student.name} - ${student.grade}")
        }
    }
}
    
}
