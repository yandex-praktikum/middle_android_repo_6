package ru.yandexpraktikum.all_notes.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import ru.yandexpraktikum.all_notes.domain.interactors.DeleteNoteInteractor
import ru.yandexpraktikum.all_notes.domain.interactors.DeleteNoteInteractorImpl
import ru.yandexpraktikum.all_notes.domain.interactors.FetchAllNotesInteractor

@Module
@InstallIn(ViewModelComponent::class)
interface AllNotesModule {

    @Binds
    fun bindFetchAllNotesUsecase(
        impl: FetchAllNotesInteractor
    ): FetchAllNotesInteractor

    @Binds
    fun bindDeleteNoteUsecase(
        impl: DeleteNoteInteractorImpl
    ): DeleteNoteInteractor
}