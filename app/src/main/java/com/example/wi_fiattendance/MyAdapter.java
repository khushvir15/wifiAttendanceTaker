package com.example.wi_fiattendance;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    Context context;
    List<Model> ModelList;

    public MyAdapter(Context context, List<Model> modelList) {
        this.context = context;
        ModelList = modelList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.attendancelist, parent, false);
        //design ow connectivity here
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        // here we will Bind it

        Model model = ModelList.get(position);
        holder.tvName.setText(model.getName());
        holder.tvId.setText(model.getID());

        String imageUri = null;
        imageUri = model.getImage();
        Picasso.get().load(imageUri).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return ModelList.size();
    }
    public class MyViewHolder extends  RecyclerView.ViewHolder{

        // here declare design
        ImageView imageView;
        TextView tvName, tvId;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.image_recyclerView_id);
            tvName = itemView.findViewById(R.id.txtname);
            tvId = itemView.findViewById(R.id.txtID);

        }
    }

}
