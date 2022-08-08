public class main {
//    Crea una clase Persona con las siguientes variables:
//
//    La edad
//
//    El nombre
//
//    El teléfono
//
//    Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la variable credito solo para esa clase.
//
//    Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.
//
//    Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que solo tenga la clase Trabajador.

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.edad = 25;
        cliente.nombre = "Jose Madrid";
        cliente.telefono = 2545341;
        System.out.println(cliente.edad);
        System.out.println(cliente.nombre);
        System.out.println(cliente.telefono);

        Trabajador trabajador = new Trabajador();
        trabajador.edad = 34;
        trabajador.nombre = "Marx Abreu";
        trabajador.telefono = 215315121;
        trabajador.salario = 18000;
        System.out.println(trabajador.edad);
        System.out.println(trabajador.nombre);
        System.out.println(trabajador.telefono);
        System.out.println(trabajador.salario);

    }
}

abstract class Persona {
    int edad;
    String nombre;
    int telefono;

    public Persona() {
        System.out.println("constructor");
    }

    abstract public int getEdad();
    abstract public void setEdad(int edad);


    abstract public String getNombre();
    abstract public void setNombre(String nombre);

    abstract public int getTelefono();
    abstract public void setTelefono(int telefono);

}

class Cliente extends Persona {
    int credito;

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getTelefono() {
        return this.telefono;
    }

    public void setTelefono(int edad) {
        this.telefono = telefono;
    }


}

class Trabajador extends Cliente  {
    int salario;


}
