package com.susmoy.tabulardataview;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DemoAdapter extends RecyclerView.Adapter<DemoAdapter.ViewHolder>{
    Context context;
    List<DemoModel> listData;

    public DemoAdapter(Context context, List<DemoModel> listData) {
        this.context = context;
        this.listData = listData;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.row_layout_2,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        if(listData != null && listData.size() > 0){
            DemoModel model = listData.get(position);
            holder.demo_1.setText(model.demo1);
            holder.demo_2.setText(model.demo2);
            holder.demo_3.setText(model.demo3);
        }
        else{
            return;
        }
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView demo_1,demo_2,demo_3;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            demo_1 = itemView.findViewById(R.id.demo_1);
            demo_2 = itemView.findViewById(R.id.demo_2);
            demo_3 = itemView.findViewById(R.id.demo_3);
        }
    }
}
