package com.plcoding.cleanarchitecturenoteapp.featureNote.domain.utils

sealed class OrderType {
    object Ascending : OrderType()
    object Descending : OrderType()
}
