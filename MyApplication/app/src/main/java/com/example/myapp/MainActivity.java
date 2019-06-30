package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn1;
    Button btn2;
    Button btn3;
    CheckBox checkBox;
    TextView textView;
    public static String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        checkBox = findViewById(R.id.checkBox);
        textView = findViewById(R.id.textView);
        checkBox.setText(R.string.clickbox);
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if(isChecked){
                    textView.setText(R.string.changed_words);
                }else{
                    textView.setText(R.string.helloworld);
                }
            }
        });
    }

    public void showImage(View view){
        Log.d(TAG,"show image act");
        Intent intent = new Intent(this, ShowImage.class);
        startActivity(intent);
    }

    public void showGrid(View view){
        Log.e(TAG,"show grid act");
        Intent intent = new Intent(this, GridViewTest.class);
        startActivity(intent);
    }

    public void showList(View view){
        Log.i(TAG,"show list act");
        Intent intent = new Intent(this, ListViewTest.class);
        startActivity(intent);
    }
}
