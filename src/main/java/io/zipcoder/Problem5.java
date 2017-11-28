package io.zipcoder;



public class Problem5 {

// I dont know how to make this work without using built in methods


    public  String reverseCapitalizeString(String string) {

        string += ":";

        for (int i = string.length() - 1; i >= 0; i--) {
           string+= string.charAt(i);
        }

        string = string.split("::")[1];

       string = string.substring(0,1).toUpperCase()+ string.substring(1,string.length()-1)
                + string.substring(string.length()-1,string.length()).toLowerCase();
        return string;
    }

    public String editStringFirstCapitalLetter(String string){

        string = reverseCapitalizeString(string);

         for(int i =1; i<string.length()-1; i++){

            if(string.charAt(i) == ' '){

               string = string.split(" ")[i];
                string = string.substring(0,1).toUpperCase()+ string.substring(1,string.length()-1)
                        + string.substring(string.length()-1,string.length()).toLowerCase();


            }



         }
         return string ;


    }




}
