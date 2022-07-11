package com.plcoding.cleanarchitecturenoteapp.featureNote.domain.useCase

import com.plcoding.cleanarchitecturenoteapp.featureNote.domain.model.Note
import com.plcoding.cleanarchitecturenoteapp.featureNote.domain.repository.NoteRepository

class GetSingleNoteUseCase(private val repository: NoteRepository) {
    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }
}