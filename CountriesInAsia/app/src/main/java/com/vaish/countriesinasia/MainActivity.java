package com.vaish.countriesinasia;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class  MainActivity extends AppCompatActivity
{
    ListView listView;
    String[] listItems = {"Item one","Item two", "Item three"};
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.list);
        adapter = new ArrayAdapter<>(this, R.layout.country_item, R.id.listText, listItems);
        listView.setAdapter(adapter);
    }
}