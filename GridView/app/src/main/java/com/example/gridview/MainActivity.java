package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    GridView simpleGrid;

    String countryList[] = {"India", "China", "australia", "Nepal", "America", "NewZealand"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simpleGrid = (GridView) findViewById(R.id.simpleGridView); // init GridView
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_gridview, R.id.simpleGridView, countryList);
        simpleGrid.setAdapter(arrayAdapter);
    }
}