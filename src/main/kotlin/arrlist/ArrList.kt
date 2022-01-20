package arrlist

class ArrList (
    private var numbers: IntArray
) {


    fun size(): Int {
        return numbers.size
    }

    fun isEmpty(): Boolean {
        return numbers.isEmpty()
    }

    fun indexOf(number: Int): Int {
        for (i in numbers.indices) {
            if (numbers[i] == number) return i
        }
        return -1
    }

    fun toArray(): IntArray {
        return numbers
    }

    fun get(pos: Int): Int {
        if (pos < numbers.size){
            return numbers[pos]
        }
        else{return -1}
        }


    fun add(num: Int) {
        val newArr = numbers.copyOf(numbers.size + 1)
        newArr[newArr.size-1] = num
        numbers = newArr
    }

    fun set(pos: Int,num: Int){
        numbers[pos] = num
    }

    fun contains(num: Int): Boolean {
        for (i in numbers.indices){
            if(numbers[i] == num ){
                return true
            }
        }
        return false
    }

    fun lastIndexOf(num: Int): Int{
        for(i in numbers.size-1 downTo 0)
            if(numbers[i] == num){
                return i
            }
        return -1
    }
}