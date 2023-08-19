package com.example.notekmmapp.android.note_list

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.notekmmapp.domain.note.Note

@Composable
fun NoteItem(
    note: Note,
    backgroundColor: Color,
    onNoteClick: () -> Unit,
    onDeleteClick: () -> Unit,
    modifier: Modifier = Modifier
    ) {

}