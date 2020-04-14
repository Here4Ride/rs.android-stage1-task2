package subtask1
import java.lang.Exception
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*


class DateFormatter {

    // TODO: Complete the following function
    fun toTextDay(day: String, month: String, year: String): String {
        return try {
            val formatter = LocalDate.of(year.toInt(), month.toInt(), day.toInt())
            formatter.format(DateTimeFormatter.ofPattern("dd MMMM, EEEE", Locale("RU")))
        } catch (e: Exception) {
            "Такого дня не существует"
        }

    }

}