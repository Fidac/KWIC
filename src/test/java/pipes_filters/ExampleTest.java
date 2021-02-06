package pipes_filters;

import org.junit.jupiter.api.Test;

public class ExampleTest {
    @Test
    public void testAlphabetizer() throws Exception{
        String file = "D:\\JavaWork\\KWIC-main\\KWIC\\files\\file.txt";
        KWIC kwic = new KWIC();
        kwic.execute(file);
    }

}
