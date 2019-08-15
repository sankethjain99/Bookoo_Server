package com.example.bookooserver;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.example.bookooserver.Common.Common;
import com.example.bookooserver.ViewHolder.OrderDetailAdapter;

public class OrderDetail extends AppCompatActivity {
    TextView order_id,order_phone,order_address,order_total;
    String order_id_value="";
    RecyclerView stbook;RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_detail);

        order_id = (TextView)findViewById(R.id.order_id);
        order_phone = (TextView)findViewById(R.id.order_phone);
        order_address = (TextView)findViewById(R.id.order_address);
        order_total = (TextView)findViewById(R.id.order_total);
        stbook=(RecyclerView)findViewById(R.id.stbook);
        stbook.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        stbook.setLayoutManager(layoutManager);

        if (getIntent()!=null)
        {
            order_id_value = getIntent().getStringExtra("OrderId");
        }
        order_id.setText(order_id_value);
        order_phone.setText(Common.currentRequest.getPhone());
        order_total.setText(Common.currentRequest.getTotal());

        

        OrderDetailAdapter adapter =new OrderDetailAdapter(Common.currentRequest.getBooks());
        adapter.notifyDataSetChanged();
        stbook.setAdapter(adapter);
    }
}
