package com.brianvp.ejemplonavswipe.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.brianvp.ejemplonavswipe.Adapters.AdaptadorPersonajes;
import com.brianvp.ejemplonavswipe.Clases.Personaje;
import com.brianvp.ejemplonavswipe.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link ListaFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link ListaFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ListaFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    RecyclerView recycler;
    ArrayList<Personaje> lPersonajes;

    private OnFragmentInteractionListener mListener;

    public ListaFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ListaFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ListaFragment newInstance(String param1, String param2) {
        ListaFragment fragment = new ListaFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vista = inflater.inflate(R.layout.fragment_lista, container, false);
        recycler = vista.findViewById(R.id.lista);
        lPersonajes = new ArrayList<>();
        recycler.setLayoutManager(new LinearLayoutManager(getContext()));
        llenarLista();
        AdaptadorPersonajes personajes = new AdaptadorPersonajes(lPersonajes);
        recycler.setAdapter(personajes);

        return vista;
    }


    private void llenarLista() {

        lPersonajes.add(new Personaje("Goku"," Es el personaje principal del manga y anime Dragon Ball, un superviviente del Planeta Vegeta cuyo nombre nativo es Kakarotto, su nombre Saiyajin, que éste a su vez proviene de una deformación del inglés \"carrot\" ",R.drawable.goku));
        lPersonajes.add(new Personaje("Gohan","A pesar de las quejas de Gokū, Chichi manda a la escuela a Gohan para que se convierta en científico a los cuatro años. Pero antes, Gokū lleva a su hijo a Kame House para presentarle a Maestro Roshi, a Bulma y a Krilin",R.drawable.gohan));
        lPersonajes.add(new Personaje("Goten","Son Goten o simplemente conocido como Goten, es el segundo hijo de Chichi y Son Goku, y hermano de Gohan nacido poco después de la segunda muerte de este último. De sangre Saiyajin, se hizo pronto muy buen amigo con el hijo de Vegeta, Trunks, con quien se solía reunir para jugar",R.drawable.goten));
        lPersonajes.add(new Personaje("Krilin","Pasaron 5 años de paz en los que Krilin se estuvo entrenando (no mucho) y un día vería como Son Goku les presentaría a su hijo Son Gohan quien quedó asombrado junto a el Maestro Roshi, Bulma y Turtle.",R.drawable.krilin));
        lPersonajes.add(new Personaje("Picoro","Piccolo es un personaje de ficción de la serie de manga y anime Dragon Ball. Como su padre (Piccolo Daimaō) surgió tras separarse de Kamisama, si uno de los dos muere, el otro también",R.drawable.picoro));
        lPersonajes.add(new Personaje("Trunks","Trunks es un personaje que hace su aparición tanto en Dragon Ball tanto en el manga y anime Dragon Ball. Es mitad Humano y mitad Saiyajin, hijo de Vegeta y Bulma, y es el hermano de Bra. ",R.drawable.trunks));
        lPersonajes.add(new Personaje("Vegeta","Vegeta también conocido como príncipe Vegeta es uno de los Saiyajin sobreviviente de la destrucción de su planeta en manos de Freezer, archi rival de Son Goku.",R.drawable.vegueta));


    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
