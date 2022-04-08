import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class main {
	
	public static Integer contarNumerosDeclarativa(List<Integer>numbers) {
		Integer res = 0;
		for(int i = 0;i<numbers.size();i++) {
			if(numbers.get(i)>10) {
				res++;
			}
		}
		
		return res;
	}
	
	public static long contarNumerosImperativa(List<Integer> numbers) {
		long res = numbers.stream().filter(num -> num > 10).count();
		return res;
	}
	public static void main(String []args) {
		List<Integer> numbers = List.of(18, 6, 4, 15, 55, 78, 12, 9, 8);
		
		System.out.println("Hay " + contarNumerosDeclarativa(numbers) + " mayores a 10");
		System.out.println("Hay " + contarNumerosImperativa(numbers) + " mayores a 10");
		
		
		//Lista de enteros y llamamos stream() en la lista para crear un nuevo flujo de datos
		Arrays.asList(1,2,3,4).stream()
		.map(elementoArray -> "Number " + String.valueOf(elementoArray))
		.forEach(n -> System.out.println(n + " as a " + n.getClass().getName()));
		
		//Si quisieramos persistir en un cambio hariamos collect()
		
		  //lista de enteros y llamamos stream() en la lista para crear un nuevo flujo de datos
        Arrays.asList(1, 2, 3, 4).stream()
                .map(elementoArray -> "Number " + String.valueOf(elementoArray))
                .forEach(n -> System.out.println(n + " as a " + n.getClass().getName()));
        
        System.out.println();
        System.out.println("*********** Si quisiéramos persistir en este cambio, haríamos collect() los datos de nuevo  ****************");
        System.out.println("*********** en un Collection objeto como un List, Map, Set, etc ****************");
        
        List<Integer> list = Arrays.asList(1, 4, 3, 5);
        List<String> mappedList = list.stream()
                .map(n -> "Number " + String.valueOf(n))
                .collect(Collectors.toList());
        System.out.println(list);
        System.out.println(mappedList);
        System.out.println();
        
        System.out.println("*********** convierta un flujo de cadenas en un flujo de enteros ****************");
        Arrays.asList("1", "2", "3", "4").stream()
                .map(n -> Integer.parseInt(n))
                .forEach(n -> System.out.println(n));
    }
	
	
}
