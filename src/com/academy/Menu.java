package com.academy;

public class Menu {
    private static final String LOGIN_MENU =
            "1.Login\n" +
            "2.Register\n" +
            "0.Exit\n";
    private static final String USER_MENU =
            "1.View rooms\n" +
            "2.Book a room\n" +
            "3.Cancel booking\n" +
            "4.View profile\n" +
            "0.Back\n";
    private static final String ADMIN_MENU =
            "1.View all bookings\n" +
            "2.View total income" +
            "3.View total in cancellation fees\n" +
            "4.Add room details\n" +
            "5.Remove room\n" +
            "6.Modify room\n" +
            "0.Back\n";

    public static void showAdminMenu() {
        System.out.println(ADMIN_MENU);
    }

    public static void showLoginMenu() {
        System.out.println(LOGIN_MENU);
    }

    public static void showUserMenu() {
        System.out.println(USER_MENU);
    }
}
