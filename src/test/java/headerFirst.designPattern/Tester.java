package headerFirst.designPattern;
import com.headeFirst.designPattern.Duck;
import org.junit.Test;

public class Tester {
    /**
     * goal:test duck class and method
     * example: input null
     * */
    @Test
    public void DuckTester(){
        Duck duck = new Duck();
        duck.quack();

    }
}
