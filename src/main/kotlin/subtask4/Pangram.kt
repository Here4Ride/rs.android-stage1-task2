package subtask4
class Pangram {
    fun Pangram(string: String): Boolean {
        var alphabet = mutableListOf<Char>('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
            'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z')
        string.forEach {
            when {(alphabet.contains(it.toLowerCase()))
            -> alphabet.remove(it.toLowerCase()) }
        }
        return alphabet.isEmpty()
    }
    fun getResult(inputString: String): String {
        val vowel = charArrayOf('a', 'e', 'i', 'o', 'u', 'y')
        val words = inputString.split(" ").filter { it != "\n" && it != "" }.toMutableList()
        if(Pangram(inputString)) {
            for (i in words.indices) {
                var pos = 0
                val word = words[i].toCharArray()
                for (char in word.indices) {
                    if (vowel.contains(word[char].toLowerCase())) {
                        word[char] = word[char].toUpperCase()
                        pos += 1
                    }
                }
                words[i] = pos.toString() + word.joinToString("")
            }
            var result = words.sortedBy { it.first() }.joinToString(" ")

            return result
        } else {
            for (i in words.indices) {
                var pos = 0
                val word = words[i].toCharArray()
                for (char in word.indices) {
                    if (!vowel.contains(word[char].toLowerCase()) && word[char].isLetter()) {
                        word[char] = word[char].toUpperCase()
                        pos += 1
                    }
                }
                words[i] = pos.toString() + word.joinToString("")
            }
            var result = words.sortedBy { it.first() }.joinToString(" ")

            return result
        }
    }

}