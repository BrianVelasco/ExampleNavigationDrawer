package com.brianvp.ejemplonavswipe.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IBVP on 01/11/2018.
 */

public class SeccionesAdapter extends FragmentStatePagerAdapter {
    //para saber cuantos fragmentos
    private final List<Fragment> listaFragmentos = new ArrayList<>();
    //Titulos
    private final List<String> listaTitulos = new ArrayList<>();


    public SeccionesAdapter(FragmentManager fm) {

        super(fm);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return listaTitulos.get(position);
    }

    @Override
    public Fragment getItem(int position) {
        return listaFragmentos.get(position);
    }

    @Override
    public int getCount() {
        return listaFragmentos.size();
    }

    public void addFragment(Fragment fragment, String titulo){
        listaFragmentos.add(fragment);
        listaTitulos.add(titulo);
    }
}
