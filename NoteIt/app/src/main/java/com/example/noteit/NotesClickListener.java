package com.example.noteit;

import androidx.cardview.widget.CardView;

import com.example.noteit.Models.Notes;

public interface NotesClickListener {
    void onClick(Notes notes);
    void onLongClick(Notes notes, CardView cardView);
}
