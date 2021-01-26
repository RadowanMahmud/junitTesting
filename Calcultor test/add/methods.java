@Test
public void addBVC10000 () {
	Caculator c = new Caculator();
	int result = c.add(0,-100);
	int expected = -100;
	assertEquals(expected,result);
}
@Test
public void addBVC10001 () {
	Caculator c = new Caculator();
	int result = c.add(0,-99);
	int expected = -99;
	assertEquals(expected,result);
}
@Test
public void addBVC10002 () {
	Caculator c = new Caculator();
	int result = c.add(0,100);
	int expected = 100;
	assertEquals(expected,result);
}
@Test
public void addBVC10003 () {
	Caculator c = new Caculator();
	int result = c.add(0,99);
	int expected = 99;
	assertEquals(expected,result);
}
@Test
public void addBVC10004 () {
	Caculator c = new Caculator();
	int result = c.add(-10000,0);
	int expected = -10000;
	assertEquals(expected,result);
}
@Test
public void addBVC10005 () {
	Caculator c = new Caculator();
	int result = c.add(-9999,0);
	int expected = -9999;
	assertEquals(expected,result);
}
@Test
public void addBVC10006 () {
	Caculator c = new Caculator();
	int result = c.add(10000,0);
	int expected = 10000;
	assertEquals(expected,result);
}
@Test
public void addBVC10007 () {
	Caculator c = new Caculator();
	int result = c.add(9999,0);
	int expected = 9999;
	assertEquals(expected,result);
}
@Test
public void addBVC10008 () {
	Caculator c = new Caculator();
	int result = c.add(0,0);
	int expected = 0;
	assertEquals(expected,result);
}
