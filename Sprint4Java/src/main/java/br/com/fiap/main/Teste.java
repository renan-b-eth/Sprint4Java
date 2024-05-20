package br.com.fiap.main;

import org.apache.http.client.ClientProtocolException;
import java.io.IOException;
import java.util.Scanner;
import br.com.fiap.model.ConsultaCNPJ;
import br.com.fiap.model.ConsultarFrase;
import br.com.fiap.service.CNPJService;
import br.com.fiap.service.FraseService;

public class Teste {

    public static void main(String[] args) throws ClientProtocolException, IOException {
        CNPJService cnpjService = new CNPJService();
        FraseService fraseService = new FraseService();
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o ID da frase:");
        String cnpj = scanner.nextLine();
        String id = scanner.next();
        
        ConsultaCNPJ consultaCNPJ = cnpjService.getConsultaCNPJ(cnpj);
        FraseService consultaFrase = fraseService.getFrase(id);
        
        if (consultaFrase != null) {
            System.out.println("Frase: " + consultaFrase.getFrase(id));
            
        } else {
            System.out.println("Não existe frase.");
        }
    }
}
