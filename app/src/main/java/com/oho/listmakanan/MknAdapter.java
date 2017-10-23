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
import android.widget.RelativeLayout;
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

    public class MknHolder extends RecyclerView.ViewHolder {

        TextView txtTitle, txtDesc;
        RelativeLayout rl;

        public MknHolder(View itemView) {
            super(itemView);
            txtTitle = (TextView) itemView.findViewById(R.id.id_title);
            txtDesc = (TextView) itemView.findViewById(R.id.id_desc);
            rl = (RelativeLayout) itemView.findViewById(R.id.rl_id);
        }
    }
        @Override
        public void onBindViewHolder(MknAdapter.MknHolder holder, final int position) {
            holder.txtTitle.setText(dataMkn.get(position).getTitle());
            holder.txtDesc.setText(dataMkn.get(position).getDesc());

            holder.rl.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    Intent it = new Intent(ctx, DetailMkn.class);
                    it.putExtra("txtBahan", dataMkn.get(position).getBahan());
                    it.putExtra("txtProsedur", dataMkn.get(position).getProsedur());
                    it.putExtra("img", dataMkn.get(position).getImg());
                    ctx.startActivity(it);
                }
            });
        }
    @Override
    public int getItemCount() {
        return dataMkn.size();
    }
}
