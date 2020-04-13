package subtask5

import java.time.format.DateTimeFormatter;
import java.time.LocalDate
import kotlin.reflect.KClass

class Blocks {
    var Number = 0
    var Str = ""
    var Date= LocalDate.parse("0001-01-01")

    fun getData(blockA: Array<Any>, blockB: KClass<*>): Any {
        if (blockB == Int::class){
            blockA.forEach{
                if(it is Int) Number += it}
            return (Number)
        }
        else if (blockB == String::class){
            blockA.forEach{
                if (it is String) Str += it}
            return (Str)
        }
        else if (blockB == LocalDate::class){
            blockA.forEach{
                if (it is LocalDate)
                if (Date < it) Date = it}
            return (Date.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")))
        }
        throw NotImplementedError("Not implemented")
    }
}