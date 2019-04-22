package br.unicamp.ft.c155041_g157918;


import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.widget.Button;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class WelcomeFragment extends Fragment {

    public WelcomeFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_welcome, container, false);
        View view =  inflater.inflate(R.layout.fragment_welcome, container, false);
        Button btn = view.findViewById(R.id.btcadastrar);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.fLayout, new CadastroFragment());
                ft.addToBackStack(null);
                ft.commit();

            }/*
            public void onClick(View view) {
               Toast toast = Toast.makeText(WelcomeFragment.this.getContext(), "testando ação do botão cadastrar", Toast.LENGTH_SHORT);
                toast.show();
            }*/
        });

        return  view;
    }
}
