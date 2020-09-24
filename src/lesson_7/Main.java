package lesson_7;

public class Main {

    public static void main(String[] args) throws Throwable {

        String file = "lesson_7.txt";
        UserService accountService = new UserService(file);
        accountService.listAccounts();
        try {
            accountService.chooseOperation();
        } catch (UnknownAccountException | NotEnoughMoneyException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
