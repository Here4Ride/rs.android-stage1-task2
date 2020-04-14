package subtask6

class Fibonacci {
    fun productFibonacciSequenceFor(n: Int): IntArray {
        var F = intArrayOf(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233)
        var prod = 0
        var count = 0
        var answ = 0
        while (0<1){
            prod = F[count]* F[count+1]
            if (prod == n){
                answ = 1
                break}
            else if (prod> n ){
                break
            }
            count++
            }
        if(answ==1){
            return intArrayOf(F[count], F[count + 1], 1)
        }
        else{
            return intArrayOf(F[count], F[count + 1], 0)
        }
    }
}
