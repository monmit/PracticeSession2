public class Main {
    public static void main(String[] args) {
        Calculator object = new Calculator();
        int Add = object.addNumbers(1,2);
        System.out.println(Add);
        int Subtract = object.substractNumbers(1,2);
        System.out.println(Subtract);
        int Multiply = object.multiplyNumbers(2,2);
        System.out.println(Multiply);
        double Divide = object.divideNumbers(1,2);
        System.out.println(Divide);
        double Divide2 = object.divideNumbers(2,0);
        System.out.println(Divide2);
    }

}
