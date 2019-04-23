package br.unicamp.ft.c155041_g157918;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
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
public class ListarepsFragment extends Fragment {
    private RecyclerView mRecyclerView;
    private myFirstAdapter mAdapter;
    private View lview;

    public ListarepsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        lview = inflater.inflate(R.layout.fragment_listareps, container, false);
        mRecyclerView = (RecyclerView) lview.findViewById(R.id.rView);

        LinearLayoutManager manager = new LinearLayoutManager(getContext());

        mRecyclerView.setLayoutManager(manager);
         mRecyclerView.setHasFixedSize(true);
        //mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mAdapter = new myFirstAdapter(new ArrayList<>(Arrays.asList(Republicas.republicas)));
        mRecyclerView.setAdapter(mAdapter);

        return lview;

    }

}
