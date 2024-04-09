package com.example.cashapp.data.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class CurrentAmountEntity(
    @PrimaryKey val currentId: Int,
    @ColumnInfo(name = "current_amount") val currentAmount: Int
)