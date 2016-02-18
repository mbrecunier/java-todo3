import java.util.ArrayList;

public class Category {
  private static ArrayList<Category> categories = new ArrayList<Category>();
  private static ArrayList<Task> tasks;

  private String mName;
  private int mId;

  public Category(String name) {
      mName = name;
      categories.add(this);
      mId = categories.size();
      tasks = new ArrayList<Task>();
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
    return tasks;
  }

  public static Category find(int id) {
    return categories.get(id-1);
  }

  public static void addTask(Task task) {
    tasks.add(task);
  }

  public static void clear() {
    categories.clear();
  }
}
