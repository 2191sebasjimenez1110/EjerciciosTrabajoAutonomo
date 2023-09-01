import java.util.Random;

public class NumeroAleatorio {
    public int numero(){ 
        Random numero = new Random();
        int valor = numero.nextInt(1,101);
        return valor;
    }
}