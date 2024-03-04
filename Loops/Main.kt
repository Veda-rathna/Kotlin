fun main(){
    println("All alphabets")
    for(chars in 'a'..'x'){
        print(chars)
    }
    println("\n\nNumbers from 1 to 40")
    for(num in 1..40){
        print(num)
    }
    println("\n\nAn if else statement to find if there is a element in a array")

    val nums = arrayOf(2,4,6,8,10)
    if(2 in nums){
        println(true)
    }
    else{
        println(false)
    }
}