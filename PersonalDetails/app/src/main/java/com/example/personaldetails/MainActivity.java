package com.example.personaldetails;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText minfoInput;
    private TextView minfoOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        minfoInput = findViewById(R.id.infoInput);
        minfoOutput = findViewById(R.id.infoOutput);
    }

    public void displayInfo(View view) {
        String color = minfoInput.getText().toString().toLowerCase();
        String message = "";

        switch (color) {
            case "matt":
                message = "You Are Matt and a Legend!!!";
                minfoOutput.setText(message);
                minfoOutput.setTextColor(Color.BLUE);
                break;
            case "lois":
                message = "You Are Lois and Smell!!!";
                minfoOutput.setText(message);
                minfoOutput.setTextColor(Color.MAGENTA);
                break;
            case "lily":
                message = "You Are Lily and Don't have a willy!!!";
                minfoOutput.setText(message);
                minfoOutput.setTextColor(Color.RED);
                break;
            case "":
                message = "Enter a name below";
                minfoOutput.setText(message);
                minfoOutput.setTextColor(Color.BLACK);
                break;
            default:
                message = "I Haven't Coded for this Person Whoops!!!";
                minfoOutput.setText(message);
                minfoOutput.setTextColor(Color.rgb(200,105,210));
                break;
        }
    }
}

