package edu.qc.seclass.glm;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.grocerylistmanager.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bnvToolBar;
    Context mContext = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bnvToolBar = findViewById(R.id.bnvToolBar);

        bnvToolBar.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case (R.id.miHome):
                        {Intent i = new Intent(mContext, MainActivity.class);
                        startActivity(i);
                            Toast.makeText(mContext, "Main Screen", Toast.LENGTH_SHORT).show();

                            return true;}
                    case (R.id.miAddItem):
                        {Intent i = new Intent(mContext, ItemSearchActivity.class);
                        startActivity(i);
                            Toast.makeText(mContext, "Item Screen", Toast.LENGTH_SHORT).show();

                            return true;}
                    case (R.id.miProfile):
                        {
                            Intent i = new Intent(mContext, ProfileActivity.class);
                            startActivity(i);
                            Toast.makeText(mContext, "Profile Screen", Toast.LENGTH_SHORT).show();

                            return true;
                        }
                    case (R.id.miLogout):
                        {//Insert code here to sign User out of account
                            Intent i = new Intent(mContext, LoginActivity.class);
                        startActivity(i);
                            Toast.makeText(mContext, "Login Screen", Toast.LENGTH_SHORT).show();
                        return true;}

                }
                return true;
            }
        });

    }


}