package arrlist1

fun main() {

    val arrayList = ArrList(arrayOf(5,5,5,4,2))
    println(arrayList.size())
    println(arrayList.isEmpty())
    println(arrayList.indexOf(2))
    println(arrayList.toArr())
    println(arrayList.get(4))
    arrayList.add(6)
    arrayList.set(0, 2)
    println(arrayList.toArr().contentToString())
    println(arrayList.ifIn(5))
    println(arrayList.lastIndexOf(2))


}