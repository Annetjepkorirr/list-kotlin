fun main(){


    var findEven= nums(listOf(1,2,3,4,5,6,7,8,9,10))
    println(findEven)

    var findWords =wordStarts(listOf("Annet","Jeep","Axio","Audi","Eclipsecross"))
    println(findWords)

    var setWord = nums1(listOf(2,3,4,5,6,7))
    println(setWord)

    var identify = alphalist(listOf("Tin","Bread","Dance","Sit","Add"))
    println(identify)

    var identifyInt =getInt(listOf(10,20,30,40))
    println(identifyInt)

    var calls = listOf("Banana","Orange")
    var findDelimiter = "-"
    var total = del(calls,findDelimiter)
    println(total)


}

//Write a function that takes a list of integers and returns the sum of all
//the even numbers in the list.
fun nums(numses:List<Int>):Int{
    var sum = 0
    for (nums in numses){
        if (nums%2 ==0){
            sum+=nums
        }
    }
    return  sum
}
//
//Write a function that takes a list of strings and returns a new
//list with all the
//strings that start with the letter "A".
fun wordStarts(words:List<String>):List<String>{
    var getWords = mutableListOf<String>()
    for (word in words) {
        if (word.startsWith('A')) {
            getWords.add(word)
        }
    }
    return getWords
}
//
//Write a function that takes a list of integers and returns a new list with all the elements doubled.
fun nums1(number1:List<Int>):List<Int>{
    var empty = mutableListOf<Int>()
    for (numss in number1){
        empty.add(numss*2)
    }
    return empty
}

//Write a function that takes a list of strings and returns a new list with all the
//strings sorted in alphabetical order
fun alphalist(findlist:List<String>):List<String>{
    var newList = mutableListOf<String>()
    for (allist in findlist){
        newList.add(allist)
    }

    return  newList.sorted()
}

//Write a function that takes a list of integers and returns the product of
//all the numbers in the list.
fun getInt(n1:List<Int>):Int{
    var products = 1
    for (n in n1){
        products*=n
    }
    return  products
}

//Write a function that takes a list of strings and a delimiter and returns a new string that
//concatenates all the strings in the list with the delimiter between them.
fun del(dil1:List<String>,delimiter:String):String{
    return dil1.joinToString(delimiter)
}
