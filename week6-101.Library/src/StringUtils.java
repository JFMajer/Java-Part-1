/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jakub
 */
public class StringUtils {
    public static boolean included(String word, String searched) {
        word = word.toUpperCase().trim();
        String trimmed = searched.toUpperCase().trim();
        //trimmed = trimmed.trim();
        //System.out.println(trimmed);
        return word.contains(searched.toUpperCase().trim());
    }
}
