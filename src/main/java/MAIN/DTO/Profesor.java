package MAIN.DTO;

public class Profesor extends Personas{
    private String Oficio;
    private String Rut;


    public Profesor(){
        super();
        this.Oficio="Maestro";
        this.Rut="22569545-8";

    }

    public Profesor(String Nombre, int Edad, String Nacionalidad, boolean Convicto, String Oficio, String Rut){
        super(Nombre, Edad, Nacionalidad, Convicto);
        this.Oficio=Oficio;
        this.Rut=Rut;
    }

    public String getOficio() {
        return Oficio;
    }

    public void setOficio(String oficio) {
        Oficio = oficio;
    }

    public String getRut() {
        return Rut;
    }

    public void setRut(String rut) {
        Rut = rut;
    }



}
