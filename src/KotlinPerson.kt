import java.util.*

data class KotlinPerson(val id: Int, val title: String, val name: String, val surname: String, val birthDate: Calendar? ){
    override fun toString(): String = "$title $name $surname"

    val age: Int?
    get() = getAge(birthDate)

    companion object{
        fun getAge(birthDate: Calendar?): Int? {
            return  birthDate?.get(Calendar.YEAR) ?: -1
        }
    }
}

fun main() {
    val kotlinPerson = KotlinPerson(1, "primeiro", "jose", "pereira", GregorianCalendar(1977, 9 ,3))
    println(kotlinPerson)
    println(kotlinPerson.age)
    val kotlinPerson2 = KotlinPerson(1, "segundo", "joao", "romao", GregorianCalendar(1920, 4,4))
    println(kotlinPerson2)
    println(kotlinPerson2.age)
    //FIXME: Arrumar metodo de comparação de idade que podem ser nulas
    // val olderPerson = if(kotlinPerson.age?.let { it >= kotlinPerson2.age? } ) kotlinPerson else kotlinPerson2

}

