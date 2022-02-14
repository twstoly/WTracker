package db;

import org.sql2o.*;
import java.net.URI;
import java.net.URISyntaxException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DB {
//        public static Sql2o sql2o = new Sql2o("jdbc:postgresql://ec2-54-211-176-156.compute-1.amazonaws.com:5432/d1qng4rvn0cgrd", "qeezjwoawlgxtr", "5175b0dced28ed160cad4a1a6e8a50bc6e4a17e602803468b7fedad46cfb74e4");
    public static Sql2o sql2o = new Sql2o("postgresql://localhost:5432/wildlife_tracker", "postgres", "1111111");
}