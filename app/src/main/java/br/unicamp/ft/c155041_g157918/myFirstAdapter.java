package br.unicamp.ft.c155041_g157918;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import java.util.ArrayList;


public class myFirstAdapter extends RecyclerView.Adapter {
    private ArrayList<Republica> reps;

    public myFirstAdapter(ArrayList<Republica> reps) {
        this.reps = reps;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        //return null;
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.adapter_layout, viewGroup, false);
        return new MyFirstViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        ((MyFirstViewHolder)viewHolder).bind(reps.get(i));


    }

    @Override
    public int getItemCount() {
        return this.reps.size();
    }

    public class MyFirstViewHolder extends RecyclerView.ViewHolder{
        private ImageView imageView;
        private TextView txtNome;
        private TextView txtBio;
        private RatingBar level;

        public MyFirstViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imgView);
            txtNome = itemView.findViewById(R.id.txtRepNome);
            txtBio = itemView.findViewById(R.id.txtRepBio);


        }

        public void bind(final Republica rep){
            imageView.setImageResource(rep.getFoto());
            txtNome.setText(rep.getNome());
            txtBio.setText(rep.getBio());
        }
    }
}
