package edu.qc.seclass.glm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.grocerylistmanager.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Deli extends AppCompatActivity {
    BottomNavigationView bnvToolBar;
    Button btnHotFood;
    Button btnSalad;
    Button btnSandwich;
    Button btnSushi;
    Context mContext = this;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deli);
        btnHotFood = findViewById(R.id.btnHotFood);
        btnSalad = findViewById(R.id.btnSalad);
        btnSandwich = findViewById(R.id.btnSandwich);
        btnSushi = findViewById(R.id.btnSushi);
        bnvToolBar = findViewById(R.id.bnvToolBar);

        btnHotFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mContext, ItemDescription.class);
                startActivity(i);
            }
        });

        btnSalad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mContext, ItemDescription.class);
                startActivity(i);
            }
        });

        btnSandwich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mContext, ItemDescription.class);
                startActivity(i);
            }
        });

        btnSushi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mContext, ItemDescription.class);
                startActivity(i);
            }
        });

    }
}
