package classeobjeto;

public class Trabalhar {
    String empresa;
    String profissao;
    float carga_horaria;
    boolean estado;
    
    void servico(){
        String tr = null;
        System.out.println("Empresa: "+this.empresa);
        System.out.println("Profissão: "+this.profissao);
        System.out.println("Carga Horária: "+this.carga_horaria+" hrs diária");
        System.out.println("Estado: "+this.estado);
    }
    
    void verficar_est_trab(){
         if(this.estado == true){
            System.out.println("Trabalhando...");
        }
        else
            System.out.println("Descansando...");
        
    }
    
    void ativo(){
        this.estado = true;
        
    }
    
    void desativo(){
        this.estado = false;
    }
}
