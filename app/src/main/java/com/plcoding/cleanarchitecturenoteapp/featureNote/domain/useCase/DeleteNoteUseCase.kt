package com.plcoding.cleanarchitecturenoteapp.featureNote.domain.useCase

import com.plcoding.cleanarchitecturenoteapp.featureNote.domain.model.Note
import com.plcoding.cleanarchitecturenoteapp.featureNote.domain.repository.NoteRepository

class DeleteNoteUseCase(private val repository: NoteRepository) {

    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }

}