/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package parsing_table;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Tazbeea Tazakka
 */
public class ReadFile {
    public void read(){
        String line=new String();
        ArrayList<String> first=new ArrayList<String>();
        ArrayList<String> follow=new ArrayList<String>();
        ArrayList<String> grammer=new ArrayList<String>();
        
        try {
                BufferedReader br = new BufferedReader(new FileReader("task6.txt"));

                grammer.clear();
                while((line=br.readLine())!=null){
                    grammer.add(line);
                }
                
                BufferedReader br2=new BufferedReader(new FileReader("First.txt"));
                first.clear();
                
                while((line=br2.readLine())!=null){
                    first.add(line);
                }
                
                BufferedReader br3=new BufferedReader(new FileReader("Follow.txt"));
                follow.clear();
                
                while((line=br3.readLine())!=null){
                    follow.add(line);
                }
                
            }
        catch(IOException Ex){
            System.out.println("Exception");
        }
 
        
        Compare_elements element=new Compare_elements();
        element.compare(grammer, first, follow);
        
    }
}
