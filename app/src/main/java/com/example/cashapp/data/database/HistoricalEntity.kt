package com.example.cashapp.data.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDate

@Entity
data class HistoricalEntity(
    @PrimaryKey val historicalId: Int,
    @ColumnInfo(name = "historical_date") val historicalDate: LocalDate,
    @ColumnInfo(name = "historical_amount") val historicalAmount: Int
)