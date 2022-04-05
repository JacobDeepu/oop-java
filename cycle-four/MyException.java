class NumberZeroException extends Exception{
    public NumberZeroException(String str){
        super(str);
    }
}
public class MyException {
    public static void checkNum(int num) throws NumberZeroException{
        if(num == 0)
            throw new NumberZeroException("Number is zero");
    }
    public static void main(String args[]) {
        try {
            System.out.println("Try Block");
            checkNum(0);
        }
        catch (Exception e) {
            System.out.println("Catch Block Exception: " + e);
        }
    }
}
