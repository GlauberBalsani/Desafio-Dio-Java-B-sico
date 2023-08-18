package entities;

import java.math.BigDecimal;

public class Conta {
    private Integer numero;
    private String agencia;
    private Cliente cliente;
    private BigDecimal saldo;

    public Conta(Integer numero, String agencia, Cliente cliente, BigDecimal saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Conta [numero=" + numero + ", agencia=" + agencia + ", cliente=" + cliente + ", saldo=" + saldo + "]";
    }


    
    

    
}
