import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    // Al logger se le debe buscar un archivo de configuración
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        try {
            System.out.println("Hola mundo");
            int i = 0;
            int b = 10 / i;
        } catch (Exception e){
            logger.error("Algo salió mal", e);
        }

    }
}
