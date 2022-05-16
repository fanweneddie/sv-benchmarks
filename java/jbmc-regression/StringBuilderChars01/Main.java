/*
 * Origin of the benchmark:
 *     license: 4-clause BSD (see /java/jbmc-regression/LICENSE)
 *     repo: https://github.com/diffblue/cbmc.git
 *     branch: develop
 *     directory: regression/jbmc-strings/StringBuilderChars01
 * The benchmark was taken from the repo: 24 January 2018
 */
public class Main {
  public static void main(String[] args) {
    StringBuilder buffer = new StringBuilder("DiffBlue Limited");

    assert buffer.toString().equals("DiffBlue Limited");
    assert buffer.charAt(0) != buffer.charAt(4);


    buffer.setCharAt(0, 'H');
    buffer.setCharAt(6, 'T');
    assert buffer.toString().equals("HiffBlTe Limited");

    buffer.reverse();
    String bufferTemp = buffer.toString();
    assert bufferTemp.equals("detimiL eTlBffiH");
  }
}
