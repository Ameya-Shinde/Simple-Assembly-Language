package org.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

public class CreateREG {

    private static HashMap<String, Integer> REGS = new HashMap<>();

    public HashMap<String, Integer> getREG() {
        return REGS;
    }

    public void createREG(String s){
        String parts[] = s.split(",");
        String key = parts[0].substring(3);
        int value = Integer.parseInt(parts[1].substring(1));
        REGS.put(key,value);
    }

    public void loadHashMap() throws IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("data.properties"));
        for (String key : properties.stringPropertyNames()) {
            int value = Integer.parseInt(properties.get(key).toString());
            REGS.put(key, value);
        }
    }

    public void storeHashMap() throws IOException {
        Properties properties = new Properties();
        for (HashMap.Entry<String,Integer> entry : REGS.entrySet()) {
            properties.put(entry.getKey(), entry.getValue().toString());
        }
        properties.store(new FileOutputStream("data.properties"), null);
    }

}
