package records;

public record TestInternAssignmentDontHideCustoms(int x, int y) {
  public TestInternAssignmentDontHideCustoms(int x, int y) {
    this.x = x;
    this.y = y;
    System.out.println("Hello there!");
  }

  public TestInternAssignmentDontHideCustoms(int x) {
    this(x, 1);
  }
  public int x() {
    return x+1;
  }

  public int y() {
    return x;
  }
}
