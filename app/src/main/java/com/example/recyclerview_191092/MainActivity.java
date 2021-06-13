package com.example.recyclerview_191092;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerview_191092.Model.RecyclerViewAdapter;
import com.example.recyclerview_191092.cardet.Cars;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Cars> obj = new ArrayList<>();
    RecyclerView RV_fin;
    RecyclerViewAdapter RVA_fin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RV_fin = findViewById(R.id.recyclerview);
        obj.add(new Cars("Honda Civic ","X","2018"));
        obj.add(new Cars("Toyota Corolla","A","2017"));
        obj.add(new Cars("Suzuki Alto","BX","2020"));
        obj.add(new Cars("Mustang","F","2019"));
        RVA_fin= new RecyclerViewAdapter(MainActivity.this,obj);
        RV_fin.setLayoutManager(new LinearLayoutManager(this ));
        RV_fin.setHasFixedSize(true);
        RV_fin.setAdapter(RVA_fin);
    }
}