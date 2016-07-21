package com.example.android.poketmonster;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

/*        ImageButton btnpika = (ImageButton) findViewById(R.id.pika);
        btnpika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int layout = getIntent().getIntExtra("layout", R.layout.pika);
                setContentView(layout);
            }
        });
        ImageButton btneve = (ImageButton) findViewById(R.id.eve);
        btneve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int layout = getIntent().getIntExtra("layout", R.layout.eve);
                setContentView(layout);
            }
        });
        ImageButton btnbutter = (ImageButton) findViewById(R.id.butter);
        btnbutter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int layout = getIntent().getIntExtra("layout", R.layout.butter);
                setContentView(layout);
            }
        });
        ImageButton btnkko = (ImageButton) findViewById(R.id.kko);
        btnkko.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int layout = getIntent().getIntExtra("layout", R.layout.kko);
                setContentView(layout);
            }
        });
        ImageButton btnisang = (ImageButton) findViewById(R.id.isang);
        btnisang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int layout = getIntent().getIntExtra("layout", R.layout.isang);
                setContentView(layout);
            }
        });
        ImageButton btnpairi = (ImageButton) findViewById(R.id.pairi);
        btnpairi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int layout = getIntent().getIntExtra("layout", R.layout.pairi);
                setContentView(layout);
            }
        });

*/
    }
    public void pika(View view){
        Intent intent=new Intent(MainActivity.this,pika.class);
        startActivity(intent);
        finish();
    }
}
