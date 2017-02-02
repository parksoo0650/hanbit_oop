package ArrayTest;

import java.util.Scanner;

public class ArrayController2 {
    public static void main(String[] args) {
	ArrayService service = new ArrayServiceImpl();
	//1.추가
	service.add();
	//최초 입력된 배열 출력
	System.out.print(service.List());
	System.out.println("\n");
	//String word = s.next();
	//검색(1)...첫글자가 H로 시작하는 단어를 출력
	
	System.out.print("검색한 단어는: "+ service.findOne());
	System.out.println("\n");
	//검색(some)...첫글자가 J로 시작하는 단어를 출력
	System.out.print("검색한 단어는: "+ service.FindSome());
	System.out.println("\n");
	// 전체 출력
	System.out.print(service.Update());
	System.out.println("\n");
	//수정이 끝나면 배열 arr을 프린트하기
	System.out.print(service.Delete());
	System.out.println("\n");
	//삭제가 끝나면 배열 arr을 프린트하기/    }
    }
}
