package com.example.rememberme.models

import java.util.Date

data class UserEvent (
    val title: String,
    val description: String,
    val date: Date,
    val notifications: List<Date>
)
