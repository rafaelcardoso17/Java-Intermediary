package classeobjeto;

public class ClasseObjeto {

    public static void main(String[] args) {
       
        Caneta c1 = new Caneta();
        c1.cor= "Azul";
        c1.carga = 90;
        c1.setPonta(0.5f);
        
        c1.tampada = false;
        c1.modelo = "Bic";
        c1.status();
        c1.tampar();
        c1.rabiscar();
        System.out.println("Destampando a caneta...");
        c1.destampar();
        c1.rabiscar();
    
    /*
        Notebook note1 = new Notebook();
        System.out.println("Notebook 1:");
        note1.marca = "dell";
        note1.cor = "prata";
        note1.hd = "500GB";
        note1.memoria = 6;
        note1.status();
        System.out.println("Ligando notebook...");
        note1.ligado();
        note1.digitar();
        System.out.println("Notebook 2");
        Notebook note2 = new Notebook();
        note2.marca = "hp";
        note2.cor = "preto";
        note2.hd = "1TB";
        note2.memoria = 16;
        note2.flag = true;
        note2.status();
        System.out.println("Desligando notebook...");
        note2.desligado();
        note2.digitar();
        */
    /*
        Trabalhar t1 = new Trabalhar ();
        t1.empresa = "everis";
        t1.profissao = "Programador Java";
        t1.carga_horaria = 9;
        t1.estado = true;
        t1.servico();
        t1.verficar_est_trab();
       
        
        System.out.println("Trabalhador indo pra casa!");
        t1.desativo();
        System.out.println("Estado: "+t1.estado);
        t1.servico();
        t1.verficar_est_trab();
    */
    }
    
}
