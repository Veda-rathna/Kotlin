//Function with arguments
fun myFunction(fname: String, age: Int){
    println("My name is " + fname +" and my age is "+age)
}

//Function with argument and return value
fun mul(num1: Int,num2: Int):Int{
    val mul = num1 * num2
    return mul
}

//Short hand function
fun mul1(x: Int,y: Int) = x + y

fun main(){
    var name = "Ramu"
    val age = 18
    myFunction(name,age)

    val num1 = 10
    val num2 = 5
    val  result = mul(num1,num2)
    println("The product is "+result)

    println("The sum of two numbers is "+ mul1(60,9))
}