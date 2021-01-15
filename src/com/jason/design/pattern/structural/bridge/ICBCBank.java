package com.jason.design.pattern.structural.bridge;

public class ICBCBank extends Bank {

    public ICBCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开中国工厂银行账号");
        account.openAccount();
        return account;
    }
}
