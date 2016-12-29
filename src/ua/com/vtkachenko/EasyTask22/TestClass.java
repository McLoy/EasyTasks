package ua.com.vtkachenko.EasyTask22;

class TestClass {
    int i = getInt();
    int k = 20;
    public int getInt() {  return k+1;  }
    public static void main(String[] args) {
        TestClass t = new TestClass();
        System.out.println(t.i + "  " + t.k);
    }
}
