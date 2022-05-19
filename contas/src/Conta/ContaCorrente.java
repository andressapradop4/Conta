
package Conta;


public class ContaCorrente {
    String numero;
    String agencia;
    boolean especial;
    double limiteesp;
    double saldo;
    
    boolean realizarSaque(double quantiaASacar){
    if(saldo>=quantiaASacar){
    saldo -= quantiaASacar;
    return true;
    
    }else{
    if(especial){
    double limite =limiteesp + saldo;
    if(limite>=quantiaASacar){
    saldo-=quantiaASacar;
    return true;
           
    }else {
    return false;
    }
    }else {
          return false;  
            }
    }
    }
    
    void depositar(double valorDepositado){
    saldo+= valorDepositado;
    }
    
    void consultarSaldo(){
        System.out.println("qual e o seu saldo"+saldo);
    }
    boolean verificarUsoChequeEspecial(){
    return saldo<0;
    }
    }
