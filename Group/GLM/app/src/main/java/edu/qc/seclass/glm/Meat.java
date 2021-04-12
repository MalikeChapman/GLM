package edu.qc.seclass.glm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.grocerylistmanager.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Meat extends AppCompatActivity {
    BottomNavigationView bnvToolBar;
    Button btnChicken;
    Button btnBeef;
    Button btnLamb;
    Button btnSalmon;
    Button btnTuna;
    Context mContext = this;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meat);
        btnChicken = findViewById(R.id.btnChicken);
        btnBeef = findViewById(R.id.btnBeef);
        btnLamb = findViewById(R.id.btnLamb);
        btnSalmon = findViewById(R.id.btnSalmon);
        btnTuna = findViewById(R.id.btnTuna);
        bnvToolBar = findViewById(R.id.bnvToolBar);

        btnChicken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mContext, ItemDescription.class);
                startActivity(i);
            }
        });

        btnBeef.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mContext, ItemDescription.class);
                startActivity(i);
            }
        });

        btnLamb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mContext, ItemDescription.class);
                startActivity(i);
            }
        });

        btnSalmon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mContext, ItemDescription.class);
                startActivity(i);
            }
        });

        btnTuna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mContext, ItemDescription.class);
                startActivity(i);
            }
        });

    }
}
