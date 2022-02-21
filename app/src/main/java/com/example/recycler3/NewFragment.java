package com.example.recycler3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class NewFragment extends Fragment {
    private ArrayList<String> date;
    private RecyclerView recyclerView;
    private ContactsAdapter contactsAdapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_new, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        namData();
        recyclerView = view.findViewById(R.id.Recycler_btn);
        contactsAdapter = new ContactsAdapter(date);
        recyclerView.setAdapter(contactsAdapter);


    }

    private void namData() {
        date = new ArrayList<>();
        date.add("роберт");
        date.add("Эдуард");
        date.add("эрик");
        date.add("саша");
        date.add("николай");
        date.add("алексей");
        date.add("питер");
        date.add("саша");
        date.add("остин");
        date.add("влдадислав");
        date.add("бенджемин");
        date.add("алберт");
        date.add("бернард");
        date.add("стивен");
        date.add("эшли");
        date.add("карл");
        date.add("брайн");
    }
}