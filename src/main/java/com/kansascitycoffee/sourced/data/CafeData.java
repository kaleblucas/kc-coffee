//package com.kansascitycoffee.sourced.models;
//
//import org.springframework.core.io.ClassPathResource;
//import org.springframework.core.io.Resource;
//
//import org.apache.commons.csv.CSVFormat;
//import org.apache.commons.csv.CSVParser;
//import org.apache.commons.csv.CSVRecord;
//
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.io.Reader;
//import java.util.ArrayList;
//import java.util.List;
//
//public class CafeData {
//
//    private static final String DATA_FILE = "cafes.csv";
//    private static boolean isDataLoaded = false;
//
//    private static ArrayList<Cafe> allCafes;
//    private static ArrayList<CafeLocation> allCafeLocations = new ArrayList<>();
//
//    private static Object findExistingObject(ArrayList list, String value){
//        for (Object item : list){
//            if (item.toString().toLowerCase().equals(value.toLowerCase())){
//                return item;
//            }
//        }
//        return null;
//    }
//
//
//    public static ArrayList<Cafe> findAll() {
//
//        // load data, if not already loaded
//        loadData();
//
//        return new ArrayList<>(allCafes);
//    }
//
//    /**
//     * Read in data from a CSV file and store it in an ArrayList of Job objects.
//     */
//    private static void loadData() {
//
//        // Only load data once
//        if (isDataLoaded) {
//            return;
//        }
//
//        try {
//
//            // Open the CSV file and set up pull out column header info and records
//            Resource resource = new ClassPathResource(DATA_FILE);
//            InputStream is = resource.getInputStream();
//            Reader reader = new InputStreamReader(is);
//            CSVParser parser = CSVFormat.RFC4180.withFirstRecordAsHeader().parse(reader);
//            List<CSVRecord> records = parser.getRecords();
//            Integer numberOfColumns = records.get(0).size();
//            String[] headers = parser.getHeaderMap().keySet().toArray(new String[numberOfColumns]);
//
//            allCafes = new ArrayList<>();
//
//            // Put the records into a more friendly format
//            for (CSVRecord record : records) {
//
//                String cafeName = record.get(0);
//                String cafeLocation = record.get(1);
//
//                CafeLocation newCafeLocation = (CafeLocation) findExistingObject(allCafeLocations, cafeLocation);
//
//
//                if (newCafeLocation == null){
//                    newCafeLocation = new CafeLocation(cafeLocation);
//                    allCafeLocations.add(newCafeLocation);
//                }
//
//                Cafe newCafe = new Cafe(cafeName, newCafeLocation);
//
//                allCafes.add(newCafe);
//            }
//            // flag the data as loaded, so we don't do it twice
//            isDataLoaded = true;
//
//        } catch (IOException e) {
//            System.out.println("Failed to load cafe data");
//            e.printStackTrace();
//        }
//    }
//
//}
