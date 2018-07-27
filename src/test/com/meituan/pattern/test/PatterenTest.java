package com.meituan.pattern.test;

import com.meituan.headFirst.adapter.TurkeyAdapter;
import com.meituan.headFirst.adapter.WildTurkey;
import com.meituan.headFirst.decorator.*;
import com.meituan.headFirst.observer.CurrentConditonsDisplay;
import com.meituan.headFirst.observer.CurrentConditonsDisplay1;
import com.meituan.headFirst.observer.WeatherData;
import com.meituan.headFirst.observer.WeatherData1;
import com.meituan.headFirst.order.Light;
import com.meituan.headFirst.order.LightOnCommand;
import com.meituan.headFirst.order.SimpleRemoteControl;
import com.meituan.headFirst.strategy.Duck;
import com.meituan.headFirst.strategy.FlyWithRocketPowered;
import com.meituan.headFirst.strategy.MallardDuck;
import com.meituan.headFirst.strategy.ModelDuck;
import com.meituan.pattern.AbstractFactory.FactoryProducer;
import com.meituan.repattern.abtractFactory.AbstractFactory;
import com.meituan.repattern.factory.Product;
import com.meituan.repattern.factory.Supermarket;
import org.junit.Test;

import javax.swing.undo.CannotUndoException;
import java.io.IOException;
import java.io.InputStream;

public class PatterenTest {
    @Test
    public void test(){
        System.out.println("test!");
    }
    @Test
    public void factoryTest(){
        Supermarket supermarket = new Supermarket();
        Product product = supermarket.sell("soap");
        product.explain();
    }

    //抽象工厂设计模式的测试
    @Test
    public void abstractFactoryTest(){
        //获取形状工厂

    }
    //策略模式Duck测试
    @Test
    public void strategyTest(){
        /*Duck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();
        mallardDuck.display();*/
        Duck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.performQuack();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyWithRocketPowered());
        System.out.println("自从我安装了火箭助推器，来看我的变化：");
        modelDuck.performFly();
    }
    //观察者模式第一次测试
    @Test
    public void observerTest(){
        WeatherData weatherData = new WeatherData();
        CurrentConditonsDisplay currentConditonsDisplay = new CurrentConditonsDisplay(weatherData);

        weatherData.setMeasurements(80,65,30.4f);
        weatherData.setMeasurements(82,72,20.4f);

    }
    //使用Observable接口设计的观察者模式第一次测试
    @Test
    public void observableTest(){
        WeatherData1 weatherData = new WeatherData1();
        CurrentConditonsDisplay1 currentConditonsDisplay = new CurrentConditonsDisplay1(weatherData);

        weatherData.setMeasurements(80,65,30.4f);
        weatherData.setMeasurements(82,72,20.4f);

    }
    //观察者模式的test
    @Test
    public void decoratorTest(){
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()
                +"$"+beverage.cost());
        Beverage beverage1 = new Espresso();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        System.out.println(beverage1.getDescription()
                +"$"+beverage1.cost());
    }
    //观察者模式下的Input测试
    @Test
    public void InputTest(){
        /*int c;
        try{
            InputStream in = new LowerCaseInputStream()

        }catch (IOException e){
            e.printStackTrace();
        }*/
    }
    //命令模式第一次测试
    @Test
    public void simpleOrderTest(){
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);
        simpleRemoteControl.setSlot(lightOn);
        simpleRemoteControl.buttonWasPressed();
    }
    //简单适配器模式测试
    @Test
    public void simpleAdapterTest(){
        com.meituan.headFirst.adapter.MallardDuck duck = new com.meituan.headFirst.adapter.MallardDuck();
        WildTurkey turkey = new WildTurkey();
        com.meituan.headFirst.adapter.Duck turkeyAdapter = new TurkeyAdapter(turkey);
        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();
        System.out.println("The TurkeyAdapter says...");
        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }

}
