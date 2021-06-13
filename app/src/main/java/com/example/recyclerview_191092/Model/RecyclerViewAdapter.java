package com.example.recyclerview_191092.Model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview_191092.cardet.Cars;
import com.example.recyclerview_191092.R;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    Context c;
    List<Cars> obj;

    public RecyclerViewAdapter() {
    }

    public RecyclerViewAdapter(Context c, List<Cars> obj) {
        this.c = c;
        this.obj = obj;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.items,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Cars ca = obj.get(position);
        holder.cn.setText("Cars Name: ",+ ca.getCars_name());
        holder.cm.setText("Cars Model: ",+ ca.getCars_model());
        holder.cy.setText("Cars Year: ",+ ca.getCars_year());
    }

    @Override
    public int getItemCount() {
        return obj.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView cn,cm,cy;
        Button btn_1;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            cn = itemView.findViewById(R.id.text1);
            cm = itemView.findViewById(R.id.text2);
            cy = itemView.findViewById(R.id.text3);
            btn_1=itemView.findViewById(R.id.button_1);
            btn_1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position=getAdapterPosition();
                    Toast.makeText(itemView.getContext(),obj.get(position).getCars_name(),Toast.LENGTH_LONG).show();
                    obj.remove(position);
                    notifyItemRemoved(position);
                }
            });

        }

        @Override
        public void onClick(View v) {

        }
    }
}