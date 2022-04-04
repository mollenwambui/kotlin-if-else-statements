fun main(){
   statement()
    timeofDay()
}
fun statement(){
    val number= 8
    if(number <0 ){
        println("Negative number")
    }
    else if (number in  0..9){
        println("Single digit number")
    }
    else if (number in 10..99){
        println("Double digit number")
    }
    else
        println("Number has more digits")
}
fun timeofDay(){
    var time= 2
    if (time<18){
        println("Good day")
    } else
        println("Have a good evening")
}