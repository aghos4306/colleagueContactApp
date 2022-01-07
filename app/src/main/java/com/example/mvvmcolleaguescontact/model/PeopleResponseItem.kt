package com.example.mvvmcolleaguescontact.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(
    tableName = "colleaguecontacts"
)
data class PeopleResponseItem(
    @PrimaryKey(autoGenerate = true)
    var id: String? = null,
    val avatar: String,
    val email: String,
    val firstName: String,
    val jobTitle: String,
    val lastName: String
)