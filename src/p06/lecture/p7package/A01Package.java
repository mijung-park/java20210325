package p06.lecture.p7package;

public class A01Package {
	// 클래스 선언할 때 
	// 패키지를 명시할 수 있음
	// 클래스의 fullName 패키지.className
	
	// 이 클래스의 fullNmae: p06.lecture.p7package.A01Package
	
	// 패키지 명시 : 파일 첫 줄 package 키워드 + 패키지 경로
	// 피키지 작명법 : 대소문자, $, _, 숫자조합
	//                 숫자가 앞에 오면 안됨
	// 작명관습 : 회사마다 다름 (lowerCamelCase, lower_snake_case)
	
	// A회사 : ex1.test.Car
	// B회사 : ex1.test.Car
	// 위 문제를 피하기 위해 회사의 도메인을 패키지명에 포함
	// A회사 도메인 : choongang.net
	// ㄴ> net.choongang.ex1.test.Car
	// B회사 도메인 : samsung.net
	// ㄴ> net.samsung.ex1.test.Car
}
