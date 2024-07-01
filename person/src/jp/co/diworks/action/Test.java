package jp.co.diworks.action;

public class Test {
	public static void main(String[]args) {
		Person taro = new Person();
		taro.name = "山田太朗";
		taro.age = 20;
		taro.phoneNumber ="09012345678";
		taro.address ="新潟県新潟市中央区○○";
		
		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);
		taro.talk();
		taro.walk();
		taro.run();
		
		taro.name = "木村次郎";
		taro.age = 18;
		taro.phoneNumber ="09098765432";
		taro.address ="埼玉県さいたま市大宮区○○";
		
		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);
		
		taro.name = "鈴木花子";
		taro.age = 16;
		taro.phoneNumber ="09029384756";
		taro.address ="東京都港区赤坂○";
		
		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);
		
		taro.name = "太田百音";
		taro.age = 25;
		taro.phoneNumber ="09087764532";
		taro.address ="大阪府茨木市○○";
		
		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);
		
		Robot aibo = new Robot();
		aibo.name = "アイボ";
		System.out.println(aibo.name);
		aibo.talk();
		aibo.walk();
		aibo.run();
		
		aibo.name = "アシモ";
		System.out.println(aibo.name);
		aibo.talk();
		aibo.walk();
		aibo.run();
		
		aibo.name = "ペッパー";
		System.out.println(aibo.name);
		aibo.talk();
		aibo.walk();
		aibo.run();
	}
	
}
