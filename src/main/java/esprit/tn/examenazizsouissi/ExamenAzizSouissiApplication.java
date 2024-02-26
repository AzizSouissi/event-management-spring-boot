package esprit.tn.examenazizsouissi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ExamenAzizSouissiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExamenAzizSouissiApplication.class, args);
    }

}
