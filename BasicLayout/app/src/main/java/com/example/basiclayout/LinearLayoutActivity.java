package com.example.basiclayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LinearLayoutActivity extends AppCompatActivity {
    EditText text1;
    EditText text2;
    EditText text3;

    Button b1;

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("MyApp: OnStart");

    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("MyApp: OnResume");

    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("MyApp: OnPause");

    }


    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("MyApp: OnStop");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MyApp: OnDestroy");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_view);
        System.out.println("MyApp: Oncreate");
        text1= findViewById(R.id.text1);
        text2= findViewById(R.id.text2);
        text3= findViewById(R.id.text3);

        b1= findViewById(R.id.button);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                int a=Integer.parseInt(text1.getText().toString());
                int b=Integer.parseInt(text2.getText().toString());
                int c=a+b;
                text3.setText(String.valueOf(c));
            }
        });

    }
}