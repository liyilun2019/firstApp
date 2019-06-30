package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListViewTest extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_test);
        listView = findViewById(R.id.listView);
        ArrayAdapter<String> mArrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1);
        mArrayAdapter.add("123");
        mArrayAdapter.add("456");
        mArrayAdapter.add(getResources().getString(R.string.helloworld));
        mArrayAdapter.add(getResources().getString(R.string.button));
        listView.setAdapter(mArrayAdapter);
    }
}
