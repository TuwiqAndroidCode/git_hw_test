
//Q " Bonus , Nestd Loop "

//In the first time, when the value of i is 1 the content of the outer for loop is executed (that is, the lines from line 3 to line 6),
// then the inner for loop starts working, in which the value of [ is set to 1, while the i is 1 as mentioned earlier,
// it is executed  The content of this inner for loop is printing 5 * j, and since the value of j is 1, it will print 5 * 1,
// then the inner for loop will finish and then line 6 will be executed under which a new line is printed... ) like this

fun main() {

    val number = 5
    for (i in 1..number){

        for (j in 1..i) {

            print("$j*5   ")

        }
        println()
    }
}