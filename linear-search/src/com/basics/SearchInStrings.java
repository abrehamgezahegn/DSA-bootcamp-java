package com.basics;

public class SearchInStrings {
    public static void main(String[] args) {
        System.out.println("Search: " + search("Van Gogh" , 'p'));
        System.out.println("Search 2: "  + search2("Living on a  island" ,'d'));
        int[] a = new int[]{1,4,5};


    }

    static boolean search(String str, char letter){
        if(str.length() == 0){
            return false;
        }
        for(int i = 0; i < str.length(); i++){
            if(letter == str.charAt(i)){
                return true;
            }
        }
        return  false;
    }

    static boolean search2(String str, char letter){
        for(char item: str.toCharArray()){
            if(item == letter){
                return  true;
            }
        }
        return  false;
    }
}

