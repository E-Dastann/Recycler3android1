package com.example.recycler3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ContactsAdapter extends RecyclerView.Adapter<ViewHolderContact> {
    private ArrayList<String> dateIpContacts;

    public ContactsAdapter(ArrayList<String> dateIpContacts) {
        this.dateIpContacts = dateIpContacts;
    }

    @NonNull
    @Override
    public ViewHolderContact onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolderContact(LayoutInflater.from(parent.getContext()).inflate(R.layout.itemcontacts, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderContact holder, int position) {
        holder.contact(dateIpContacts.get(position));
    }

    @Override
    public int getItemCount() {
        return dateIpContacts.size();
    }
}
