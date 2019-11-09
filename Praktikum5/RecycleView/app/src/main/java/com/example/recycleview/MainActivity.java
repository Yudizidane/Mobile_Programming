package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private RecyclerView pet;
private ArrayList<mantan>list=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pet = findViewById(R.id.halah);
        pet.setHasFixedSize(true);
    if (getSupportActionBar()!=null){
        getSupportActionBar().setTitle("Mantan King Of Sultan YUDI");
        }
    list.addAll(getListHmj());
    showRecycleList();
    }

    public ArrayList<mantan>getListHmj(){
        String[]data =getResources().getStringArray(R.array.data_nama);
        String[] kopet =getResources().getStringArray(R.array.data_desc);
        String[] ceko =getResources().getStringArray(R.array.photo);
        ArrayList<mantan>list =new ArrayList<>();
        for (int i=0;i<data.length;i++){
            mantan mantan =new mantan();
            mantan.setName(data[i]);
            mantan.setDescription(kopet[i]);
            mantan.setPhoto(ceko[i]);
            list.add(mantan);
        }
        return list;
    }
    private void showRecycleList(){
        pet.setLayoutManager(new LinearLayoutManager(this));
        ListHmAdapter listHmAdapter =new ListHmAdapter(list);
        pet.setAdapter(listHmAdapter);
    }
}
