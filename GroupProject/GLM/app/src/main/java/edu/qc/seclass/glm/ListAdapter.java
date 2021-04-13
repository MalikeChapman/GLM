package edu.qc.seclass.glm;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.grocerylistmanager.R;

import org.json.JSONArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {
    Context mContext;
    List<ArrayList> mUserLists;
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View listView = LayoutInflater.from(mContext).inflate(R.layout.listview, parent, false);
        return new ViewHolder(listView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        List<Item> itemList = mUserLists.get(position);
        holder.bind(mUserLists);

    }

    @Override
    public int getItemCount() {
        return mUserLists.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            TextView tvListName = itemView.findViewById(R.id.tvListName);
            TextView tvListSize = itemView.findViewById(R.id.tvListSizeTitle);


        }

        public void bind(List<> itemList) {
            JSONArray array = new JSONArray(itemList);

        }
    }
}
