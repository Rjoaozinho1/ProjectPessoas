import java.util.ArrayList;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<Fisica> fisica = new ArrayList<Fisica>();
        ArrayList<Juridica> juridica = new ArrayList<Juridica>();
        ArrayList<Colaborador> colab = new ArrayList<Colaborador>();
        
        Scanner scan = new Scanner(System.in);

        String cpf, rg, genero, cnpj, ctps, nome, logradouro, bairro, cidade, uf;
        int nasc;

        System.out.print("\nDigite a quantidade de pessoas fisicas: ");
		int qtdFisica = scan.nextInt();
        System.out.print("\nDigite a quantidade de pessoas juridicas: ");
		int qtdJuridica = scan.nextInt();
        System.out.print("\nDigite a quantidade de pessoas colaboradoras: ");
		int qtdColab = scan.nextInt();

        if(scan.hasNextLine())
			scan.hasNextLine();

            for (int i = 0; i < qtdFisica; i++){
                System.out.println("**** Pessoa Fisica ****");
                System.out.print("\nDigite o nome: ");
                nome = scan.next();
                System.out.print("\nDigite o logradouro: ");
                logradouro = scan.next();
                System.out.print("\nDigite o bairro: ");
                bairro = scan.next();
                System.out.print("\nDigite a cidade: ");
                cidade = scan.next();
                System.out.print("\nDigite o Estado: ");
                uf = scan.next();
                System.out.print("\nDigite o cpf: ");
                cpf = scan.next();
                System.out.print("\nDigite o rg: ");
                rg = scan.next();
                System.out.print("\nDigite o genero: ");
                genero = scan.next();
                System.out.print("\nDigite a idade: ");
                nasc = scan.nextInt();
                
                Fisica objFisica = new Fisica(nome, logradouro, bairro, cidade, uf, cpf, rg, genero, nasc);
    
                Fisica.add(objFisica);

            }    

            for (int i = 0; i < qtdJuridica; i++){
                System.out.println("**** Pessoa Juridica ****");
                System.out.print("\nDigite o nome: ");
                nome = scan.next();
                System.out.print("\nDigite o logradouro: ");
                logradouro = scan.next();
                System.out.print("\nDigite o bairro: ");
                bairro = scan.next();
                System.out.print("\nDigite a cidade: ");
                cidade = scan.next();
                System.out.print("\nDigite o Estado: ");
                uf = scan.next();
                System.out.print("\nDigite o cpf: ");
                cnpj = scan.next();
                
                Juridica objJuridica = new Juridica(nome, logradouro, bairro, cidade, uf, cnpj);
    
                Juridica.add(objJuridica);
            }

            for (int i = 0; i < qtdColab; i++){
                System.out.println("**** Colaborador ****");
                System.out.print("\nDigite o nome: ");
                nome = scan.next();
                System.out.print("\nDigite o logradouro: ");
                logradouro = scan.next();
                System.out.print("\nDigite o bairro: ");
                bairro = scan.next();
                System.out.print("\nDigite a cidade: ");
                cidade = scan.next();
                System.out.print("\nDigite o Estado: ");
                uf = scan.next();
                System.out.print("\nDigite o cpf: ");
                cpf = scan.next();
                System.out.print("\nDigite o rg: ");
                rg = scan.next();
                System.out.print("\nDigite o genero: ");
                genero = scan.next();
                System.out.print("\nDigite a idade: ");
                nasc = scan.nextInt();
                System.out.print("\nDigite o cpf: ");
                ctps = scan.next();

                Colaborador objColaborador = new Colaborador(nome,logradouro, bairro, cidade, uf, cpf, rg, genero, nasc, ctps);
    
                Colaborador.add(objColaborador);
            }

            for(Fisica objFisica: fisica){
            System.out.println("\nNome: " + getNome() + "\nCPF: " + getCpf() + "\nRG: " + getRg() + "\nGENERO: " + getGenero() + "NASCIMENTO: " + getNasc());
            }

            for(Juridica objJuridica: juridica){
                System.out.println("\nNome: " + getNome() + "\nCPF: " + getCpf() + "\nRG: " + getRg() + "\nGENERO: " + getGenero() + "NASCIMENTO: " + getNasc());
            }

            for(Colaborador objColaborador: colab){
                System.out.println("\nNome: " + getNome() + "\nCPF: " + getCpf() + "\nRG: " + getRg() + "\nGENERO: " + getGenero() + "NASCIMENTO: " + getNasc());
            }


            scan.close();
    }
}
