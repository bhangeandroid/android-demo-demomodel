package com.example.activity_module;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edit_text1 = (EditText) findViewById(R.id.edit_text1);
        EditText edit_text2 = (EditText) findViewById(R.id.edit_text2);
        Button button1 = (Button) findViewById(R.id.button1);

        Intent intent = new Intent(this, SecondActivity.class);//which we want to call3
        startActivity(intent);//call to intent

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "", Toast.LENGTH_LONG).show();
            }
        });
    }
}