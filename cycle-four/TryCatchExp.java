class TryCatchExp {
    public static void checkNum(int num) throws ArithmeticException{
        if(num == 0)
            throw new ArithmeticException("Number is zero");
    }
    public static void main(String args[]) {
        try {
            System.out.println("Try Block");
            checkNum(0);
        }
        catch (Exception e) {
            System.out.println("Catch Block Exception: " + e);
        }
        finally {
            System.out.println("Finally Block");
        }
        System.out.println("rest of the code...");
    }
}