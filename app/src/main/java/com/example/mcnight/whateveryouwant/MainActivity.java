package com.example.mcnight.whateveryouwant;

import android.content.Intent;
import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView text1 = (TextView) findViewById(R.id.hello);
        final TextView text2 = (TextView) findViewById(R.id.hello2);
        final ImageView image1 = (ImageView) findViewById(R.id.pokeball);


        text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text2.setText(R.string.idmatter);
            }
        });

        text2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text2.setBackgroundResource(R.drawable.pbal);
            }
        });

        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image1.setImageResource(R.drawable.pka);
                Intent nextPage = new Intent(MainActivity.this, next.class);
                startActivity(nextPage);
            }
        });

    }
}
