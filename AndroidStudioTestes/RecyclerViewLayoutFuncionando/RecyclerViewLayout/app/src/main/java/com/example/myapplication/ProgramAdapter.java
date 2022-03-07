package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProgramAdapter extends RecyclerView.Adapter<ProgramAdapter.ViewHolder> {

    // Variáveis

    Context context;
    String[] programNameList;
    String[] programDescriptionList;
    int[] imagens;

    // Construtor

    public ProgramAdapter(Context context, String[] programNameList, String[] programDescriptionList, int[] imagens){
        this.context = context;
        this.programNameList = programNameList;
        this.programDescriptionList = programDescriptionList;
        this.imagens = imagens;
    }

    @NonNull
    @Override
    public ProgramAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.single_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
        // return new ViewHolder(view); pode ser assim tb, eu acho

        // funcionou, sim, mas ta meio bugado, calma
    }

    @Override
    public void onBindViewHolder(@NonNull ProgramAdapter.ViewHolder holder, int position) {
        holder.rowName.setText(programNameList[position]);
        holder.rowDescription.setText(programDescriptionList[position]);
        holder.rowImage.setImageResource(imagens[position]);
    }

    @Override
    public int getItemCount() {
        return programNameList.length;
    }

    // ViewHolder

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView rowName;
        TextView rowDescription;
        ImageView rowImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            rowName = itemView.findViewById(R.id.txt1);
            rowDescription = itemView.findViewById(R.id.txt2);
            rowImage = itemView.findViewById(R.id.imageView);
        }
    }

}
