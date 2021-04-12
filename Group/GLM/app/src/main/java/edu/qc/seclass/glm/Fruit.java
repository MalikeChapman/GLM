package edu.qc.seclass.glm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.grocerylistmanager.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Fruit extends AppCompatActivity {
    BottomNavigationView bnvToolBar;
    Button btnApple;
    Button btnOrange;
    Button btnBanana;
    Button btnPeach;
    Button btnGrape;
    Context mContext = this;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit);
        btnApple = findViewById(R.id.btnApple);
        btnOrange = findViewById(R.id.btnOrange);
        btnBanana = findViewById(R.id.btnBanana);
        btnPeach = findViewById(R.id.btnPeach);
        btnGrape = findViewById(R.id.btnGrape);
        bnvToolBar = findViewById(R.id.bnvToolBar);

        btnApple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mContext, ItemDescription.class);
                startActivity(i);
            }
        });

        btnOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mContext, ItemDescription.class);
                startActivity(i);
            }
        });

        btnBanana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mContext, ItemDescription.class);
                startActivity(i);
            }
        });

        btnPeach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mContext, ItemDescription.class);
                startActivity(i);
            }
        });

        btnGrape.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mContext, ItemDescription.class);
                startActivity(i);
            }
        });

    }
}
