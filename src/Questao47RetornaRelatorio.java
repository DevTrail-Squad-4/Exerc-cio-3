package javacodes;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Paciente{

    private String nome, sexo;
    private double peso, altura;
    private int idade;
    

    
    public  Paciente(){

        this.nome = "padrao";
        this.sexo = "nao tem";
        this.peso = 0.0;
        this.idade = 0;
        this.altura = 0.0;


    }

    
    public  Paciente(String nome, String sexo, double peso, int idade, double altura){

        this.nome = nome;
        this.sexo = sexo;
        this.peso = peso;
        this.idade = idade;
        this.altura = altura;


    }


    public int qtdDePaciente(List<Paciente> pacientes){
        return pacientes.size();
    }

    public double mediaIdadeHomens(List<Paciente> pacientes){
        int homemMaiordeIdade = 0;
        double totalIdade = 0;
        for (Paciente p : pacientes){
            if(p.sexo.equalsIgnoreCase("Masculino")) {
                homemMaiordeIdade++;
                totalIdade += (double)p.idade;
            }
        }
        return totalIdade/homemMaiordeIdade;
    }

    public int numMulheresAltura160170peso70mais(List<Paciente> pacientes){
        int mulheresAltura160170peso70mais = 0;

        for (Paciente p : pacientes){
            if (p.sexo.equalsIgnoreCase("Feminino") && p.altura >= 1.60 && p.altura <= 1.70 && p.peso >= 70){
                mulheresAltura160170peso70mais++;
            }
        }
        return mulheresAltura160170peso70mais;

    }

    public int pessoasEntre18e25(List<Paciente> pacientes){
        int pessoasEntre18e25 = 0;

        for (Paciente p : pacientes){
            if (p.idade >= 18 && p.idade <= 25){
                pessoasEntre18e25++;
            }
            
        }
        return pessoasEntre18e25;
    }

    public String nomePessoaMaisVelha(List<Paciente> pacientes){
        int idadebase = 0;
        String nomeMaisVelho = "";

        for (Paciente p : pacientes){
            if(p.idade > idadebase){
                idadebase = p.idade;
                nomeMaisVelho = p.nome;
            }
        }

        return nomeMaisVelho;
    }

    public String nomeMulherMaisBaixa(List<Paciente> pacientes){
        double alturaBase = 2.0;
        String nomeMaisBaixa = "";

        for (Paciente p : pacientes){
            if(p.sexo.equalsIgnoreCase("Feminino") && p.altura < alturaBase){
                alturaBase = p.altura;
                nomeMaisBaixa = p.nome;
            }
        }

        return nomeMaisBaixa;
    }

    public int homemMaior160MaiorIdade(List<Paciente> pacientes){
        int homemMaior160MaiorIdade = 0;
        float alturaBase = 1.6f;

        for(Paciente p : pacientes){
            if(p.sexo.equalsIgnoreCase("Masculino") && (p.altura > alturaBase) && (p.idade >=18)){
                homemMaior160MaiorIdade++;
            }
        }

        return homemMaior160MaiorIdade;
    
}


    public String getNome() {

        return nome;

    }

    public String getSexo() {

        return sexo;

    }

    public double getPeso() {

        return peso;

    }

    public int getIdade() {

        return idade;

    }

    public double getAltura() {

        return altura;

    }

    public void setNome(String nome) {

        this.nome = nome;

    }

    public void setSexo(String sexo) {

        this.sexo = sexo;

    }

    public void setPeso(double peso) {

        this.peso = peso;

    }

    public void setIdade(int idade) {

        this.idade = idade;

    }

    public void setAltura(double altura) {

        this.altura = altura;

    }


}


public class Questao47RetornaRelatorio {

    public static void main(String[] args) {
        String primeiroOuProximo = "primeiro", mensagemUltimo = "";
        Scanner scanner = new Scanner(System.in);
        List<Paciente> pacientes = new ArrayList<>();
       
        while(true){
            String nomeParaFinalizarLoop, nomePaciente;

            Paciente paciente = new Paciente();
            System.out.println("Insira os dados do "+ primeiroOuProximo + " paciente conforme for requerido" + mensagemUltimo);
            System.out.print("Insira o Nome: ");
            paciente.setNome(scanner.nextLine());
            System.out.print("Insira o Sexo (Masculino/Feminino): ");
            paciente.setSexo(scanner.nextLine());
            System.out.print("Insira o Peso (em Kg): ");
            paciente.setPeso(scanner.nextDouble());
            scanner.nextLine();
            System.out.print("Insira a Idade: ");
            paciente.setIdade(scanner.nextInt());
            scanner.nextLine();
            System.out.print("Insira a Altura (em metros): ");
            paciente.setAltura(scanner.nextDouble());
            scanner.nextLine();

            pacientes.add(paciente);
        
            primeiroOuProximo = "Próximo";
            mensagemUltimo = ", se for o ultimo paciente da lista, adicionar \"fim\" depois do nome do paciente. ";
            nomePaciente = paciente.getNome();
            nomeParaFinalizarLoop = nomePaciente.substring(nomePaciente.length() -3);
            if(nomeParaFinalizarLoop.equalsIgnoreCase("fim")){
                break;
            }


        }

        Paciente p = new Paciente();
        System.out.println("\nRelatório de Pacientes:");
        System.out.println("Quantidade de pacientes: " + p.qtdDePaciente(pacientes));
        System.out.println("Média de idade dos homens: " + p.mediaIdadeHomens(pacientes));
        System.out.println("Quantidade de mulheres com altura entre 1,60 e 1,70 e peso acima de 70kg: " + p.numMulheresAltura160170peso70mais(pacientes));
        System.out.println("Quantidade de pessoas com idade entre 18 e 25 anos: " + p.pessoasEntre18e25(pacientes));
        System.out.println("Nome do paciente mais velho: " + p.nomePessoaMaisVelha(pacientes));
        System.out.println("Nome da mulher mais baixa: " + p.nomeMulherMaisBaixa(pacientes));
        System.out.println("Quantidade de homens com mais de 1,60 e maiores de idade" + p.homemMaior160MaiorIdade(pacientes));
        //Minha situação criada é saber quantos homens sao maiores de idade e mais altos que 1.60
        scanner.close();

        

    }
    
}
