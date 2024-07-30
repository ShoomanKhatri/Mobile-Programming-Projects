package com.example.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView simpleList;
    String countryList[] = {"Nepal","Nepal","Nepal", "Nepal", "Nepal","Nepal", "Nepal", "Nepal", "Nepal", "Nepal", "Nepal","Nepal","Nepal", "Nepal", "Nepal", "Nepal", "Nepal", "Nepal"};
    int flags[] = {R.drawable.flag_of_nepal,R.drawable.flag_of_nepal,R.drawable.flag_of_nepal,R.drawable.flag_of_nepal,R.drawable.flag_of_nepal, R.drawable.flag_of_nepal, R.drawable.flag_of_nepal,R.drawable.flag_of_nepal,R.drawable.flag_of_nepal,R.drawable.flag_of_nepal,R.drawable.flag_of_nepal,R.drawable.flag_of_nepal, R.drawable.flag_of_nepal, R.drawable.flag_of_nepal,R.drawable.flag_of_nepal,R.drawable.flag_of_nepal,R.drawable.flag_of_nepal,R.drawable.flag_of_nepal};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simpleList = (ListView) findViewById(R.id.simpleListView);
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), countryList, flags);
        simpleList.setAdapter(customAdapter);
    }
}