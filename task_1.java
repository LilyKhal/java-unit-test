@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
    int actual = 19;
    boolean expected = true;
    assertEquals("Возраст пользователя соответсвует требованиям",expected,isAdult);
	// Напиши код здесь
}