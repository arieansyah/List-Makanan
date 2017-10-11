package com.oho.listmakanan;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.util.ArrayList;

import static android.R.attr.bitmap;
import static android.R.attr.path;

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
        holder.img.setImageResource(dataMkn.get(position).getImg());

    }

    @Override
    public int getItemCount() {
        return dataMkn.size();
    }

    public class MknHolder extends RecyclerView.ViewHolder
        implements View.OnClickListener{

        TextView txtTitle, txtDesc;
        ImageView img;

        public MknHolder(View itemView) {
            super(itemView);
            txtTitle = (TextView) itemView.findViewById(R.id.id_title);
            txtDesc = (TextView) itemView.findViewById(R.id.id_desc);
            img = (ImageView) itemView.findViewById(R.id.id_img);


            itemView.setOnClickListener(this);
        }
        @Override
        public void onClick(View view) {
            /*Toast.makeText(itemView.getContext(), txtTitle.getText()+" - "+txtDesc.getText(), Toast.LENGTH_LONG).show();*/

            Intent it = new Intent(itemView.getContext(), DetailMkn.class);
            it.putExtra("txtTitle", txtTitle.getText().toString());
            it.putExtra("txtDesc", txtDesc.getText().toString());
            it.putExtra("img", R.drawable.menu_gofood);


            ctx.startActivity(it);
        }
    }


}
