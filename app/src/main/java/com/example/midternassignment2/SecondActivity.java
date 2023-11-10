package com.example.midternassignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        getSupportActionBar().hide();
        getSupportActionBar().setTitle("Full screen");

        Intent intent2 = getIntent();

        int i =  intent2.getExtras().getInt("id");

        gridViewAdapter gridViewAdapter  = new gridViewAdapter(this);

        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(gridViewAdapter.image[i]);

        Button back_bt = (Button) findViewById(R.id.back_bt);
        back_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(back);
            }
        });
    }
}