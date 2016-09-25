/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package parsing_table;

import java.util.ArrayList;

/**
 *
 * @author Tazbeea Tazakka
 */
public  class Compiler_2010331027_6 {

    public static ArrayList<String> first_row=new ArrayList<String>();
    public static ArrayList<String> left_grammer=new ArrayList<String>();
    public static ArrayList<String> right_grammer=new ArrayList<String>();
    public static ArrayList<Integer> num_of_right_token_grammer=new ArrayList<Integer>();
    public static ArrayList<String> right_first=new ArrayList<String>();
    public static ArrayList<String> right_follow=new ArrayList<String>();

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ReadFile file=new ReadFile();
        file.read();
        
    }
    
}
