package com.example.cashapp.data.model

data class Goals(
    val title: String,
    val goalAmount: Int,
    val currentAmount: Int,
    val description: String,
    val urlGoals: String?,
    val goalsComplete: Boolean
)
