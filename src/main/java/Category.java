import java.util.ArrayList;

public class Category {
  private static ArrayList<Category> categories = new ArrayList<Category>();

  private static ArrayList<Task> mTasks;
  private String mName;
  private int mId;

  public Category(String name) {
      mName = name;
      categories.add(this);
      mId = categories.size();
      mTasks = new ArrayList<Task>();
  }

  public String getName() {
    return mName;
  }

  public static ArrayList all() {
    return categories;
  }

  public int getId() {
    return mId;
  }

  public static ArrayList getTasks() {
    return mTasks;
  }

  public static Category find(int id) {
    try {
      return categories.get(id-1);
    } catch (IndexOutOfBoundsException exception) {
      System.out.println("Index out of bounds exception: " + exception.getMessage());
      return null;
    }
  }

  public static void addTask(Task task) {
    mTasks.add(task);
  }

  public static void clear() {
    categories.clear();
  }
}
