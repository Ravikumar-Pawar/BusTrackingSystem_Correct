package com.example.bustrackingsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FuelDetails extends AppCompatActivity {
private Button Goback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fuel_details);
   // call setup
        setup();

        // go bacck
        Goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(FuelDetails.this, menu.class);
                startActivity(intent);
            }
        });




    }





private void setup()
{
    Goback= (Button)findViewById(R.id.goback);
}

}
