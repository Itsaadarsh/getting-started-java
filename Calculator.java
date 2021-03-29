class Calc {
    int num1, num2;
    static int result;

    static {
        result = 0;
    }

    public Calc() {
        this.num1 = 5;
        this.num2 = 5;
    }

    public Calc(int n1, int n2) {
        this.num1 = n1;
        this.num2 = n2;
    }

    public void add(int... nums) {
        for (int num : nums) {
            result += num;
        }
    }

    public void sub() {
        result = num1 - num2;
    }

}

public class Calculator {
    public static void main(String[] args) {
        Calc obj = new Calc();
        obj.add(10, 20, 30);
        System.out.println(Calc.result);
    }
}
