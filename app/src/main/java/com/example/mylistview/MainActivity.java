package com.example.mylistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView listView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listitemView);

        String [] Countryname = getResources().getStringArray(R.array.country_name);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,R.layout.countrynamelist,R.id.TextViewid,Countryname);
        listView.setAdapter(adapter);

    }
}