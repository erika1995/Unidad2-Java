public class Usuario{

    public public static void (String[] args) {
        
        String nombre;
        String apellido;
        int edad;
        String hobbie;
        String editor_cod_pref;
        String sistema_operativo;

        public Persona(){};

        public Persona(String pNombre, String pApellido, int pEdad, String pHobbie, 
        String pEditor_cod_pref, String pSistema_operativo){
            this.nombre=pNombre;
            this.apellido=pApellido;
            this.edad=pEdad;
            this.hobbie=pHobbie;
            this.editor_cod_pref=pEditor_cod_pref;
            this.sistema_operativo=pSistema_operativo;
        }

        void mostrarPersona(){
            System.out.println("Su nombre es: " + nombre);
            System.out.println("Su apellido es: " + apellido);
            System.out.println("Su edad es: " + edad);
            System.out.println("Su hobbie es: " + hobbie);
            System.out.println("Su editor de código preferido es: " + editor_cod_pref);
            System.out.println("El sistema operativo que usa es: " + sistema_operativo);
            
        }

    }
}