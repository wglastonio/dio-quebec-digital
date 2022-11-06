import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ExemploMap {
    public static void main(String[] args) throws Exception {
        
        System.out.println("\n-- Dicionário com modelos e consumo --");
        Map<String, Double> carrosPopulares = new HashMap<>() {{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares.toString());


        System.out.println("\n-- Substituir o consumo do Gol por 15.2Km/l --");
        carrosPopulares.put("gol", 16.1);
        System.out.println(carrosPopulares.toString());

        
        System.out.println("\n-- Verificar se o modelo Tucson está no dicionário --");
        Boolean contemTucson = carrosPopulares.containsKey("tucson");
        System.out.println(contemTucson);

        
        System.out.println("\n-- Exibir o consumo do Uno --");
        Double consumoUno = carrosPopulares.get("uno");
        System.out.println(consumoUno + " Km/l");

        
        System.out.println("\n-- Exibir os modelos adicionados --");
        Set<String> modelos = carrosPopulares.keySet();
        for (String modelo: modelos) System.out.println(modelo);

        
        System.out.println("\n-- Exibir os consumos dos modelos --");
        Collection<Double> consumos = carrosPopulares.values();
        for (Double consumo: consumos) System.out.println(consumo);


        System.out.println("\n-- Exibir modelo mais econômico --");
        Double melhorConsumo = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMelhorConsumo = "";

        for (Map.Entry<String, Double> entry: entries) {
            if (entry.getValue().equals(melhorConsumo)) {
                modeloMelhorConsumo = entry.getKey();
                System.out.println(modeloMelhorConsumo + " - " + entry.getValue() + " Km/l");
            }
        }


        System.out.println("\n-- Exibir modelo menos econômico --");
        Double piorConsumo = Collections.min(carrosPopulares.values());
        String modeloPiorConsumo = "";

        for (Map.Entry<String, Double> entry: entries) {
            if (entry.getValue().equals(piorConsumo)) {
                modeloPiorConsumo = entry.getKey();
                System.out.println(modeloPiorConsumo + " - " + entry.getValue() + " Km/l");
            }
        }


        System.out.println("\n-- Somas dos consumos --");
        Double somaConsumo = 0d;
        for (Double consumo: consumos) {
            somaConsumo += consumo;
        }            
        System.out.println(somaConsumo);


        System.out.println("\n-- Média dos consumos --");
        Double mediaConsumo = 0d;
        for (Double consumo: consumos) {
            mediaConsumo += consumo/consumos.size();
        }            
        System.out.printf("%.2f Km/l\n", mediaConsumo);


        System.out.println("\n-- Remover modelos com consumo 15.6 Km/l --");
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        while(iterator.hasNext()) {
            if (iterator.next() == 15.6) iterator.remove();
        }
        Set<Map.Entry<String, Double>> ent = carrosPopulares.entrySet();
        for (Map.Entry<String, Double> e: ent)  {
            System.out.println(e.getKey() + " - " + e.getValue() + " Km/l");
        }


        System.out.println("\n-- Mostra na ordem que foram informados --");
        Map<String, Double> carrosPopularesOrdem = new LinkedHashMap<>() {{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopularesOrdem.toString());


        System.out.println("\n-- Mostra na ordem por modelo --");
        Map<String, Double> carrosPopularesOrdemModelo = new TreeMap<>() {{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopularesOrdemModelo.toString());


        System.out.println("\n-- Apaga o dicionario --");
        System.out.println("Antes --> " + carrosPopulares);
        carrosPopulares.clear();
        System.out.println("Depois --> " + carrosPopulares);


        System.out.println("\n-- Verifica se o dicionario está vazio --");
        System.out.println(carrosPopulares.isEmpty());
    }
}

