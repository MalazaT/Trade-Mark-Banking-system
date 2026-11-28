package util;

public class AccountGenerator {
    private static final int BASE_ACCOUNT_NUMBER=20260000;

    private AccountGenerator(){
    }

    public static int generateAccountNumber(int accountId){
        return BASE_ACCOUNT_NUMBER+accountId;
    }
}
