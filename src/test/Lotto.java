package test;

/**
@FILE   : LottoDraw.java
@DATE   : 2016. 12. 27.
@AUTHER : Park Seoung-soo
@STORY  : 로또볼 추첨
	  1~45까지 랜덤숫자
	    볼갯수는 총 6개
	    중복 허용
	    출력은 {5,23,12,40,19,22]
	  
*/
public class Lotto {
    private int[] arr;
    public void lottoDraw() {
/*	int lottoNum=0, count=0, i=0;
	int[]balls=new int[6];
	for(i=0;i<balls.length;i++){
	    lottoNum=(int)(Math.random()*45+1);
	    balls[i]=lottoNum;
	    System.out.printf("%d,",balls[i]);
	}*/
	 int ball1=0,ball2=0,ball3=0,ball4=0,ball5=0,ball6=0,count=0;
	while(true){
	    
	    int lottoNum=(int) (Math.random()*45+1);
	    count++;
	    
	   
	    switch(count){
		case 1:
			ball1=lottoNum;
			break;
		case 2:
			count=(lottoNum==ball1)?count--:count;
			ball2=lottoNum;
			break;
		case 3:
			ball3=lottoNum;
			count=(lottoNum==ball2||lottoNum==ball1)?count--:count;
			ball3=lottoNum;
			break;
		case 4:
			count=(lottoNum==ball3||lottoNum==ball2||lottoNum==ball1)?count--:count;
			ball4=lottoNum;
			break;
		case 5:
			
			count=(lottoNum==ball4||lottoNum==ball3||lottoNum==ball2||lottoNum==ball1)?count--:count;
			ball5=lottoNum;
			
			break;
		case 6:
		    	count=(lottoNum==ball5||lottoNum==ball4||lottoNum==ball3||lottoNum==ball2||lottoNum==ball1)?count--:count;
			ball6=lottoNum;
			break;
		}
	    
	    if(count==6){
		break;
	    }
	   
	  }
	  System.out.printf("추첨된 번호 [%d,%d,%d,%d,%d,%d]",ball1,ball2,ball3,ball4,ball5,ball6);
    }
}
