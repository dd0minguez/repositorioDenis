package repositoriodenis;

/**
 * Usuario
 */
public class Usuario {
    Integer ID;
    String Nombre;
    String Correo;

    public Usuario(Integer ID, String Nombre, String Correo){
        this.ID = ID;
        this.Nombre = Nombre;
        this.Correo = Correo;
    }
    
    public Integer getID(){
        return ID;
    }
    public String getNombre(){
        return Nombre;
    }
    public String getCorreo(){
        return Correo;
    }

    public void setID(Integer ID){
        this.ID = ID;
    }
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }
    public void setCorreo(String Correo){
        this.Correo = Correo;
    }

    public void pintarInfo(){
        System.out.println("Nombre: " + Nombre + " Correo: " + Correo);
    }
}