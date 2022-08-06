import pkg.*;
import java.util.*;
import java.io.*;       

class main {        // This should be all that is in your main.java file.
	public static void main(String args[]) throws FileNotFoundException {
        BBoard myBoard = new BBoard("Poole's Amazing BBoard");          // Feel free to change the name.
        myBoard.loadUsers(args[0]);
        myBoard.run();

        // Feel free to add code for testing purposes. 

        // Examine data.txt for example Messages displayed from the BBoard

        // Examine users.txt for the format of users and their passwords. 
	}
}
