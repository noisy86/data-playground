package arrlist1


class ArrList<T>(private var nums: Array<T>) {


    fun size(): Int {
        return nums.size
    }

    fun isEmpty(): Boolean {
        return nums.isEmpty()
    }

    fun indexOf(num: T): Int {
        for (i in nums.indices) {
            if (nums[i] == num) return i
        }
        return -1
    }

    fun toArr(): Array<T> {
        return nums
    }

    fun get(pos: Int): T {
        return if (pos < nums.size) nums[pos]
        else throw Exception("není")
    }

    fun add(num: T) {
        val newArr = nums + num
        nums = newArr
    }

    fun set(pos: Int, num: T) {
        nums[pos] = num
    }

    fun ifIn(num: T): Boolean {
        for (i in nums.indices) {
            if (nums[i] == num) return true
        }
        return false
    }

    fun lastIndexOf(num: T): Int {
        for (i in nums.size - 1 downTo 0)
            if (nums[i] == num) {
                return i
            }
        return -1
    }
}