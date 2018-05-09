package global;

import adapter.CarController;
import adapter.CarListAdapter;
import adapter.CarManager;
import builder.CarBuilder;
import builder.CarDirectorBuilder;
import builder.LuxuryCarBuilder;
import builder.SedanCarBuilder;
import chainOfResponsibility.Calculate10;
import chainOfResponsibility.Calculate2;
import chainOfResponsibility.Calculate5;
import chainOfResponsibility.security.Account;
import chainOfResponsibility.security.AccountBalanceValidator;
import chainOfResponsibility.security.AccountInfoValidator;
import chainOfResponsibility.security.InvalidAccountException;
import decorator.ArmedCar;
import decorator.RegularCar;
import decorator.SportCar;
import decorator.component.Gps;
import decorator.component.Gun;
import factory.CarFactory;
import iterator.CarContainer;
import iterator.IIterator;
import models.car.Car;
import models.car.CarType;
import models.car.engine.MediumEngine;
import models.car.engine.SmallEngine;
import proxy.Internet;
import proxy.ProxyInternet;
import singleton.UserSession;
import state.Engine;

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
