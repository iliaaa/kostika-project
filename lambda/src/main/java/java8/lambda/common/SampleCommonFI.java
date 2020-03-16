package java8.lambda.common;

public class SampleCommonFI {
    public static void main(String[] args) {
        CommonFI<String> doWithStr = (s) -> s + " --- " + s;

        System.out.println(doWithStr.action("SSDD"));
    }
}
