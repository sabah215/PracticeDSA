//package com.dsabootcamp;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class CellsInRange {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		//System.out.println(cellsInRange("K1:L2"));
//
//	}
//
//	 public static List<String> cellsInRange(String s) {
//
//	        List<String> cells = new ArrayList();
//
//	        // Split the String
//	        String [] splitted = s.split(":");
//
//	        // Set colLow colHigh rowLOw rowHigh
//	        char colLow = splitted[0].charAt(0);
//	        char colHigh = splitted[1].charAt(0);
//	        int rowLOw = Character.getNumericValue(splitted[0].charAt(1));
//	        int rowHigh = Character.getNumericValue(splitted[1].charAt(1));
//
//	        StringBuilder sb;
//
//	        // check if colLow <= colHigh and rowLOw <= rowHigh
//
//
//	            // loop colLow through colHigh
////	            for(int i=colLow; i<=colHigh; i++){
////
////	                // loop rowLow through rowHigh
////	                for(int j=rowLOw; j<=rowHigh; j++){
////	                    sb = new StringBuilder();
////	                    //
////
////	                    sb.append(Character.toString(i));
////	                    sb.append(j);
////
////	                    cells.add(sb.toString());
////
////	                }
//	            }
//
//
//
//
//
//
//	      //  return cells;
//
//	    }
//
//
//
//}
