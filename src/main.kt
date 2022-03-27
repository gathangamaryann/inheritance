
    //Create a class Car with the following attributes: make, model, color, capacity.
   // It has these functions:
    //carry(people: Int) : Prints out “Carrying $peoplepassengers” if the
    //number of people is within its capacity else it prints out “Over capacity
    //by $x people” where x is the number of people exceeding its capacity
    //(3 points)
    //-identity() : Prints out the color, make and modelin the following
    //format e.g:  “I am a white subaru legacy”(1 point)
    //-calculateParkingFees(hours: Int) : Calculates andreturns the
    //parking fees by multiplying the hours by 20(1 point)
    //2.Create a class Bus with the same attributes and functions as the Car class.
    //In addition, it has another method calledmaxTripFare(fare: Double) that
    //calculates and returns the maximum amount of fare that can be collected per
    //trip.(2 points)
    //The bus’calculateParkingFees method returns the productof hours and
    //the capacity of the bus(3 points)
    //Make use of inheritance to avoid duplication. Also be sure to instantiate both classes

    fun main(){
        var mycar=Car("Jeep","Gladiater","pink",4)
        println( mycar.Calculateparkingfees(4))
        mycar.Identity()
        mycar.Carry(2)
        var myBus=Bus("cithhoppa","metro","green",50)
        println(myBus.mixTripFare(14.2))
        myBus.Identity()
        myBus.Carry(50)
        println(myBus.Calculateparkingfees(3))
        println(myBus.mixTripFare(14.2))




    }
    open class Car(var make:String,var model:String,var color:String,var capacity:Int){
        fun Carry(people:Int){
            var p=people-capacity

            if (people<=capacity)
                println("Carrying $people passengers")
            else
                println("over capacity by $p people")


        }
        fun Identity(){
            println("i am $color $make $model")

        }
        open fun Calculateparkingfees(hours:Int):Int{
            var H=hours*20
            return H


        }

    }
    class Bus(make:String,model:String,color:String,capacity:Int):Car(make,model,color,capacity){
        fun mixTripFare(fare:Double):Double{
            var t=fare*capacity
            return t
        }

        override fun Calculateparkingfees(hours: Int): Int {
            var y=hours*capacity
            return y
        }

    }
