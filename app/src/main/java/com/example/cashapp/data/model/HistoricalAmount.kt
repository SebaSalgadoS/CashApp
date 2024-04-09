package com.example.cashapp.data.model

import java.time.LocalDate

data class HistoricalAmount(
    val date: LocalDate,
    val historialAmount: Int
)