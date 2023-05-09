package org.example;

import java.util.HashMap;

public class ShowREG {

    CreateREG createREG = new CreateREG();

    HashMap<String, Integer> database = createREG.getREG();
    public void showResult() {
        System.out.println(database);
    }

}
