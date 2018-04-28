package hw3.hello;

import static org.junit.Assert.assertArrayEquals;

import java.io.IOException;
import java.util.*;

import hw3.hello.wordladdercode.CreateWordladder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class WordladderTest {
    private CreateWordladder WordladderForTest = new CreateWordladder();

    @Test
    public void testAdjacent(){
        assertArrayEquals(
                new Object[]{
                    WordladderForTest.IsAdjacent("this","that"),
                    WordladderForTest.IsAdjacent("big","zip"),
                    WordladderForTest.IsAdjacent("find","first"),
                    WordladderForTest.IsAdjacent("","great"),
                    WordladderForTest.IsAdjacent("big","pig"),
                    WordladderForTest.IsAdjacent("find","fine")
        },new Object[]{
                false,
                false,
                false,
                false,
                        true,
                        true,
        });
    }

    @Test
    public void testExist(){
        Set<String> test = new HashSet<String>();
        test.add("apple");
        assertArrayEquals(
                new Object[]{

                        WordladderForTest.IsExist(test,"bigop"),
                        WordladderForTest.IsExist(test,"funzyswer"),
                        WordladderForTest.IsExist(test,"apple")
                },
                new Object[]{
                        false,
                        false,
                        true
                }
        );
    }

    @Test
    public void testValid(){
        assertArrayEquals(
                new Object[]{
                        WordladderForTest.IsValid("1r3"),
                        WordladderForTest.IsValid("%"),
                        WordladderForTest.IsValid("pretty")
                },
                new Object[]{
                        false,
                        false,
                        true
                }
        );
    }

    @Test
    public void testSameOut() throws IOException{
        assertArrayEquals(
                new Object[]{
                        WordladderForTest.StringLadderGenerate("love","love"),
                        WordladderForTest.StringLadderGenerate("love","skyyy1")
                },
                new Object[]{
                        "The words are the same.",
                        "The word skyyy1 is invalid."
                }
        );
    }
}

