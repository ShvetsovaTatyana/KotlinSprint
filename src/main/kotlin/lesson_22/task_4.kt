package org.example.lesson_22

class MainScreenViewModel(val mainScreenState: MainScreenState) {
    fun loadData() {
        val lackOfData = MainScreenState("", false)
        val loadingData = lackOfData.copy(isLoading = true)
        val downloadedData = loadingData.copy(data = "привет", isLoading = false)
    }
}

data class MainScreenState(
    val data: String,
    val isLoading: Boolean = false,
)