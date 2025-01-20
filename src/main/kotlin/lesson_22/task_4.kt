package org.example.lesson_22

class MainScreenViewModel(var mainScreenState: MainScreenState) {
    fun loadData() {
        mainScreenState = MainScreenState("", false)
        mainScreenState = mainScreenState.copy(isLoading = true)
        mainScreenState = mainScreenState.copy(data = "привет", isLoading = false)
    }

    data class MainScreenState(
        val data: String,
        val isLoading: Boolean = false,
    )
}

