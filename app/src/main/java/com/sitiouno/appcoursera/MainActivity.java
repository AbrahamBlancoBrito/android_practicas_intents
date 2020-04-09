package com.sitiouno.appcoursera;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String name  = "";
    String date  = "";
    String tlf   = "";
    String email = "";
    String desc  = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button stebutton = (Button)findViewById(R.id.sgtbutton);

        stebutton.setOnClickListener(new View.OnClickListener(){
            @SuppressLint("StringFormatInvalid")
            @Override
            public void onClick(View v) {
                 Intent intent = new Intent (MainActivity.this,ConfirmActivity.class);

                EditText nametext  = (EditText)findViewById(R.id.editTextName);
                EditText tlftext   = (EditText)findViewById(R.id.editTextTlf);
                EditText emailtext = (EditText)findViewById(R.id.editTextEmail);
                EditText desctext  = (EditText)findViewById(R.id.editTextDesc);
                DatePicker picker  = (DatePicker)findViewById(R.id.datePicker);

                 name  = nametext.getText().toString();
                 date  = picker.getDayOfMonth()+"/"+ (picker.getMonth() + 1)+"/"+picker.getYear();
                 tlf   = tlftext.getText().toString();
                 email = emailtext.getText().toString();
                 desc  = desctext.getText().toString();

                intent.putExtra(getResources().getString(R.string.name), name);
                intent.putExtra(getResources().getString(R.string.date), date);
                intent.putExtra(getResources().getString(R.string.tlf), tlf);
                intent.putExtra(getResources().getString(R.string.email), email);
                intent.putExtra(getResources().getString(R.string.desc), desc);

                startActivity(intent);
            }
        });
    }


    @Override
    protected void onResume() {
        super.onResume();

       /* EditText nametext  = (EditText)findViewById(R.id.editTextName);
        EditText tlftext   = (EditText)findViewById(R.id.editTextTlf);
        EditText emailtext = (EditText)findViewById(R.id.editTextEmail);
        EditText desctext  = (EditText)findViewById(R.id.editTextDesc);
        DatePicker picker  = (DatePicker)findViewById(R.id.datePicker);

        Bundle extras = getIntent().getExtras();

        String name2  = extras.getString(getResources().getString(R.string.name));
        String date2  = extras.getString(getResources().getString(R.string.date));
        String tlf2   = extras.getString(getResources().getString(R.string.tlf));
        String email2 = extras.getString(getResources().getString(R.string.email));
        String desc2  = extras.getString(getResources().getString(R.string.desc));

        nametext.setText(name2);
        tlftext.setText(tlf2);
        emailtext.setText(email2);
        desctext.setText(desc2);
       // picker.setText(name);*/

        Toast.makeText(this, "resume", Toast.LENGTH_LONG).show();
    }


    @Override
    protected void onPause() {
        super.onPause();

      /*  EditText nametext  = (EditText)findViewById(R.id.editTextName);
        EditText tlftext   = (EditText)findViewById(R.id.editTextTlf);
        EditText emailtext = (EditText)findViewById(R.id.editTextEmail);
        EditText desctext  = (EditText)findViewById(R.id.editTextDesc);
        DatePicker picker  = (DatePicker)findViewById(R.id.datePicker);

        nametext.setText(name);
        tlftext.setText(tlf);
        emailtext.setText(email);
        desctext.setText(desc);
        // picker.setText(name);*/

        Toast.makeText(this, "pause", Toast.LENGTH_LONG).show();
    }


}
