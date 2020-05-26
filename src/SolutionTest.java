import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

    Solution solution;

    @Before
    public void setup(){
        solution = new Solution();
    }
    
    @Test
    public void CreatePhoneNumberTest() {
        int[] actual = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String expected = "(123) 456-7890";
        assertEquals(expected, solution.CreatePhoneNumber(actual));
    }
}