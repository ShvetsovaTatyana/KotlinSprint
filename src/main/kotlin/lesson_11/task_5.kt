package org.example.lesson_11

import kotlin.random.Random

fun main() {
    val forum = Forum()
    val userOne = forum.createNewUser("Max")
    val userTwo = forum.createNewUser("Kate")
    forum.createNewMessage(userOne.userId, "Hi")
    forum.createNewMessage(userOne.userId, "Привет")
    forum.createNewMessage(userTwo.userId, "Hello")
    forum.createNewMessage(userTwo.userId, "Хай")
    forum.printThread()
}

class Forum() {
    val userList: ArrayList<ForumMember> = arrayListOf()
    val messageList: ArrayList<ForumMessage> = arrayListOf()
    fun createNewUser(userName: String): ForumMember {
        val user = ForumMember(userId = 1.rangeTo(100).random().toString(), userName)
        userList.add(user)
        return user
    }

    fun createNewMessage(userId: String, message: String) {
        if (userList.find { it.userId == userId } == null)
            return
        else {
            val message = ForumMessage(authorId = userId, message = message)
            messageList.add(message)
        }
    }

    fun printThread() {
        for (i in messageList) {
            val authorMessage = userList.find { it.userId == i.authorId }
            println("${authorMessage!!.userName}:${i.message}")
        }
    }
}

class ForumMember(
    val userId: String,
    val userName: String,
) {
}

class ForumMessage(
    val authorId: String,
    val message: String,
) {

}