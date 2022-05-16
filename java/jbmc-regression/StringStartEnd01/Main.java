/*
 * Origin of the benchmark:
 *     license: 4-clause BSD (see /java/jbmc-regression/LICENSE)
 *     repo: https://github.com/diffblue/cbmc.git
 *     branch: develop
 *     directory: regression/jbmc-strings/StringStartEnd01
 * The benchmark was taken from the repo: 24 January 2018
 */
public class Main {
  public static void main() {
    String string = "tested"; 

    assert string.startsWith("te");
    assert string.startsWith("tested");
    assert !string.startsWith("tet");

    assert string.endsWith("ed");
    assert string.endsWith("tested");
    assert !string.endsWith("tet");
  }
}
