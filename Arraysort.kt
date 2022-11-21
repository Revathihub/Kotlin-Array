import java.util.Scanner
fun main(args:Array<String>){
    var scan=Scanner(System.`in`)
    println("Enter the array Size: ")
    var arraySize=scan.nextInt()
    var myarray=Array(arraySize,{0})
    for(i in 0..(arraySize-1)){
        myarray.set(i,scan.nextInt())
    }
    println("Array elements are:")
    for(i in 0..(arraySize-1)){
    print("${myarray[i]} ")
    }
    println()
    myarray.sort()
    println("Array sort in Ascending Order:")
    for(i in myarray){
        print("$i ")
    }
    println()
    myarray.sortDescending()
    println("Array sort in Descending Order:")
    for(i in myarray){
        print("$i ")
    }
}