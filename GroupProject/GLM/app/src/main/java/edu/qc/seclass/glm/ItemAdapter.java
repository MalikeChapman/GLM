package edu.qc.seclass.glm;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.grocerylistmanager.R;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {
    Context context;
    List<Item> items;

    public ItemAdapter(Context context, List<Item> items){
        this.context = context;
        this.items = items;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.itemview, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Item item = items.get(position);
        holder.bind(item);

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ConstraintLayout container;
        EditText etQuantityNumber;
        ImageView ivPlusQuantity;
        ImageView ivMinusQuantity;
        ImageView ivAddItemToList;
        TextView tvItemName;





        public ViewHolder(@NonNull View itemView){
            super(itemView);
            container = itemView.findViewById(R.id.container);
            etQuantityNumber = itemView.findViewById(R.id.etQuantityNumber);
            ivPlusQuantity = itemView.findViewById(R.id.ivPlusQuantity);
            ivMinusQuantity = itemView.findViewById(R.id.ivMinusQuantity);
            ivAddItemToList = itemView.findViewById(R.id.ivAddItemToList);
            tvItemName = itemView.findViewById(R.id.tvItemName);

        }

        public void bind(final Item item){
            tvItemName.setText(item.getKeyItemName());

        }


    }
    public void addAll(List<Item> list){
        items.addAll(list);
        notifyDataSetChanged();
    }
}
