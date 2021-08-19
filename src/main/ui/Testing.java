package ui;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Testing {
    static JSONObject json = new JSONObject();
    static JSONArray jray = new JSONArray();

    public JSONObject dealWith(String k, Object val) {
        return json.put(k, val);
    }

    public void addElement() {
        jray.put(0, "3");
        jray.put(1,5);
        jray.put(3, "okay");
    }

    public static void main(String[] args) throws IOException {
        Testing newTest = new Testing();
        newTest.dealWith("first key", 1);
        newTest.addElement();
        newTest.dealWith("second key", jray);
        FileWriter file = new FileWriter("C://Users//OceanPC//Desktop//jsonFun.json");
        file.write(json.toString());
        file.close();
    }


}

