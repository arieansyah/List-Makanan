package com.oho.listmakanan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
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

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        listMkn.setLayoutManager(layoutManager);

        DividerItemDecoration divider = new DividerItemDecoration(listMkn.getContext(),
                layoutManager.getOrientation());
        listMkn.addItemDecoration(divider);

    }

    private void generateData() {
        dataMkn = new ArrayList<>();

        String[] title = {
                "Gulai Kambing",
                "Donat Kentang",
                "Risoles isi Sayur",
                "Risoles Kentang Pastry"
        };

        String[] desc = {
                "Resep Gulai Kambing sangat Cocok Untuk diaplikasikan untuk anda yang bingung " +
                        "ingin memasak menu makananan apa saat ini",
                "Resep Donat Kentang yang sudah kami sajikan merupakan resep yang sederhana dan " +
                        "praktis sehingga bisa diterapkan oleh siapa saja yang ingin mencoba " +
                        "membuatnya sendiri",
                "Resep dan Membuat Risoles isi sayur ini tidak sulit, selain itu isi dan rasa " +
                        "juga bisa disesuaikan dengan selera masing-masing",
                "Resep Risoles Kentang Pastry, anda tentu tidak asing lagi dengan pastry " +
                        "nusantara satu ini, Risoles adalah Kue dengan dadaran yang terbuat dari " +
                        "tepung"
        };

        String[] bahan = {
                "500 gram tepung terigu protein tinggi\n" +
                "250 gram kentang, kukus, haluskan dan dinginkan\n" +
                "50 gram susu bubuk fullcream\n" +
                "1 bungkus/ 11 gram ragi instant\n" +
                "100 gram gula halus\n" +
                "75 gram mentega\n" +
                "½ sdt garam\n" +
                "4 butir kuning telur\n" +
                "100 ml air dingin\n",

                "500 gram tepung terigu protein tinggi\n" +
                "250 gram kentang, kukus, haluskan dan dinginkan\n" +
                "50 gram susu bubuk fullcream\n" +
                "1 bungkus/ 11 gram ragi instant\n" +
                "100 gram gula halus\n" +
                "75 gram mentega\n" +
                "½ sdt garam\n" +
                "4 butir kuning telur\n" +
                "100 ml air dingin\n",

                "100 gram tepung terigu protein sedang\n" +
                "1 butir telur\n" +
                "250 ml susu cair\n" +
                "¼ sdt garam\n" +
                "1 sdm margarin, lelehkan, biarkan dingin\n",

                "200 ml air\n" +
                "125 gr margarine\n" +
                "1 sdm gula pasir\n" +
                "150 gr tepung terigu cakra\n" +
                "4 btr telur"
        };

        int[] img = {
                R.drawable.menu_gofood,
                R.drawable.menu_gomart,
                R.drawable.menu_goride,
                R.drawable.menu_gosend
        };

        for (int i = 0; i < title.length; i++){
            Makanan makanan = new Makanan(title[i],desc[i],bahan[i],img[i]);

            dataMkn.add(makanan);
        }
    }
}
