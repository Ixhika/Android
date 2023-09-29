package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerContactAdpater extends RecyclerView.Adapter<RecyclerContactAdpater.ViewHolder> {

    Context context;
    ArrayList<Contact_model> arr;
    RecyclerContactAdpater(Context context , ArrayList<Contact_model> arr){
        this.context = context;
        this.arr = arr;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.contact_row,parent , false);

        ViewHolder viewHolder  =new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.img.setImageResource(arr.get(position).img);
        holder.name.setText(arr.get(position).name);
        holder.number.setText(arr.get(position).number);
    }

    @Override
    public int getItemCount() {
        return arr.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView name , number;
        ImageView img;
        public ViewHolder(View itemView){
           super(itemView);

           name= itemView.findViewById(R.id.textView1);
           number= itemView.findViewById(R.id.textView2);
           img = itemView.findViewById(R.id.img);
       }
   }

}
