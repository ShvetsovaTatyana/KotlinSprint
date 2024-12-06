package org.example.lesson_16

class OnlineStore(private val orderNumber: String, var readinessStatus: String) {
    private fun changeStatus(newReadinessStatus: String) {
        this.readinessStatus = newReadinessStatus
    }

    fun sendAnApplication(newReadinessStatus: String) {
        this.changeStatus(newReadinessStatus)
    }
}

