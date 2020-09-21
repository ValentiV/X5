package lesson_7;

public class UserService implements AccountService {
    @Override
    public void withdraw(int accountId, int amount) throws Throwable, Throwable {

    }

    @Override
    public void balance(int accountId) throws Throwable {
        System.out.println("test" + accountId);
    }

    @Override
    public void deposit(int accountId, int amount) throws Throwable, Throwable {

    }

    @Override
    public void transfer(int from, int to, int amount) throws Throwable, Throwable {

    }
}
