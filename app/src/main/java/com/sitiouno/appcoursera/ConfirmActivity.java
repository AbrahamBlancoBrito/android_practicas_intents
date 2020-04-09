package com.sitiouno.appcoursera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ConfirmActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm);

        Bundle extras = getIntent().getExtras();

        String name  = extras.getString(getResources().getString(R.string.name));
        String date  = extras.getString(getResources().getString(R.string.date));
        String tlf   = extras.getString(getResources().getString(R.string.tlf));
        String email = extras.getString(getResources().getString(R.string.email));
        String desc  = extras.getString(getResources().getString(R.string.desc));

        TextView nametext  = (TextView)findViewById(R.id.textViewname);
        TextView datetext   = (TextView)findViewById(R.id.textViewdate);
        TextView tlftext   = (TextView)findViewById(R.id.textViewtlf);
        TextView emailtext = (TextView)findViewById(R.id.textViewemail);
        TextView desctext  = (TextView)findViewById(R.id.textViewdesc);

        nametext.setText("Nombre: " + name);
        datetext.setText("Fecha de Nacimiento: "+ date);
        tlftext.setText("Tel: "+ tlf);
        emailtext.setText("Email: "+ email);
        desctext.setText("Descripción: " +desc);

        Button editbutton = (Button)findViewById(R.id.EditButton);

        editbutton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent (ConfirmActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
