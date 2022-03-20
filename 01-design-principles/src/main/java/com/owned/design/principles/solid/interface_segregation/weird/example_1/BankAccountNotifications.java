package com.owned.design.principles.solid.interface_segregation.weird.example_1;

interface IBankAccountSlackNotifications {
    void notify(String channel, String message); //slack
}

interface IBankAccountEmailNotifications {
    void notify(String recipient, String subject, String message); //email
}

interface IBankAccountMicrometerNotifications {
    void notify(String url, String metricName, String description, String message); //Micrometer
}
