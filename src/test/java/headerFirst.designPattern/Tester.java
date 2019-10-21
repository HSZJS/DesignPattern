package headerFirst.designPattern;
import com.headeFirst.designPattern.*;
import org.junit.Test;

import com.headeFirst.designPattern.ObserverPattern.*;
import com.headeFirst.designPattern.Decorator.*;
public class Tester {
    /**
     * goal:test duck class and method
     * example: input null
     * 定义：
     * 策略模式定义了算法族，分别封装起来，让它们之间可以互相替换，此模式让算法的变化独立于使用算法的客户。
     *
     * UML结构图：
     *
     *
     * 角色：
     * 环境(Context)角色：持有一个Strategy引用
     * 抽象策略(Strategy)角色:接口或抽象类
     * 具体策略(ConcreteStrategy)角色：包含具体的算法或行为
     * https://www.cnblogs.com/yawen/p/7182958.html
     * */
    @Test
    public void DuckTester(){
        MallarDuck duck = new MallarDuck();
        duck.quack();
        duck.swim();
        duck.display();
        duck.performFly();

    }
    /**
     * gaol:test red header duck test
     * red head duck
     * */
    @Test
    public void RedHeaderDuckTest(){
        RedHeaderDuck duck = new RedHeaderDuck();
        duck.quack();
        duck.swim();
        duck.display();
        duck.performFly();
    }


    @Test
    public void WeaterStation(){
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay current = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80,100,30.4f);
    }
    /**
     * 装饰者模式：增加行为到被包装的对象上面
     * 定义
     * 装饰者模式动态地将责任附近在对象上。若要扩展功能，装饰者提供了比继承更有弹性的替代方案。
     *
     * 结构
     *
     *
     * 角色
     * Component：一般是一个抽象类 ConcreteComponent：继承自Component，
     * 这个类就是被装饰的对象 Decorator：继承自抽象类，
     * 装饰者需要共同实现的接口，
     * 用来保证装饰者和被装饰者有共同的超类，
     * 并保证每一个装饰者都有一些必须具有的性质，
     * 如每一个装饰者都有一个实例变量来保存某个Component类型的引用
     * ConcreteDecorator：用来装饰Component类型的类
     * */
    @Test
    public void decorator(){
        //无调料的基础类型
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()+"$"+beverage.cost());
        //添加调料的其他类型
        Beverage beverage1 = new HouseBlend();
        beverage1 = new Mocha(beverage1);
        System.out.println(beverage1.getDescription()+"$"+beverage1.cost());
        /**
         *继承也属于扩展的形式之一，但不见的是达到弹性设计的最好方式
         * */
    }
}
