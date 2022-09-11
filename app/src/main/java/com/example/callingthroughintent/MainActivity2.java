package com.example.callingthroughintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView textView;
    private Button button;
    private Button call;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView=findViewById(R.id.phoneTV);
        button=findViewById(R.id.previousBTN);
        call=findViewById(R.id.callBTN);

        String number=getIntent().getStringExtra("keynum");
        textView.setText("+88"+number);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity2.this,MainActivity.class);
                startActivity(intent);
            }
        });

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // calling functionality code
                Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + number));
                startActivity(intentCall);
            }
        });
    }
}