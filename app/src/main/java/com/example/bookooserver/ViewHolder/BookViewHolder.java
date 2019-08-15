package com.example.bookooserver.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.ContextMenu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.bookooserver.Common.Common;
import com.example.bookooserver.Interface.ItemClickListner;
import com.example.bookooserver.R;

public class BookViewHolder extends RecyclerView.ViewHolder implements
        View.OnClickListener,
        View.OnCreateContextMenuListener



{

    public TextView book_name;
    public ImageView book_image;

    private  com.example.bookooserver.Interface.ItemClickListner itemClickListener;

    public BookViewHolder(View itemView){
        super(itemView);


        book_name = (TextView)itemView.findViewById(R.id.book_name);
        book_image = (ImageView)itemView.findViewById(R.id.book_image);

        itemView.setOnCreateContextMenuListener(this);
        itemView.setOnClickListener(this);
    }

    public void setItemClickListener(ItemClickListner itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    @Override
    public void onClick(View view){
        itemClickListener.onClick(view,getAdapterPosition(),false);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        menu.setHeaderTitle("Select Action");
        menu.add(0,0,getAdapterPosition(), Common.UPDATE);
        menu.add(0,1,getAdapterPosition(),Common.DELETE);
    }
}