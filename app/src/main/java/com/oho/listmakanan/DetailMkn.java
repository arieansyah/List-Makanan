package com.oho.listmakanan;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailMkn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_mkn);
        Bundle it = getIntent().getExtras();


        TextView txtBahan = (TextView) findViewById(R.id.id_bahan);
        ImageView img = (ImageView) findViewById(R.id.id_img);


        txtBahan.setText(it.getCharSequence("txtBahan"));
        img.setImageResource(it.getInt("img"));


    }
}
