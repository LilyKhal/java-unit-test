package ru.yandex.praktikum;
import org.junit.Test;
import org.junit.runners.Parameterized;

// Напиши аннотацию для параметризованных тестов
@RunWith(Parameterized.class)
public class CheckIsAdultTest {

    private final int age;
    private final boolean result;

    public CheckIsAdultTest(int age, boolean result) {
        this.age = age;
        this.result = result;  // Инициализируй поля класса в конструкторе
    }

    @Parameterized.Parameters // Пометь метод аннотацией для параметров
    public static Object[][] getTextData() {
        return new Object[][] {
                {12, false},
                {21, true},
                {17, false},
                {45,true},// Заполни массив тестовыми данными и ожидаемым результатом
        };
    }

    @Test
    public void checkIsAdultWhenAgeThenResult() {
        Program program = new Program();
        //int age=34; // Передай сюда возраст пользователя
        boolean isAdult = program.checkIsAdult(age);
        // Сравни полученный и ожидаемый результаты, не забудь про сообщение об ошибке
        assertEquals("Возраст пользователя не соответствует требованиям",result, isAdult);
    }
}