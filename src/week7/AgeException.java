package week7;

public class AgeException extends Exception {
  public int age;
  public AgeException(int age) {
    super("User must be at least 18 to continue; the given user was " + age);
    this.age = age;
  }
}
