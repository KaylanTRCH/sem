package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class AppTest {
    static App app;

    @BeforeAll
    static void init() {
        app = new App();
    }

    @Test
    void printCitiesTestNull() {
        app.printCityReport(null);
    }

    @Test
    void printCitiesTestEmpty() {
        ArrayList<City> cities = new ArrayList<City>();
        app.printCityReport(cities);
    }

    @Test
    void printCitiesTestNormal() {
        ArrayList<City> cities = new ArrayList<>();
        City city = new City(458, "Glasgow", "GBR", "Scotland", 619680);
        cities.add(city);
        city = new City(459, "Liverpool", "GBR", "England", 461000);
        cities.add(city);
        city = new City(460, "Edinburgh", "GBR", "Scotland", 450180);
        cities.add(city);
        app.printCityReport(cities);
    }

    @Test
    void printCountriesTestNull() {
        app.printCountryReport(null);
    }

    @Test
    void printCountriesTestEmpty() {
        ArrayList<Country> countries = new ArrayList<Country>();
        app.printCountryReport(countries);
    }

    @Test
    void printCountriesTestNormal() {
        ArrayList<Country> countries = new ArrayList<>();
        Country country = new Country("AGO","Angola","Africa","Central Africa",
                1246700,1975,12878000,38,6648,
                7984,"Angola","Republic","José Eduardo dos Santos","56","AO");
        countries.add(country);
        country = new Country("GBR","United Kingdom","Europe","British Islands",
                242900,1066,59623400,77.7,1378330,
                1296830,"United Kingdom","Constitutional Monarchy","Elisabeth II","456","GB");
        countries.add(country);
        country = new Country("GHA","Ghana","Africa","Western Africa",
                238533.00,1957,20212000,57.4,7137.00,
                6884.00,"Ghana","Republic","John Kufuor","910","GH"
        );
        countries.add(country);
        app.printCountryReport(countries);
    }

    @Test
    void printCountriesPopulationHighestToLowestTestNull() {
        app.printCountriesPopulationLargestToSmallest(null);
    }

    @Test
    void printCountriesPopulationHighestToLowestTestEmpty() {
        ArrayList<Country> countries = new ArrayList<Country>();
        app.printCountriesPopulationLargestToSmallest(countries);
    }

    @Test
    void printCountriesPopulationHighestToLowestTestNormal() {
        ArrayList<Country> countries = new ArrayList<>();
        Country country = new Country("AGO","Angola","Africa","Central Africa",
                1246700,1975,12878000,38,6648,
                7984,"Angola","Republic","José Eduardo dos Santos","56","AO");
        countries.add(country);
        country = new Country("GBR","United Kingdom","Europe","British Islands",
                242900,1066,59623400,77.7,1378330,
                1296830,"United Kingdom","Constitutional Monarchy","Elisabeth II","456","GB");
        countries.add(country);
        country = new Country("GHA","Ghana","Africa","Western Africa",
                238533.00,1957,20212000,57.4,7137.00,
                6884.00,"Ghana","Republic","John Kufuor","910","GH"
        );
        countries.add(country);
        app.printCountriesPopulationLargestToSmallest(countries);
    }

    @Test
    void printCountriesPopulationHighestToLowestByContinentTestNullNoContinent() {
        app.printCountriesPopulationByContinentLargestToSmallest(null,null);
    }

    @Test
    void printCountriesPopulationHighestToLowestByContinentTestNullWithContinent() {
        app.printCountriesPopulationByContinentLargestToSmallest(null,"Europe");
    }

    @Test
    void printCountriesPopulationHighestToLowestByContinentTestEmptyNoContinent() {
        ArrayList<Country> countries = new ArrayList<Country>();
        app.printCountriesPopulationByContinentLargestToSmallest(countries,null);
    }

    @Test
    void printCountriesPopulationHighestToLowestByContinentTestEmptyWithContinent() {
        ArrayList<Country> countries = new ArrayList<Country>();
        app.printCountriesPopulationByContinentLargestToSmallest(countries,"Europe");
    }

    @Test
    void printCountriesPopulationHighestToLowestByContinentTestNormalNoContinent() {
        ArrayList<Country> countries = new ArrayList<>();
        Country country = new Country("AGO","Angola","Africa","Central Africa",
                1246700,1975,12878000,38,6648,
                7984,"Angola","Republic","José Eduardo dos Santos","56","AO");
        countries.add(country);
        country = new Country("GBR","United Kingdom","Europe","British Islands",
                242900,1066,59623400,77.7,1378330,
                1296830,"United Kingdom","Constitutional Monarchy","Elisabeth II","456","GB");
        countries.add(country);
        country = new Country("GHA","Ghana","Africa","Western Africa",
                238533.00,1957,20212000,57.4,7137.00,
                6884.00,"Ghana","Republic","John Kufuor","910","GH"
        );
        countries.add(country);
        app.printCountriesPopulationByContinentLargestToSmallest(countries,null);
    }

    @Test
    void printCountriesPopulationHighestToLowestByContinentTestNormalWithContinent() {
        ArrayList<Country> countries = new ArrayList<>();
        Country country = new Country("AGO","Angola","Africa","Central Africa",
                1246700,1975,12878000,38,6648,
                7984,"Angola","Republic","José Eduardo dos Santos","56","AO");
        countries.add(country);
        country = new Country("GBR","United Kingdom","Europe","British Islands",
                242900,1066,59623400,77.7,1378330,
                1296830,"United Kingdom","Constitutional Monarchy","Elisabeth II","456","GB");
        countries.add(country);
        country = new Country("GHA","Ghana","Africa","Western Africa",
                238533.00,1957,20212000,57.4,7137.00,
                6884.00,"Ghana","Republic","John Kufuor","910","GH"
        );
        countries.add(country);
        app.printCountriesPopulationByContinentLargestToSmallest(countries,"Europe");
    }

    @Test
    void printCountriesPopulationHighestToLowestByRegionTestNullNoRegion() {
        app.printCountriesPopulationByRegionLargestToSmallest(null,null);
    }

    @Test
    void printCountriesPopulationHighestToLowestByRegionTestNullWithRegion() {
        app.printCountriesPopulationByRegionLargestToSmallest(null,"Caribbean");
    }

    @Test
    void printCountriesPopulationHighestToLowestByRegionTestEmptyNoRegion() {
        ArrayList<Country> countries = new ArrayList<Country>();
        app.printCountriesPopulationByRegionLargestToSmallest(countries,null);
    }

    @Test
    void printCountriesPopulationHighestToLowestByRegionTestEmptyWithRegion() {
        ArrayList<Country> countries = new ArrayList<Country>();
        app.printCountriesPopulationByRegionLargestToSmallest(countries,"Caribbean");
    }

    @Test
    void printCountriesPopulationHighestToLowestByRegionTestNormalNoRegion() {
        ArrayList<Country> countries = new ArrayList<>();
        Country country = new Country("AGO","Angola","Africa","Central Africa",
                1246700,1975,12878000,38,6648,
                7984,"Angola","Republic","José Eduardo dos Santos","56","AO");
        countries.add(country);
        country = new Country("GBR","United Kingdom","Europe","British Islands",
                242900,1066,59623400,77.7,1378330,
                1296830,"United Kingdom","Constitutional Monarchy","Elisabeth II","456","GB");
        countries.add(country);
        country = new Country("GHA","Ghana","Africa","Western Africa",
                238533.00,1957,20212000,57.4,7137.00,
                6884.00,"Ghana","Republic","John Kufuor","910","GH"
        );
        countries.add(country);
        app.printCountriesPopulationByRegionLargestToSmallest(countries,null);
    }

    @Test
    void printCountriesPopulationHighestToLowestByRegionTestNormalWithRegion() {
        ArrayList<Country> countries = new ArrayList<>();
        Country country = new Country("AGO","Angola","Africa","Central Africa",
                1246700,1975,12878000,38,6648,
                7984,"Angola","Republic","José Eduardo dos Santos","56","AO");
        countries.add(country);
        country = new Country("GBR","United Kingdom","Europe","British Islands",
                242900,1066,59623400,77.7,1378330,
                1296830,"United Kingdom","Constitutional Monarchy","Elisabeth II","456","GB");
        countries.add(country);
        country = new Country("GHA","Ghana","Africa","Western Africa",
                238533.00,1957,20212000,57.4,7137.00,
                6884.00,"Ghana","Republic","John Kufuor","910","GH"
        );
        countries.add(country);
        app.printCountriesPopulationByRegionLargestToSmallest(countries,"Western Africa");
    }

    @Test
    void printCitiesPopulationHighestToLowestTestNull() {
        app.printCitiesPopulationLargestToSmallest(null);
    }

    @Test
    void printCitiesPopulationHighestToLowestTestEmpty() {
        ArrayList<City> cities = new ArrayList<City>();
        app.printCitiesPopulationLargestToSmallest(cities);
    }

    @Test
    void printCitiesPopulationHighestToLowestTestNormal() {
        ArrayList<City> cities = new ArrayList<>();
        City city = new City(458, "Glasgow", "GBR", "Scotland", 619680);
        cities.add(city);
        city = new City(459, "Liverpool", "GBR", "England", 461000);
        cities.add(city);
        city = new City(460, "Edinburgh", "GBR", "Scotland", 450180);
        cities.add(city);
        app.printCitiesPopulationLargestToSmallest(cities);
    }

    @Test
    void printCitiesPopulationByContinentHighestToLowestTestNullNoContinent() {
        app.printCitiesPopulationByContinentLargestToSmallest(null, null);
    }

    @Test
    void printCitiesPopulationByContinentHighestToLowestTestNullWithContinent() {
        app.printCitiesPopulationByContinentLargestToSmallest(null, "Europe");
    }

    @Test
    void printCitiesPopulationByContinentHighestToLowestTestEmptyNoContinent() {
        ArrayList<City> cities = new ArrayList<City>();
        app.printCitiesPopulationByContinentLargestToSmallest(cities, null);
    }

    @Test
    void printCitiesPopulationByContinentHighestToLowestTestEmptyWithContinent() {
        ArrayList<City> cities = new ArrayList<City>();
        app.printCitiesPopulationByContinentLargestToSmallest(cities, "Europe");
    }

    @Test
    void printCitiesPopulationByContinentHighestToLowestTestNormalNoContinent() {
        ArrayList<City> cities = new ArrayList<>();
        City city = new City(458, "Glasgow", "GBR", "Scotland", 619680);
        cities.add(city);
        city = new City(459, "Liverpool", "GBR", "England", 461000);
        cities.add(city);
        city = new City(460, "Edinburgh", "GBR", "Scotland", 450180);
        cities.add(city);
        app.printCitiesPopulationByContinentLargestToSmallest(cities, null);
    }

    @Test
    void printCitiesPopulationByContinentHighestToLowestTestNormalWithContinent() {
        ArrayList<City> cities = new ArrayList<>();
        City city = new City(458, "Glasgow", "GBR", "Scotland", 619680);
        cities.add(city);
        city = new City(459, "Liverpool", "GBR", "England", 461000);
        cities.add(city);
        city = new City(460, "Edinburgh", "GBR", "Scotland", 450180);
        cities.add(city);
        app.printCitiesPopulationByContinentLargestToSmallest(cities, "Europe");
    }

    @Test
    void printCitiesPopulationByRegionHighestToLowestTestNullNoRegion() {
        app.printCitiesPopulationByRegionLargestToSmallest(null, null);
    }

    @Test
    void printCitiesPopulationByRegionHighestToLowestTestNullWithRegion() {
        app.printCitiesPopulationByRegionLargestToSmallest(null, "Caribean");
    }

    @Test
    void printCitiesPopulationByRegionHighestToLowestTestEmptyNoRegion() {
        ArrayList<City> cities = new ArrayList<City>();
        app.printCitiesPopulationByRegionLargestToSmallest(cities, null);
    }

    @Test
    void printCitiesPopulationByRegionHighestToLowestTestEmptyWithRegion() {
        ArrayList<City> cities = new ArrayList<City>();
        app.printCitiesPopulationByRegionLargestToSmallest(cities, "Caribbean");
    }

    @Test
    void printCitiesPopulationByRegionHighestToLowestTestNormalNoRegion() {
        ArrayList<City> cities = new ArrayList<>();
        City city = new City(458, "Glasgow", "GBR", "Scotland", 619680);
        cities.add(city);
        city = new City(459, "Liverpool", "GBR", "England", 461000);
        cities.add(city);
        city = new City(460, "Edinburgh", "GBR", "Scotland", 450180);
        cities.add(city);
        app.printCitiesPopulationByRegionLargestToSmallest(cities, null);
    }

    @Test
    void printCitiesPopulationByRegionHighestToLowestTestNormalWithRegion() {
        ArrayList<City> cities = new ArrayList<>();
        City city = new City(458, "Glasgow", "GBR", "Scotland", 619680);
        cities.add(city);
        city = new City(459, "Liverpool", "GBR", "England", 461000);
        cities.add(city);
        city = new City(460, "Edinburgh", "GBR", "Scotland", 450180);
        cities.add(city);
        app.printCitiesPopulationByRegionLargestToSmallest(cities, "Caribbean");
    }
}