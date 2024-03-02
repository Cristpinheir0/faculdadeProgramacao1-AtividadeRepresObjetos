import java.util.Scanner;

public class Cronometro {

    // Tempo a ser
    private long tempoDecorrido;

    public long getTempoDecorrido() {
        return tempoDecorrido;
    }

    Scanner scanner = new Scanner(System.in);

    public void cronometrar() {
        System.out.println("Digite algo e aperte enter para começar: ");
        String comando = scanner.nextLine();
        long inicio = System.currentTimeMillis();
        System.out.println("Digite algo e aperte enter para finalizar: ");
        comando = scanner.nextLine();
        long fim = System.currentTimeMillis();
        tempoDecorrido = fim - inicio;
        System.out.println("Tempo decorrido: " + tempoDecorrido + " ms");

    }
}
