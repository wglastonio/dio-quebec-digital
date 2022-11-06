import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class ExercicioStreamAPI {
    public static void main(String[] args) {
        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "6", "5");

        System.out.println("\n-- Imprimir todos os elementos da lista --");
        //Modo completo -- não utilizado
        numerosAleatorios.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            };
        });

        //Lambda
        numerosAleatorios.stream().forEach(s -> System.out.println(s));

        //Reference Method
        numerosAleatorios.stream().forEach(System.out::println);


        System.out.println("\n-- Colocar os 5 primeiros números dentro de um Set --");
        numerosAleatorios.stream()
                         .limit(5)
                         .collect(Collectors.toSet())
                         .forEach(System.out::println);

        //Outra forma
        Set<String> collectSet = numerosAleatorios.stream()
                                                  .limit(5)
                                                  .collect(Collectors.toSet());
        collectSet.forEach(System.out::println);


        System.out.println("\n-- Transformar a lista de String em Inteiros --");
        //Modo completo -- não utilizado
        Stream<Integer> listInteiros = numerosAleatorios.stream()
                         .map(new Function<String, Integer>() { 
                            @Override 
                            public Integer apply(String s) { 
                                return Integer.parseInt(s); 
                            } 
                        });
        System.out.println("-->");
        listInteiros.forEach(System.out::println);
        
        //Lambda
        numerosAleatorios.stream().map(s -> Integer.parseInt(s)).collect(Collectors.toList()).forEach(System.out::println);;

        //Reference Method
        numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList()).forEach(System.out::println);
        
        List<Integer> numerosAleatoriosInt = numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList());
        System.out.println(numerosAleatoriosInt);


        System.out.println("\n-- Colocar os números pares e maiores que 2 em uma lista --");
        //Modo completo -- não utilizado
        List<Integer> listParesMaiorDois = numerosAleatorios.stream()
                                                            .map(Integer::parseInt)
                                                            .filter(new Predicate<Integer>() {
                                                                @Override
                                                                public boolean test(Integer i){
                                                                    if (i % 2 == 0 && i > 2) return true;
                                                                    return false;
                                                                }
                                                            }).collect(Collectors.toList());
        System.out.println(listParesMaiorDois);

        //Lambda e Reference Method
        List<Integer> listParesMaiorDois2 = numerosAleatorios.stream()
                                                            .map(Integer::parseInt)
                                                            .filter(i -> i % 2 == 0 && i > 2)
                                                            .collect(Collectors.toList());
        System.out.println(listParesMaiorDois2);


        System.out.println("\n-- Mostrar a média dos números --");
        //Modo completo -- não utilizado
        numerosAleatorios.stream()
                         .mapToInt(new ToIntFunction<String>() {
                            @Override
                            public int applyAsInt(String s) {
                                return Integer.parseInt(s);
                            }
                         });

        //Lambda
        numerosAleatorios.stream()
                         .mapToInt(s -> Integer.parseInt(s))
                         .average()
                         .ifPresent(v -> System.out.println(v));

        //Reference Method
        numerosAleatorios.stream()
                         .mapToInt(Integer::parseInt)
                         .average()
                         .ifPresent(System.out::println);
        
    
        System.out.println("\n-- Remover os números ímpares --");
        //Modo completo -- não utilizado
        List<Integer> numerosAleatoriosInt2 = numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList());
        numerosAleatoriosInt2.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test (Integer i) {
                if (i % 2 != 0) return true;
                return false;
            }
        });
        System.out.println(numerosAleatoriosInt2);


        //Lambda
        numerosAleatoriosInt2.removeIf(i -> i % 2 != 0);
        System.out.println(numerosAleatoriosInt2);
    }
}
