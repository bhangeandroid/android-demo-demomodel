package com.example.activity_module;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Shree on 2/7/2018.
 */

public class SecondActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);


        EditText edit_text3=(EditText)findViewById(R.id.edit_text3);
        EditText edit_text4=(EditText)findViewById(R.id.edit_text4);
        EditText edit_text5=(EditText)findViewById(R.id.edit_text5);
        Button button2=(Button)findViewById(R.id.button2);

        Intent intent1=new Intent(this,ThirdActivity.class);
        startActivity(intent1);
    }
}
