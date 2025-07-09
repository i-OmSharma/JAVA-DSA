package com.om;

public class SearchInString {
    public static void main(String[] args) {
        String name = "Anar";
        char target = 'r';
        System.out.println(search(name, target));
    }

    static boolean search(String str, char target) {
        if (str.length() == 0){
            return false;
        }
         //isEmpty
        if(str.isEmpty()){
            return  false;
        }
        //basic loop
        for(int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i))
                return true;
        }

        //advance loop
        for (char ch : str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
        return false;

//    static boolean search(String str, char target) {
//        if (str.length() == 0){
//            return false;
//        }
//
//        for (int i = 0; i < str.length(); i++) {
//            if (target == str.charAt(i)) {
//                return true;
//            }
//        }
//        return false;
    }
}

