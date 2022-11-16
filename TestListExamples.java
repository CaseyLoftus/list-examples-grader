import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;

public class TestListExamples {
  // Write your grading tests here!
  @Test
  public void testMerge() {
    ArrayList<String> list1 = new ArrayList<>();
    list1.add("a");
    list1.add("c");
    ArrayList<String> list2 = new ArrayList<>();
    list2.add("b");
    list2.add("d");
    ArrayList<String> list3 = new ArrayList<>();
    list3.add("a");
    list3.add("b");
    list3.add("c");
    list3.add("d");
    assertEquals(ListExamples.merge(list1, list2), list3);

  }
}
