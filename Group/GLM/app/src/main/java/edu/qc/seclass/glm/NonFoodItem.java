package edu.qc.seclass.glm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.grocerylistmanager.R;

public class NonFoodItem extends AppCompatActivity {
    Button btnPetCare;
    Button btnStationary;
    Button btnFirstAid;
    Button btnCleaning;
    Context mContext = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nonfooditem);
        btnPetCare = findViewById(R.id.btnGrocery);
        btnStationary = findViewById(R.id.btnProduce);
        btnFirstAid = findViewById(R.id.btnDeli);
        btnCleaning = findViewById(R.id.btnMeat);

        btnPetCare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "No Item Found", Toast.LENGTH_SHORT).show();
            }
        });

        btnStationary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "No Item Found", Toast.LENGTH_SHORT).show();
            }
        });

        btnFirstAid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "No Item Found", Toast.LENGTH_SHORT).show();
            }
        });

        btnCleaning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "No Item Found", Toast.LENGTH_SHORT).show();
            }
        });
    }

}