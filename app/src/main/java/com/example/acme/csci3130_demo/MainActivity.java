package com.example.acme.csci3130_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private Button button;
private EditText editText;
private TextView viewText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.buttonPress);
        editText = findViewById(R.id.editText);
        viewText = findViewById(R.id.viewText);
        //function that changes text on the button press
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewText.setText(editText.getText());
            }
        });

    }
}
