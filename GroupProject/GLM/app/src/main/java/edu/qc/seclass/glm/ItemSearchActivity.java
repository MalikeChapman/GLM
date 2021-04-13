package edu.qc.seclass.glm;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.grocerylistmanager.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.parse.FindCallback;
import com.parse.ParseException;
import com.parse.ParseQuery;
import com.parse.SaveCallback;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

public class ItemSearchActivity extends AppCompatActivity {
    BottomNavigationView bnvToolBarItemSearch;
    Context mContext = this;
    RecyclerView rvItemView;
    ItemAdapter mItemAdapter;
    List<Item> mItems;
    Button btnAdd;
    EditText etAddItem;
    EditText etQuantityNumber;
    ImageView ivMinusQuantity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_search);

        bnvToolBarItemSearch = findViewById(R.id.bnvToolbarItemSearch);

        rvItemView = findViewById(R.id.rvItemView);
        btnAdd = findViewById(R.id.btnAdd);
        etAddItem = findViewById(R.id.etAddItem);



        mItems = new ArrayList<>();
        mItemAdapter = new ItemAdapter(mContext, mItems);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rvItemView.setLayoutManager(linearLayoutManager);
        rvItemView.setAdapter(mItemAdapter);

        queryItems();







        bnvToolBarItemSearch.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case (R.id.miHome):
                    {
                        Intent i = new Intent(mContext, MainActivity.class);
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

    private void queryItems() {
        ParseQuery<Item> query = ParseQuery.getQuery(Item.class);
        query.addAscendingOrder(Item.KEY_ITEM_NAME);
        query.findInBackground(new FindCallback<Item>() {
            @Override
            public void done(List<Item> objects, ParseException e) {
                if (e != null){
                    Log.e("ItemSearchActivity", "Issue with getting items", e);
                    return;
                }
                mItemAdapter.clear();
                mItemAdapter.addAll(objects);
            }
        });
    }



    public void addItemsToDatabase(View view) {
        String itemText = etAddItem.getText().toString();
       Item itemToAdd = new Item();
       itemToAdd.setKeyItemName(itemText);
       itemToAdd.saveInBackground(new SaveCallback() {
           @Override
           public void done(ParseException e) {
               if (e != null){
                   Log.e("ItemSearchActivity", "Issue with save", e);
                   Toast.makeText(mContext, "Error while saving new item", Toast.LENGTH_SHORT).show();
               }
               Log.i("ItemSearchActivity", "New item saved successfully");
               queryItems();
               etAddItem.setText("");
           }
       });

    }


}