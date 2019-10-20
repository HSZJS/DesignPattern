package headerFirst.designPattern;
import com.headeFirst.designPattern.*;
import org.junit.Test;

public class Tester {
    /**
     * goal:test duck class and method
     * example: input null
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
}
