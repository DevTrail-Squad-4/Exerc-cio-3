public class Questao59_Tabuada {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++){
            System.out.println("Tabudade de " + i + ":");
            for(int j = 1; j <= 10; j++){
                System.out.println(i + " X " + j + ": " + (i*j));
            }
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        }
    }
}
