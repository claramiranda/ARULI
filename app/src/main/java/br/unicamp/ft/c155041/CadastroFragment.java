package br.unicamp.ft.c155041;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


/**
 * A simple {@link Fragment} subclass.
 */
public class CadastroFragment extends Fragment {


    public CadastroFragment() {
        // Required empty public constructor
    }

 /** @// TODO: 20/04/19
 * Criar função OnClick do botão, para salvar as informações
 * */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View v;
        v = inflater.inflate(R.layout.fragment_cadastro, container, false);

        //Spinner actions
        Spinner spinner = (Spinner) v.findViewById(R.id.spinner_cursos);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getContext(),
                R.array.spinner_cursos, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);



        // Return inflated view
        return v;
    }

}
