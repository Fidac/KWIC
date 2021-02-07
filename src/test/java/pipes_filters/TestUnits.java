package pipes_filters;
import pipes_filters.CircularShifter;
import pipes_filters.KWIC;
import pipes_filters.Pipe;
import pipes_filters.Utils;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestUnits {
    @Test
    public void testEntirePipeline() throws Exception{
        String file = "./files/file.txt";
        KWIC kwic = new KWIC();
        kwic.execute(file);
    }

    @Test
    public void testShiftMethod() throws IOException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        var sentence = "Testing the shift".split(" ");
        Pipe inCS = new Pipe();
        Pipe csAl = new Pipe();
        CircularShifter cs = new CircularShifter(inCS, csAl);
        var shiftMethod = cs.getClass().getDeclaredMethod("shift", sentence.getClass());
        shiftMethod.setAccessible(true);
        Object[] parameters = {sentence};
        var shiftedSentence = shiftMethod.invoke(cs,parameters);
        assertEquals(Utils.rebuildLineString((String[]) shiftedSentence),"the shift Testing");
    }

    @Test
    public void testShiftTimesMethod() throws IOException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        var sentence = "Testing the shift".split(" ");
        int times = 2;
        Object[] parameters = {sentence, times};

        Pipe inCS = new Pipe();
        Pipe csAl = new Pipe();
        CircularShifter cs = new CircularShifter(inCS, csAl);
        var shiftMethod = cs.getClass().getDeclaredMethod("shiftTimes", sentence.getClass(), int.class);
        shiftMethod.setAccessible(true);
        var shiftedSentence = shiftMethod.invoke(cs, parameters);
        assertEquals(Utils.rebuildLineString((String[]) shiftedSentence),"shift Testing the");
    }
    @Test
    public void testShiftLineMethod() throws IOException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        var sentence = "Testing the shift".split(" ");

        var correctSentences = new ArrayList<String[]>();
        correctSentences.add("Testing the shift".split(" "));
        correctSentences.add("the shift Testing".split(" "));
        correctSentences.add("shift Testing the".split(" "));

        Object[] parameters = {sentence};

        Pipe inCS = new Pipe();
        Pipe csAl = new Pipe();
        CircularShifter cs = new CircularShifter(inCS, csAl);
        var shiftMethod = cs.getClass().getDeclaredMethod("shiftLine", sentence.getClass());
        shiftMethod.setAccessible(true);
        var shiftedSentences = shiftMethod.invoke(cs, parameters);
        assertArrayEquals(((ArrayList<String[]>)shiftedSentences).toArray(), correctSentences.toArray());
    }

}
