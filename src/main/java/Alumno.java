public class Alumno {

    private int nroEstudiante;
    private String grupo;
    private boolean tienePrevia;

    public Alumno() {

    }

    public int getNroEstudiante(){
       return this.nroEstudiante;
    }

    public int set (int unEstudiante){
        this.nroEstudiante = unEstudiante;
    }

    public String getGrupo(){
        return this.grupo;
    }

    public String setGrupo (String unGrupo){
        this.grupo = unGrupo;
    }

    public boolean getTienePrevia(){
        return this.tienePrevia;
    }

    public boolean setTienePrevia (boolean unaPrevia){
        this.tienePrevia = unaPrevia;
    }

}
