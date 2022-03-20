package com.owned.design.principles.solid.open_closed.weird.example_2;

interface Payment {
    void paymentMethod();
}

class Stripe implements Payment{
    @Override
    public void paymentMethod() {
        // return payment for stripe
    }
}

class Paypal implements Payment{
    @Override
    public void paymentMethod() {
        // return payment for paypal
    }
}

class Amazon implements Payment{
    @Override
    public void paymentMethod() {
        // return payment for amazon
    }
}
