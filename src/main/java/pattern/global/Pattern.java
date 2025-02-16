package pattern.global;

import pattern.adapter.CarController;
import pattern.adapter.CarListAdapter;
import pattern.adapter.CarManager;
import pattern.builder.CarBuilder;
import pattern.builder.CarDirectorBuilder;
import pattern.builder.LuxuryCarBuilder;
import pattern.builder.SedanCarBuilder;
import pattern.builder.message.EmailMessageBuilder;
import pattern.builder.message.JmsMessageBuilder;
import pattern.builder.message.MessageCreator;
import pattern.chainOfResponsibility.Calculate10;
import pattern.chainOfResponsibility.Calculate2;
import pattern.chainOfResponsibility.Calculate5;
import pattern.chainOfResponsibility.security.Account;
import pattern.chainOfResponsibility.security.AccountBalanceValidator;
import pattern.chainOfResponsibility.security.AccountInfoValidator;
import pattern.chainOfResponsibility.security.InvalidAccountException;
import pattern.decorator.ArmedCar;
import pattern.decorator.RegularCar;
import pattern.decorator.SportCar;
import pattern.decorator.component.Gps;
import pattern.decorator.component.Gun;
import pattern.factory.CarFactory;
import pattern.iterator.CarContainer;
import pattern.iterator.IIterator;
import pattern.models.car.Car;
import pattern.models.car.CarType;
import pattern.models.car.engine.MediumEngine;
import pattern.models.car.engine.SmallEngine;
import pattern.proxy.Internet;
import pattern.proxy.ProxyInternet;
import pattern.singleton.UserSession;
import pattern.state.Engine;

public class Pattern {

    /*
     * Test all design pattern
     */

    public static void main(String[] args) {

        decoratorPattern();
        builderPattern();
        singletonPattern();
        adapterPattern();
        iteratorPattern();
        statePattern();
        factoryPattern();
        bridgePattern();
        chainOfRes();
        proxyPattern();
        chainOfResponsibility();
    }

    private static void chainOfRes() {

        Account account = new Account("Abc", "xxx", -3000d);

        AccountInfoValidator accountInfoValidator = new AccountInfoValidator();

        AccountBalanceValidator accountBalanceValidator = new AccountBalanceValidator();

        accountInfoValidator.setNextSecurity(accountBalanceValidator);

        try {

            accountInfoValidator.validateAcount(account);

        } catch (InvalidAccountException ex1) {

            System.out.println(ex1.getMessage());
        }


    }

    private static void chainOfResponsibility() {

        System.out.println("----Chain of responsibility----");

        int amount = 13;

        Calculate10 calculate10 = new Calculate10();
        Calculate5 calculate5 = new Calculate5();
        Calculate2 calculate2 = new Calculate2();

        calculate10.setNextCalculate(calculate5);
        calculate5.setNextCalculate(calculate2);

        System.out.println("The amount to calculate : " + amount);
        calculate10.calculate(amount);


        System.out.println("----********** ---- ********----");
    }

    private static void iteratorPattern() {
        CarContainer container = new CarContainer();
        IIterator iterator = container.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private static void decoratorPattern() {
        System.out.println("-------------Decorator--------------------");
        Car luxuryCar = CarFactory.createCar(CarType.LUXURY, new MediumEngine());
        ArmedCar car = new ArmedCar(luxuryCar, new Gun());
        car.decorate();

        Car sedanCar = CarFactory.createCar(CarType.SEDAN, new SmallEngine());
        SportCar sportCar = new SportCar(sedanCar);
        sportCar.decorate();

        RegularCar regularCar = new RegularCar(sedanCar, new Gps());
        regularCar.decorate();

        System.out.println("-------------********--------------------");

    }

    private static void bridgePattern() {
        Car luxuryCar = CarFactory.createCar(CarType.LUXURY, new MediumEngine());
        Car sedanCar = CarFactory.createCar(CarType.SEDAN, new SmallEngine());

        luxuryCar.startEngine();
        sedanCar.startEngine();

    }

    private static void builderPattern() {
        CarBuilder carBuilder = new LuxuryCarBuilder();
        CarDirectorBuilder director = new CarDirectorBuilder(carBuilder);
        director.buildCar();
        System.out.println(director.getCar().toString());

        carBuilder = new SedanCarBuilder();
        director = new CarDirectorBuilder(carBuilder);
        director.buildCar();
        System.out.println(director.getCar().toString());


        System.out.println("----------------------------");
        try {
            MessageCreator messageCreator = new MessageCreator(new EmailMessageBuilder());
            System.out.println(messageCreator.getMessage());
            messageCreator = new MessageCreator(new JmsMessageBuilder());
            System.out.println(messageCreator.getMessage());
            System.out.println("----------------------------");
        } catch (Exception e) {

        }

    }

    private static void factoryPattern() {
        Car luxuryCar = CarFactory.createCar(CarType.LUXURY);
        Car sedanCar = CarFactory.createCar(CarType.SEDAN);

        System.out.println("created : " + luxuryCar.getName());
        System.out.println("created : " + sedanCar.getName());

    }

    private static void singletonPattern() {
        UserSession session = UserSession.getInstance();
        session.addData(1, "abcd");
        session.addData(2, "cdef");
        System.out.println(session.getDataMap());
    }

    private static void adapterPattern() {
        CarController carController = new CarController();
        CarListAdapter carListAdapter = new CarListAdapter(CarManager.getInstance());
        carController.importAllCar(carListAdapter.getListCarImport());
    }

    private static void statePattern() {
        Engine engine = new Engine();
        int i = 0;
        while (i < 5) {
            engine.nexState();
            i++;
        }
    }

    private static  void proxyPattern() {

        Internet in1 = new ProxyInternet();

        try {

            in1.conectTo("vnxpress.net");
            in1.conectTo("facebook.com");

        } catch (Exception e) {
            System.out.println(e);
        }
    }


}
