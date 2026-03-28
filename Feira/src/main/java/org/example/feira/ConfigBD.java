package org.example.feira;

import java.io.InputStream;
import java.util.Properties;

public class ConfigBD {


        private String url;


        public ConfigBD (){
            loadProperties();
        }

        private void loadProperties() {
            try (InputStream input = getClass()
                    .getClassLoader()
                    .getResourceAsStream("db.properties")) {

                if (input == null) {
                    throw new RuntimeException("Arquivo db.properties não encontrado!");
                }

                Properties prop = new Properties();
                prop.load(input);

                url = prop.getProperty("db.url");


            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public String getUrl() {
            return url;
        }

       
    }
