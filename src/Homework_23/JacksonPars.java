package Homework_23;

//Знайти API курсу валют будь якого банку та розпарсити (витягти) інформацію стосовно усіх значень в API та записати до JSON файлу в пакеті

import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths; 
import java.nio.file.StandardOpenOption;


public class JacksonPars {

   public static void parseJson (String url) throws IOException {

       ObjectMapper objectMapper = new ObjectMapper();

       ExchangeRates [] exchangeRate = objectMapper.readValue(new URL(url), ExchangeRates [].class);

       for (ExchangeRates exchangeRates : exchangeRate ) {
           System.out.println(exchangeRates);
       }

       String jsonString1 = objectMapper.writeValueAsString(exchangeRate);
//       String jsonString = objectMapper.writerWithDefaultPrettyPrinter().
//               writeValueAsString(exchangeRate);

       // запис даних в файл

       Files.write(Paths.get("C:\\Users\\Serega\\IdeaProjects\\FirstProject\\src\\Homework_23\\Exchange.json"),
               jsonString1.getBytes(), StandardOpenOption.CREATE);

   }




}
