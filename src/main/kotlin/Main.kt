//Q1 :
fun main() {
        var mymap= mutableMapOf("student" to "Raghad" ,"student2" to "Rola","student3" to "maha" )
        println(mymap)
    mymap.putIfAbsent("student4" , "Afrah")
    println(mymap)
    mymap["student3"] ="mashail"
    println(mymap)
    mymap.remove(key= "student")
    println(mymap)

    //========================================================

    //Q2 :
    var Cities= mutableMapOf("Cities" to "Riyad" ,"Cities2" to "jeddah","Cities3" to "yanbu" )
    println(Cities)
    Cities.putAll(listOf("abha","damam","almadina").mapIndexed{ index, s ->index.toString() to s  })
    println(Cities)


    /*val numbersMap = mutableMapOf("one" to 1, "two" to 2, "three" to 3) // anathor suliton
    numbersMap.putAll(listOf("four" to 4, "five" to 5))
    println(numbersMap)*/

}
