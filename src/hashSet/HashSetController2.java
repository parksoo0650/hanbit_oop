package hashSet;

import java.util.*;

public class HashSetController2 {
    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	String[] arr = {"Java","JSP","Spring","JS","Html"};
	String result="";
	Set<String> set = new HashSet<String>();
	for(String i:arr){
	    set.add(i);
	}
	//1.추가...한번 주어진 배열 arr를 set에 추가하기
	//String word = s.next();
	//검색(1)...첫글자가 H로 시작하는 단어를 출력
	
	for(int i=0;i<arr.length;i++){
	    if("H".equals(String.valueOf(arr[i].charAt(0)))){
		result=arr[i];
		break;
	    }
	}
	System.out.print("검색한 단어는: "+result);
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
