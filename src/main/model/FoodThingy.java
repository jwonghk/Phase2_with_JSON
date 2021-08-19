package model;

import org.json.JSONObject;
import persistence.Writable;

public class FoodThingy implements Writable {
    private String name;
    private Category cate;

    public FoodThingy(String foodname, Category foodcate) {
        this.name = foodname;
        this.cate = foodcate;
    }

    public String getName() {
        return this.name;
    }

    public Category getCate() {
        return this.cate;
    }

    @Override
    public JSONObject toJson() {
        JSONObject json = new JSONObject();
        json.put("name", name);
        json.put("category", cate);
        return json;
    }
}
