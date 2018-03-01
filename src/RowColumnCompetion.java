
public class RowColumnCompetion {
	public static boolean isWinner()
	{
		char ary[][] = new char[3][3];
	    if((ary[0][0]=='x' && ary[0][1]=='x' && ary[0][2]=='x') || (ary[0][0]=='o' && ary[0][1]=='o' && ary[0][2]=='o'))
	    {
	        return false;
	    }
	    else if((ary[1][0]=='x' && ary[1][1]=='x' && ary[1][2]=='x') || (ary[1][0]=='o' && ary[1][1]=='o' && ary[1][2]=='o'))
	    {
	        return false;
	    }
	    else if((ary[2][0]=='x' && ary[2][1]=='x' && ary[2][2]=='x') || (ary[2][0]=='o' && ary[2][1]=='o' && ary[2][2]=='o'))
	    {
	        return false;
	    }
	    else if((ary[0][0]=='x' && ary[1][0]=='x' && ary[2][0]=='x') || (ary[0][0]=='o' && ary[1][0]=='o' && ary[2][0]=='o'))
	    {
	        return false;
	    }
	    else if((ary[0][1]=='x' && ary[1][1]=='x' && ary[2][1]=='x') || (ary[0][1]=='o' && ary[1][1]=='o' && ary[2][1]=='o'))
	    {
	        return false;
	    }
	    else if((ary[0][2]=='x' && ary[1][2]=='x' && ary[2][2]=='x') || (ary[0][2]=='o' && ary[1][2]=='o' && ary[2][2]=='o'))
	    {
	        return false;
	    }
	    else if((ary[0][0]=='x' && ary[1][1]=='x' && ary[2][2]=='x') || (ary[0][0]=='o' && ary[1][1]=='o' && ary[2][2]=='o'))
	    {
	        return false;
	    }
	    else if((ary[2][0]=='x' && ary[1][1]=='x' && ary[0][2]=='x') || (ary[2][0]=='o' && ary[1][1]=='o' && ary[0][2]=='o'))
	    {
	        return false;
	    }
	    else
	    return true;
	    
	}
}
