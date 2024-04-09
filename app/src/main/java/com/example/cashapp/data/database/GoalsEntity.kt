package com.example.cashapp.data.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class GoalsEntity(
    @PrimaryKey val goalId: Int,
    @ColumnInfo(name = "title_goal") val titleGoal: String,
    @ColumnInfo(name = "decription_goal") val descriptionGoal: String,
    @ColumnInfo(name = "amount_goal") val amountGoal: Int,
    @ColumnInfo(name = "current_amount_goal") val currentAmountGoal: Int,
    @ColumnInfo(name = "complete_goal") val completeGoal: Boolean
)