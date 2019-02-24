package com.example.bustrackingsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BusNumberChoices extends AppCompatActivity {
    private Button fetch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus_number_choices);
        setUPViews();


        //Go TO menu page
        fetch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BusNumberChoices.this, menu.class);
                startActivity(intent);
            }
        });

    }
    private void setUPViews()
    {
        fetch=(Button)findViewById(R.id.fetchdetails);
    }
}
