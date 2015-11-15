package patterns.visitor;

/**
 * Created by Artyom on 11/14/2015.
 */
public interface ShoppingCartVisitor {

    int visit(Book book);
    int visit(Fruit fruit);
}
