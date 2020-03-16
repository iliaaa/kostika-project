package java8.lambda.methodRefernce;

public class Sample {
    public static void main(String[] args) {
        System.out.println(test(ActionClass::doActionStatic, 10));

        ActionClass actionClass = new ActionClass();
        System.out.println(test(actionClass::doAction, 4));
    }

    static Integer test(SomeFI action, int a){
        return action.doAction(a);
    }
}
