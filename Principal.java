import java.time.LocalDateTime;

public class  Principal{
	public static void main(String[]args){
	
	System.out.println("Hola Mundo");
	mostrarFechaHora();
	}
	public static void mostrarFechaHora(){
	LocalDateTime ahora = LocalDateTime.now();
		System.out.print("Fecha y hora: " + ahora);

	}
}
