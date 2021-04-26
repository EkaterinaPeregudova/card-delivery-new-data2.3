package ru.netology.delivery.test;

import com.github.javafaker.Faker;
import lombok.val;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import ru.netology.delivery.data.DataGenerator;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;


public class CardDeliveryData {
    @BeforeEach
    void setup() {
        open("http://localhost:9999");
    }

    @Test
    @DisplayName("Should successful plan and replan meeting")
    void shouldSuccessfulPlanAndReplanMeeting() {
        val validUser = DataGenerator.Registration.generateUser("ru");
        val daysToAddForFirstMeeting = 4;
        val firstMeetingDate = DataGenerator.generateDate(daysToAddForFirstMeeting);
        val daysToAddForSecondMeeting = 7;
        val secondMeetingDate = DataGenerator.generateDate(daysToAddForSecondMeeting);

        // TODO: добавить логику теста в рамках которого будет выполнено планирование и перепланирование встречи.
        // Для заполнения полей формы можно использовать пользователя validUser и строки с датами в переменных
        // firstMeetingDate и secondMeetingDate. Можно также вызывать методы generateCity(locale),
        // generateName(locale), generatePhone(locale) для генерации и получения в тесте соответственно города,
        // имени и номера телефона без создания пользователя в методе generateUser(String locale) в датагенераторе
    }



//        private LocalDate plusDays(int n) {
//            LocalDate date = LocalDate.now();
//            date = date.plusDays(n);
//
//            return date;
//        }
//
//        @Test
//        void shouldSendForm() {
//            open("http://localhost:9999");
//            $$("[type=text]").first().setValue("Москва");
//            $("[placeholder='Дата встречи']").doubleClick().sendKeys(Keys.DELETE);
//            String newDate = plusDays(4).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
//            $("[placeholder='Дата встречи']").setValue(newDate);
//            $("[data-test-id=name] [type=text]").setValue("Перегудова Екатерина");
//            $("[name=phone]").setValue("+79091231212");
//            $(".checkbox__box").click();
//            $("div.form-field>[type=button]").submit();
//            $(".notification__content").shouldBe(visible, Duration.ofSeconds(15)).shouldHave(exactText("Встреча успешно забронирована на " + newDate));
//
//        }
//
//        @Test
//        void shouldDate() {
//            open("http://localhost:9999");
//            $$("[type=text]").first().setValue("Москва");
//            $("[placeholder='Дата встречи']").doubleClick().sendKeys(Keys.DELETE);
//            String newDate = plusDays(2).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
//            $("[placeholder='Дата встречи']").setValue(newDate);
//            $("[data-test-id=name] [type=text]").setValue("Перегудова Екатерина");
//            $("[name=phone]").setValue("+79091231212");
//            $(".checkbox__box").click();
//            $("div.form-field>[type=button]").submit();
//            $(withText("Заказ на выбранную дату невозможен")).shouldBe(visible);
//
//        }
//
//        @Test
//        void shouldName() {
//            open("http://localhost:9999");
//            $$("[type=text]").first().setValue("Москва");
//            $("[placeholder='Дата встречи']").doubleClick().sendKeys(Keys.DELETE);
//            String newDate = plusDays(4).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
//            $("[placeholder='Дата встречи']").setValue(newDate);
//            $("[data-test-id=name] [type=text]").setValue("Peregudova Ekaterina");
//            $("[name=phone]").setValue("+79091231212");
//            $(".checkbox__box").click();
//            $("div.form-field>[type=button]").submit();
//            $(withText("Имя и Фамилия указаные неверно. Допустимы только русские буквы, пробелы и дефисы.")).shouldBe(visible);
//
//        }
//
//
//        @Test
//        void shouldNotCheckbox() {
//            open("http://localhost:9999");
//            $$("[type=text]").first().setValue("Москва");
//            $("[placeholder='Дата встречи']").doubleClick().sendKeys(Keys.DELETE);
//            String newDate = plusDays(4).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
//            $("[placeholder='Дата встречи']").setValue(newDate);
//            $("[data-test-id=name] [type=text]").setValue("Перегудова Екатерина");
//            $("[name=phone]").setValue("+790912312120");
//            $("div.form-field>[type=button]").submit();
//            $(withText("Я соглашаюсь с условиями обработки и использования моих персональных данных")).shouldBe(visible);
//
//        }

}
