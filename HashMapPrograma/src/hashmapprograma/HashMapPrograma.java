package hashmapprograma;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author rjosecar
 */
public class HashMapPrograma {
    public static void main(String[] args) {
        
        HashMap<Integer, String> HMap = new HashMap<Integer, String>();
        
        HMap.put(1, "One");
        HMap.put(2, "Two");
        HMap.put(3, "Three");
        HMap.put(4, "Four");
        HMap.put(5, "Five");
        HMap.put(6, "Six");
        
        System.out.println("Lenght Hash Map: "+HMap.size());
        System.out.println("Elements Hash Map: "+HMap.values());
        
        for(Map.Entry<Integer,String> entry : HMap.entrySet()){
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Chave: "+key+" Valor "+value);
        }
    }
    
}
