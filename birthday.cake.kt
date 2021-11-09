//november 9 2021 742am

fun main() {
	val age = 24
    val layers = 5
    
    printCakeCandles(age)
    printCakeTop(age)
    printCakeBottom(age, layers)
}



fun printCakeTop(age: Int){
    repeat(age + 2){
        print("=")
    }
}

fun printCakeCandles(age: Int){
    print(" ")
    repeat(age){
        print(",")
    }
    println()
    
    print(" ")
    repeat(age){
        print("|")
    }
    
    println()
}

fun printCakeBottom(age: Int, layers: Int) {
    repeat(layers){
    	println()
    	repeat(age + 2) {
        	print("@")
    	}
    }
}
