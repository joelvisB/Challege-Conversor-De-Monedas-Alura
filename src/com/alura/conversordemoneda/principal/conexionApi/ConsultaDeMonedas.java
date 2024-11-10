package com.alura.conversordemoneda.principal.conexionApi;
import com.alura.conversordemoneda.principal.modelo.*;
import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class ConsultaDeMonedas {

    public Monedas buscarMoneda(String monedaBase, String monedaObjetivo){
        String apikey = "bdf1d1315f1c9f55b0e79da4";

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/" + apikey + "/pair/" + monedaBase + "/" + monedaObjetivo + "/");

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request,HttpResponse.BodyHandlers.ofString());

            String json = response.body();

            return new Gson().fromJson(json,Monedas.class);
        }catch (Exception e){
            throw new RuntimeException("[No se encontro ningun tipo de moneda.]");
        }

    }

}
