package edu.qc.seclass.glm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.grocerylistmanager.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class FoodItem extends AppCompatActivity {
    BottomNavigationView bnvToolBar;
    Button btnGrocery;
    Button btnProduce;
    Button btnDeli;
    Button btnMeat;
    Button btnDairy;
    Context mContext = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fooditem);
        btnGrocery = findViewById(R.id.btnGrocery);
        btnProduce = findViewById(R.id.btnProduce);
        btnDeli = findViewById(R.id.btnDeli);
        btnMeat = findViewById(R.id.btnMeat);
        btnDairy = findViewById(R.id.btnDairy);
        bnvToolBar = findViewById(R.id.bnvToolBar);

        btnGrocery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mContext, Grocery.class);
                startActivity(i);
            }
        });

        btnProduce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mContext, Produce.class);
                startActivity(i);
            }
        });

        btnDeli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mContext, Deli.class);
                startActivity(i);
            }
        });

        btnMeat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mContext, Meat.class);
                startActivity(i);
            }
        });

        btnDairy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mContext, Dairy.class);
                startActivity(i);
            }
        });
    }
}
