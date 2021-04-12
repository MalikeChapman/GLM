package edu.qc.seclass.glm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.grocerylistmanager.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Produce extends AppCompatActivity {
    BottomNavigationView bnvToolBar;
    Button btnFruit;
    Button btnVegetable;
    Context mContext = this;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produce);
        btnFruit = findViewById(R.id.btnFruit);
        btnVegetable = findViewById(R.id.btnVegetable);
        bnvToolBar = findViewById(R.id.bnvToolBar);

        btnFruit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mContext, Fruit.class);
                startActivity(i);
            }
        });

        btnVegetable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mContext, Vegetable.class);
                startActivity(i);
            }
        });

    }
}
