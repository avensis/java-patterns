package com.owned.design.principles.solid.open_closed.weird.example_1;

import lombok.Value;

import java.math.BigDecimal;

@Value
public class MortgageWeirdBankAccount extends BankAccount implements BankAccountPercentage{


    MortgageWeirdBankAccount(BigDecimal amount, int years) {
        super(amount, years);
    }

    public int calculatePercentage() {
        return amount.intValue() * 100 / years;
    }
}
