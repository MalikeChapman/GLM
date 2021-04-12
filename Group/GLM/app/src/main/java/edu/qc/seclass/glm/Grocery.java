package edu.qc.seclass.glm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.grocerylistmanager.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Grocery extends AppCompatActivity {
    BottomNavigationView bnvToolBar;
    Button btnCereal;
    Button btnCandy;
    Button btnChips;
    Button btnPasta;
    Button btnRice;
    Context mContext = this;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grocery);
        btnCereal = findViewById(R.id.btnCereal);
        btnCandy = findViewById(R.id.btnCandy);
        btnChips = findViewById(R.id.btnChips);
        btnPasta = findViewById(R.id.btnPasta);
        btnRice = findViewById(R.id.btnRice);
        bnvToolBar = findViewById(R.id.bnvToolBar);

        btnCereal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mContext, ItemDescription.class);
                startActivity(i);
            }
        });

        btnCandy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mContext, ItemDescription.class);
                startActivity(i);
            }
        });

        btnChips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mContext, ItemDescription.class);
                startActivity(i);
            }
        });

        btnPasta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mContext, ItemDescription.class);
                startActivity(i);
            }
        });

        btnRice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mContext, ItemDescription.class);
                startActivity(i);
            }
        });

    }

}
