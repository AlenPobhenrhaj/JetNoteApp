package com.example.jetnoteapp.data

import com.example.jetnoteapp.model.Note

class NotesDataSource {
    fun loadNotes(): List<Note> {
        return listOf(

            Note(title = "A good day", description = "We went on a vacation by the lake"),
            Note(title = "Android Compose", description = "Working on Android Compose course today"),
            Note(title = "Keep at it...", description = "Sometimes things just happen"),
            Note(title = "A movie day", description = "Watching a movie with family today"),
            Note(title = "Beast, first day first show", description = "Leaner,Meaner,Stronger, can you feel the terror,power,fire"),
            Note(title = "Yennai Arindhal", description = "Victorrrr!!!!!!!!"),
            Note(title = "Dhool", description = "Ooo podhu"),

        )
    }
}