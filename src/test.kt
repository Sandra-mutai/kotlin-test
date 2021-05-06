fun main() {
       intro()
    numbers()
    guest(age=3)
    guest(age=10)
    guest(age = 20)
    members("sarah","sandra","shiliza")
    var calculator =()
    println(calculator.add(5, 9))



}
fun intro(  name:String,  age:Int) {

   return(My name is $name and I am $age years old)

}
fun guest(age :Int) {
    when (age){
        in 1..5 ->println("studdent get a bottle of milk")
        in 6..14->println("student get a bottle of fanta")
        else ->println("student get a bottle of coca cola")
    }
    fun members(name:String,name2:String,name3:String):Array<String> {
        var names = arrayOf(name, name2, name3)
        for (name in names)
            if (name.length > 5) {
                println(name)
            }
        return names
    }
    fun calculator(){
        fun multuply(a:Int,b:Int):Int{
            return(a+b)

        }
        fun divide(a:Int,b:Int):Int{
            return(a*b)
        }
        fun modulus(a:Int,b:Int):Int {
            return (a % b)
        }
        }
    fun human(name:String ,age:Int, weight:Float){
        fun eat(foodWeight: Int){
            (“I am eating {foodWeight} kgs of food”)
        }
        fun speak(speech: String)
    }
}
fun comparison(num:Int,num2:Int,):Boolean {
    var names = arrayOf(num, num2,)
    for (name in num)
        if (name.length > 5) {
            println(true)
        } else (false)
}