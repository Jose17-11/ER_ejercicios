package automatas;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class ER_ejemplo1 {
//	Clases de la libreria regex: Pattern y Matcher
	public static void main(String[] args) {
		try {
//			Se declara la variable a comparar
			String cadena = "hjsh87";
//			La clase pattern almacena la expresion regular a compar
			Pattern pat = Pattern.compile("^[^\\d].*");
//			Clase matter compara si la cadena es la misma expresion que se pide
			Matcher mat = pat.matcher(cadena);
//			Condicion que nos confirmara en consola si la expresion regular es valida
			if (mat.matches()) {
//				Si arroja true la clase matcher instanciada hara las siguientes instrucciones
				System.out.println("Si");
			} else {
//				Si es lo contrario la clase matcher instanciada no hara las siguientes instrucciones
				System.out.println("No");
			}
//			las clases vistas se encierran en un try catch para arrojar el aviso en caso que surja la exception PatternSyntaxException
		} catch (PatternSyntaxException e) {
//			En caso de que surja la exception arrojara el r
			System.err.println("Se ha producido un error de sintaxis en la expresión regular:");
			System.err.println(e.getDescription());
			System.err.println("Posición del error: " + e.getIndex());
		}
	}
}
