package com.meterstoinches.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView t1,t2,t3;
    private Bundle extras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t1 = findViewById(R.id.nameID);
        t2 = findViewById(R.id.descriptionID);
        t3 = findViewById(R.id.ratingID);

        extras = getIntent().getExtras();

        if(extras != null){
            t1.setText(extras.getString("name"));
            t2.setText(extras.getString("description"));
            t3.setText(extras.getString("rating"));
        }
    }
}
