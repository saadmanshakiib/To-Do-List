package TO_DO_LIST;

import javax.swing.*;
import java.io.*;
import java.util.*;

public class Account {
   private  String name;
   private String pass;

   //Account(){}
    Account(String name,String pass){
       this.name = name;
       this.pass = pass;
    }
    public void setName(String name){this.name = name;}
    public String getName(){return this.name;}

    public void setPass(String pass){this.pass = pass;}
    public String getPass(){return this.pass;}

    public void Add(){
        try{
            File file2 = new File("account.txt");
            FileWriter fw = new FileWriter(file2,true);
            fw.write(getName()+"\t");
            fw.write(getPass()+"\t");
            fw.write("\n---------------------------------------------\n");
            fw.flush();
            fw.close();
    }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    public boolean Check(String name,String pass){
       boolean check = false;
       try{
           File file2 = new File("account.txt");
            Scanner scanner =  new Scanner(file2);
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] data = line.split("\t");
                if(data[0].equals(name) && data[1].equals(pass)){
                    check = true;
                }
            }
       }
       catch (Exception e){
           e.printStackTrace();
       }
       return check;
    }
}
