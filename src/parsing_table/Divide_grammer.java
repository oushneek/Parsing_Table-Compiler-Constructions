/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package parsing_table;

import java.util.ArrayList;
import java.util.StringTokenizer;
import static parsing_table.Compiler_2010331027_6.*;
/**
 *
 * @author Tazbeea Tazakka
 */
public class Divide_grammer {
    
    public void divide(ArrayList<String> file,String fileName){
        ArrayList<String> left=new ArrayList<String>();
        ArrayList<String> right=new ArrayList<String>();
        ArrayList<Integer> num_of_right_token=new ArrayList<Integer>();
        left.clear();
        right.clear();
        num_of_right_token.clear();
        
        for(int i=0;i<file.size();i++){
        
            StringTokenizer tokenizer=new StringTokenizer(file.get(i),"=|");
            
            left.add(tokenizer.nextToken());
            int count=0;
            while(tokenizer.hasMoreTokens()){
                count++;
                right.add(tokenizer.nextToken());
            }
            num_of_right_token.add(count);
            
            if(fileName!="grammer"){
                StringTokenizer tokenizer2=new StringTokenizer(right.get(i),"{,}");
                while(tokenizer2.hasMoreTokens()){
                    String temp=tokenizer2.nextToken();
                    int j=0;
                    for(j=0;j<first_row.size();j++){
                        if(temp.equals(first_row.get(j))){
                            break;
                        }
                    }
                    if(j==first_row.size() && temp!="ε"){
                        first_row.add(temp);
                    }
                }
            }
             
            
            
            
        }
        if (fileName.equals("grammer")){
                for(int x=0;x<left.size();x++){
                    left_grammer.add(left.get(x));
                }
                for(int x=0;x<right.size();x++){
                    right_grammer.add(right.get(x));
                }
                for(int x=0;x<num_of_right_token.size();x++){
                    num_of_right_token_grammer.add(num_of_right_token.get(x));
                }
            }
        else if(fileName.equals("first")){
           for(int i=0;i<right.size();i++){
               right_first.add(right.get(i));
           }
       }
       else if(fileName.equals("follow")){
           for(int i=0;i<right.size();i++){
               right_follow.add(right.get(i));
           }
       }

            
        
    }
}
