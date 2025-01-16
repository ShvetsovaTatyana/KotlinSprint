package org.example.lesson_14

fun main() {
    val chat = Chat()
    chat.addMessage("59615", "Таня", "Запрос возвращает 502")
    chat.addThreadMessage("54845", "Илья", "Какая платформа?", "59615")
    chat.addThreadMessage("48854", "Таня", "Андроид", "59615")
    chat.addMessage("44545", "Абрам", "Почему таймер не считает?")
    chat.addThreadMessage("45251", "Виктория", "Это была проверка", "44545")
    chat.addThreadMessage("54541", "Ольга", "У нас есть прайс лист?", "44545")
    chat.printChat()
}

class Chat() {
    val messageList: ArrayList<Message> = arrayListOf()
    fun addMessage(id: String, author: String, textMessage: String) {
        val message = Message(id, author, textMessage)
        messageList.add(message)
    }

    fun addThreadMessage(id: String, author: String, textMessage: String, parentMessageId: String) {
        val thread = ChildMessage(id, author, textMessage, parentMessageId)
        messageList.add(thread)
    }

    fun printChat() {
        val messageGrouping = messageList.groupBy { if (it is ChildMessage) it.parentMessageId else it.id }
        for (i in messageGrouping) {
            for (j in i.value) {
                if (j is ChildMessage)
                    println("\t${j.author}: ${j.textMessage}")
                else
                    println("${j.author}: ${j.textMessage}")
            }
        }
    }
}

open class Message(val id: String, val author: String, val textMessage: String) {

}

class ChildMessage(id: String, author: String, textMessage: String, val parentMessageId: String) :
    Message(id, author, textMessage) {

}