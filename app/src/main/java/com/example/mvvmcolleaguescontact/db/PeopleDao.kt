package com.example.mvvmcolleaguescontact.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.mvvmcolleaguescontact.model.PeopleResponseItem

@Dao
interface PeopleDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(peopleResponseItem: PeopleResponseItem) : String

    @Query("SELECT * FROM colleaguecontacts")
    fun getAllPersons(): LiveData<List<PeopleResponseItem>>

    @Delete
    suspend fun deletePerson(peopleResponseItem: PeopleResponseItem)
}