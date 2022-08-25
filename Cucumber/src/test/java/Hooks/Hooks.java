package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
@Before ()
public void goestogoogle() {
	System.out.println("Goes to google");
}
	
@After ()
public void enterstext () {
	System.out.println("User closes the window after viewing search results");
}	
	
	
}


// In both the files @before is executed first in botht the files and then the @after annotation hook is executed 