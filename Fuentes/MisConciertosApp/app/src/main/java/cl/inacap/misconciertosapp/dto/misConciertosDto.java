package cl.inacap.misconciertosapp.dto;

public class misConciertosDto {

    private String Fecha;
    private String NombreArtista;
    private int ValorEntrada;
    private int Imagen;

    public misConciertosDto(String fecha, String nombreArtista, int valorEntrada, int imagen) {
        this.Fecha = fecha;
        this.NombreArtista = nombreArtista;
        this.ValorEntrada = valorEntrada;
        this.Imagen = imagen;
    }

    public int getImagen() {
        return Imagen;
    }

    public void setImagen(int imagen) {
        Imagen = imagen;
    }

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
