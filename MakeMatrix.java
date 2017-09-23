/*
*	Simple Java Program to make a random matrix
*	Author 	: Sanoj Punchihewa
*	Created : 23 / 09 / 2017	
*/

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class MakeMatrix {
	
	static int TYPE_INT = 0;
	static int TYPE_FLOAT = 1;
	static int TYPE_DOUBLE = 2;
	static int TYPE;

    public static void main(String[] args){
        
        System.out.println("Printing Matrix Started...");
        
        try {
            FileWriter fileWriter = new FileWriter(args[3]);
            BufferedWriter writer = new BufferedWriter(fileWriter);

            int rows = Integer.valueOf(args[0]);
            int col = Integer.valueOf(args[1]);
			
            Random random = new Random();
			
			if(args[2].equals("i")){
				TYPE = TYPE_INT;
			}else if(args[2].equals("f")){
				TYPE = TYPE_FLOAT;
			}else if(args[2].equals("d")){
				TYPE = TYPE_DOUBLE;
			}else{
				System.out.println("Invalid Data type");
				System.exit(1);
			}
			
			writer.write(rows + " " + col + "\n");
			writer.flush();
			
            for (int i = 0; i < rows; i++){
                for (int j = 0; j < col; j++){
					
					if(TYPE == TYPE_INT){
						writer.write(random.nextInt(100) + " ");
					}else if(TYPE == TYPE_FLOAT){
						writer.write(random.nextFloat() + " ");
					}else if(TYPE == TYPE_DOUBLE){
						writer.write(random.nextDouble() + " ");
					}
                    
                }
                writer.write("\n");
				writer.flush();
            }

        }catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("DONE !");
        
    }

}