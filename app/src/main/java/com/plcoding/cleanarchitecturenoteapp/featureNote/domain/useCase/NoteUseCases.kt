package com.plcoding.cleanarchitecturenoteapp.featureNote.domain.useCase

data class NoteUseCases(
    val getNoteUseCase: GetNotesUseCase,
    val deleteNoteUseCase: DeleteNoteUseCase,
    val addNoteUserCase: AddNoteUseCase,
    val getSingleNoteUseCase: GetSingleNoteUseCase
)
