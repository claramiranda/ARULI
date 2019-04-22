package br.unicamp.ft.c155041;

import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyFirstAdapter extends RecyclerView.Adapter {

    private ArrayList<Republica> republicas;
    private OnClickListener onClickListener;

    public interface OnClickListener {
        public void onClick(int pos);
    }

    /*CONSTRUCTOR*/
    public MyFirstAdapter(ArrayList<Republica> a){
        this.republicas=a;
    }


    public void setOnClickListener(OnClickListener onClickListener){
        this.onClickListener = onClickListener;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.adapter_layout, parent, false);

        final MyFirstViewHolder h = new MyFirstViewHolder(v);

        v.setOnClickListener(
                new View.OnClickListener(){

                    @Override
                    public void onClick(View v) {
                        onClickListener.onClick(h.pos);
                    }
                }
        );

        return h;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((MyFirstViewHolder)holder).bind(republicas.get(position), position);

    }

    @Override
    public int getItemCount() {
        return this.republicas.size();
    }

    class MyFirstViewHolder extends RecyclerView.ViewHolder{
        //private ImageView imageView;
        private TextView txtNome;
        private TextView txtLvl;
        private TextView txtBio;

        public int pos;

        public MyFirstViewHolder(View itemView){
            super(itemView);
            //imageView = itemView.findViewById(R.id.imgView);
            //imageTime = itemView.findViewById();
            txtNome = itemView.findViewById(R.id.txtNome);
            txtLvl = itemView.findViewById(R.id.txtLvl);
            txtBio = itemView.findViewById(R.id.txtBio);

        }

        public void bind(final Republica rep, int position){
           // imageView.setImageResource(rep.getFoto());
            txtNome.setText(rep.getNome());
            txtLvl.setText(rep.getLevel_agitação());
            txtBio.setText(Html.fromHtml(rep.getBio()));
            pos = position;
        }
    }
}
