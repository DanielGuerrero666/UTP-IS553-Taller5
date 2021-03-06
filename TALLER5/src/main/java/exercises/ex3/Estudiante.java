/*
    Estudiante, JavaSE-11, 09/03/2021 
    Codigo de la clase Estudiante
*/
package exercises.ex3;

public class Estudiante{
    protected String nombre;
    protected String codigo;
    protected String numeroDeTelefono;
    protected String correoElectronico;
    protected String institucion;

    // Constructor 
    
    public Estudiante(String nombre, String codigo, String numeroDeTelefono, String correoElectronico, String institucion) {
        setNombre(nombre);
        setCodigo(codigo);
        setNumeroDeTelefono(numeroDeTelefono);
        setCorreoElectronico(correoElectronico);
        setInstitucion(institucion);
    }

    // Setters & Getters

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

    public String getcodigo(){
        return codigo;
    }

    public void setNumeroDeTelefono(String numeroDeTelefono){
        this.numeroDeTelefono = numeroDeTelefono;
    }

    public String getNumeroDeTelefono(){
        return numeroDeTelefono;
    }

    public void setCorreoElectronico(String correoElectronico){
        this.correoElectronico = correoElectronico;
    }

    public String getCorreoElectronico(){
        return correoElectronico;
    }

    public void setInstitucion(String institucion){
        this.institucion = institucion;
    }

    public String getInstitucion(){
        return institucion;
    }

} 
