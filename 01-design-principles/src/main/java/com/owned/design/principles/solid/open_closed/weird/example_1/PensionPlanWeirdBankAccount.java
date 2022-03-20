package com.owned.design.principles.solid.open_closed.weird.example_1;

import lombok.Value;

import java.math.BigDecimal;

@Value
public class PensionPlanWeirdBankAccount extends BankAccount implements BankAccountPercentage {


    PensionPlanWeirdBankAccount(BigDecimal amount, int years) {
        super(amount, years);
    }

    public int calculatePercentage() {
        return amount.intValue() * 100 / years;
    }
}
