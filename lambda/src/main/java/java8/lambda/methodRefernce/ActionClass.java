package java8.lambda.methodRefernce;

public class ActionClass {
    public static Integer doActionStatic(Integer val){
        return ((Double) Math.pow(val, 2)).intValue();
    }

    public Integer doAction(Integer val) {
        return ((Double) Math.pow(val, 2)).intValue();
    }
}
