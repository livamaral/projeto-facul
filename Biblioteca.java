  import java.util.Scanner;
  import java.util.Random;
  
    class Biblioteca{
    static Random random = new Random();
    static Scanner entrada = new Scanner(System.in);  
    static String virar;
      
     public static void fase3_1(){
       
       Scanner telefone = new Scanner(System.in);
       int numero;
       System.out.println("\nA detetive corre até a recepção e encontra um telefone");
       System.out.println("\nDigite 911 para ligar para a emergência 📞");
       numero = telefone.nextInt();
       System.out.println("Ao tentar discar um número de telefone o silêncio da linha toma seu ouvido, e Alanis percebe que o telefone não está funcionando..");
       System.out.println("\n Tecle Enter para virar para um dos lados para procurar um outro telefone na recepção");
       
      virar = entrada.nextLine();
      int lado = random.nextInt(2);
      if(lado == 1){
      System.out.println("Não há nada ao redor,apenas arquivos de outros pacientes.");
        
      System.out.println("Tecle Enter para continuar andando");
      String andar;
      andar= entrada.nextLine();
      portas();
    }
       else{
      System.out.println("-----------------------------------------------\nQuando ela menos espera o homem aparece atrás dela com sua arma em mãos, ela sabia que não havia mais o que fazer, quando o homem abaixa a arma e lhe entrega um papel, no qual havia gotas de sangue respigados.\nO homem levanta novamente a arma e a aponta para seu próprio queixo, e antes que Alanis possa fazer alguma coisa ele aperta o gatilho. Na carta dizia:\n-----------------------------------------------\nHoje é dia 08/05/2045, às 7:32 da manhã. Me chamo David e estou prestes a cometer a maior loucura da minha vida. Não me deram a oportunidade de trabalhar em um lugar harmonioso, me chamavam de todos os xingamentos possíveis, provavelmente porque eu era um homem que trabalhava como faxineiro do hospital, mas eu era obrigado a continuar pois minha filha precisava daquele transplante, e eles não a deram a oportunidade para sobreviver, com isso, nenhum desses merecem viver…\n-----------------------------------------------");
  }}
       public static void portas(){
        int escolha1 = 1;
        Scanner entradaporta1= new Scanner(System.in);
       System.out.println("\nAlanis avista duas portas\n O que deseja fazer?\n"); 
        System.out.println ("  1: para tentar abrir a porta da direita");
        System.out.println ("  2: para tentar abrir a porta da esquerda ");
        
        escolha1 = entradaporta1.nextInt();
       
        switch(escolha1){
        case 1:
        System.out.println("A porta está trancada");
 System.out.println("Tecle 2 para abrir a porta da esquerda"); 
        int escolha2 = 2;    
        Scanner entradaporta2 = new Scanner(System.in);    
        escolha2 = entradaporta2.nextInt();
          System.out.println("-----------------------------------------------\nAo abrir a porta a detetive se depara com um homem morto com uma arma ao lado do corpo, e um papel, no qual havia gotas de sangue respigados.\nNa carta dizia:\n-----------------------------------------------\nHoje é dia 08/05/2045, às 7:32 da manhã. Me chamo David e estou prestes a cometer a maior loucura da minha vida. Não me deram a oportunidade de trabalhar em um lugar harmonioso, me chamavam de todos os xingamentos possíveis, provavelmente porque eu era um homem que trabalhava como faxineiro do hospital, mas eu era obrigado a continuar pois minha filha precisava daquele transplante, e eles não a deram a oportunidade para sobreviver, com isso, nenhum desses merecem viver…\n-----------------------------------------------");
          break;

          case 2:
            System.out.println("-----------------------------------------------\nAo abrir a porta a detetive se depara com um homem morto com uma arma ao lado do corpo, e um papel, no qual havia gotas de sangue respigados.\nNa carta dizia:\n-----------------------------------------------\nHoje é dia 08/05/2045, às 7:32 da manhã. Me chamo David e estou prestes a cometer a maior loucura da minha vida. Não me deram a oportunidade de trabalhar em um lugar harmonioso, me chamavam de todos os xingamentos possíveis, provavelmente porque eu era um homem que trabalhava como faxineiro do hospital, mas eu era obrigado a continuar pois minha filha precisava daquele transplante, e eles não a deram a oportunidade para sobreviver, com isso, nenhum desses merecem viver…\n-----------------------------------------------");
            break;
        }}}