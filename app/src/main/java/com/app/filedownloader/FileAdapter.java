package com.app.filedownloader;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class FileAdapter extends RecyclerView.Adapter<FileAdapter.VHItem> {

    Context context;
    List<FileData> list_file;
    Adapteronclick adapteronclick;

    interface Adapteronclick {
        void adapterPos(int pos);
    }

    public FileAdapter(Context context, List<FileData> list_file, Adapteronclick adapteronclick) {
        this.context = context;
        this.list_file = list_file;
        this.adapteronclick = adapteronclick;
    }

    @NonNull
    @Override
    public FileAdapter.VHItem onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_download, viewGroup, false);
        return new VHItem(v);
    }

    @Override
    public void onBindViewHolder(@NonNull VHItem vhItem, final int position) {
        list_file.get(position);
        vhItem.tv_productname.setText(list_file.get(position).getProductname());
        vhItem.btn_download.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adapteronclick.adapterPos(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list_file.size();
    }

    public class VHItem extends RecyclerView.ViewHolder {
        TextView tv_productname;
        Button btn_download;

        public VHItem(@NonNull View itemView) {
            super(itemView);
            tv_productname = itemView.findViewById(R.id.tv_productname);
            btn_download = itemView.findViewById(R.id.btn_download);
        }
    }
}
