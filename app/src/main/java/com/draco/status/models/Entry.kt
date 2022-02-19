package com.draco.status.models

data class Entry(
    val rating: Rating,
    val timestamp: Long,
    val description: String? = null
)