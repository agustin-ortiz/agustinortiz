public class Persona {

    private String nombre;
    private int cedula;
    private int edad;

    public Persona() {

    }

    
    public String getNombre(){
        return this.nombre;
    }

    public void setNombre (String unNombre){

        this.nombre = unNombre;
    }

    public int getCedula(){ return this.cedula; }

    public void setCedula (Integer unaCedula){

        this.cedula = unaCedula;
    }

    public int getEdad(){
        return this.edad;
    }

    public void setEdad (Integer unaEdad){

        this.edad = unaEdad;
    }
    



}
