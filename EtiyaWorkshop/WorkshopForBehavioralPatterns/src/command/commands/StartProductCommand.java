package command.commands;

import command.models.Product;

public class StartProductCommand implements ICommand{

    private Product product;

    public StartProductCommand(Product product) {
        this.product = product;
    }

    @Override
    public void execute() {
        this.product.productProduced();
        System.out.println("Üretim başlatıldı.");
    }
}
