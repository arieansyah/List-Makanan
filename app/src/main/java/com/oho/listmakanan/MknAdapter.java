package com.oho.listmakanan;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.ArrayList;

/**
 * Created by borneo on 05/10/17.
 */

public class MknAdapter extends RecyclerView.Adapter<MknAdapter.MknHolder> {
    Context ctx;
    ArrayList<Makanan> dataMkn;

    public MknAdapter(Context ctx, ArrayList<Makanan> dataMkn) {
        this.ctx = ctx;
        this.dataMkn = dataMkn;
    }

    @Override
    public MknAdapter.MknHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(ctx);
        View mknView = inflater.inflate(R.layout.list_makanan, parent, false);

        return new MknHolder(mknView);
    }

    @Override
    public void onBindViewHolder(MknAdapter.MknHolder holder, int position) {
        holder.txtTitle.setText(dataMkn.get(position).getTitle());
        holder.txtDesc.setText(dataMkn.get(position).getDesc());
        holder.txtBahan.setText(dataMkn.get(position).getBahan());
        holder.txtProsedur.setText(dataMkn.get(position).getProsedur());
        holder.img.setImageResource(dataMkn.get(position).getImg());

    }

    @Override
    public int getItemCount() {
        return dataMkn.size();
    }

    public class MknHolder extends RecyclerView.ViewHolder
        implements View.OnClickListener{

        TextView txtTitle, txtDesc, txtBahan, txtProsedur;
        ImageView img;

        public MknHolder(View itemView) {
            super(itemView);
            txtTitle = (TextView) itemView.findViewById(R.id.id_title);
            txtDesc = (TextView) itemView.findViewById(R.id.id_desc);
            txtBahan = (TextView) itemView.findViewById(R.id.id_bahan);
            txtProsedur = (TextView) itemView.findViewById(R.id.id_prosedur);
            img = (ImageView) itemView.findViewById(R.id.id_img);


            itemView.setOnClickListener(this);
        }
        @Override
        public void onClick(View view) {
            /*Toast.makeText(itemView.getContext(), txtTitle.getText()+" - "+txtDesc.getText(), Toast.LENGTH_LONG).show();*/
            Intent it = new Intent(itemView.getContext(), DetailMkn.class);
            it.putExtra("txtBahan", txtBahan.getText().toString());
            it.putExtra("txtProsedur", txtProsedur.getText().toString());
            it.putExtra("img", R.drawable.img);
            ctx.startActivity(it);
        }
    }


}
