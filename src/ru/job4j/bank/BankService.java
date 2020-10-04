package ru.job4j.bank;

import ru.job4j.pojo.Book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        boolean flag = true;
        if (user != null) {
            List<Account> accs = users.get(user);
            for (Account acc : accs) {
                if (acc.equals(account)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                accs.add(account);
            }
        }
    }

    public User findByPassport(String passport) {
        User rsl = null;
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                rsl = user;
                break;
            }
        }
        return rsl;
    }

    public Account findByRequisite(String passport, String requisite) {
        Account rsl = null;
//        User user = null;
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accs = users.get(user);
            for (Account reqst : accs) {
                if (reqst.getRequisite().equals(requisite)) {
                    rsl = reqst;
                    break;
                }
            }
        }
        return rsl;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        User srcUser = findByPassport(srcPassport);
        User destUser = findByPassport(destPassport);
        Account srcAcc = findByRequisite(srcPassport, srcRequisite);
        Account destAcc = findByRequisite(destPassport, destRequisite);
        if (srcUser != null
                && destUser != null
                && srcAcc != null
                && destAcc != null
                && srcAcc.getBalance() >= amount) {
                srcAcc.setBalance(srcAcc.getBalance() - amount);
                destAcc.setBalance(destAcc.getBalance() + amount);
                rsl = true;

        }
        /*
        if (srcUser != null
                & destUser != null
                & srcAcc != null
                & destAcc != null) {
            if (srcAcc.getBalance() >= amount) {
                srcAcc.setBalance(srcAcc.getBalance() - amount);
                destAcc.setBalance(destAcc.getBalance() + amount);
                rsl = true;
            }
        }
         */
        return rsl;
    }
}