/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package parsing_table;

import java.util.ArrayList;
import static parsing_table.Compiler_2010331027_6.*;

/**
 *
 * @author Tazbeea Tazakka
 */
public class Compare_elements {
    
    
    public void compare(ArrayList<String> grammer,ArrayList<String> first,ArrayList<String> follow){
        
        
        first_row.clear();
        right_first.clear();
        right_follow.clear();
        left_grammer.clear();
        Divide_grammer test= new Divide_grammer();
        test.divide(grammer, "grammer");
        test.divide(first, "first");
        test.divide(follow, "follow");
        
        ArrayList<String> parsing_table =new ArrayList<String>();
        parsing_table.clear();

        
        // compare for parsing table
        int i,j;
        for(i=0;i<right_first.size();i++){
            String leftside=left_grammer.get(i),first_right=right_first.get(i),follow_right=right_follow.get(i);
            for(j=0;j<first_row.size();j++){
                String oparands= first_row.get(j);
                if(first_right.contains(oparands)){
                    if(first_right.contains("ε")){
                        String temp=first_right.substring(0, 2);
                        parsing_table.add(temp+follow_right);
                        break;
                    }
                    else{
                        parsing_table.add(first_right);
                        break;
                    }
                   
                }
            }
            
        }
        WriteFile write =new WriteFile();
        for(int a=0;a<parsing_table.size();a++){
            write.write_file(left_grammer.get(a) +" : "+parsing_table.get(a)+" ->> "+grammer.get(a));
        }
        
        
        
    }
}
