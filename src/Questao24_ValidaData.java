import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Questao24_ValidaData {
    Scanner scan = new Scanner(System.in);

    public class ValidaData{
        private int data;
        private int mes;
        private String ano;
        private int mesFevereiro = 28;
        private int tamanhoAno;
        private char digito;
        private char digitoDois;
        private String digitoResultado;
        ArrayList <Integer>  mesNormal = new ArrayList<>();
        ArrayList <Integer> mesTrintaUm = new ArrayList<>();

        
        
        public ValidaData(){
            Collections.addAll(mesNormal, 4, 6, 9, 11);
            Collections.addAll(mesTrintaUm,1, 2, 3, 5, 7, 8, 10, 12);
            
            System.out.println("Esse codigo verifica se uma data é valida");
            System.out.println("Informe a data");
            data = scan.nextInt();
            System.out.println("Informe o mes usando um unico numeral. Ex: 1,2,3,4,5,6,7,8,9,10,11,12");
            mes = scan.nextInt();
            System.out.println("Informe o ano");
            scan.nextLine();
            ano = scan.nextLine();


            tamanhoAno = ano.length();
            digito = ano.charAt(tamanhoAno - 2);
            digitoDois = ano.charAt(tamanhoAno - 1);
            
            String convert = Character.toString(digito);
            String convertDois = Character.toString(digitoDois);

            digitoResultado = convert + convertDois;
            int convertResultado = Integer.parseInt(digitoResultado.trim());


            int anoBissexto = convertResultado % 4;
            
            if(anoBissexto == 0){
                mesFevereiro ++; //adiciona 29 a fevereiro
                for(int i : mesNormal){
                    if(i == mes){
                        if(mes == 2){
                            if(data <= mesFevereiro){
                                System.out.println("Data valida");
                            }else{
                                System.out.println("Data incorreta");
                            }
                        }else if(mes != 2){
                            if(data <= 30){
                                System.out.println("Data valida");
                            }else{
                                System.out.println("Data incorreta");   
                            

                             }
                        }
                    }
                }

                for(int i : mesTrintaUm){
                    if(i == mes){
                        if(mes == 2){
                            if(data <= mesFevereiro){
                                System.out.println("Data valida");
                            }else{
                                System.out.println("Data incorreta");
                            }
                        }else{
                            if(data <= 31){
                                System.out.println("Data valida");
                            }else{
                                System.out.println("Data incorreta");   
                            }

                        }
                    }
                }

            }else{
                for(int i : mesNormal){
                    if(i == mes){
                        if(mes == 2){
                            if(data <= mesFevereiro){
                                System.out.println("Data valida");
                            }else{
                                System.out.println("Data incorreta");
                            }
                        }else if(mes != 2){
                            if(data <= 30){
                                System.out.println("Data valida");
                            }else{
                                System.out.println("Data incorreta");   
                            

                             }
                        }
                    }
                }

                for(int i : mesTrintaUm){
                    if(i == mes){
                        if(mes == 2){
                            if(data <= mesFevereiro){
                                System.out.println("Data valida");
                            }else{
                                System.out.println("Data incorreta");
                            }
                        }else{
                            if(data <= 31){
                                System.out.println("Data valida");
                            }else{
                                System.out.println("Data incorreta");   
                            }

                        }
                    }
                }
            }


        }
    }

    
    public static void main(String[] args) throws Exception {
        Questao24 app = new Questao24();
        app.new ValidaData();

    }
}
