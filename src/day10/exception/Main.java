package day10.exception;

public class Main {

    public static void main(String[] args) throws InvalidLoginInputException {

        ThrowsExample te = new ThrowsExample();

//        int n = te.inputNumber();
//        System.out.println("n = " + n);

//        try {
//            int n = te.convert("550!@");
//            System.out.println("n = " + n * 20);
//        } catch (NumberFormatException e) {
//            System.out.println("djfskfdsjkfjsf");
//        }


        LoginUser user = new LoginUser("abc1234", "1234");

        user.loginValidate("abc12343", "1234");


    }
}
