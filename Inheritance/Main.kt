class MyParentClass{
    val x = 5

    fun parent(){
        println("This is the parent class")
    }
}

class MyChildClass: MyParentClass(){
    val y = 10
    fun child(){
        println("This is the child class")
    }

    fun main(){
        var c = MyChildClass()
        c.parent() // calling the function from the parent class
        c.child()  // calling a new function in the child class
    }
}