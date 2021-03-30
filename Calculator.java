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
        if (nums.length > 0) {
            for (int num : nums) {
                result += num;
            }
        } else {
            result = num1 + num2;
        }
    }

    public void sub() {
        result = num1 - num2;
    }

}

class CalcAdv extends Calc {
    private int num3;

    public CalcAdv(int n1, int n2, int n3) {
        super(n1, n2);
        this.num3 = n3;
    }

    public void mul(int... nums) {
        if (nums.length > 0) {
            result = 1;
            for (int num : nums) {
                result *= num;
            }
        } else {
            result = num1 * num2;
        }
    }

    public void displayPri() {
        System.out.println(this.num3);
    }
}

public class Calculator {
    public static void main(String[] args) {
        CalcAdv obj = new CalcAdv(4, 5, 3);
        obj.displayPri();
        obj.mul();
        System.out.println(Calc.result);
    }
}
