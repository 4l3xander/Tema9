public class Persona {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.edad = 22;
        cliente.nombre = "Gerar";
        cliente.telefono = 625487446;
        cliente.credito = "10.000";

        System.out.println(cliente.edad);
        System.out.println(cliente.nombre);
        System.out.println(cliente.telefono);
        System.out.println(cliente.credito);


    }
}

class People {
    int edad;
    String nombre;
    int telefono;

}
class Cliente extends People{
    String credito;
}