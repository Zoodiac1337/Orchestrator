//package com.example.Orchestrator.main;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.net.HttpURLConnection;
//import java.net.URL;
//
//public class APIConnector {
//    public static String GET(String url) throws IOException {
//        URL myURL = new URL(url);
//        HttpURLConnection con = (HttpURLConnection) myURL.openConnection();
//        con.setRequestProperty("X-RapidAPI-Key", "MHhiKZ2sNLh6Ui8WTsR3qA==eUqDKjFLKZbf4zh9");
//        con.setRequestProperty("X-RapidAPI-Host", "weather-by-api-ninjas.p.rapidapi.com");
//        con.setRequestMethod("GET");
//        con.connect();
//
//        String response = "";
//        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
//        String line = in.readLine();
//
//        while (line != null)
//        {
//            response += line + "\r\n";
//            line = in.readLine();
//        }
//
//        return response;
//    }
//
//}
