class Conta {
      
      private int numero;
      String titular;
      double saldo;
      
      public boolean saca(double valor){
      
        if(this.saldo < valor){
           return false;
        }
        else {
            this.saldo = this.saldo - valor;
            return true;
        }
      
      }
      
      public void deposita(double valor){
      this.saldo += valor;
      }
      
      public boolean transferePara(Conta destino, double valor){
         boolean retirou = this.saca(valor);
            if( retirou == false){
               return false;
            } else {
                 destino.deposita(valor);
                 return true;
            }
      }

}

class OO {
         public static	void main(String[] args) {
         Conta minhaConta;
         minhaConta = new Conta();
         
         minhaConta.titular = "Duke";
         minhaConta.saldo = 1000.0;
         
         boolean consegui = minhaConta.saca(2000);
         if(consegui){
            System.out.println("Consegui sacar");
         } else {
               System.out.println("Não consegui sacar");
         }
         
         minhaConta.deposita(500);
         
         System.out.println("Saldo atual é: " + minhaConta.saldo);
         
         Conta contaTerceiro = new Conta();         
         
         minhaConta.transferePara(contaTerceiro, 500);
         
         System.out.println("Saldo atual é: " + minhaConta.saldo);
         
         System.out.println("Saldo atual de Terceiro é: " + contaTerceiro.saldo);
         
         } 
}
