package co.edu.unipiloto.beeradvice;

public class BeerExpert {
    public static String getBrands(String color){
        switch (color){
            case "Light":
                return "Bud Light Platinum";
            case "Amber":
                return "New Belgium Fat Tire Amber Ale";
            case "Brown":
                return "Sweetwater Georgia Brown";
            case "Dark":
                return "Deschutes Black Butte Porter";
            default:
                return  "No beers for the selected item";
        }
    }
}
