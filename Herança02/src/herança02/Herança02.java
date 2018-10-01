package herança02;
public class Herança02 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Pessoa p1 = new Pessoa();
       Visitante v1 = new Visitante ();
       
       v1.setIdade(22);
       v1.setNome("Pessoa");
       v1.setSexo("Masculino");
       
       System.out.println(v1.toString());
    
       Aluno a1 = new Aluno();
       
       a1.setCurso("SI");
       a1.setIdade(29);
       a1.setMatricula(221);
       a1.setNome("Rafael");
       a1.setSexo("Masculino");
       a1.pagarMens();
       //System.out.println(a1.toString());
       Bolsista b1 = new Bolsista();
       b1.setCurso("Geografia");
       b1.setIdade(56);
       b1.setMatricula(5679);
       b1.setNome("Maria");
       b1.setSexo("Feminino");
       b1.setBolsa(578.58f);
       b1.pagarMens();
    }
    
}
