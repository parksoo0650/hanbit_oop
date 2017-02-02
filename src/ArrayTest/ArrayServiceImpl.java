package ArrayTest;

public class ArrayServiceImpl implements ArrayService{
   String[] strArray;
   String result;
   int i;
   public ArrayServiceImpl(){
       strArray = new String[5];
       result = "";
       i=0;
   }
    @Override
    public void add() {
	String[] arr = {"Java","JSP","Spring","JS","Html"}; 
	for(i=0; i <strArray.length; i++){
	    strArray[i] = arr[i];
	}
    }
    @Override
    public String findOne() {
	for(i=0;i<strArray.length;i++){
	    if("H".equals(String.valueOf(strArray[i].charAt(0)))){
		result=strArray[i];
		break;
	    }
	}
	return result;
    }

    @Override
    public String FindSome() {
	// TODO Auto-generated method stub
	result="";
	for(i=0;i<strArray.length;i++){
	    if("J".equals(String.valueOf(strArray[i].charAt(0)))){
		result+=strArray[i]+"\t";
	    }
	}
	return result;
    }

    @Override
    public String List() {
	result="";
	for(i=0;i<strArray.length;i++){
	   result+=strArray[i]+"\t";
	}

	return result;
    }

    @Override
    public String Update() {
	result="";
	for(i=0;i<strArray.length;i++){
	    if("JS".equals(strArray[i])){
		strArray[i]="Javascript";
	    }
	}
	for(int i=0; i<strArray.length;i++){
	    result+=strArray[i]+"\t";
	}
	  return result;
    }
    @Override
    public String Delete() {
	result="";
	for(i=0; i<strArray.length; i++){
	    if("Spring".equals(strArray[i])){
		strArray[i]=strArray[strArray.length-1];
		strArray[strArray.length-1]=null;
	    }
	}
	   for(i=0;i<strArray.length-1;i++){
	       result+=strArray[i]+"\t";
	   }
	   return result;
	
	
    }
   
    
}
