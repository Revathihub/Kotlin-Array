import java.util.Scanner
fun main(args:Array<String>){
    var scan=Scanner(System.`in`)
    println("Enter the array Size: ")
    var arraySize=scan.nextInt()
    var myarray1=Array(arraySize,{0})
    for(i in 0..(arraySize-1)){
        myarray1.set(i,scan.nextInt())
    }
    println("Array elements are:")
    for(i in 0..(arraySize-1)){
        print("${myarray1[i]} ")
    }
    println()
    println("Smallet number in Array:")
    println(myarray1.min())
    println("Largest number in Array:")
    println(myarray1.max())
}