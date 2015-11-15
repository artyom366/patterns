package overrride;

/**
 * Created by Artyom on 11/13/2015.
 */
public class ChildClass extends BaseClass {

    @Override
    public void doSomething(Object str){
        System.out.println("Child impl:"+str);
    }
}
