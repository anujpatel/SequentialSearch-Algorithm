package com.anuj.algorithms;

/**
 * 
 * @author Anuj
 * @source goldenpackagebyanuj.blogspot.com
 */
public class SequentialSearch {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 19, 17, 7};

        int searchItem = 3;
        SequentialSearch sequentialSearch = new SequentialSearch();
        boolean searchItemFound = sequentialSearch.contains(a, searchItem);
        System.out.println("SearchItem " + searchItem + " found : " + searchItemFound);
    }

    public boolean contains(int[] a, int searchItem) {
        for (int i : a) {
            if (i == searchItem) {
                return true;
            }
        }
        return false;
    }
}
