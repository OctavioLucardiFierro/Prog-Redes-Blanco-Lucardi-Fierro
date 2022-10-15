package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.AdapterView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyReceptorViewAdapter extends RecyclerView.Adapter<MyReceptorViewAdapter.ViewHolder> {

    private List<String> mData;
    private LayoutInflater mInflater;
    private ItemClickListener mClickListener;


    MyReceptorViewAdapter(Context contex, List<String> data){
        this.mInflater = LayoutInflater.from(contex);
        this.mData = data;
    }

    @NonNull
    @Override
    public MyReceptorViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.recyclerview_row,parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyReceptorViewAdapter.ViewHolder holder, int position) {
        String nombre = mData.get(position);
        holder.myTextView.setText(nombre);
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
