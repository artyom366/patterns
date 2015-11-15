package patterns.visitor;

/**
 * Created by Artyom on 11/14/2015.
 */
public interface ItemElement {

    public int accept(ShoppingCartVisitor shoppingCartVisitor);
}
