package com.example.radiocheckbox;

import android.content.DialogInterface;
import android.preference.DialogPreference;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioGroup rg=(RadioGroup) findViewById(R.id.bgroup1);
        RadioButton rb1=(RadioButton) findViewById(R.id.male);
        RadioButton rb2=(RadioButton)findViewById(R.id.female) ;
        Button view =(Button)findViewById(R.id.view) ;

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alrt=new AlertDialog.Builder(MainActivity.this);
                alrt.setMessage("Clicked");
                alrt.setTitle("Alert Box");
                alrt.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                alrt.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
            }
        });
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(group.getCheckedRadioButtonId()==R.id.female)
                    Toast.makeText(MainActivity.this,"ans"+getText(R.id.male),Toast.LENGTH_LONG).show();
            }
        });
    }
}
