import java.util.Scanner;

public class ExecutarAgenda {
    public static void main(String[]args){
        Agenda aqui = new Agenda();
        Scanner ler = new Scanner(System.in);
        boolean zelda = true;
        tudo: while (zelda==true){
                continuar: while(aqui.contador<=10){
                        System.out.println("\n\nDigite a opção desejada: \n 1-Cadastrar usuário\n 2-Remover Usuário\n 3-Buscar "
                        +"Usuário\n 4-Imprimir agenda\n 5-Imprimir usuário\n 6-Sair");
                        String op = ler.next();
                        switch(op){
                        case "1": aqui.adiscionaPessoa();
                                break;
                        case "2": aqui.deletaPessoa();
                                break;
                        case "3": aqui.procuraPessoa();
                                break;
                        case "4": aqui.imprimeAgenda();
                                break;
                        case "5": aqui.imprimePessoa();
                                break;
                        case "6": System.out.println("Encerrando o programa");
                                System.exit(0); break;
                        default: System.out.println("Opção inválida");
                                continue continuar;
                        }
                        continue continuar;       
                }
                if(aqui.contador>10){
                        System.out.println("\nAgenda cheia");
                        System.out.println("\nDeseja excluir algum usuario? \n 1-Sim    2-Não");
                        String opt = ler.next();
                        switch(opt){
                                case "1": aqui.deletaPessoa();
                                continue tudo;
                                case "2": aqui.imprimeAgenda(); System.out.println("Encerrando sistema"); System.exit(0);
                                default: System.out.println("Opção inválida"); continue tudo;
                        }
                }
                System.out.println("Fim do programa");
        }
    }
}