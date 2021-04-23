package ru.netology.delivery.data;

import com.github.javafaker.Faker;
import lombok.Value;
import lombok.val;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Random;


public class DataGenerator {

    private DataGenerator() {

    }

    public static String generateDate(int n) {
        LocalDate date = LocalDate.now();
        String newDate = date.plusDays(n).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        return newDate;
    }

    public static String generateCity() {
        String[] cities = {"Москва", "Кемерово", "Смоленск", "Тамбов", "Пенза", "Липецк", "Петрозаводск", "Астрахань", "Саратов", "Санкт-Петербург"};
        return cities[new Random().nextInt(cities.length)];

    }

    public static String generateName(String locale) {
        Faker faker = new Faker(new Locale (locale));
        String name = (faker.name().lastName().replace("ё", "е"));
        return name;
    }
    public static String generatePhone(String locale) {
        Faker faker = new Faker(new Locale(locale));
        String phone = faker.phoneNumber().phoneNumber();
        return phone;
    }

    public static class DeliveryRequest {
        public DeliveryRequest() {
        }


        public static UserInfo clientInfo(String locale) {
            Faker faker = new Faker(new Locale(locale));
            return new UserInfo ()
                    faker.phoneNumber().phoneNumber());
        }
    }
    @Value
    public static class UserInfo {
        String city;
        String name;
        String phone;
    }
}
