class passcheck {
    final int passmark = 35;

    public void checkResult(int marks) {
        if (marks >= passmark)
            System.out.println("PASS AYYAV RAA BUJJI..");
        else
            System.out.println("CHADUVU DANDAGA RAA NEEKU..");
    }

    public static void main(String[] args) {
        passcheck p = new passcheck();
        p.checkResult(36);
    }
}
