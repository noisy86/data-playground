package arrlist

class BootlegMath {
    companion object{
        tailrec fun add(num1: Int, num2: Int): Int{
            if (num2 > 0)
                return add(num1+1,num2-1)
            return num1
        }


        tailrec fun multiply(num1: Int, num2: Int, result: Int = 0): Int{
            if (num1 > 0)
                return multiply(num1-1,num2,result+num2)
            return result
        }


        tailrec fun power(num1: Int, num2: Int, result: Int = num1): Int{
            if (num2 > 1)
                return power(num1,num2-1,result*num1)
            return result
        }

        tailrec fun sumOfDigits(num1: Int, result: Int = 0): Int{
            if (num1>0)
                return sumOfDigits((num1-(num1%10))/10,result + num1%10)
            return result
        }

        tailrec fun isPalindrome(input: String, index: Int = 0): Boolean{
            if (index < input.length/2){
                if (input[index] != input[input.length-index-1])
                    return false
                return isPalindrome(input,index+1)
            }
            return true
        }
    }

}