import java.util.Scanner;

public class Principal {
  public  static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        Usuario[] usuarios = crearUsuarios(2);

        for (int i = 0; i < usuarios.length; i++) {
            System.out.println(usuarios[i].nombre + " " + usuarios[i].apellidos + " " + usuarios[i].email);
        }
    }

    public static Usuario[] crearUsuarios(int n) {
        Usuario[] usuarios = new Usuario[n];

        for (int i = 0; i < n; i++) {
            usuarios[i] = new Usuario();

            System.out.print("Nombre: ");
            usuarios[i].nombre = teclado.nextLine();

            System.out.print("Apellidos: ");
            usuarios[i].apellidos = teclado.nextLine();

            System.out.print("Email: ");
            usuarios[i].email = teclado.nextLine();
        }

        return usuarios;
    }
}

