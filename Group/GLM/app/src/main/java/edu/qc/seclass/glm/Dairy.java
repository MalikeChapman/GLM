package edu.qc.seclass.glm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.grocerylistmanager.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Dairy extends AppCompatActivity {
    BottomNavigationView bnvToolBar;
    Button btnMilk;
    Button btnYogurt;
    Button btnCheese;
    Button btnButter;
    Context mContext = this;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dairy);
        btnMilk = findViewById(R.id.btnMilk);
        btnYogurt = findViewById(R.id.btnYogurt);
        btnCheese = findViewById(R.id.btnCheese);
        btnButter = findViewById(R.id.btnButter);
        bnvToolBar = findViewById(R.id.bnvToolBar);

        btnMilk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mContext, ItemDescription.class);
                startActivity(i);
            }
        });

        btnYogurt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mContext, ItemDescription.class);
                startActivity(i);
            }
        });

        btnCheese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mContext, ItemDescription.class);
                startActivity(i);
            }
        });

        btnButter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mContext, ItemDescription.class);
                startActivity(i);
            }
        });

    }
}
