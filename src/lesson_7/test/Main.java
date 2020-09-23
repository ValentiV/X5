package lesson_7.test;

public class Main {

    public static void main(String[] args) throws Throwable {

        String file = "lesson_7.txt";
        UserService accountService = new UserService(file);
        try {
            accountService.chooseOperation();
        } catch (UnknownAccountException | NotEnoughMoneyException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
