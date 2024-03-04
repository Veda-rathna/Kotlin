class Car{
    var brand = ""
    var model = ""
    var year = 0

    fun drive(){
        println("Varata mame durrrrr......")
    }
}

fun main(){
    var c = Car()

    c.brand = "Ford"
    c.model = "Fiesta"
    c.year = 1968

    println("The car ${c.model} from ${c.brand} was manufactured in ${c.year}")
    c.drive()
}