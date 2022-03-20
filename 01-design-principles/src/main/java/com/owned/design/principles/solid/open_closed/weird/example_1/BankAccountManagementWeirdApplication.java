package com.owned.design.principles.solid.open_closed.weird.example_1;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Slf4j
public class BankAccountManagementWeirdApplication {

    BankAccountPercentage bankPercentage;

    public BankAccountManagementWeirdApplication(BankAccountPercentage bankPercentage){
        this.bankPercentage = bankPercentage;
    }

    void performOperation(){
        bankPercentage.calculatePercentage();
    }



    public static void main(String[] args) {

        MortgageWeirdBankAccount mortage = new MortgageWeirdBankAccount(BigDecimal.valueOf(100000), 25);
        BankAccountManagementWeirdApplication bankMortage = new BankAccountManagementWeirdApplication(mortage);
        bankMortage.performOperation();

        PensionPlanWeirdBankAccount pension = new PensionPlanWeirdBankAccount(BigDecimal.valueOf(100000), 25);
        BankAccountManagementWeirdApplication bankPension = new BankAccountManagementWeirdApplication(pension);
        bankPension.performOperation();

    }
}
