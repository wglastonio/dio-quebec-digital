import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Populacao {
    public static void main(String[] args) {
        
        System.out.println("\n-- Criação do dicionário --");
        Map<String, Integer> populacao1 = new HashMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(populacao1.toString());


        System.out.println("\n-- Substituir população do RN por 3534165  --");
        populacao1.put("RN", 3534165);
        System.out.println(populacao1.toString());


        System.out.println("\n-- Verificar se PB está no dicionário -- Caso não inserir PB=4039277  --");
        Boolean contemPB = populacao1.containsKey("PB");
        if (!contemPB) populacao1.put("PB", 4039277);
        System.out.println(populacao1.toString());


        System.out.println("\n-- Exibir a população de PE  --");
        Integer populacaoPE = populacao1.get("PE");
        System.out.println(populacaoPE);


        System.out.println("\n-- Exibir na ordem informada --");
        Map<String, Integer> populacao2 = new LinkedHashMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(populacao2.toString());


        System.out.println("\n-- Exibir na ordem alfabética --");
        Map<String, Integer> populacao3 = new TreeMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(populacao3.toString());


        System.out.println("\n-- Exibir estado com menor população --");
        Integer menorPopulacao = Collections.min(populacao3.values());
        Set<Map.Entry<String, Integer>> entries = populacao3.entrySet();
        String estadoMenorPopulacao = "";
        for(Map.Entry<String, Integer> entry: entries){
            if (entry.getValue() == menorPopulacao) {
                estadoMenorPopulacao = entry.getKey();
                System.out.println("{" + estadoMenorPopulacao + "=" + menorPopulacao + "}");
            }
        }


        System.out.println("\n-- Exibir estado com maior população --");
        Integer maiorPopulacao = Collections.max(populacao3.values());
        String estadoMaiorPopulacao = "";
        for(Map.Entry<String, Integer> entry: entries){
            if (entry.getValue() == maiorPopulacao) {
                estadoMaiorPopulacao = entry.getKey();
                System.out.println("{" + estadoMaiorPopulacao + "=" + maiorPopulacao + "}");
            }
        }


        System.out.println("\n-- Soma maior e menor população --");
        System.out.println("{" + (maiorPopulacao + menorPopulacao) + "}");


        System.out.println("\n-- Soma de todas as populações --");
        Integer somaPopulacao = 0;
        for (Integer pop: populacao3.values()) somaPopulacao += pop;
        System.out.println("{" + somaPopulacao + "}");


        System.out.println("\n-- Média de população --");
        Integer mediaPopulacao = 0;
        for (Integer pop: populacao3.values()) mediaPopulacao += pop/populacao3.size();
        System.out.println("{" + mediaPopulacao + "}");


        System.out.println("\n-- Remover estados com menos de 4000000 --");
        Iterator<Integer> iterator = populacao3.values().iterator();
        while(iterator.hasNext()) {
            if (iterator.next() < 4000000) iterator.remove();
        }
        System.out.println(populacao3);


        System.out.println("\n-- Apagar o dicionário --");
        populacao3.clear();
        System.out.println(populacao3);


        System.out.println("\n-- Verifica se o dicionario está vazio --");
        System.out.println(populacao3.isEmpty());

    }
}

