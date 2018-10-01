package hashset01;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author rjosecar
 */
public class HashSet_Teste {
    public static void main(String[] args) {
        String[] things = {"maça","bob","gato","bob","bacon"};
        
        List<String> list = Arrays.asList(things);
        
        System.out.println("Lista: "+list);
        
        Set<String> set = new HashSet<String>(list);
        
        System.out.println("Lista com Set"+set);
        
    }
    
}
