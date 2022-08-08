package com.jcn.businesscard

import android.app.Application
import com.jcn.businesscard.data.AppDatabase
import com.jcn.businesscard.data.BusinessCardRepository

class App : Application() {
    val database by lazy {AppDatabase.getDatabase(this)}
    val repository by lazy {BusinessCardRepository(database.businessDao())}
}