
package Conta;





public class ex01conta {
    public static void main(String[] args) {
        
        ContaCorrente conta = new ContaCorrente();
        
        conta.numero="123456";
        conta.agencia = "1234";
        conta.especial = true;
        conta.limiteesp = 500;
       conta.saldo = 2000;
        
        System.out.println("saldo da conta"+conta.numero+"="+conta.saldo);
        
        boolean saqueEfetuado =  conta.realizarSaque(15);
      
        if(saqueEfetuado){
            
            System.out.println("saque efetuado");
            System.out.println("saldo atual="+ conta.saldo);
        }else{
            System.out.println("nao foi possivel realizar o saque");
        }
        System.out.println("deposito de 100 reais");
        conta.depositar(100);
        conta.consultarSaldo();
      if(conta.verificarUsoChequeEspecial()){
          System.out.println("esta usando cheque especial");
      }else{
          System.out.println("nao esta usando cheque especial");
      }
    
    }
    
   
}

