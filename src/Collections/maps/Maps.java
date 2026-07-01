package Collections.maps;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import models.Contacto;

public class Maps {
    //Primer valor que corresponde a clave String y el Integer a el valor
    // Map <K, V>
    // Map<tipoClave, tipo valor

    //R las interfaces se pueden instanciar? 

    public Map<String, Integer> construirHashMap(){
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10); 
        map.put("B", 20);
        map.put("C", 30);
        map.put("A", 50);
        System.out.println(map.size());
        System.out.println(map);
        System.out.println(map.values().toArray());
       


            // Mapa ---> Valores que se transformaron --> array y array[posiciones]
        for(int i = 0; i < map.size(); i++){ 
            System.out.println(map.values().toArray()[i]);


        }
        //Map --> Keys -- > -X -->X
        //pASO A Maap -> Keys -> Set -> valor del set 
        for(String key: map.keySet()){
            System.out.println(key);
            
            //A, B, C 
        }

        // T = entry <k,v>
        // Set<Entry<S,I>>
        // Set<T>  
     //   map.entrySet();
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry);

        }

        return map;

        
    }
    public LinkedHashMap<String, Integer> coLinkedHashMap(){
        LinkedHashMap<String, Integer> lMap = new LinkedHashMap<>();
        //lMap.put("A", 10); 
        //lMap.put("B", 20);
        //lMap.put("C", 30);
        //lMap.put("A", 50);
        lMap.put("A", 2);
        lMap.put("B", 3);
        lMap.put("A", 5);
        lMap.put("C", 50);
        lMap.put("D", 5);
        lMap.put("F", 3);
        lMap.put("G", 8);
        lMap.put("H", 85);
        lMap.put("I", 5);
        System.out.println(lMap);
        System.out.println(lMap.entrySet());
        return lMap;

    }
    public Map<String, Integer> cTreeMap(){
        Map<String, Integer> lMap = new TreeMap<>();
        //lMap.put("A", 10); 
        //lMap.put("B", 20);
        //lMap.put("C", 30);
        //lMap.put("A", 50);
        lMap.put("A", 2);
        lMap.put("B", 3);
        lMap.put("A", 5);
        lMap.put("C", 50);
        lMap.put("D", 5);
        lMap.put("F", 3);
        lMap.put("G", 8);
        lMap.put("H", 85);
        lMap.put("I", 5);
        System.out.println(lMap);
        System.out.println(lMap.entrySet());
        return lMap;
    }
    public void eliminarDuplicadosAndSort(List<Contacto> contacto){
        Set<Contacto> tSet = new TreeSet<>(); 
        for(Contacto contactos : contacto){
            tSet.add(contactos);
        }
    

    }

    
}
