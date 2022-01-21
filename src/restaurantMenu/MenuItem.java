package restaurantMenu;

import java.util.Date;
import java.util.Objects;

public class MenuItem {
    private String category;
    private String name;
    private String description;
    private double price;
    private Boolean isNew;
    public Date creationDate = new Date();

    public Boolean getNew() {
        return isNew;
    }

    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

//    MenuItem(String category, String name, String description, double price, Boolean isNew){
//        this.category = category;
//        this.name = name;
//        this.description = description;
//        this.price = price;
//        this.isNew = isNew;
//    }
    //Changes isNew
    public void changeIsNew(boolean x) {
        isNew = x;
    }

    public MenuItem(String category, String name, String description, double price, Boolean isNew, Date creationDate) {
        this.category = category;
        this.name = name;
        this.description = description;
        this.price = price;
        this.isNew = isNew;
        this.creationDate = creationDate;
    }

    @Override
    public String toString() {
        return  "**********" + "\n" +
                "Name: " + name + '\n' +
                "Price: $" + price + '\n' +
                "Category: " + category + '\n' +
                "Description: " + description + '\n' +
                "CreationDate: " + creationDate + '\n' +
                "**********" + "\n";
    }
//    public String toString() {
//        return  "**********" + "\n" +
//                "Name: " + name + '\n' +
//                "Price: $" + price + '\n' +
////                "----------" + "\n" +
//                "Category: " + category + '\n' +
//                "Description: " + description + '\n' +
//                "IsNew: " + isNew + '\n' +
//                "CreationDate: " + creationDate + '\n' +
//                "**********" + "\n";
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return Objects.equals(name, menuItem.name) && Objects.equals(description, menuItem.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description);
    }
}
