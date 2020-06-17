package chap06.exercises.ex20_review;

import java.util.Scanner;

public class BankApplication {
	
	private static Account[] accountList = new Account [100];
	// 계좌를 넣을 수 있는 100개의 저장공간 할당
	
	
	private static Scanner sc = new Scanner(System.in) ;
	// 스캐너 사용을 위한 스캐너 객체 선언
	
	
	static String ano;
	static String owner;
	static int balance;
	// 전역에서 사용할 수 있도록 static 필드선언
	
	
	public static void main(String[] args) {
		
		boolean run = true;
		// while문을 구동하기 위한 boolean
		
		while (run) {
			System.out.println("-------------------------------------");
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 나가기");
			System.out.println("-------------------------------------");
			System.out.println("선택");
			
			
			
			int selectNo = sc.nextInt();
			
			switch (selectNo){
			case 1: createAccount();
					break;
			case 2: accountList();
					break;
			case 3: deposit();
					break;
			case 4: withdraw();
					break;
			case 5: run = false;
			}
				
		}
		// while 문 밖에서 프로그램 종료 메시지 출력 
		System.out.println("프로그램을 종료합니다.");
		
	}
	
	// main 함수 밖에서 메소드 선언 시작
	
	public static void createAccount() {
	// 입력한 string, string, int 값을 Account[]에 입력함
		System.out.println("통장 개설을 도와드리겠습니다.");
		System.out.println("계좌번호>");
		ano = sc.next();
		System.out.println("고객명>");
		owner = sc.next();
		System.out.println("최초 예치금>");
		balance = sc.nextInt();
		
		for (int i = 0; i < accountList.length; i++) {
			// account 인스턴스 생성 
			if (accountList[i] == null) { // 빈칸(null)에 작성하도록 함 
			accountList[i] = new Account(ano, owner, balance); // 배열에 객체 삽입
			System.out.println(accountList[i].getOwner() + " 고객님 계좌 개설이 완료되었습니다.");
			break; 
			}
		}
		
	}
	
	public static void accountList() {
		System.out.println("보유 계좌를 보여 드리겠습니다.");
		
		for (int i=0; i<accountList.length;i++) {
			if (accountList[i] != null) {
			System.out.print(accountList[i].getOwner());
			System.out.print("\t");
			System.out.print(accountList[i].getAno());
			System.out.print("\t");
			System.out.print(accountList[i].getBalance());
			System.out.print("\t");
			System.out.println();
			
			}
		}
		
		
	}
	
	public static void deposit() {
		System.out.println("입금 메뉴");
		System.out.print("계좌번호 입력 >");
		ano = sc.next();
		
		if (findAccount(ano) == null) {
			System.out.println("계좌 정보를 다시 확인해 주세요.");
		} else {
			System.out.print("입금액 입력>");
			int plus = sc.nextInt();
			findAccount(ano).setBalance(findAccount(ano).getBalance()+plus);
			System.out.println("입금이 완료되었습니다. ");
		}
		
		
		
	}
	
	public static void withdraw() {
		
		System.out.println("출금 메뉴");
		System.out.print("계좌번호 입력 >");
		ano = sc.next();
		
		if (findAccount(ano) == null) {
			System.out.println("계좌 정보를 다시 확인해 주세요.");
		} else {
			System.out.print("출금액 입력>");
			int minus = sc.nextInt();
			findAccount(ano).setBalance(findAccount(ano).getBalance()-minus);
			// findAccount(ano)를 통한 값을 이용하여 .setbalance()실행
			// setbalance의 대상은 findAccount(ano).getBalance()를 가져온 값
			// 거기에 minus 값을 뺀 값이 setBalance() 메소드에 적용 
			
			System.out.println("출금이 완료되었습니다. ");
		}
				
	}
	
	
	private static Account findAccount(String ano) {
		// return type이 Account 라는 클래스가 됨 
		for (int i=0; i< accountList.length; i++) {
			if (ano.equals(accountList[i].getAno())) {
				return accountList[i];
			}
		}
		return null; 
	}
	
	

}
