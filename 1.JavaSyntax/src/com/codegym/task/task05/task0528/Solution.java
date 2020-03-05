package com.codegym.task.task05.task0528;                                                  
                                                  
/*                                                   
Display today's date                                                  
                                                  
*/

import java.text.SimpleDateFormat;
import java.util.*;

public class Solution {
    public static void main(String[] args) {                                                  
        //write your code here

        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("MM dd yyyy");
        System.out.println(formatForDateNow.format(dateNow));
    }                                                  
}