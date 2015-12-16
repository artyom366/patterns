import multi.callable.Runner;
import multi.lock.ReentrantLockEx1;
import multi.lock.ReentrantLockEx2;
import multi.lock.Resource;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Artyom on 11/2/2015.
 */
public class App {

    public static void main(String[] args) throws Exception {

        //Computer computer = new Computer.ComputerBuilder("500", "8").setBluetoothEnabled(true).setGraphicsCardEnabled(true).build();
        //Server server = (Server) ComputerFactory.getComputer("server", "8", "500", "8000");

        //Employees emps = new Employees();
        //emps.loadData();
        //Employees employees = (Employees) emps.clone();

        //Volt volt = new SocketAdapterImpl().get3Volts();

        //Shape triangle = new Triangle();
        //Shape circle = new Circle();
        //Drawing drawing = new Drawing();
        //drawing.addShape(triangle);
        //drawing.addShape(circle);
        //drawing.draw("red");

        //CommandExecutor commandExecutor = new CommandExecutorProxy("arta", "letmein");
        //commandExecutor.runCommand("notepad.exe");

        //DrawingClient drawingClient = new DrawingClient(500, 500);

        //patterns.bridge.Shape triangle = new patterns.bridge.Triangle(new RedColor());
        //patterns.bridge.Shape pentagon = new patterns.bridge.Pentagon(new GreenColor());
        //triangle.applyColor();
        //pentagon.applyColor();


        //Car luxSportsCar = new LuxuryCar(new SportCar(new BasicCar()));
        //luxSportsCar.assemble();

        //HouseTemplate glassHouse = new GlassHouse();
        //glassHouse.build();

        //ChatMediator chatMediator = new ChatMediatorImpl();
        //User user1 = new UserImpl(chatMediator, "Art1");
        //User user2 = new UserImpl(chatMediator, "Art2");
        //User user3 = new UserImpl(chatMediator, "Art3");
        //chatMediator.addUser(user1);
        //chatMediator.addUser(user2);
        //chatMediator.addUser(user3);
        //user1.send("Hello");

        //ATMDispenseChain atmDispenseChain = new ATMDispenseChain();
        //atmDispenseChain.dispense();

        //SubjectImpl subject = new SubjectImpl();
        //Observer observer1 = new ObserverImpl("obs1");
        //Observer observer2 = new ObserverImpl("obs2");
        //Observer observer3 = new ObserverImpl("obs3");
        //subject.register(observer1);
        //subject.register(observer2);
        //subject.register(observer3);
        //observer1.setSubject(subject);
        //observer2.setSubject(subject);
        //observer3.setSubject(subject);
        //observer1.update();
        //observer2.update();
        //observer3.update();
        //subject.postMessage("Hello message");

        //generics.GenericType<String> genericType1 = new generics.GenericType<String>();
        //genericType1.setT("444");
        //generics.GenericType<String> genericType2 = new generics.GenericType<String>();
        //genericType2.setT("444");
        //System.out.println(generics.GenericType.isEqual(genericType1, genericType2));

        /*Abstract a = new Abstract(5) {
            @Override
            public void test() {
                System.out.println("test");
            }
        };*/
        //a.test();

        //ShoppingCart cart = new ShoppingCart();
        //cart.addItem(new Item("123", 10));
        //cart.addItem(new Item("124", 20));
        //cart.pay(new PayPalStrategy("email", "pass"));
        //cart.pay(new CreditCardStrategy("name", "number", "cvv", "exp"));

        //Interface1Impl impl = new Interface1Impl();
        //impl.defaultPrint();
        //impl.print();

        //String[] arr = new String[]{"aaa", "bbb"};
        //ImmutableClass immutableClass = new ImmutableClass(arr);
        //System.out.println(immutableClass);
        //arr[0] = "ccc";
        //System.out.println(immutableClass);

        //BaseClass baseClass = new ChildClass();
        //baseClass.doSomething("test");
        //ChildClass childClass = new ChildClass();
        //childClass.doSomething("test");

        //FileSystemReceiver fileSystemReceiver
        //        = FileSystemReceiverUtil.getUnderlyingFileSystem();
        //OpenFileCommand openFileCommand = new OpenFileCommand(fileSystemReceiver);
        //FileInvoker fileInvoker = new FileInvoker(openFileCommand);
        //fileInvoker.execute();

        //TVContext tvContext = new TVContext();
        //State startState = new TVStartState();
        //State stopState = new TVStopState();
        //tvContext.setState(startState);
        //tvContext.doAction();

        //ItemElement[] itemElements = new ItemElement[]{
        //        new Book(50, "123"),
        //        new Fruit(40, 30, "apple")};
        //Calculator calculator = new Calculator();
        //calculator.calculate(itemElements);

        //InterpreterClient client = new InterpreterClient(new InterpreterContext());
        //System.out.println(client.interpret("28 in Binary"));

        //ChannelCollection channelCollection = new ChannelCollectionImpl();
        //channelCollection.addChannel(new Channel(98.5, ChannelTypeEnum.ENGLISH));
        //channelCollection.addChannel(new Channel(99.5, ChannelTypeEnum.ENGLISH));
        //channelCollection.addChannel(new Channel(100.5, ChannelTypeEnum.ENGLISH));
        //channelCollection.addChannel(new Channel(102.5, ChannelTypeEnum.ENGLISH));
        //channelCollection.addChannel(new Channel(103.5, ChannelTypeEnum.ENGLISH));
        //ChannelIterator iterator = channelCollection.iterator(ChannelTypeEnum.ENGLISH);
        //while (iterator.hasNext()) {
        //     System.out.println(iterator.next());
        //}

        //FileWriterCareTaker careTaker = new FileWriterCareTaker();
        //FileWriteUtil fileWriteUtil = new FileWriteUtil("fileName.txt");
        //fileWriteUtil.write("first");
        //careTaker.save(fileWriteUtil);
        //fileWriteUtil.write("second");
        //System.out.println(fileWriteUtil);
        //careTaker.undo(fileWriteUtil);
        //System.out.println(fileWriteUtil);

        //System.out.println(StatesEnum.DEAD.getDetails());
        //System.out.println(StatesEnum.DEAD);

//        List<String> strings = new ArrayList<String>();
//        strings.add("aaa");
//        strings.add("bbb");
//        strings.add("nnn");
//
//        Iterator<String> iterator = strings.iterator();
//
//        while(iterator.hasNext()){
//            String s = iterator.next();
//            System.out.println(s);
//
//            if(s.equals("bbb")) {
//                System.out.println("removing " + s);
//                iterator.remove();
//            }
//        }


        //System.out.println(AddBinary.addBinary("11", "1"));
        //WordConcatSubstring.findWordSubstring("barfoothefoobarman", new String[] {"foo", "bar"});
        //System.out.println(SummaryRanges.getSummaryRanges(new int[]{1, 2, 3, 4, 5, 7, 8,}));

        //ShortestPalindrome shortestPalindrome = new ShortestPalindrome();
        //System.out.println(shortestPalindrome.getPalindrome("abcd"));

        //LargestNumber largestNumber = new LargestNumber();
        //largestNumber.getLargestNumber(new int[]{4, 7, 1, 2, 44, 778, 9});

        //Equilibrium equilibrium = new Equilibrium();
        //System.out.println(equilibrium.anotherSolution(new int[]{3, 1}));


//        http://www.programcreek.com/2012/12/leetcode-evaluate-reverse-polish-notation/
//        http://www.programcreek.com/2014/05/leetcode-largest-rectangle-in-histogram-java/
//        http://www.programcreek.com/2014/02/leetcode-longest-common-prefix-java/
//        http://www.programcreek.com/2014/03/leetcode-gas-station-java/
//        http://www.programcreek.com/2014/03/leetcode-pascals-triangle-java/
//        http://www.programcreek.com/2014/04/leetcode-pascals-triangle-ii-java/
//        http://www.programcreek.com/2014/03/leetcode-container-with-most-water-java/
//        http://www.programcreek.com/2014/03/leetcode-candy-java/
//        http://www.programcreek.com/2014/06/leetcode-trapping-rain-water-java/
//        http://www.programcreek.com/2014/03/leetcode-count-and-say-java/
//        http://www.programcreek.com/2014/06/leetcode-basic-calculator-java/
//        http://www.programcreek.com/2014/06/leetcode-rectangle-area-java/
//        http://www.programcreek.com/2013/02/longest-substring-which-contains-2-unique-characters/
//        http://www.programcreek.com/2013/01/leetcode-triangle-java/
//        http://www.programcreek.com/2014/05/leetcode-zigzag-conversion-java/


//        Runner runner = new Runner();
//        runner.run();

//        Message message = new Message("message");
//        Waiter waiter = new Waiter(message);
//        Notifier notifier = new Notifier(message);
//
//        Thread wt = new Thread(waiter, "waiter");
//        Thread nt = new Thread(notifier, "notifier");
//
//        wt.start();
//        nt.start();

//        ThreadLocalEx threadLocalEx = new ThreadLocalEx();
//        Thread thread1 = new Thread(threadLocalEx, "th1");
//        Thread thread2 = new Thread(threadLocalEx, "th2");
//        thread1.start();
//        thread2.start();

//        multi.timer.Runner runner = new multi.timer.Runner();
//        runner.run();

//        ThPool pool = new ThPool();
//        pool.runScheduled();

//        Lock lock = new ReentrantLock();
//        Resource resource = new Resource(lock);
//        Thread thread3 = new Thread(new ReentrantLockEx1(resource, lock), "th1");
//        Thread thread4 = new Thread(new ReentrantLockEx2(resource, lock), "th2");
//
//        thread3.start();
//        thread4.start();

        Runner runner = new Runner();
        runner.run();


        return;

    }
}
