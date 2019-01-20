package com.example.bilibilibymyself.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bilibilibymyself.R;
import com.example.bilibilibymyself.bean.Animal;

import java.util.List;

public class AnimalAdapter extends RecyclerView.Adapter<AnimalHolder> {

    private List<Animal> animals;
    private Context context;
    @NonNull
    @Override
    public AnimalHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_layout, viewGroup, false);
        return new AnimalHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AnimalHolder animalHolder, int i) {
        animalHolder.bindView(animals.get(i));
    }

    @Override
    public int getItemCount() {
        return animals.size();
    }

    public AnimalAdapter(List<Animal> animals, Context context) {
        this.animals = animals;
        this.context = context;
    }
}
