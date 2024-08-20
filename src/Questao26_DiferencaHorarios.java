import java.util.Scanner;

public class Questao26_DiferencaHorarios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro horário (hh:mm:ss):");
        String horario1 = scanner.nextLine();

        System.out.println("Digite o segundo horário (hh:mm:ss):");
        String horario2 = scanner.nextLine();

        int segundos1 = converterParaSegundos(horario1);
        int segundos2 = converterParaSegundos(horario2);

        int diferencaSegundos = Math.abs(segundos1 - segundos2);

        int horas = diferencaSegundos / 3600;
        int minutos = (diferencaSegundos % 3600) / 60;
        int segundos = diferencaSegundos % 60;

        System.out.printf("A diferença entre os horários é: %02d:%02d:%02d%n", horas, minutos, segundos);
    }

    private static int converterParaSegundos(String horario) {
        String[] partes = horario.split(":");
        int horas = Integer.parseInt(partes[0]);
        int minutos = Integer.parseInt(partes[1]);
        int segundos = Integer.parseInt(partes[2]);

        return horas * 3600 + minutos * 60 + segundos;
    }
}
