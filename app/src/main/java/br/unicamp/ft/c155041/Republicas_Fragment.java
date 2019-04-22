package br.unicamp.ft.c155041;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Arrays;


/**
 * A simple {@link Fragment} subclass.
 */
public class Republicas_Fragment extends Fragment {

    private RecyclerView mRecyclerView;
    private View lview;
    private MyFirstAdapter mAdapter;


    public Republicas_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //lview = inflater.inflate(R.layout.fragment_republicas, container, mRecyclerView = lview.findViewById(R.id.rView));
        lview = inflater.inflate(R.layout.fragment_republicas,container,false);
       // mRecyclerView = lview.findViewById(R.id.rView);
      //  mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
      //  mAdapter = new MyFirstAdapter(new ArrayList(Arrays.asList(Republica.republicas)));
      //  mRecyclerView.setAdapter(mAdapter);





        return lview;
    }

}
/*
public class ListaDeCursosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_de_cursos);

        ListView listaDeCursos = (ListView) findViewById(R.id.lista);

    }

}
 */