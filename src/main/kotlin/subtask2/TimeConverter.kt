package subtask2
class TimeConverter {
    // TODO: Complete the following function
    fun toTextFormat(hour: String, minute: String): String {
        var hours = hour.toInt()
        var minutes = minute.toInt()
        val nums = arrayOf<String>("zero", "one", "two",
            "three", "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
            "seventeen", "eighteen", "nineteen", "twenty", "twenty one", "twenty two",
            "twenty three", "twenty four", "twenty five", "twenty six", "twenty seven",
            "twenty eight", "twenty nine")
        return when  (minutes) {
            0 -> nums[hours] + " o' clock"
            15 -> "quarter past " + nums[hours]
            30 -> "half past " + nums[hours]
            45 -> "quarter to " + nums[(hours % 12) + 1]
            in (1..29) -> nums[minutes] + " minutes past " +
                    nums[hours]
            in (30..59) -> nums[60 - minutes] + " minutes to " +
                    nums[(hours % 12) + 1]

            else -> ""
        }

}
}


