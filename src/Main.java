public class Main {
    public static void main(String[] args) {
        /* TERMOMETRO */
        System.out.println("Utilização do termometro");
        // Declaração do termometro a ser utilizado
        Termometro termometro = new Termometro();
        // Medição da primeira temperatura
        termometro.medirTemperatura();
        System.out.println("Temperatura anterior = " + termometro.getTemperaturaAnterior() + "ºC");
        termometro.setTemperaturaAnterior(35.5);
        // Medição da segunda temperatura
        termometro.medirTemperatura();
        termometro.compararTemperaturas();
        /* CRONOMETRO */
        System.out.println("Utilização do cronometro");
        // Declaração do cronometro a ser utilizado
        Cronometro cronometro = new Cronometro();
        cronometro.cronometrar();
        System.out.println("O tempo decorrido foi de: " + cronometro.getTempoDecorrido() + "ms");

    }
}