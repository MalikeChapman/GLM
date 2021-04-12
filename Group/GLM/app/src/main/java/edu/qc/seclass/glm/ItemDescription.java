package edu.qc.seclass.glm;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.grocerylistmanager.R;

public class ItemDescription extends AppCompatActivity {
    ImageView itemPhoto;
    TextView textName;
    TextView textPrice;
    TextView textDescription;
    ImageButton btnNegative;
    TextView textQuantity;
    ImageButton btnPositive;
    ImageButton btnCart;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_description);
        itemPhoto = findViewById(R.id.itemPhoto);
        textName = findViewById(R.id.textName);
        textPrice = findViewById(R.id.textPrice);
        textDescription = findViewById(R.id.textDescription);
        btnNegative = findViewById(R.id.btnNegative);
        textQuantity = findViewById(R.id.textQuantity);
        btnPositive = findViewById(R.id.btnPositive);
        btnCart = findViewById(R.id.btnCart);

    }
}
