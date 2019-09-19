package com.example.mattsfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText mColorInput;
    private TextView mColorOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mColorInput = findViewById(R.id.colorInput);
        mColorOutput = findViewById(R.id.colorOutput);
    }

    public void updateColorText(View view) {
        String color = mColorInput.getText().toString().toLowerCase();
        String message = "";

        switch (color) {
            case "blue":
                message = "You Like Blue!!!";
                mColorOutput.setText(message);
                mColorOutput.setTextColor(Color.BLUE);
                break;
            case "green":
                message = "You Like Green!!!";
                mColorOutput.setText(message);
                mColorOutput.setTextColor(Color.GREEN);
                break;
            case "yellow":
                message = "You Like Yellow!!!";
                mColorOutput.setText(message);
                mColorOutput.setTextColor(Color.YELLOW);
                break;
            case "black":
                message = "You Like Black!!!";
                mColorOutput.setText(message);
                mColorOutput.setTextColor(Color.BLACK);
                break;
             default:
                 message = "I Haven't Coded for this Color Whoops!!!";
                 mColorOutput.setText(message);
                 mColorOutput.setTextColor(Color.rgb(200,105,210));
                 break;
        }
    }
}
