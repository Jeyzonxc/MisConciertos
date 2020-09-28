package cl.inacap.misconciertosapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextView genero;
    private Spinner comboGenero;
    private TextView calificaciones;
    private Spinner comboCalificaciones;
    private TextView fecha;
    private EditText nombre;
    private EditText valor;
    private Button registrarBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.fecha = findViewById(R.id.idTextViewfecha);
        this.nombre = findViewById(R.id.idNombreTxt);
        this.valor = findViewById(R.id.idValor);
        this.registrarBtn = findViewById(R.id.idBtnR);






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

        calificaciones= (TextView) findViewById(R.id.idCalificación);
        comboCalificaciones= (Spinner) findViewById(R.id.idSpinnerCalificacion);

        ArrayAdapter<CharSequence> adapter1=ArrayAdapter.createFromResource(this,R.array.calificacion,android.R.layout.simple_spinner_item);

        comboCalificaciones.setAdapter(adapter1);

        comboCalificaciones.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(parent.getContext(),
                        "Calificación" +parent.getItemAtPosition(position).toString(),Toast.LENGTH_LONG).show();
                calificaciones.setText("Calificación:"+parent.getItemAtPosition(position).toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapter1View) {

            }
        });


        this.registrarBtn.setOnClickListener(new View.OnClickListener() {
            @Override



            public void onClick(View view) {
                List<String> errores= new ArrayList<>();
                String nombre = "";
                int valor = 0;

                try{
                    if (nombre.isEmpty()){

                    }

                }catch(Exception e){
                    errores.add("El nombre debe empezar con mayuscula y  ser de min 3 caracteres y max 30");
                }

                try {

                    if(valor < 0 ){
                        throw new NumberFormatException();
                    }
                }catch (NumberFormatException ex){
                    errores.add("-Debe ingresar un valor");
                }

                if(errores.isEmpty()){


                }else{
                    mostrarErrores(errores);
                }

            }

            private void mostrarErrores(List<String>errores){

                String mensaje ="";
                for (String e: errores){
                    mensaje+="-"+e+"\n";
                }

                AlertDialog.Builder alertBuilder = new AlertDialog.Builder(MainActivity.this);
                alertBuilder.setTitle("Error de validacion").setMessage(mensaje).setPositiveButton("acceptar",null).create().show();
            }
        });




    }



    public void abrirCalendario(View view) {
        Calendar cal = Calendar.getInstance();
        int anio = cal.get(Calendar.YEAR);
        int mes = cal.get(Calendar.MONTH);
        int dia = cal.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog dpd = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                String fechas= dayOfMonth + "/" + month + "/" + year;
                fecha.setText(fechas);
            }
        }, anio, mes, dia);
        dpd.show();
    }




}