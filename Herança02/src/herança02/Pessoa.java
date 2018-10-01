package herança02;
public abstract class Pessoa {
    protected int idade;
    protected String nome;
    protected String sexo; 

    public void fazerNiver(){
        this.idade++;
    }
    
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Dados{" + "idade=" + idade + ", nome=" + nome + ", sexo=" + sexo + '}';
    }
  
    
}
