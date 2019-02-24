package com.example.bustrackingsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.common.util.Base64Utils;

public class TextMessage extends AppCompatActivity {
private Button Close;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_message);
        //setup
        setup();

        //close chat
        Close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(TextMessage.this, menu.class);
                startActivity(intent);
            }
        });
    }



    private void setup()
    {
        Close=(Button)findViewById(R.id.close);
    }
}
