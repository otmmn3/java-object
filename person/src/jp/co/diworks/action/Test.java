package jp.co.diworks.action;

public class Test {
	public static void main(String[]args) {
		Person taro = new Person();
		taro.name = "山田太朗";
		taro.age = 20;
		
		System.out.println(taro.name);
		System.out.println(taro.age);
		
		taro.name = "木村次郎";
		taro.age = 18;
		
		System.out.println(taro.name);
		System.out.println(taro.age);
		
		taro.name = "鈴木花子";
		taro.age = 16;
		
		System.out.println(taro.name);
		System.out.println(taro.age);
		
		taro.name = "太田百音";
		taro.age = 25;
		
		System.out.println(taro.name);
		System.out.println(taro.age);
	}
}
