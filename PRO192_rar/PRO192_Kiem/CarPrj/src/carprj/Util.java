/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carprj;

import java.util.Scanner;

public final class Util {

    private static final String IGNORE_CASE_PATTERN = "(?i)";

    private Util() {
    }

    public static String inputString(String message, boolean allowEmpty) {
        Scanner sc = new Scanner(System.in);
        String str = "";
        do {
            System.out.print(message + ": ");
            str = sc.nextLine();
        } while (!allowEmpty && str.isEmpty());
        return str.trim();
    }

    public static Integer inputInteger(String message, Integer minValue, Integer maxValue) {
        Integer inputVal = null;
        do {
            try {
                inputVal = Integer.valueOf(Util.inputString(message, false));
            } catch (NumberFormatException ex) {
                inputVal = null;
//                Logger.getLogger(Util.class.getName()).log(Level.SEVERE, null, ex);
            }
        } while (inputVal == null
                || (minValue != null && minValue.compareTo(inputVal) > 0)
                || maxValue != null && maxValue.compareTo(inputVal) < 0);
        return inputVal;
    }

    public static Integer inputInteger(String message, Integer minValue, Integer maxValue, boolean allowEmpty) {
        Integer inputVal = null;
        String sVal = "";
        do {
            try {
                sVal = Util.inputString(message, allowEmpty);
                if (sVal.isEmpty()) {
                    inputVal = null;
                } else {
                    inputVal = Integer.valueOf(sVal);
                }
            } catch (NumberFormatException ex) {
                inputVal = null;
//                Logger.getLogger(Util.class.getName()).log(Level.SEVERE, null, ex);
            }
        } while (!(allowEmpty && sVal.isEmpty())
                && (inputVal == null
                || minValue != null && minValue.compareTo(inputVal) > 0
                || maxValue != null && maxValue.compareTo(inputVal) < 0));
        return inputVal;
    }

    public static boolean validateStringPattern(String str, String regex, boolean ignoreCase) {
        if (str != null && regex != null) {
            if (ignoreCase) {
                regex = Util.IGNORE_CASE_PATTERN + regex;
            }
            return str.matches(regex);
        }
        return false;
    }
    
    public static boolean isStop(String message, boolean allowBlankOrEmpty) {
        String input = null;
        Scanner sc = new Scanner(System.in);
        if (allowBlankOrEmpty) {
            message += "(leave blank as No) Y/N: ";
        } else {
            message += " (not blank or empty) Y/N: ";
        }
        do {
            System.out.println(message);
            input = toCorrectInputFormat(sc.nextLine().trim(), allowBlankOrEmpty);
        } while (input == null);
        return "Y".equals(input);
    }
        public static String toCorrectInputFormat(String input, boolean allowBlankOrEmpty) {
        String str = input.toLowerCase();
        if ("no".equals(str) || "0".equals(str) || "n".equals(str)
                || (str.isEmpty() && allowBlankOrEmpty == true)) {
            return "N";
        }
        if ("yes".equals(str) || "y".equals(str) || "ye".equals(str) || "1".equals(str)) {
            return "Y";
        }
        return null;
    }
    public static Double inputDouble (String message, Double minValue, Double maxValue){
        Double inputVal = null;
        do {
            try {
                inputVal = Double.valueOf(Util.inputString(message, false));
            } catch (NumberFormatException ex) {
                inputVal = null;
//                Logger.getLogger(Util.class.getName()).log(Level.SEVERE, null, ex);
            }
        } while (inputVal == null
                || (minValue != null && minValue.compareTo(inputVal) > 0)
                || maxValue != null && maxValue.compareTo(inputVal) < 0);
        return inputVal;
    }
    
    public static Double inputDouble (String message, Double minValue, Double maxValue, boolean allowEmpty){
        Double inputVal = null;
        String sVal = "";
        
        do {
            try {
                sVal = Util.inputString(message, allowEmpty);
                if (sVal.isEmpty()) {
                    inputVal = null;
                } else {
                    inputVal = Double.valueOf(sVal);
                }
            } catch (NumberFormatException ex) {
                inputVal = null;
//                Logger.getLogger(Util.class.getName()).log(Level.SEVERE, null, ex);
            }
        } while (!(allowEmpty && sVal.isEmpty())
                && (inputVal == null
                || minValue != null && minValue.compareTo(inputVal) > 0
                || maxValue != null && maxValue.compareTo(inputVal) < 0));
        return inputVal;
    }
    
    public static boolean validateStringLength(String str, int min, int max) {
        if (str == null) {
            return false;
        }
        int length = str.length();
        return length >= min && length <= max;
    }
    
    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
