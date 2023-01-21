import java.awt.*;
import java.io.*;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args){
        Scanner line = new Scanner(System.in);
        //creating a file:
        /* 
        File obj = new File("file1.txt");
        try{
            FileWriter w = new FileWriter("file1.txt");
            String inp = "";

            while(!(inp = line.nextLine().trim()).equals("")) {
               // System.out.println("here");
                w.write(inp + "\n");
            }


            w.close();
        } catch(IOException e){
            e.printStackTrace();
        }
        */

        int flag = 0;
        String fileName = line.nextLine().trim();
        File file = new File(fileName);
        try{
            Scanner r = new Scanner(file);
            while(r.hasNextLine()){
                String l = r.nextLine();
                for(int i=0; i<l.length(); i++){
                    if(l.charAt(i) < '0' || l.charAt(i) > '9'){
                        System.out.println("OtherCharactersFound");
                        flag = 1;
                        break;
                    }
                }
                if(flag == 0)
                    System.out.println(l);
                flag = 0;
            }

            r.close();

        } catch(FileNotFoundException e){
            e.printStackTrace();
        }


    }
}
