package eci.edu.dosw.parcial.Parcial_Corte_1_CVDS.DOSW;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {


    private static final Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {

        logger.info("Iniciando la aplicación Parcial-Corte-1-CVDS-DOSW...");
        logger.info("Verificando que Maven está corriendo correctamente...");

        SpringApplication.run(Application.class, args);

        logger.info("Aplicación iniciada correctamente. Maven y Spring Boot funcionando OK!");
    }
}
