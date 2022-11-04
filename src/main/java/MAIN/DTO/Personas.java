package MAIN.DTO;

public class Personas {
    private String Nombre;
    private int Edad;
    private String Nacionalidad;
    private boolean Convicto;


    public Personas() {
        this.Nombre="Yasmin";
        this.Edad=40;
        this.Nacionalidad="Indu";
        this.Convicto=true;
    }
    public Personas(String Nombre, int edad, String Nacionalidad, boolean Convicto){
        this.Nombre= Nombre;
        this.Edad=Edad;
        this.Nacionalidad=Nacionalidad;
        this.Convicto=Convicto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        Nacionalidad = nacionalidad;
    }

    public boolean isConvicto() {
        return Convicto;
    }

    public void setConvicto(boolean convicto) {
        Convicto = convicto;
    }


}
