package ArrayTest;

import java.util.Scanner;

public class ArrayController {
    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	String[] arr = {"Java","JSP","Spring","JS","Html"};
	//String word = s.next();
	//검색(1)...첫글자가 H로 시작하는 단어를 출력
	String result="";
	for(int i=0; i<arr.length; i++){
	    if("H".equals(arr[i])){
		result=arr[i]+"\n";	    
	    }
	}
	System.out.println(result);
	System.out.println("\n");
	//검색(some)...첫글자가 J로 시작하는 단어를 출력
	result="";
	for(int i=0;i<arr.length;i++){
	    if("J".equals(String.valueOf(arr[i].charAt(0)))){
		result+=arr[i]+"\t";
	    }
	}
	 System.out.print("검색한단어 : " + result);
	System.out.println("\n");
	// 전체 출력
	result="";
	for(int i=0;i<arr.length;i++){
	   result+=arr[i]+"\t";
	}
	 System.out.print(result);
	System.out.println("\n");
	result="";
	for(int i=0; i<arr.length;i++){
	    if("JS".equals(arr[i])){
		arr[i]="Javascript";
	    }
	}
	//수정이 끝나면 배열 arr을 프린트하기
	result="";
	for(int i=0; i<arr.length;i++){
	    result+=arr[i]+"\t";
	}
	System.out.print(result);
	System.out.println("\n");
	//삭제(Spring 를 삭제)
	result="";
	for(int i=0; i<arr.length;i++){
	    if("Spring".equals(arr[i])){
		arr[i]=arr[arr.length-1];
		arr[arr.length-1]=null;
	    }
	}
	for(int i=0; i< arr.length-1; i++){
	    result+=arr[i]+"\t";
	}
	 System.out.print(result);
	//삭제가 끝나면 배열 arr을 프린트하기
    }
}
