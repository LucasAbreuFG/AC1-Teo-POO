package ac1;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteContaCorrente {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        ArrayList<ContaCorrente>contas = new ArrayList<ContaCorrente>();

        int op = 0;
        int i = 0, numConta;
        float saldoTeste = 0,somatoriaSaldos = 0;
        float Limite = 0;


        while(op != 6){

            System.out.println("Digite a opção que deseja:");
            System.out.println("[1]Cadastrar [2]Deposito [3]Saque [4]Ver Saldo [5]Somatorio Saldo [6]Sair");

            op = Integer.parseInt(s.nextLine());
            ++i;
            switch(op) {
                case 1:
                    
                    ContaCorrente c = new ContaCorrente();

                    c.setNumConta(i);
                    
                    System.out.println("Digite o seu Nome: ");
                    c.setNomeCli(s.nextLine());

                    System.out.println("Digite o seu Limite Especial: ");
                    Limite = Float.parseFloat(s.nextLine());
                    
                    while(c.setLimiteEspecial(Limite) == false){
                        System.out.println("Digite o seu Limite novamente: ");
                        Limite = Float.parseFloat(s.nextLine());
                        
                    }

                    System.out.println("Digite o seu saldo: ");
                    saldoTeste = Float.parseFloat(s.nextLine());
                        
                    while(c.setSaldo(saldoTeste) == false){
                        System.out.println("Digite o seu saldo novamente: ");
                        saldoTeste = Float.parseFloat(s.nextLine());
                        
                    }

                    contas.add(c);
                    System.out.println("" );

                    break;

                case 2:
                        System.out.println("Digite o número da conta que deseja acessar: ");
                        numConta = Integer.parseInt(s.nextLine());

                        for (ContaCorrente c2 : contas) {
                            saldoTeste = 0;
                            if(numConta == c2.getNumConta()){
                                System.out.println("Agora apresente a quantia que deseja depositar:  " );
                                saldoTeste =  Float.parseFloat(s.nextLine());
                                c2.setDeposito(saldoTeste);
                                
                                System.out.println("Saldo alterado com sucesso" );
                                System.out.println("Atualmente seu saldo é de: R$" + c2.getSaldo() );
                                break;
                                    
                            }
                            
                        }
                        if(saldoTeste == 0){
                            System.out.println("A conta digitada não existe " );
                            
                        }
                        System.out.println("" );
                        
                    break;
                
                case 3:
                    System.out.println("Digite o número da conta que deseja acessar: ");
                    numConta = Integer.parseInt(s.nextLine());

                    for (ContaCorrente c2 : contas) {
                        saldoTeste = 0;
                        if(numConta == c2.getNumConta()){
                            System.out.println("Agora apresente a quantia que deseja sacar:  " );
                            saldoTeste =  Float.parseFloat(s.nextLine());
                            
                            if(c2.setSaque(saldoTeste)){
                                System.out.println("Saldo alterado com sucesso" );
                                System.out.println("Atualmente seu saldo é de: R$" + c2.getSaldo() );
                            }
                            else{
                                System.out.println("O saque que você deseja retirar é alto demais ou o seu Limite não comporta." );
                                
                            }
                            break;
                        }
                    }
                    if(saldoTeste == 0){
                        System.out.println("A conta digitada não existe " );

                    }
                    System.out.println("" );

                    break;
                
                case 4:
                    System.out.println("Digite o número da conta que deseja acessar: ");
                    numConta = Integer.parseInt(s.nextLine());

                    for (ContaCorrente c2 : contas) {
                        saldoTeste = 0;
                        if(numConta == c2.getNumConta()){
                            System.out.println("" );
                            System.out.println("o Número da sua conta é:" + c2.getNumConta() );
                            System.out.println("o Mome da sua conta é:" + c2.getNomeCli() );
                            System.out.println("E o seu Saldo equivale a: R$" + c2.getSaldo() );

                            saldoTeste = 1;
                            break;
                        }
                    }
                    if(saldoTeste == 0){
                        System.out.println("A conta digitada não existe " );
                        

                    }
                    System.out.println("" );

                    break;
                
                case 5:
                    somatoriaSaldos = 0;
                    System.out.println("Iniciando a somatória dos saldos... ");
                    for (ContaCorrente c2 : contas) {
                        if(c2.getSaldo() >= 0){
                       
                            somatoriaSaldos = somatoriaSaldos + c2.getSaldo();

                        }
                    }
                    System.out.println("" );

                    if(somatoriaSaldos > 0){
                        System.out.println("A somatória de todos os saldos que não usaram limite resultaram em: " );
                        System.out.println(" R$" + somatoriaSaldos );

                    }
                    else{
                        System.out.println("Todas as contas se encontram com Saldo Negativo.." );
                        
                    }
                    System.out.println("" );
                        
                    break;
                
                default:
                
              }
        }
        s.close();


    }
}

