package com.example.mvvmcolleaguescontact.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.mvvmcolleaguescontact.model.PeopleResponseItem

@Database(
    entities = [PeopleResponseItem::class],
    version = 1
)
abstract class PeopleDatabase: RoomDatabase() {

    abstract fun getPeopleDao() : PeopleDao

    companion object {
        @Volatile
        private var instance : PeopleDatabase? = null
        private val LOCK = Any()

        operator fun invoke(context: Context) = instance ?: synchronized(LOCK) {
            instance ?: createDatabase(context).also { instance = it }
        }

        private fun createDatabase(context: Context) =
            Room.databaseBuilder(
                context.applicationContext,
                PeopleDatabase::class.java,
                "people_db.db"
            ).build()
    }
}