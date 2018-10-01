package polimorfismo;
/**
 *
 * @author rjosecar
 */
public class Polimorfismo {
    public static void main(String[] args) {
          //Animal m = new Animal();
        Mamifero m = new Mamifero();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Reptil r = new Reptil();
        Canguru c = new Canguru();
        
        m.locomover();
        p.locomover();
        a.locomover();
        r.locomover();
        c.locomover();
        
    }
    
}
