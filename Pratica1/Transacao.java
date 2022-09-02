import java.util.Date;

public class Transacao{
    private Int conta;
    private Double valor_venda;
    private Date data;
    private double valor_compra;
    public Int getConta() {
        return conta;
    }
    public void setConta(Int conta) {
        this.conta = conta;
    }
    public Double getValor_venda() {
        return valor_venda;
    }
    public void setValor_venda(Double valor_venda) {
        this.valor_venda = valor_venda;
    }
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }
    public double getValor_compra() {
        return valor_compra;
    }
    public void setValor_compra(double valor_compra) {
        this.valor_compra = valor_compra;
    }
}