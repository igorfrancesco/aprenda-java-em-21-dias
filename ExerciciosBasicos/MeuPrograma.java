package ExerciciosBasicos;
class MeuPrograma {
public static void main(String[] args){

 int idade = 15;
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
