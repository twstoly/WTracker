import models.Animal;
import models.Endangered;
import models.Sighting;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;
import static spark.Spark.get;

public class App {
    public static void main(String[] args) {

        ProcessBuilder process = new ProcessBuilder();
        int port;


        if (process.environment().get("PORT") != null) {
            port = Integer.parseInt(process.environment().get("PORT"));
        } else {
            port = 4567;
        }

        port(port);

        staticFileLocation("/public");


        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            model.put("animals", Animal.all());
            model.put("endangered", Endangered.all());
            model.put("sightings", Sighting.all());
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());









    }
}













































































































