package org.example;

import java.util.HashMap;

public class AddToREG {

    CreateREG createREG = new CreateREG();

    private boolean isInt(String str) {
        try {
            Integer.parseInt(str);
            return true;
        }
        catch(NumberFormatException nfe) {
            return false;
        }
    }

    public void command(String s){
        String parts[] = s.split(",");
        String key = parts[0].substring(4);

        if(isInt(parts[1])){
            int value = Integer.parseInt(parts[1]);
            add(key, value);
        }else{
            add(key, parts[1]);
        }

    }

    public void add(String R1, String R2){
        HashMap<String, Integer> add = createREG.getREG();
        int value =add.get(R1) + add.get(R2);
        add.put(R1, value);
    }

    public void add(String R, int n){
        HashMap<String, Integer> add = createREG.getREG();
            int value = add.get(R);
            value = value + n;
            add.put(R, value);
    }

}
