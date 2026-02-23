public class PracticeProblem {

public static void main (String args[])	{


}

	public static String pluralize(String x){
	    if (x.toLowerCase().endsWith("ey")) {
	        return "eys";
		}
	    else if (x.toLowerCase().endsWith("y")){
	        return "ies";
		}
	    else if (x.toLowerCase().endsWith("ife")){
	        return "ives";
		}
	    else {
	        return "s";
		}
	}
	
	public static int min(int x, int y, int z) {
	    int a = Math.min(y, z);
	    int w = Math.min(x, a);
	    return w;
	}
	
    public static Boolean isLeapYear(int x) {
	    if (x % 4 == 0){
	        if (x % 100 == 0){
	            if (x % 400 == 0){
	                return true;
	            }
	    else {
	        return false;
	    }
	        }
	    else {
	        return true;
	    }
	    }
	    else {
	        return false;
	    }
	}
	
}