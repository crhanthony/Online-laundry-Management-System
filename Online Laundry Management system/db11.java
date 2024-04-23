package onlinelaundrymanagementsystem;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents the home page of the online laundry management system.
 */
public class HomePage {
    private List<String> services;
    private List<String> promotions;

    /**
     * Constructor to initialize the home page with services and promotions.
     */
    public HomePage() {
        services = new ArrayList<>();
        promotions = new ArrayList<>();
    }

    /**
     * Adds a service to the home page.
     *
     * @param service The service to be added.
     */
    public void addService(String service) {
        services.add(service);
    }

    /**
     * Removes a service from the home page.
     *
     * @param service The service to be removed.
     */
    public void removeService(String service) {
        services.remove(service);
    }

    /**
     * Adds a promotion to the home page.
     *
     * @param promotion The promotion to be added.
     */
    public void addPromotion(String promotion) {
        promotions.add(promotion);
    }

    /**
     * Removes a promotion from the home page.
     *
     * @param promotion The promotion to be removed.
     */
    public void removePromotion(String promotion) {
        promotions.remove(promotion);
    }

    /**
     * Displays the home page with all the services and promotions.
     */
    public void displayHomePage() {
        System.out.println("Welcome to the Online Laundry Management System!");
        System.out.println("Services:");
        for (String service : services) {
            System.out.println("- " + service);
        }
        System.out.println("Promotions:");
        for (String promotion : promotions) {
            System.out.println("- " + promotion);
        }
    }

    // Usage Example for HomePage

    public static void main(String[] args) {
        HomePage homePage = new HomePage();
        homePage.addService("Wash and Fold");
        homePage.addService("Dry Cleaning");
        homePage.addPromotion("20% off on first order");
        homePage.addPromotion("Free pickup and delivery");
        homePage.displayHomePage();
    }
}