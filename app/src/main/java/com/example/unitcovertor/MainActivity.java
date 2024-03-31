package com.example.unitcovertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     TextView welcomeText , result_text;
     Button btn;
     EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        welcomeText = findViewById(R.id.title);
        result_text = findViewById(R.id.value);
        editText = findViewById(R.id.input);
        btn = findViewById(R.id.convertor);

btn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
     double kilos_entered = Double.parseDouble(editText.getText().toString());
     result_text.setText(""+covertToPound(kilos_entered) + " lb");

    }
});

    }
    public double covertToPound(double kilos){
      double pounds_result = kilos*2.20462;
      return pounds_result;
    }
}