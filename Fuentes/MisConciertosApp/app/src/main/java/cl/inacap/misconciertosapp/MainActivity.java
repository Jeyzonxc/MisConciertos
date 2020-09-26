package cl.inacap.misconciertosapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView genero;
    Spinner comboGenero;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        genero= (TextView) findViewById(R.id.idGenero);
        comboGenero= (Spinner) findViewById(R.id.idSpinnerGenero);

        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,R.array.genero_musical,android.R.layout.simple_spinner_item);

        comboGenero.setAdapter(adapter);

        comboGenero.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(parent.getContext(),
                "Genero Musical:" +parent.getItemAtPosition(position).toString(),Toast.LENGTH_LONG).show();

                genero.setText("Genero Musical:"+parent.getItemAtPosition(position).toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}