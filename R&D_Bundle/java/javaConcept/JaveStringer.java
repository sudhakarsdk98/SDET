//import required classes and package, if any  

package javaConcept;

public class JaveStringer {

	    public static void main(String[] args) {
	        String[][] characters = {
	                {
	                        "  H  ",
	                        "  H  ",
	                        "HHHHH",
	                        "  H  ",
	                        "  H  "
	                },
	                {
	                        " AAAAA ",
	                        "A     A",
	                        "AAAAAAA",
	                        "A     A",
	                        "A     A"
	                },
	                {
	                        " PPPP ",
	                        "P    P",
	                        "PPPPP ",
	                        "P     ",
	                        "P     "
	                },
	                {
	                        " PPPP ",
	                        "P    P",
	                        "PPPPP ",
	                        "P     ",
	                        "P     "
	                },
	                {
	                        " Y   Y ",
	                        " Y   Y",
	                        "  YYY ",
	                        "    Y ",
	                        "    Y "
	                },
	                {
	                        " N   N ",
	                        " NN  N",
	                        " N N N",
	                        " N  NN",
	                        " N   N"
	                },
	                {
	                        " EEEE ",
	                        " E    ",
	                        " EEEE ",
	                        " E    ",
	                        " EEEE "
	                },
	                {
	                        " W   W ",
	                        " W   W",
	                        " W W W",
	                        " W W W",
	                        "  W W "
	                },
	                {
	                        " Y   Y ",
	                        "  YYY ",
	                        "   Y  ",
	                        "   Y  ",
	                        "   Y  "
	                },
	                {
	                        " EEEE ",
	                        " E    ",
	                        " EEEE ",
	                        " E    ",
	                        " EEEE "
	                },
	                {
	                        " AAAAA ",
	                        "A     A",
	                        "AAAAAAA",
	                        "A     A",
	                        "A     A"
	                },
	                {
	                        " RRRR ",
	                        " R   R",
	                        " RRRR ",
	                        " R R  ",
	                        " R  R "
	                }
	        };

	        // Printing the characters line by line
	        for (int i = 0; i < 5; i++) {
	            for (int j = 0; j < characters.length; j++) {
	                System.out.print(characters[j][i] + "  ");
	            }
	            System.out.println();
	        }
	    }
	}
