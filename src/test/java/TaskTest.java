import org.junit.*;
import static org.junit.Assert.*;

public class TaskTest{

  @Test
    public void Task_intantiatesCorrectly_true() {
    Task myTask = new Task ("Mow the lawn");
    assertEquals(true, myTask instanceof Task);
  }

  @Test
    public void Task_intantiatesWithDescription_true() {
    Task myTask = new Task ("Mow the lawn");
    assertEquals("Mow the lawn", myTask.getDescription());
  }
}
