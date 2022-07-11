package com.plcoding.cleanarchitecturenoteapp.featureNote.presentation.utils

import com.plcoding.cleanarchitecturenoteapp.featureNote.domain.model.Note
import com.plcoding.cleanarchitecturenoteapp.featureNote.domain.utils.NoteOrder
import com.plcoding.cleanarchitecturenoteapp.featureNote.domain.utils.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)
