fun main(){
val vitz = TransportMean.Car("vitz", "gallery", "red", 4)
    vitz.carryingPeople(6)
    vitz.capacity
    vitz.identity()
    println(vitz.calculateParkingFees(8))
    val chania = TransportMean. Bus("Rembo", "matt", "blue", 50)
    println(chania.maxTripFare(250.50))
    println(chania.calculateParkingFees(50))
}
 open class TransportMean(var make: String,var model: String,var color: String,var capacity: Int){


class Car( make:String,  model:String, color:String, capacity:Int):TransportMean(make,model,color,capacity){
    fun carryingPeople(people:Int){
        var x = people-capacity
        if  (people <=capacity)
        println("carrying $people passengers")
        else println("over capacity $x people")
    }
    fun identity(){
        println("I am a $color $make $model")
    }
    fun calculateParkingFees(hours:Int): Int{
        var fees = hours*20
        return (fees)
    }
}
class Bus( make: String, model: String,  color: String,  capacity: Int):TransportMean(make,model,color,capacity){
    fun maxTripFare(fare:Double):Double{
        return fare
    }
    fun calculateParkingFees(hours: Int):Int{
       var fees = capacity*hours
       return fees
    }
}
}