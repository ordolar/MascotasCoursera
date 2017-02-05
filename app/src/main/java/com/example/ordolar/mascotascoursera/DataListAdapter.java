package com.example.ordolar.mascotascoursera;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Ordolar on 31/01/2017.
 */

public class DataListAdapter extends RecyclerView.Adapter<DataListAdapter.ViewHolder> {
    private List<DataList> list;
    private Context ctx;

    public DataListAdapter(Context ctx, List<DataList> list){
        this.ctx=ctx;
        this.list=list;

    }

    @Override
    public DataListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //crear el inflater
        LayoutInflater inflater=LayoutInflater.from(ctx);
        View layout=inflater.inflate(R.layout.list_view, null);



        //crear Viewholder
        return new ViewHolder(layout);
    }

    @Override
    public void onBindViewHolder(final DataListAdapter.ViewHolder holder, int position) {
        holder.headerTv.setText(list.get(position).getHeader());
        //holder.detailTV.setText(list.get(position).getDetail());
        holder.detailIcon.setImageResource(list.get(position).getImagen());
        holder.huesobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });



    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private TextView headerTv, detailTV;
        ImageView detailIcon;
        ImageButton huesobtn;

        public ViewHolder(View itemView) {
            super(itemView);
            this.headerTv=(TextView) itemView.findViewById(R.id.headerTV);
            this.detailTV=(TextView) itemView.findViewById(R.id.detailsTV);

            this.huesobtn=(ImageButton) itemView.findViewById(R.id.huesobtn);
            this.detailIcon=(ImageView) itemView.findViewById(R.id.detailIcon);
        }
    }
}
