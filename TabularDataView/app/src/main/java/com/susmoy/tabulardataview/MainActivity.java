package com.susmoy.tabulardataview;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    DemoAdapter demoAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler);

        setRecycler();
    }

    @SuppressLint("ResourceAsColor")
    private void setRecycler() {
        recyclerView.setHasFixedSize(true);
//        DividerItemDecoration divider = new DividerItemDecoration(this,DividerItemDecoration.VERTICAL);
//        GradientDrawable drawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP,int[] ());
//        drawable.setSize(10,5);
//        divider.setDrawable(drawable);
//        recyclerView.addItemDecoration(divider);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        demoAdapter = new DemoAdapter(this,getList());
        recyclerView.setAdapter(demoAdapter);
    }
    private List<DemoModel> getList(){
        List<DemoModel> list = new ArrayList<>();
        list.add(new DemoModel("Demo1","Demo2askjhdkasd kasndasjdnaksjdjiasbd jabsjdasld askndkasjdlas dsandklasnlkdnaslkd mas d","Demo3"));
        list.add(new DemoModel("Demo1","Demo2","Demo3"));
        list.add(new DemoModel("Dejasjdklams;kdmaslk dasdasmd;kasm;dmo1","Demo2","Demo3"));
        list.add(new DemoModel("Demo1","Demo2","Dass;kdaskld asldnasdnlsa dsaldksandl sad askdnnsald emo3"));
        list.add(new DemoModel("Demo1","Demo2","Demo3"));
        list.add(new DemoModel("Demo1","Demo2","Demo3"));
        list.add(new DemoModel("Dejasjdklams;kdmaslk dasdasmd;kasm;dmo1","Demo2","Demo3"));
        list.add(new DemoModel("Demo1","Demo2","Dass;kdaskld asldnasdnlsa dsaldksandl sad askdnnsald emo3"));
        list.add(new DemoModel("Demo1","Demo2","Demo3"));
        return list;
    }

}