package classes;

public class Animal {
	  private String strName;
    private String strColor;
    private boolean blnBreathe = true;
    private boolean blnGender = true;

    public Animal (String inpName, String inpColor, boolean inpBreathe, boolean inpGender) {
    	strName = inpName;
    	strColor = inpColor;
    	blnBreathe = inpBreathe;
    	blnGender = inpGender;
    }

    public static void main(String args[]) {
     System.out.print("Animal Made");
    }
}
