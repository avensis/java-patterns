package com.owned.design.principles.solid.open_closed.weird.example_1;

import java.math.BigDecimal;

public class BankAccount {

    BigDecimal amount;
    int years;

    BankAccount(BigDecimal amount, int years){
        this.amount = amount;
        this.years = years;
    }
}
