package rohitPracctise;

public class StringPatternMatching {


    static String str1 = "ABBBBBCCCCCDDDDDD";

    static String pstr2 = "BC";
    // Creating array of string length
    static char[] chStr1 = str1.toCharArray();

    static char[] chPStr2 = pstr2.toCharArray();


    static int lchStr1 = chStr1.length;

    static int lpchStr2 = chPStr2.length;

    public static void main(String[] args) {
        boolean j_out_flag = false;
        int captureindexPatternFound = 0;
        boolean captureindexPatternFoundFlag = true;
        for (int i = 0; i < lchStr1; i++) {

            for (int j = 0; j < lpchStr2 && (i + j) < lchStr1; j++) {

                if (chStr1[i + j] == chPStr2[j]) {

                    System.out.println("chStr1[i+j]==chPStr2[j]" + "i+j::" + i + "::" + chStr1[i + j] + "::" + "j::" + j + "::" + chPStr2[j]);
                    if (captureindexPatternFoundFlag) {
                        captureindexPatternFound = i;
                        captureindexPatternFoundFlag = false;
                    }
                    if (j == lpchStr2 - 1) {
                        j_out_flag = true;

                    }
                } else {
                    captureindexPatternFoundFlag = true;
                    break;
                }
            }

            if (j_out_flag) {

                System.out.println("pattern found for --> " + pstr2 + " at index - i -> " + captureindexPatternFound);
                break;

            }
        }
        if (!j_out_flag) {
            System.out.println("pattern Not found for" + pstr2);


        }
    }


}
