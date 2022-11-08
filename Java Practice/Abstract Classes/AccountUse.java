class AccountUse {
    public static void main(String args[]) {
        SavingsAccount s1 = new SavingsAccount();
        System.out.println(s1.CalculateInterest());
        CurrentAccount c1 = new CurrentAccount();
        System.out.println(c1.CalculateInterest());
    }
}