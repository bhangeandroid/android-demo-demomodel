package com.example.activity_module;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

/**
 * Created by Shree on 2/7/2018.
 */

public class ThirdActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);

        EditText edit_text5=(EditText)findViewById(R.id.edit_text5);
        EditText edit_text6=(EditText)findViewById(R.id.edit_text6);
        EditText edit_text7=(EditText)findViewById(R.id.edit_text7);

    }
}

