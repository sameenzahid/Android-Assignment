package com.example.sameenproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    RecyclerView recyclerView;
    ArrayList<Model> arrayList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        arrayList.add(new Model(R.drawable.baby_monkey, "Baby Monkey", "Hey! Welcome to my World"));
        arrayList.add(new Model(R.drawable.chicks, "Chicks", "Hey! Welcome to my World"));
        arrayList.add(new Model(R.drawable.dogs, "Dogs", "Hey! Welcome to my World"));
        arrayList.add(new Model(R.drawable.goat, "Goat", "Hey! Welcome to my World"));
        arrayList.add(new Model(R.drawable.gulehri, "Squirrel", "Hey! Welcome to my World"));
        arrayList.add(new Model(R.drawable.monkey, "Monkey", "Hey! Welcome to my World"));
        arrayList.add(new Model(R.drawable.parrot, "Parrot", "Hey! Welcome to my World"));
        arrayList.add(new Model(R.drawable.sheep, "Sheep", "Hey! Welcome to my World"));
        arrayList.add(new Model(R.drawable.zebra, "Zebra", "Hey! Welcome to my World"));


        ModelRecycleView ModelRecycleView = new ModelRecycleView(this, arrayList);
        recyclerView.setAdapter(ModelRecycleView);




    }
}