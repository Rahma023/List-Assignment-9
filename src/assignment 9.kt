fun main() {
println(namesList(listOf("Jane","Safe","Ruth","Beth","Ali","Holy","Sada","Daniel","Janet","Caro")))
println(people(listOf(3.21,1.32,5.7,98.3,20.2)))

    persons()
    addPerson()
    var gari= listOf(
        Car("Kwf263",75),
        Car("Kis526",300)
    )
    println(car(listOf(75,300)))

}

fun namesList(names:List<String>):List<String>{
    var a= mutableListOf<String>()
    for(name in names){
        if(names.indexOf(name)%2==0){
          a.add(name)
        }
    }
    return a
}

fun people(height:List<Double>):Pair<Double,Double>{
    var total=height.sum()
    var average=height.average()
    return Pair(total, average)
}

data class Person(var name:String, var age:Int, var weight:Double, var height:Int)
    fun persons(){
        var person= listOf(
            Person("Tevin",22,34.2,4),
            Person("Michael",25,50.2,2),
            Person("Miriam",18,40.3,5),
            Person("Issa",30,60.2,8)
        )

        var sortedPerson=person.sortedByDescending { person -> person.name }
        println(sortedPerson)
    }


data class person(var name:String, var age:Int, var weight:Double, var height:Int)
    fun addPerson() {
        var people = mutableListOf(
            Person("Tevin", 22, 34.2, 4),
            Person("Michael", 25, 50.2, 2),
            Person("Miriam", 18, 40.3, 5),
            Person("Issa", 30, 60.2, 8)
        )
        people.addAll(
            listOf(
                Person("Esha",13,20.3,6),
                Person("Nuru",18,20.4,5)
            )
        )
        println(people)
    }
data class Car(var registration:String, var mileage:Int)
fun car (mileage:List<Int>):Int{
    var distance=mileage.average().toInt()
    return distance
}


