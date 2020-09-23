package lesson_7.test;

public interface AccountService {

    void balance(int accountId) throws UnknownAccountException;

    void withdraw(int accountId, int amount) throws NotEnoughMoneyException, UnknownAccountException;

    void deposit(int accountId, int amount) throws NotEnoughMoneyException, UnknownAccountException;

    void transfer(int from, int to, int amount) throws Throwable;
}