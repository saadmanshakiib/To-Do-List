package TO_DO_LIST;

import javax.swing.*;
import java.io.*;

public class todo {
    private String name,time,TO_DO;
    todo(){}
    todo(String name,String time,String TO_DO){
        this.name = name;
        this.time = time;
        this.TO_DO = TO_DO;
    }
    public void setName(String name){this.name = name;}
    public void setTime(String time){this.time = time;}
    public void setTO_DO(String TO_DO){this.TO_DO = TO_DO;}

    public String getName(){return this.name;}
    public String getTime(){return this.time;}
    public String getTO_DO(){return this.TO_DO;}

    public void setALL(String name,String time,String TO_DO){
        try{
            File file = new File("To_Do.txt");
            FileWriter fw = new FileWriter(file,true);
            fw.write("\nTask Name : "+getName());
            fw.write("\nTime : "+getTime());
            fw.write("\nTo-Do : "+getTO_DO());
            fw.write("\n-------------------------------------------------\n");
            fw.flush();
            fw.close();
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error While Creaitng File");
        }
    }


}
