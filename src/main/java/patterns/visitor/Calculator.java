package patterns.visitor;

/**
 * Created by Artyom on 11/14/2015.
 */
public class Calculator {

    public  ShoppingCartVisitorImpl shoppingCartVisitor;

    public Calculator() {
        shoppingCartVisitor = new ShoppingCartVisitorImpl();
    }

    public int calculate(ItemElement[] itemElements) {

        int sum = 0;

        for (ItemElement element : itemElements) {
            sum += element.accept(shoppingCartVisitor);
        }

        System.out.println("Total cost: " + sum);
        return sum;
    }


}
