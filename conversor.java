import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class conversor {
    public static void main(String[] args) {

        int opcion = 1;
        int MenuOpcion = 0;

        Scanner lectura = new Scanner(System.in);
        while (opcion != 3) {
            String Divisa1 = "";
            String Divisa2 = "";
            double monto = 0;

            System.out.println("""
                    \n******************************
                    Bienvenido al conversor de divisas
                    
                    (1)- Conversar Divisa
                    (2)- Salir
                    *******************************
                    
                    """);
            opcion = lectura.nextInt();
            if(opcion == 2) {
                System.out.println("Gracias por utilizar mi programa");
                break;
            }
            switch (opcion) {
                case 1:

                System.out.println("""
                        *****************************
                        
                        ARS - Peso Argentino
                        
                        BOB - Boliviano Boliviano
                        
                        BRL - Real Brasileño
                        
                        CLP - Peso Chileno
                        
                        COP - Peso Colombiano
                        
                        USD - Dólar Estadounidense
                        
                        CRC - Colón Costarricense
                        
                        ******************************
                        """);
                System.out.println("Digite las iniciales de la divisa base que desea conversar: ");
                Divisa1 = lectura.next().toUpperCase();

                    System.out.println("Ahora digite la divisa en la que desea convertir el " + Divisa1 + ": ");
                    Divisa2 = lectura.next().toUpperCase();

                System.out.println("Por favor digite la cantidad de; "+ Divisa1 + " que desea convertir a --> " + Divisa2);
                monto = Double.parseDouble(String.valueOf(lectura.nextDouble()));
                break;
            }
            URI direccion = URI.create("https://v6.exchangerate-api.com/v6/112798272d7c810dffe636fe/pair/" + Divisa1 + "/" + Divisa2 + "/" + monto);

            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(direccion)
                        .build();

                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                Gson gson = new Gson();
                JsonObject jsonObject = gson.fromJson((response.body()), JsonObject.class);
                double Respuesta = jsonObject.get("conversion_result").getAsDouble();


                System.out.println("\n El resultado de convertir "+monto+" "+ Divisa1 + " es "+ +Math.round(Respuesta*100.0)/100.0 + " "+Divisa2) ;


            } catch (NumberFormatException e){
                System.out.println("Error");
            } catch (Exception e) {
                System.out.println("Error");
            }
        }


    }
}
