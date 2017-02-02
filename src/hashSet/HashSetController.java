package hashSet;

import java.util.*;



public class HashSetController {
    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	
	 String[] arr={"Java","JSP","Spring","JS","Html"};
	    HashSet<String> set=new HashSet<String>();
	    for(String i:arr){
		set.add(i);
	    }
	    System.out.println("SET :"+set.toString());
	   
	    System.out.println("삭제를 원하는 걸 입력하세요");
	    String del = s.next();
	    String result="";
	    for(int i=0;i<arr.length;i++){
		if(del.equals(arr[i])){
		    arr[i]=arr[arr.length-1];
		    arr[arr.length-1]=null;
		    result=del+"이 삭제되었습니다.\n";
		    break;
		}else{
		    result="값이 없습니다.";
		}
	    }
	    System.out.println(result.toString());
	    for(int i=0;i<arr.length-1;i++){
		System.out.println(arr[i]+"\t");
	    }
	    	
    }
   
}
