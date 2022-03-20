package com.owned.design.principles.solid.open_closed.refactor.example_1;

import java.math.BigDecimal;

abstract class BankAccountPercentageCalculableAbstract {
        abstract int getPercentage(BigDecimal amount, int years);
    }

