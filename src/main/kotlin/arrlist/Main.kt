import arrlist.ArrList

fun main() {
    val arrList = ArrList(intArrayOf(1, 10, 13, 24, 15))
    println(arrList.size())
    println(arrList.isEmpty())
    println(arrList.indexOf(2))
    println(arrList.toArray())
    println(arrList.get(4))
    arrList.add(36)
    arrList.set(0,2)
    println(arrList.toArray().contentToString())
    println(arrList.contains(5))
    println(arrList.lastIndexOf(2))
}