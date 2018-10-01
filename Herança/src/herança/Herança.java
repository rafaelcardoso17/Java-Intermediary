package herança;
/**
 *
 * @author rjosecar
 */
public class Herança {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Pedro");
        p1.setSexo("Masculino");
        p1.setIdade(20);
        
        p2.setNome("José");
        p2.setSexo("Masculino");
        p2.setIdade(22);
        
        p3.setNome("Maria");
        p3.setSexo("Feminino");
        p3.setIdade(30);
        
        p4.setNome("Rafael");
        p4.setSexo("Masculino");
        p4.setIdade(25);
        
        
        p2.setCurso("Informatica");
        p3.setSalario(2575.50f);
        p4.setSetor("Estoque");
        
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
    
}
