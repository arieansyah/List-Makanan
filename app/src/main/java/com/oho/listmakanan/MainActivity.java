package com.oho.listmakanan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Makanan> dataMkn;
    private RecyclerView listMkn;
    private MknAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        generateData();//call
        listMkn = (RecyclerView) findViewById(R.id.id_mkn);
        adapter = new MknAdapter(this, dataMkn);
        listMkn.setAdapter(adapter);
        listMkn.setLayoutManager(new LinearLayoutManager(this));

    }

    private void generateData() {
        dataMkn = new ArrayList<>();

        String[] title = {
                "Kale/Lemon Sandwiches",
                "Kale/Lemon Sandwiches",
                "Kale/Lemon Sandwiches",
                "Kale/Lemon Sandwiches"
        };

        String[] desc = {
                "This Sandwich is stunningly delicious and tastes This Sandwich is stunningly " +
                        "delicious and tastes This Sandwich is stunningly delicious and tastes This Sandwich is stunningly delicious and tastes This Sandwich is stunningly delicious and tastes",
                "This Sandwich is stunningly delicious and tastes This Sandwich is stunningly " +
                        "delicious and tastes This Sandwich is stunningly delicious and tastes This Sandwich is stunningly delicious and tastes This Sandwich is stunningly delicious and tastes",
                "This Sandwich is stunningly delicious and tastes This Sandwich is stunningly " +
                        "delicious and tastes This Sandwich is stunningly delicious and tastes This Sandwich is stunningly delicious and tastes This Sandwich is stunningly delicious and tastes",
                "This Sandwich is stunningly delicious and tastes This Sandwich is stunningly " +
                        "delicious and tastes This Sandwich is stunningly delicious and tastes This Sandwich is stunningly delicious and tastes This Sandwich is stunningly delicious and tastes"
        };

        int[] img = {
                R.drawable.menu_gofood,
                R.drawable.menu_gomart,
                R.drawable.menu_goride,
                R.drawable.menu_gosend
        };

        for (int i = 0; i < title.length; i++){
            Makanan makanan = new Makanan(title[i],desc[i],img[i]);

            dataMkn.add(makanan);
        }
    }
}
