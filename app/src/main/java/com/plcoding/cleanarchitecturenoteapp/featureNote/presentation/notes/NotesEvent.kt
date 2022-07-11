package com.plcoding.cleanarchitecturenoteapp.featureNote.presentation.notes

import com.plcoding.cleanarchitecturenoteapp.featureNote.domain.model.Note
import com.plcoding.cleanarchitecturenoteapp.featureNote.domain.utils.NoteOrder

sealed class NotesEvent {
    data class Order(val noteOrder: NoteOrder): NotesEvent()
    data class DeleteNote(val note: Note): NotesEvent()
    object RestoreNote: NotesEvent()
    object ToggleOrderSection: NotesEvent()
}
