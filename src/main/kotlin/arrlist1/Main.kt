package arrlist1

fun main() {

    val arrayList = ArrList(arrayOf(7,3,3,4,12))
    println(arrayList.size())
    println(arrayList.isEmpty())
    println(arrayList.indexOf(3))
    println(arrayList.toArr())
    println(arrayList.get(1))
    arrayList.add(8)
    arrayList.set(0, 2)
    println(arrayList.toArr().contentToString())
    println(arrayList.ifIn(5))
    println(arrayList.lastIndexOf(2))


}