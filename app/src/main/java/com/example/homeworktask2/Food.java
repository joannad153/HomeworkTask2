package com.example.homeworktask2;

public class Food {

    private int foodID;
    private String name;
    private String cost;
    private String description;
    private int imageId;

    public Food(int foodID, String name, String cost, String description, int imageId) {
        this.foodID = foodID;
        this.name = name;
        this.cost = cost;
        this.description = description;
        this.imageId = imageId;
    }

    public int getFoodID() { return foodID; }

    public void setFoodID(int foodID) { this.foodID = foodID; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getCost() { return cost; }

    public void setCost() { this.cost = cost; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

    public int getImageId() { return imageId; }

    public void setImageId(int imageId) { this.imageId = imageId; }
}
