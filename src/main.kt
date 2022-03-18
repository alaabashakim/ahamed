fun main(){
    var multiply= productArray(arrayOf(5, 9, 11, 2, 7))
    println(multiply)

    var add= sumArray(arrayOf("Winfred", 25, "789", 39.00, 37, 78.29))
    println(add)

    var vowel=  vowelsArray(arrayOf('g', 'i', 'd', 'q', 'b'))
    println(vowel)

}

fun productArray(numbers:Array<Int>): Int{
    var multiply=1
    numbers.forEach { numbers ->
        multiply *=  numbers

    }
    return multiply
}

fun  sumArray(mixed: Array<Any>): Double{

    var add= 0.00
    mixed.forEach { y ->
        if (y is Double|| y is Float){
            add += y.toString().toDouble()
        }
    }
    return add
}

fun vowelsArray(letters: Array<Char>): Int {
    var vowel = 0
    letters.forEach { v ->
        if (v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u') {
            vowel++

    }
    return vowel
}