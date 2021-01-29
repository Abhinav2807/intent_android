package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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

        Button continue_button=findViewById(R.id.button);
        Intent i = new Intent(getApplicationContext(), MainActivity2.class);

        EditText editText=findViewById(R.id.editTextTextPersonName);

        continue_button.setOnClickListener( new View.OnClickListener(){

            @Override
            public void onClick(View v) {
               if(editText.toString().length()!=0)
               {
                   i.putExtra("Name",editText.getText().toString());
                   Toast.makeText(getApplicationContext(), "Welcome "+editText.getText().toString() , Toast.LENGTH_SHORT).show();
                   startActivity(i);
               }
               else
                   Toast.makeText(MainActivity.this, "Please enter some data !!", Toast.LENGTH_SHORT).show();

            }
        });
    }
}