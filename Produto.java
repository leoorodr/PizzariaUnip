public class Produto{
    public String nome;
    public String descrição;
    public float valor;

    
    public boolean atualizarValor(float valor){
        this.valor=valor;
        return true;
    }
}