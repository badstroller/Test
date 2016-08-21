/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package tester;
import java.util.Scanner;
/**
 *
 * @author David
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        	final long startTime; 
	final long endTime;
	int i;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter a nubmer");
	i = s.nextInt();

	startTime = System.currentTimeMillis();
	Boolean[] array = new Boolean[i];

	//System.out.println(array.length);

	for(int in = 0; in < array.length; in++){
		array[in] = true;
	}

	for(int outer = 2; outer <= Math.sqrt(i); outer++){
		for(int inner = 2; (inner * outer) < i; inner++){
			if(array[inner * outer]){
				array[inner * outer] = false;
			}
		}
	}

/**	for(int in = 0; in < i; in++){
		if(array[in]){
			System.out.println(in);
		}
	}
*/
	endTime = System.currentTimeMillis();
	System.out.print("It took: ");
	System.out.print((endTime - startTime) / 1000);
	System.out.println(" seconds to find every prime between 1 and " + i + "."); 

        
    }
    
}
