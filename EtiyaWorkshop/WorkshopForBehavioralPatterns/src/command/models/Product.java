package command.models;

public class Product {
    public String productName;



    public void productProduced(){
        System.out.println(productName+ " is produced");
    }

    public void productionStopped(){
        System.out.println(productName+ " isn't produce anymore");
    }


}
