import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/*
 * Framework colecciones java
 * 
 * INTERFACES
 * 	set	No permite duplicados
 * 	List 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 	CLASES
 * 		vector
 * 		Que
 * 		Deque
 * 		Stack
 * 
 * */
public class Prueba {
	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();

		numeros.add(10);
		numeros.add(4);
		numeros.add(-9);
		numeros.add(12);
		numeros.add(-1);

		System.out.println(numeros.toString());

		// MergeSort
		Collections.sort(numeros);

		System.out.println(numeros.toString());
		System.out.println();
		System.out.println("~~~~~~~~~~~ Cadenas ~~~~~~~~~~~~");
		ArrayList<String> nombres = new ArrayList<>();

		nombres.add("Luck");
		nombres.add("Leia");
		nombres.add("Anakyn");
		nombres.add("Obi Wan Kenobi");

		ArrayList<String> copiaNombres = (ArrayList<String>) nombres.clone();

		System.out.println(nombres.toString());
		Collections.sort(nombres);
		System.out.println(nombres.toString());
		System.out.println();
		System.out.println("~~~~~~~ Ordenamiento en orden inverso ~~~~~~~~~");

		System.out.println(copiaNombres.toString());
		Collections.sort(copiaNombres, Collections.reverseOrder());
		System.out.println(copiaNombres.toString());
		// QuickSort

		class Alumno implements Comparable<Alumno> {
			String nControl;
			Integer edad;

			public Alumno(String nControl, int edad) {
				super();
				this.nControl = nControl;
				this.edad = edad;
			}

			@Override
			public String toString() {
				return "Alumno [nControl=" + nControl + ", edad=" + edad + ", getClass()=" + getClass()
						+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
			}

			/*
			 * @Override public int compareTo(Alumno o) { return
			 * nControl.compareTo(o.nControl); }
			 */
			@Override
			public int compareTo(Alumno o) {
				return edad.compareTo(o.edad);
			}

		}// clase alumno
		System.out.println();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		Alumno a1 = new Alumno("17", 20);
		Alumno a2 = new Alumno("1", 1);
		Alumno a3 = new Alumno("7", 96);
		Alumno a4 = new Alumno("878", 30);
		Alumno a5 = new Alumno("3", 7);

		ArrayList<Alumno> alumnos = new ArrayList<>();
		alumnos.add(a1);
		alumnos.add(a2);
		alumnos.add(a3);
		alumnos.add(a4);
		alumnos.add(a5);

		System.out.println(alumnos.toString());

		Collections.sort(alumnos);
		System.out.println(alumnos.toString());

		System.out.println();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		System.out.println(Collections.binarySearch(numeros, -1));

		// TAREA: Aplicar binary Search en Coleccion Alumnos}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(Collections.binarySearch(alumnos, new Alumno("7", 96)));

	}// main
}// clase principal
