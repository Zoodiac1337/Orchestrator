package com.example.Orchestrator.random;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class RandomNumber {
    public static Integer getRandomNumber(int min, int max) throws IOException {
        String request = "{\n" +
                "    \"jsonrpc\": \"2.0\",\n" +
                "    \"method\": \"generateIntegers\",\n" +
                "    \"params\": {\n" +
                "        \"apiKey\": \"4c630a74-792f-4541-8c8f-85f003e0e2cb\",\n" +
                "        \"n\": 1,\n" +
                "        \"min\": "+min+",\n" +
                "        \"max\": "+max+",\n" +
                "        \"replacement\": true\n" +
                "    },\n" +
                "    \"id\": 42\n" +
                "}";

        URL url = new URL("https://api.random.org/json-rpc/4/invoke");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("POST");
        con.setRequestProperty("Accept", "application/json");
        con.setRequestProperty("Content-type", "application/json");
        con.setDoOutput(true);

        OutputStream os = con.getOutputStream();
        OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");
        osw. write(request);
        osw.close();
        os.close();

        BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String response = "";

        String line;
        while ((line = br.readLine()) !=null) {
            response = response+line;
        }
        ObjectMapper mapper = JsonMapper.builder().findAndAddModules().build();
        RandomMain newNumber = mapper.readValue(response, RandomMain.class);

        return (newNumber.result.random.data.get(0));
    }

}
