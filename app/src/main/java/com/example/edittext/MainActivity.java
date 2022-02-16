package com.example.edittext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // Declare data initialize
    Button submit;
    EditText name, password, email, contact, date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set data from elements in layout
        name = (EditText) findViewById(R.id.editText1);
        password = (EditText) findViewById(R.id.editText2);
        email = (EditText) findViewById(R.id.editText3);
        date = (EditText) findViewById(R.id.editText4);
        contact = (EditText) findViewById(R.id.editText5);
        submit = (Button)  findViewById(R.id.button);

        // Event onClick on button
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (
                    name.getText().toString().isEmpty()
                        || password.getText().toString().isEmpty()
                        || email.getText().toString().isEmpty()
                        || date.getText().toString().isEmpty()
                        || contact.getText().toString().isEmpty()
                ) {
                    Toast.makeText(
                        getApplication(),
                        "Enter the Data",
                        Toast.LENGTH_SHORT
                    ).show();
                } else {
                    Toast.makeText(
                        getApplication(),
                        "Name - " + name.getText().toString()
                            + " \n" + "Password - " + password.getText().toString()
                            + " \n" + "E-mail - " + email.getText().toString()
                            + " \n" + "Date - " + date.getText().toString()
                            + " \n" + "Contact - " + contact.getText().toString(),
                        Toast.LENGTH_SHORT
                    ).show();
                }
            }
        });
    }
}