public class UserData {

   private enum userNames {
//      Epancha Vitaliy,
       ghlg,
       hgfil,
   }

   private static final String[] loginNames = {
            "Vitalik",
            "Виталик"
    };

    private static final String [] emailNames = {
            "zayath88@gmail.com"
    };

    private static final String [] BranchNames = {
            "KITA ODESSA"
    };

    private static final String [] kenshiNumber = {
            "8020001122"
    };

    private static final String [] passwords = {
            "6179c5cef8",
            "20101988"
    };

    public static String[] getBranchNames() { return BranchNames; }
    public static String[] getEmailNames() { return emailNames; }
    public static String[] getKenshiNumber() { return kenshiNumber; }
    public static String[] getLoginNames() { return loginNames; }
    public static String[] getPasswords() { return passwords; }
    public static String[] getUserNames() { return userNames; }


}

