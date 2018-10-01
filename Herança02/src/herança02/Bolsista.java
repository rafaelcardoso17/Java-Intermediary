package herança02;
public final class Bolsista extends Aluno{
    private float bolsa;
    
    
    public void renovarBolsa(){
        System.out.println("Renovando bolsa do aluno "+this.getNome());
    }
    
    @Override
    public void pagarMens(){
        System.out.println(this.getNome()+" é bolsista! Pagamento realizado com sucesso!");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
    
}
