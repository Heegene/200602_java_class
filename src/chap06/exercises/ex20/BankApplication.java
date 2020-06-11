package chap06.exercises.ex20;

import java.util.Scanner;

public class BankApplication {

	private static Account[] accountArray = new Account[100];  
	// account 배열 만들고 account가 100개 저장될 수 있는 공간 메모리에 할당 
	// accountArray.method() 로 호출

	private static Scanner scanner = new Scanner(System.in);

	static String ano;

	public static void main(String[] args) {

		boolean run = true;
		while (run) {

			System.out.println("--------------------------------------------------------");
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("--------------------------------------------------------");
			System.out.println("선택 > ");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) { // 계좌생성

				creatAccount();

			} else if (selectNo == 2) { // 계좌목록
				accountList();

			} else if (selectNo == 3) {
				deposit(); // 예금
			} else if (selectNo == 4) {
				withdraw(); // 출금

			} else if (selectNo == 5) {
				run = false;

			}

		}
		System.out.println("프로그램을 종료합니다.");

	}

	
	
	private static void creatAccount() {
		// 계좌생성
		System.out.println("계좌생성 메뉴입니다.");

		System.out.print("계좌번호: ");
		ano = scanner.next();

		System.out.print("계좌주: ");
		String owner = scanner.next();

		System.out.print("초기 입금액 : ");
		int balance = scanner.nextInt();

		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = new Account(ano, owner, balance); // accountArray[i] 번째에 account를 넣어주는것 
				break;
			}

			// 이렇게도 가능
			// 위에 int size = 0; 해놓고
//			accountArray[size] = account;
//			size++; 
//			이런식으로도 가능 
			
		}

	}

	private static void accountList() {
		// 계좌리스트

		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				break;
			}

			System.out.println(accountArray[i].getAno() + "      " + accountArray[i].getOwner() + "      "
					+ accountArray[i].getBalance());
		}

	}

	private static void deposit() {
		System.out.println("예금 메뉴입니다.");
		System.out.print("계좌번호");
		ano = scanner.next();

		if (findAccount(ano) == null) {
			System.out.println("계좌 정보를 다시 확인해 주세요");

		} else {
			System.out.println("예금하실 금액을 입력해 주세요.");
			int balance = scanner.nextInt();
			findAccount(ano).setBalance(findAccount(ano).getBalance() + balance);
			System.out.println("결과 : 입금이 완료되었습니다. ");
		}

	}

	private static void withdraw() {
		// 출금
		System.out.println("출금 메뉴입니다.");
		System.out.print("계좌번호 :");
		ano = scanner.next();

		if (findAccount(ano) == null) {
			System.out.println("계좌 정보를 다시 확인해 주세요");

		} else {
			System.out.println("출금하실 금액을 입력해 주세요.");
			int balance = scanner.nextInt();

			if (findAccount(ano).getBalance() - balance < 0) {
				System.out.println("잔액 이상으로 출금할 수 없습니다.");
				System.out.println("결과 - 트랜잭션 실패. 처음부터 다시 시작해 주세요. ");

			} else {
				findAccount(ano).setBalance(findAccount(ano).getBalance() - balance);
				System.out.println("결과 - 출금이 완료되었습니다. ");
			}

		}

	}

	private static Account findAccount(String ano) {

		for (int i = 0; i < accountArray.length; i++) {
			if (ano.equals(accountArray[i].getAno())) {
				return accountArray[i];
			}
		}
		return null;
	}

}
