import java.util.Arrays;

class Password {
	//Atributos clase Password
	int longitud = 8;
	int[] contraseña;
	
	//Constructor por defecto
	Password() {
		
	}
	
	//Constructor con la longitud. La contraseña se genera con el método
	Password(int longitud) {
		this.longitud = longitud;
		this.contraseña = generarContrasena(longitud);
	}
	
	//Método pàra generar la contraseña
	public static int[] generarContrasena(int longitud) {
		//Creación Vector
		int vecPass[] = new int[longitud];
		
		//Añadir números random al Vector con la longitud del vector
		for (int x = 0; x < vecPass.length; x++) {
			vecPass[x] = (int) (Math.random()*9+1);
		}
		
		//Devolvemos el vector
		return vecPass;
	}
	
	//Sobreescribimos el método toString y pasamos el array a String
	@Override
	public String toString() {
		return "La contraseña generada es: " + Arrays.toString(contraseña);
	}
}


public class Main {

	public static void main(String[] args) {
		//Creamos el objeto indiciando la longitud y printamos la contraseña
		Password contraseña1 = new Password(11);
		
		System.out.println(contraseña1);
		
		System.out.println();
		
		Password contraseña2 = new Password(7);
		
		System.out.println(contraseña2);
		
	}
}
