package com.example.callingthroughintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.numberET);
        button=findViewById(R.id.nextBTN);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String passData=editText.getText().toString();
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("keynum",passData);
                startActivity(intent);
            }
        });
    }
}