package hackerrank


fun plusMinus(arr: Array<Int>): Unit {
    // Write your code here
    var positives = 0.0
    var negatives = 0.0
    var zeroes = 0

    arr.forEach{ num ->
        println(num)
        if(num > 0) positives ++
        else if(num < 0) negatives ++
        else zeroes ++
    }

    println(positives / arr.size)
    println(negatives / arr.size)
    println(zeroes / arr.size)


}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    plusMinus(arr)
}