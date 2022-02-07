package db;

import org.sql2o.*;
import java.net.URI;
import java.net.URISyntaxException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class DB {
    public static Sql2o sql2o = new Sql2o("jdbc:postgresql://ec2-52-2-245-64.compute-1.amazonaws.com:5432/d3l90moeqqpqh3", "oibetcbnwyqbos", "7de45ccda37a1e180d005b984e6ac2ce2afa2e42e9257ef4e0f9ca8155fcf56e");

//    public static Sql2o sql2o;
//    static Logger logger = LoggerFactory.getLogger(DB.class);
//
//    static {
//
//        try {
//            URI dbUri;
//            if (System.getenv("DATABASE_URL") == null) {
//                dbUri = new URI("postgres://localhost:5432/wildlife_tracker");
//            } else {
//                dbUri = new URI(System.getenv("DATABASE_URL"));
//            }
//            int port = dbUri.getPort();
//            String host = dbUri.getHost();
//            String path = dbUri.getPath();
//            String username = (dbUri.getUserInfo() == null) ? "postgres" : dbUri.getUserInfo().split(":")[0];
//            String password = (dbUri.getUserInfo() == null) ? "twstolY." : dbUri.getUserInfo().split(":")[1];
//            sql2o = new Sql2o("jdbc:postgresql://" + host + ":" + port + path, username, password);
//        } catch (URISyntaxException e) {
//            logger.error("Unable to connect to database.");
//        }
//    }
}