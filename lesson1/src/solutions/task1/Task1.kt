package solutions.task1

import java.lang.StringBuilder

/*
Реализуй алгоритм для переворчаивания односвязного списка
элементов. Т.е к примеру был список A->B->C->D и нужно из него получить
список D->C->B->A. ​ Время работы алгоритма - O(n)​ (можешь словами, а
можешь на любом языке программирования). ​ Ограничение по памяти - O(1).
Это значит, что использовать дополнительные массивы, списки и т.д
(какие-либл структуры данных) нельзя. Но если не сможешь решить без них -
то используй.
 */

class ListNode(var value:Int = -1, var next: ListNode? = null){
    //Функция toString, которую мы переопределили вызвается при работе println()/print()
    override fun toString(): String {
        return value.toString()
    }
}

class List(var head:ListNode?){
    //В этой функции мы возвращаем строкое представление нашего всего списка как "1 2 3 4 5 ..." для вызова функции println()/print()
    override fun toString(): String {
        val stringBuilder = StringBuilder()
        var cur = head
        while(cur!=null){
            stringBuilder.append("${cur.value} ")

            cur = cur.next
        }
        return stringBuilder.toString()
    }
}

fun main() {
    val firstNode = ListNode()

    val list = List(firstNode)
    val size = 10

    //Заполнение односвязанного списка
    var current = list.head
    for (i in 0 until size) {
        current?.value = i
        if(i==size-1){
            current?.next = null
        }
        else{
            current?.next = ListNode() //0x00001F
        }
        current = current?.next // вот тут мы переходим на следующий объект по ссылке
    }
    println(list)
//    println(reverseList(list))
}