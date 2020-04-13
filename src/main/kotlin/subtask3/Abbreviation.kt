package subtask3

class Abbreviation {

    fun abbreviationFromA(a: String, b: String): String {
      return when { a.filter { b.contains(it,true) }.equals(b,true)
              ||a.contains(b,true)-> "YES"

          else -> "NO"
            }
        }
}


