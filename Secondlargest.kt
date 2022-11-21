import java.util.Scanner
fun main(args:Array<String>) {
    var scan = Scanner(System.`in`)
    println("Enter the array Size: ")
    var arraySize = scan.nextInt()
    var myarray2 = Array(arraySize, { 0 })
    for (i in 0..(arraySize - 1)) {
        myarray2.set(i, scan.nextInt())
    }
    println("Array elements are:")
    for (i in 0..(arraySize - 1)) {
        print("${myarray2[i]} ")
    }
    println()
    myarray2.sortDescending()
    print("Second Largest arry Element is ${myarray2[1]}")
}