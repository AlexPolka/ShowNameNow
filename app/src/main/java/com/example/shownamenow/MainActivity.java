package com.example.shownamenow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Declare Variables
    private Button myButton;
    private TextView showText;
    private EditText enterName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //The actual meat and potatoes
        myButton = findViewById(R.id.button);
        enterName = findViewById(R.id.editText);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Takes what user enters and upon button press, displays "Hello ..."
                String name = enterName.getText().toString();
                showText.setText("Hello " +name+"!");
            }
        });
        showText = findViewById(R.id.textView);

    }
}
