class MeuPrograma {
public static void main(String[] args){

 int idade = 15;
 int idadeNoAnoQueVem = idade + 1;
     /*
     System.out.println("Minha idade é: " + idade);
     System.out.println("Minha idade para o próximo ano é: " + idadeNoAnoQueVem);
     
       System.out.print("\n **************************************** \n");
       
       int jan = 15000, fev = 23000, mar = 17000;
       int soma, media;
       
       soma = jan + fev + mar;
       media = soma / 3;
       
       System.out.println("O resultado do Trimestre em R$ '(reais)'");
       System.out.println("Total gasto: R$ "+ soma);
       System.out.println("A média mensal: R$ "+ media);       
       System.out.print(" **************************************** \n");
       */
       
       boolean amigoDoDono = true;        
       if(idade < 18 && amigoDoDono == false){
        System.out.println("Não pode entrar na festa :(");
       } else {
       System.out.println("Pode entrar na festa :)");
       }
       System.out.print("\n\n");
       System.out.print(" **************************************** \n");
       
       while (idade <= 18){
       
       System.out.println(idade);
       idade = idade + 1;
       }
       int x = 20, y = 100;
       
       for(int i = x; i < y; i++){
       if(i % 19 == 0){
       System.out.println("Achei um número divisível por 19 entre x e y == " + i);
       continue;
        }
      }
       
       
       System.out.print("\n **************************************** \n");
    }

}
