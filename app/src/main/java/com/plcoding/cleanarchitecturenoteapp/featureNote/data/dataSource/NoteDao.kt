package com.plcoding.cleanarchitecturenoteapp.featureNote.data.dataSource

import androidx.room.*
import com.plcoding.cleanarchitecturenoteapp.featureNote.domain.model.Note
import kotlinx.coroutines.flow.Flow

@Dao
interface NoteDao {

    @Query("SELECT * FROM note")
    fun getNotes(): Flow<List<Note>>

    @Query("SELECT * FROM note WHERE id=:id")
    suspend fun getNoteById(id: Int): Note?

    // if call insert with id that already exists, will just update
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNote(note: Note)

    @Delete
    suspend fun deleteNote(note: Note)

}