public class A_CharAndString {
    /**
     * <p>Returns a string that contains the character sequence</p>
     *
     * @param chArr given array of character
     * @return a string instance of given character array
     */
    public static String chArrToString(char[] chArr) {
        String str = "";
        for (char i : chArr) {
            str += i;
        }
        return str;
    }

    /**
     * <p>Returns the ascii code of the specified character</p>
     *
     * @param ch given character
     * @return the ascii code of the given character
     */
    public static int asciiCode(char ch) {
        int castAscii = (int) ch;
        return castAscii;
    }
}
