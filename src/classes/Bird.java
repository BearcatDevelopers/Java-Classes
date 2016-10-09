package classes;

public class Bird extends Animal {
	  private boolean blnCanFly = true;

	  public Bird (String inpName, String inpColor, boolean inpBreathe, boolean inpGender, boolean inpCanFly) {
	    super(inpName, inpColor, inpBreathe, inpCanFly);
	    blnCanFly = inpCanFly;
	  }

	  public String CanFly() {
	    if (blnCanFly) {
	      return "This bird can fly!";
	    } else {
	      return "Poor bird cannot fly :(";
	    }
	  }

	  public static void main(String args[]) {
	   Bird goose = new Bird("Goose", "blue", true, true, false);

	   System.out.print("Bird Made");
	   System.out.print(goose.CanFly());
	   System.out.print(goose.CanFly());
	  }
	}