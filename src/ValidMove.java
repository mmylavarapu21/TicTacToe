
/*public class ValidMove {

	public static void isOpenMove()
	{
		char ary[][] = new char[3][3];
		int count,pl1,pl2,choice;
	        if( count==1 || count==3 || count==5 || count==7 || count==9 )
	    {
	        if(choice==1 && (ary[0][0] != 'x' && ary[0][0] != 'o' ))
	    ary[0][0]=pl1;
	    else if(choice==2 && (ary[0][1] != 'x' && ary[0][1] != 'o' ))
	    ary[0][1]=pl1;
	    else if(choice==3 && (ary[0][2] != 'x' && ary[0][2] != 'o' ))
	    ary[0][2]=pl1;
	    else if(choice==4 && (ary[1][0] != 'x' && ary[1][0] != 'o' ))
	    ary[1][0]=pl1;
	    else if(choice==5 && (ary[1][1] != 'x' && ary[1][1] != 'o' ))
	    ary[1][1]=pl1;
	    else if(choice==6 && (ary[1][2] != 'x' && ary[1][2] != 'o' ))
	    ary[1][2]=pl1;
	    else if(choice==7 && (ary[2][0] != 'x' && ary[2][0] != 'o' ))
	    ary[2][0]=pl1;
	    else if(choice==8 && (ary[2][1] != 'x' && ary[2][1] != 'o' ))
	    ary[2][1]=pl1;
	    else if(choice==9 && (ary[2][2] != 'x' && ary[2][2] != 'o' ))
	    ary[2][2]=pl1;
	    else
	    {
	    System.out.println("Invalid Move - Box already used");
	    count--;
	    }
	    
	    getBoardCopy(ary);
	    
	    }
	    else if( count==2 || count==4 || count==6 || count==8 )
	    {
	        if(choice==1 && (ary[0][0] != 'x' && ary[0][0] != 'o' ))
	    ary[0][0]=pl2;
	    else if(choice==2 && (ary[0][1] != 'x' && ary[0][1] != 'o' ))
	    ary[0][1]=pl2;
	    else if(choice==3 && (ary[0][2] != 'x' && ary[0][2] != 'o' ))
	    ary[0][2]=pl2;
	    else if(choice==4 && (ary[1][0] != 'x' && ary[1][0] != 'o' ))
	    ary[1][0]=pl2;
	    else if(choice==5 && (ary[1][1] != 'x' && ary[1][1] != 'o' ))
	    ary[1][1]=pl2;
	    else if(choice==6 && (ary[1][2] != 'x' && ary[1][2] != 'o' ))
	    ary[1][2]=pl2;
	    else if(choice==7 && (ary[2][0] != 'x' && ary[2][0] != 'o' ))
	    ary[2][0]=pl2;
	    else if(choice==8 && (ary[2][1] != 'x' && ary[2][1] != 'o' ))
	    ary[2][1]=pl2;
	    else if(choice==9 && (ary[2][2] != 'x' && ary[2][2] != 'o' ))
	    ary[2][2]=pl2;
	    else
	    {
	    System.out.println("Invalid Move - Box already used");
	    count--;
	    }
	    
	    getBoardCopy(ary);
	}
	}
}
	
	
*/