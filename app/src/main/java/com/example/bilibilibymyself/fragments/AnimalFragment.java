package com.example.bilibilibymyself.fragments;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.bilibilibymyself.R;
import com.example.bilibilibymyself.adapter.AnimalAdapter;
import com.example.bilibilibymyself.base.BaseFragment;
import com.example.bilibilibymyself.bean.Animal;

public class AnimalFragment extends BaseFragment {

    private RecyclerView recyclerView;
    private AnimalAdapter animalAdapter;
    @Override
    public int setIdResource() {
        return R.layout.animal_fragment;
    }

    @Override
    public void loadData() {
        for (int i = 0; i < 10; i++) {
            Animal animal = new Animal(R.drawable.ic_home_black_24dp, "adsa");
            animals.add(animal);
        }
    }

    @Override
    public void initView() {
        recyclerView = getView().findViewById(R.id.animal_recycler);
        animalAdapter = new AnimalAdapter(animals, getContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(animalAdapter);
    }
}
