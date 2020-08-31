import java.util.Scanner;

public class Agenda {
    String[][] vnome = new String[11][3];
    Scanner ler = new Scanner(System.in);
    int contador = 1;

    //Adisciona pessoa
    public void adiscionaPessoa(){
        vai: for(int i = 0; i<3;i++){
            switch(i){
                case 0: System.out.println("Digite o nome"); 
                        String tempNome= ler.next();
                        for(int b=0;b<=10;b++){
                            if(tempNome.equals(vnome[b][i])){
                                System.out.println("Nome de usuário já cadastrado");
                                break vai;
                            }
                        }
                        this.vnome[contador][i] = tempNome;
                        break;
                case 1: System.out.println("Digite sua idade"); 
                        this.vnome[contador][i] = ler.next();
                        break;
                case 2: System.out.println("Digite sua altura"); 
                        this.vnome[contador][i] = ler.next();
                        contador+=1;
                        break;
            }
            
        }
    }

    //Delete pessoa
    public void deletaPessoa(){
        int pok = 0;
        if(contador!=1){
            if(pok!=33){
                System.out.println("Digite o nome da pessoa que deseja deletar");
                String apaga = ler.next();
                String temp = apaga;
                for(int i = 1; i<=10;i++){
                    if(apaga.equals(vnome[i][0])){
                        for(int n=0;n<3;n++){
                            vnome[i][n] = null;
                        }
                        apaga = "apagou";
                        pok = 33;
                        System.out.println(temp+" foi deletado");
                        contador -= 1;
                    }
                }
                if(apaga!="apagou"){
                    System.out.println("USUÁRIO NÃO ENCONTRADO");
                }
            }
        }else{
            System.out.println("NENHUM USUÁRIO PARA DELETAR");
        }
    }

    //Procura a pessoa
    public void procuraPessoa(){
        if(contador!=1){
            System.out.println("Digite o nome da pessoa que deseja procurar");
            String procura = ler.next();
            for(int i=1; i<=10;i++){
                if(procura.equals(vnome[i][0])){
                    System.out.println(procura+" está cadastrado na posição "+i);
                    procura = "achado";
                }
            }
            if(procura!="achado"){
                System.out.println("USUÁRIO NÃO ENCONTRADO");
            }
        }else{
            System.out.println("NENHUM USUÁRIO PARA PROCURAR");
        }
    }

    //Imprime agenda
    public void imprimeAgenda(){
        if(contador == 1){
            System.out.println("AGENDA VAZIA");
        }else{
            for(int i = 1;i<contador;i++){
                System.out.println("\n Pessoa numero "+i+": ");
                for(int b = 0; b<3;b++){
                    switch(b){
                        case 0: System.out.print(" Nome: "+vnome[i][b]);
                            break;
                        case 1: System.out.print(" - Idade: "+vnome[i][b]);
                            break;
                        case 2: System.out.print(" - Altura: "+vnome[i][b]);
                            break;
                    }
                }
            }
        }
    } 

    //Imprime pessoa
    public void imprimePessoa(){
        if(contador == 1){
            System.out.println("NENHUM USUÁRIO CADASTRADO");
        }else{
            System.out.println("Digite o nome da pessoa que deseja pesquisar");
            String pessoa = ler.next();
            String euvi = null;
            for(int i = 1;i<=10;i++){
                if(pessoa.equals(vnome[i][0])){
                    System.out.println("Pessoa encontrada: ");
                    euvi = "achei";
                    for(int b = 0;b<3;b++){
                        System.out.print(" "+vnome[i][b]+" ");
                    }
                }
            }
            if(euvi==null){
                System.out.println("USUÁRIO NÃO ENCONTRADO");
            }
        }
    }
}
