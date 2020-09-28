package cl.inacap.misconciertosapp.dto;

public class misConciertos {

     private String Fecha;
     private String NombreArtista;
     private int ValorEntrada;

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String fecha) {
        Fecha = fecha;
    }

    public String getNombreArtista() {
        return NombreArtista;
    }

    public void setNombreArtista(String nombreArtista) {
        NombreArtista = nombreArtista;
    }

    public int getValorEntrada() {
        return ValorEntrada;
    }

    public void setValorEntrada(int valorEntrada) {
        ValorEntrada = valorEntrada;
    }
}
