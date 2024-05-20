package br.com.fiap.service;

import java.io.IOException;
import java.net.URLEncoder;
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import com.google.gson.Gson;
import br.com.fiap.model.ConsultaCNPJ;
import br.com.fiap.model.ConsultarFrase;

public class FraseService {
	
    public FraseService getFrase(String id) throws ClientProtocolException, IOException {

        //ConsultaCNPJ consultacnpj = null;
        FraseService consultaFrase = null;
        
        //String url = "https://brasilapi.com.br/api/cnpj/v1/" + URLEncoder.encode(cnpj, "UTF-8");
        String url = "https://api.adviceslip.com/advice/" + id;
        
        HttpGet request = new HttpGet(url);

        try (CloseableHttpClient httpClient = HttpClientBuilder.create().disableRedirectHandling().build();
                CloseableHttpResponse response = httpClient.execute(request)) {
            HttpEntity entity = response.getEntity();
            
            if (entity != null) {
                String result = EntityUtils.toString(entity);
                Gson gson = new Gson();
                //consultacnpj = gson.fromJson(result, ConsultaCNPJ.class);
                consultaFrase = gson.fromJson(result, FraseService.class);
            }
        }
        
        return consultaFrase;
    }
}
