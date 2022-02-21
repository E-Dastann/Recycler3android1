package com.example.recycler3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolderContact extends RecyclerView.ViewHolder {
    private TextView textView;

    public ViewHolderContact(@NonNull View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.contact);

    }

    public void contact(String date) {
        textView.setText(date);

    }
}
