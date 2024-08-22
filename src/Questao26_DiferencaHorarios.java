import java.util.Scanner;

public class Questao26_DiferencaHorarios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro horário (hh:mm:ss):");
        String horario1 = scanner.nextLine();
        validarHorario(horario1);

        System.out.println("Digite o segundo horário (hh:mm:ss):");
        String horario2 = scanner.nextLine();
        validarHorario(horario2);

        int segundos1 = converterParaSegundos(horario1);
        int segundos2 = converterParaSegundos(horario2);

        int diferencaSegundos = Math.abs(segundos1 - segundos2);

        System.out.printf("A diferença entre os horários é: %d segundos%n", diferencaSegundos);
    }

    private static void validarHorario(String horario) {
        String[] partes = horario.split(":");
        int horas = Integer.parseInt(partes[0]);
        int minutos = Integer.parseInt(partes[1]);
        int segundos = Integer.parseInt(partes[2]);

        if (horas < 0 || horas > 24) {
            throw new IllegalArgumentException("Horas devem estar entre 0 e 24.");
        }
        if (minutos < 0 || minutos >= 60) {
            throw new IllegalArgumentException("Minutos devem estar entre 0 e 59.");
        }
        if (segundos < 0 || segundos >= 60) {
            throw new IllegalArgumentException("Segundos devem estar entre 0 e 59.");
        }
    }

    private static int converterParaSegundos(String horario) {
        String[] partes = horario.split(":");
        int horas = Integer.parseInt(partes[0]);
        int minutos = Integer.parseInt(partes[1]);
        int segundos = Integer.parseInt(partes[2]);

        return horas * 3600 + minutos * 60 + segundos;
    }
}
