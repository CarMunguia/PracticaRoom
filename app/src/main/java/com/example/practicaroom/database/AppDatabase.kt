package com.example.practicaroom.database

import androidx.room.Database
import androidx.room.RoomDatabase

const val DATABASE_VERSION = 1
const val TABLE_USERS = "users"
const val DATABASE_NAME = "appdata" +
        "base.sqlite"

@Database(entities = [UserEntity::class],
    version = DATABASE_VERSION
)

abstract class AppDatabase : RoomDatabase(){
    abstract fun userDao(): UserDao

}