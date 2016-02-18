import java.util.ArrayList;

public class Category {
  private static ArrayList<Category> categories = new ArrayList<Category>();

  private String mName;
  private int mId;

  public Category(String name) {
      mName = name;
      categories.add(this);
      mId = categories.size();
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
}
