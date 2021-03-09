// RegistroLibreta, JavaSE-11, 05/03/2021 

package exercises.ex1;

    public class RegistroLibreta{
        private String nombre;
        private String direccion;
        private String numeroDeTelefono;
        private String correoElectronico;

        // Constructor de objetos tipo RegistroLibreta //

        public RegistroLibreta(String nombre, String direccion, String numeroDeTelefono, String correoElectronico) {
            this.setNombre(nombre);
            this.setDireccion(direccion);
            this.setNumeroDeTelefono(numeroDeTelefono);
            this.setCorreoElectronico(correoElectronico);
        }

        // Métodos Mutadores de atributos // 

        public String getCorreoElectronico() {
            return correoElectronico;
        }

        public void setCorreoElectronico(String correoElectronico) {
            this.correoElectronico = correoElectronico;
        }

        public String getNumeroDeTelefono() {
            return numeroDeTelefono;
        }

        public void setNumeroDeTelefono(String numeroDeTelefono) {
            this.numeroDeTelefono = numeroDeTelefono;
        }

        public String getDireccion() {
            return direccion;
        }

        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }        
    }
