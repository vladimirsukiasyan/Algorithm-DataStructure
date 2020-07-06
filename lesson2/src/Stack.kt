class ListNode(var value:Int = -1, var next: ListNode? = null) {
    override fun toString(): String {
        return value.toString()
    }
}

class Stack(var head: ListNode? = null){
    fun push(newNode: ListNode){
        newNode.next = head
        head = newNode

    }
    fun pop(){
        head = head?.next
    }
    fun peek(): Int? {
        return head?.next?.value
    }
}