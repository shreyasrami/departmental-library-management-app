package com.example.unicodelibraryapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Arrays;

public class FinesFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View fragmentView = inflater.inflate(R.layout.fragment_fines, container, false);

        //Initializing the recycler view
        RecyclerView recyclerView = fragmentView.findViewById(R.id.fines_rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.addItemDecoration(new DividerItemDecoration(recyclerView.getContext(), ((LinearLayoutManager)recyclerView.getLayoutManager()).getOrientation()));

        //Initialize recycler adapter
        ArrayList<String> bookTitles = new ArrayList<String>(Arrays.asList("Condensed Matter Physics Book 1000223", "Operating Systems 1", "Computer Networks 3"));
        FinesAdapter adapter = new FinesAdapter(bookTitles);
        recyclerView.setAdapter(adapter);

        return fragmentView;
    }
}