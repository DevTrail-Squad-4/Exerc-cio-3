import java.util.ArrayList;
import java.util.List;

class Pessoa{

    String sexo;
    int idade;


    public Pessoa(String sexo, int idade){
        this.sexo = sexo;
        this.idade = idade;
    }

}

public class Questao46HomemMaiorMulherMaior{
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        int homemMaiorIdade = 0;
        int mulherMaiorIdade = 0;

        for(int i=0; i<100; i++){
            String sexo = (i%2 == 0)? "masculino" : "feminino";
            int idade = (int)(Math.random() * 90);
            pessoas.add(new Pessoa(sexo, idade));
        }

        for (Pessoa p : pessoas){
            if(p.idade >= 18){
                if(p.sexo.equals("masculino")){
                    homemMaiorIdade++;
                }
                if(p.sexo.equals("feminino")){
                    mulherMaiorIdade++;
                }
            }
        }


        System.out.println("Homens maiores de idade: " + homemMaiorIdade);
        System.out.println("Mulheres maiores de idade: " + mulherMaiorIdade);
        



    }

    


}