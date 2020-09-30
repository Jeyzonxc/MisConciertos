package cl.inacap.misconciertosapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

import cl.inacap.misconciertosapp.dto.misConciertosDto;

public class adapter extends ArrayAdapter <misConciertosDto> {
    private List <misConciertosDto> myList;
    private Context myContext;
    private int resourceLayout;


    public adapter(@NonNull Context context, int resource, List <misConciertosDto> objects) {
        super(context, resource, objects);

        this.myList = objects;
        this.myContext = context;
        this.resourceLayout = resource;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;

        if (view == null)
            view = LayoutInflater.from(myContext).inflate( resourceLayout, null);
            misConciertosDto conciertos = myList.get(position);
        TextView nArtista = view.findViewById(R.id.idNombreTxt);
        nArtista.setText(myList.get(position).getNombreArtista());
            return view;



    }
}
