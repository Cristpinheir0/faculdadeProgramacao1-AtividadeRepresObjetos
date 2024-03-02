import java.text.DecimalFormat;
import java.util.Random;

public class Termometro {

    private double temperaturaAnterior = 0;
    private double temperaturaAtual = 0;
    DecimalFormat formato = new DecimalFormat("#.##");
    Random random = new Random();


    public double getTemperaturaAnterior() {
        return temperaturaAnterior;
    }

    public void setTemperaturaAnterior(double temperaturaAnterior) {
        this.temperaturaAnterior = temperaturaAnterior;
    }

    public void medirTemperatura() {
        temperaturaAnterior = temperaturaAtual;
        temperaturaAtual = Double.parseDouble((formato.format(random.nextDouble(151) -30)).replace(",", "."));
        System.out.println("A temperatura medida é: " + temperaturaAtual);
    }

    /**
     * Método responsável por comparar as duas temperaturas armazenadas
     */
    public void compararTemperaturas() {
        final double diferenca = temperaturaAtual - temperaturaAnterior;
        if(diferenca > 0){
            System.out.println("A temperatura atual é maior que a temperatura passada, por " + diferenca + "ºC");
            return;
        } else if(diferenca < 0) {
            System.out.println("A temperatura atual é menor que a temperatura passada, por " + diferenca + "ºC");
            return;
        }
        System.out.println("A temperatura atual é igual a temperatura passada");
    }

}
