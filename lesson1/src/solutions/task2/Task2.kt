package solutions.task2

import java.lang.StringBuilder
import kotlin.time.measureTime

/*
Реализуй алгоритм для удаления значений дубликатов из
неотсортированного односвязного списка. ​ Ограничение по времени и памяти
не ставлю. Задачу можно решить по-разному. В одном случае ты
проигрываешь по памяти, в другом по времени.
 */

class ListNode(var value: Int = -1, var next: ListNode? = null) {
    //Функция toString, которую мы переопределили вызвается при работе println()/print()
    override fun toString(): String {
        return value.toString()
    }
}

class List(var head: ListNode?) {
    //В этой функции мы возвращаем строкое представление нашего всего списка как "1 2 3 4 5 ..." для вызова функции println()/print()
    override fun toString(): String {
        val stringBuilder = StringBuilder()
        var cur = head
        while (cur != null) {
            stringBuilder.append("${cur.value} ")

            cur = cur.next
        }
        return stringBuilder.toString()
    }
}

fun main() {
//    Второй вариант заполнения списка вручную. Тут происходят вложенные создания объектов
//    val list = List(ListNode(1, ListNode(2, ListNode(2, ListNode(3, ListNode(1, ListNode(2)))))))
    val list = List(ListNode())
    val size = 10000

    //Заполнение односвязанного списка
    var current = list.head
    for (i in 0 until size) {
        if(i==size-1){
            current?.value = i
            current?.next = null
        }
        else{
            current?.value = i
            current?.next = ListNode()
        }
        current = current?.next
    }

    println(list)
//    println(removedDuplicates(list))
//    println(removedDuplicates1(list))
}