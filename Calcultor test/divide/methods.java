@Test
public void subtract_BVC10000 () {
	Caculator c = new Caculator();
	int result = c.subtract(150,300);
	int expected = -150;
	assertEquals(expected,result);
}
@Test
public void subtract_BVC10001 () {
	Caculator c = new Caculator();
	int result = c.subtract(150,301);
	int expected = -151;
	assertEquals(expected,result);
}
@Test
public void subtract_BVC10002 () {
	Caculator c = new Caculator();
	int result = c.subtract(150,400);
	int expected = -250;
	assertEquals(expected,result);
}
@Test
public void subtract_BVC10003 () {
	Caculator c = new Caculator();
	int result = c.subtract(150,399);
	int expected = -249;
	assertEquals(expected,result);
}
@Test
public void subtract_BVC10004 () {
	Caculator c = new Caculator();
	int result = c.subtract(100,350);
	int expected = -250;
	assertEquals(expected,result);
}
@Test
public void subtract_BVC10005 () {
	Caculator c = new Caculator();
	int result = c.subtract(101,350);
	int expected = -249;
	assertEquals(expected,result);
}
@Test
public void subtract_BVC10006 () {
	Caculator c = new Caculator();
	int result = c.subtract(200,350);
	int expected = -150;
	assertEquals(expected,result);
}
@Test
public void subtract_BVC10007 () {
	Caculator c = new Caculator();
	int result = c.subtract(199,350);
	int expected = -151;
	assertEquals(expected,result);
}
@Test
public void subtract_BVC10008 () {
	Caculator c = new Caculator();
	int result = c.subtract(150,350);
	int expected = -200;
	assertEquals(expected,result);
}
