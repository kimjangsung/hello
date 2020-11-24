package com.example.consultationofficeinformation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button btn_move;
    private Button btn_move2;
    private Button btn_move3;
    private Button btn_move4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_move = findViewById(R.id.btn_move);
        btn_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , SubActivity.class);
                startActivity(intent); //액티비티 이동
            }
        });
        btn_move2 = findViewById(R.id.btn_move2);
        btn_move2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this , SubActivity2.class);
                startActivity(intent2);
            }
        });
        btn_move3 = findViewById(R.id.btn_move3);
        btn_move3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(MainActivity.this , SubActivity3.class);
                startActivity(intent3);
            }
        });
        btn_move4 = findViewById(R.id.btn_move4);
        btn_move4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(MainActivity.this , SubActivity4.class);
                startActivity(intent4);
            }
        });

    }
}