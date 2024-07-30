package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    // Using ArrayList to store images data
    ArrayList courseImg = new ArrayList<>(Arrays.asList(R.drawable.flag_of_nepal, R.drawable.flag_of_nepal,
            R.drawable.flag_of_nepal, R.drawable.flag_of_nepal,
            R.drawable.flag_of_nepal, R.drawable.flag_of_nepal,
            R.drawable.flag_of_nepal, R.drawable.flag_of_nepal,R.drawable.flag_of_nepal, R.drawable.flag_of_nepal,
            R.drawable.flag_of_nepal, R.drawable.flag_of_nepal,
            R.drawable.flag_of_nepal, R.drawable.flag_of_nepal,
            R.drawable.flag_of_nepal, R.drawable.flag_of_nepal));
    ArrayList courseName = new ArrayList<>(Arrays.asList("Nepal", "Nepal", "Nepal", "Nepal", "Nepal",
            "Nepal", "Nepal", "Nepal","Nepal", "Nepal", "Nepal", "Nepal", "Nepal",
            "Nepal", "Nepal", "Nepal"));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Getting reference of recyclerView
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        // Setting the layout as linear
        // layout for vertical orientation
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);

        // Sending reference and data to Adapter
        Adapter adapter = new Adapter(MainActivity.this, courseImg, courseName);

        // Setting Adapter to RecyclerView
        recyclerView.setAdapter(adapter);
    }
}