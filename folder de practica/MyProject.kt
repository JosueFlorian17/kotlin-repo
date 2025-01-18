/*fun main(){
    val num1 = 10;  //  numero 1
    val num2 = 20; //   numero 2
    println("Hello, World")  //  imprimimos mi primero "hola mundo"
    println(num1+num2) // hacemos la suma de ambos numeros

    // poniendo tipos a los numeros
    val i: Int = 10;
    val l: Long = i.toLong();
    val d1: Double = i.toDouble()
    val d2: Double = l.toDouble()
    println(d1)
    println(d2)
}
 */


/*fun main (){

    println(123+456*789)
    println(1 + 2 * 3 + 4 * 5 + 6 * 7 + 8 * 9)
    println((1+2)*3+4*5+6*(7+8)*9)
    println(13530.0/1.23)

    println("------------------------------")

    val level1 = 79;
    val level2 = 92;
    val level3 = 86;
    val averageScore = (level1+level2+level3)/3;
    val totalScore = level1+level2+level3;
    val boostMultiplier = 4;
    val finalScore = totalScore * boostMultiplier; // ya multiplicado por el boost
    println("average score")
    println(averageScore)
    println(totalScore)
    println("multiplicado por el boostMultiplier")
    println(finalScore)

}
 */

fun main () {

    val mystring= """
         Hola
         Esto tiene
         Varias lineas."""
    println(mystring)

    val age=70;
    val mystringo = "My age is $age"
    println(mystringo)

    var text= "hola"
    text+=" mundo"
    text=text.uppercase()
    println(text)
    println(text.length)

}

