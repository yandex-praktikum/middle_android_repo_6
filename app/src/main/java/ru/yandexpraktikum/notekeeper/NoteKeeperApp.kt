package ru.yandexpraktikum.notekeeper

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import ru.yandexpraktikum.notekeeper.di.AppContainer

@HiltAndroidApp
class NoteKeeperApp: Application() {
    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = AppContainer(this)
    }
}