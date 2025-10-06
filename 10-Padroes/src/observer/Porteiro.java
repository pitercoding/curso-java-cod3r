package observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro {

    private List<ObservadorChegadaAniversariente> observadores
            = new ArrayList<>();

    public void registrarObservador(ObservadorChegadaAniversariente observador){
        observadores.add(observador);
    }

    public void monitorar() {
        Scanner scanner = new Scanner(System.in);

        String valor = "";

        while (!"sair".equalsIgnoreCase(valor)) {

            System.out.print("Aniversariante chegou? ");
            valor = scanner.nextLine();

            if ("sim".equalsIgnoreCase(valor)) {
                //Criar evento
                EventoChegadaAniversariante evento
                        = new EventoChegadaAniversariante(new Date());

                // notificar os observadores
                observadores.stream().forEach(o -> o.chegou(evento));
                valor = "sair";
            } else {
                System.out.println("Alarme falso...");
            }
        }

    }
}
