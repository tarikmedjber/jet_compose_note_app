package com.plcoding.cleanarchitecturenoteapp.di

import android.app.Application
import androidx.room.Room
import com.plcoding.cleanarchitecturenoteapp.featureNote.data.dataSource.NoteDao
import com.plcoding.cleanarchitecturenoteapp.featureNote.data.dataSource.NoteDataBase
import com.plcoding.cleanarchitecturenoteapp.featureNote.data.dataSource.NoteDataBase.Companion.DATABASE_NAME
import com.plcoding.cleanarchitecturenoteapp.featureNote.data.repository.NoteRepositoryImpl
import com.plcoding.cleanarchitecturenoteapp.featureNote.domain.repository.NoteRepository
import com.plcoding.cleanarchitecturenoteapp.featureNote.domain.useCase.*
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun providesNoteDatabase(app: Application): NoteDataBase {
        return Room.databaseBuilder(
            app,
            NoteDataBase::class.java,
            DATABASE_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun providesNoteRepository(db: NoteDataBase): NoteRepository {
        return NoteRepositoryImpl(db.noteDao)
    }

    @Provides
    @Singleton
    fun providesNoteUseCases(repository: NoteRepository): NoteUseCases {
        return NoteUseCases(
            getNoteUseCase = GetNotesUseCase(repository),
            deleteNoteUseCase = DeleteNoteUseCase(repository),
            addNoteUserCase = AddNoteUseCase((repository)),
            getSingleNoteUseCase = GetSingleNoteUseCase((repository))
        )
    }
}