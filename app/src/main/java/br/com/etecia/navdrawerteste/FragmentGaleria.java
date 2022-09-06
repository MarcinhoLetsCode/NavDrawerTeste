package br.com.etecia.navdrawerteste;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class FragmentGaleria extends Fragment {

    GridView gridView;
    String tituloGaleria[] = {"Foto 1, Foto 2, Foto 3, Foto 4"};
    int fotoGaleria[] = {R.drawable.kids, R.drawable.dogs, R.drawable.park, R.drawable.couple};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_galeria, container, false);

        MyAdapterGallery myAdapterGallery = new MyAdapterGallery();

        gridView = view.findViewById(R.id.lvGaleria);

        gridView.setAdapter(myAdapterGallery);

        return view;
    }

    private class MyAdapterGallery extends BaseAdapter {

        @Override
        public int getCount() {
            return fotoGaleria.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            ImageView imageView;
            TextView txtGalery;

            View v = getLayoutInflater().inflate(R.layout.modelo_galeria, null);

            imageView = v.findViewById(R.id.ivFoto);
            txtGalery = v.findViewById(R.id.ivTexto);

            imageView.setImageResource(fotoGaleria[i]);
            txtGalery.setText(tituloGaleria[i]);

            return v;
        }
    }
}