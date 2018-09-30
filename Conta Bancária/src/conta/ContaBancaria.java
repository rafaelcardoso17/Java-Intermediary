package conta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author rjosecar
 */
public class ContaBancaria {
    

    
    public static void main(String[] args) {
        
        
        
        ArrayList <ContaBanc> contas = new ArrayList<ContaBanc>();
     
        
        Scanner tec = new Scanner(System.in);
        Scanner tec2 = new Scanner(System.in);         
        boolean flag = true;
        while(flag == true){
        System.out.println("1 - Abrir Conta");
        System.out.println("2 - Sacar");
        System.out.println("3 - Depositar");
        System.out.println("4 - Encerrar Conta");
        System.out.println("5 - Pagar Mensalidade");
        System.out.println("6 - Status da Conta");
        System.out.println("0 - Sair"); 
        System.out.print("Escolha uma opção: ");
        int opc = tec.nextInt();    
          switch(opc){
            case 1:
                ContaBanc c = new ContaBanc(0.0f,false);
                
                System.out.println("Digite o numero da conta: ");
                int numC = tec.nextInt();
                System.out.println("Digite a senha da conta: ");
                int sen = tec.nextInt();
                System.out.println("Digite o tipo da conta (cc - Conta Corrente, cp - Conta Poupanaça): ");
                String tip = tec2.nextLine();
                System.out.println("Digite o nome do Dono: ");
                String don = tec2.nextLine();
         
                c.setNumConta(numC);
                c.setSenha(sen);
                c.setTipo_conta(tip);
                c.setNome_dono(don);
                c.abrirConta();
                contas.add(c);
                break;
            case 2:
                System.out.println("Digite o numero da conta: ");
                int n2 = tec.nextInt();
                System.out.println("Digite a senha da conta: ");
                int s2 = tec.nextInt();
                int ver2 = 0;
                for(ContaBanc x: contas){
                    if(x.getNumConta() == n2 && x.getSenha()==s2){
                        System.out.println("Digite o valor a sacar: ");
                        float sac = tec.nextFloat();
                        x.sacar(sac);
                    }
                    else{
                        ver2++;
                    }
                    
                }
                if(ver2>0){
                    System.out.println("Conta nao Cadastrada, número da conta ou senha errados!");
                }
                if(contas.isEmpty()){
                    System.out.println("Conta nao Cadastrada!");
                }
               
                break;
            case 3:
                System.out.println("Digite o numero da conta: ");
                int n3 = tec.nextInt();
                System.out.println("Digite a senha da conta: ");
                int s3 = tec.nextInt();
                int ver3 = 0;
                for(ContaBanc x: contas){
                    if(x.getNumConta() == n3 && x.getSenha()==s3){
                        System.out.println("Digite o valor a depositar: ");
                        float dep = tec.nextFloat();
                        x.depositar(dep);
                    }
                    else{
                        ver3++;
                    }
                    
                }
                if(ver3>0){
                    System.out.println("Conta nao Cadastrada, número da conta ou senha errados!");
                }
                if(contas.isEmpty()){
                    System.out.println("Conta nao Cadastrada!");
                }
                break;
            case 4:
                System.out.println("Digite o numero da conta: ");
                int n4 = tec.nextInt();
                System.out.println("Digite a senha da conta: ");
                int s4 = tec.nextInt();
                int ver4 = 0;
                for(ContaBanc x: contas){
                    if(x.getNumConta() == n4 && x.getSenha()==s4){
                        x.fecharConta();
                    }
                    else{
                        ver4++;
                    }
                    
                }
                if(ver4>0){
                    System.out.println("Conta nao Cadastrada, número da conta ou senha errados!");
                }
                if(contas.isEmpty()){
                    System.out.println("Conta nao Cadastrada!");
                }
                break;
            case 5:
                System.out.println("Digite o numero da conta: ");
                int n5 = tec.nextInt();
                System.out.println("Digite a senha da conta: ");
                int s5 = tec.nextInt();
                int ver5 = 0;
                for(ContaBanc x: contas){
                    if(x.getNumConta() == n5 && x.getSenha()==s5){
                        x.pagarMensal();
                    }
                    else{
                        ver5++;
                    }
                }
                if(ver5>0){
                    System.out.println("Conta nao Cadastrada, número da conta ou senha errados!");
                }
                if(contas.isEmpty()){
                    System.out.println("Conta nao Cadastrada!");
                }
                break;
            case 6:
                System.out.println("Digite o numero da conta: ");
                int n1 = tec.nextInt();
                System.out.println("Digite a senha da conta: ");
                int s1 = tec.nextInt();
                int ver = 0;
                for(ContaBanc x: contas){
                    if(x.getNumConta() == n1 && x.getSenha()==s1){
                        x.estado();
                    }
                    else{
                        ver++;
                    }
                    
                }
                if(ver>0){
                    System.out.println("Conta nao Cadastrada, número da conta ou senha errados!");
                }
                if(contas.isEmpty()){
                    System.out.println("Conta nao Cadastrada!");
                }
                break;
            case 0:
                System.out.println("Saindo!");
                flag = false;
                break;
            default:
                System.out.println("Opcção Inválida!");
            }
        
        }
  /*      
        while(opc != 3){
            
            if(opc==1){
            
            }
            else if(opc==2){
            
            }
            else if(opc==3){
            
            }
            else if(opc==4){
            
            }
            else if(opc==5){
            
            }
       
        } */
        
      
        
        
        
        
        
 
        
    }
}
