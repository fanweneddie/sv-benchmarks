/*
 * Origin of the benchmark:
 *     license: 4-clause BSD (see /java/jbmc-regression/LICENSE)
 *     repo: https://github.com/diffblue/cbmc.git
 *     branch: develop
 *     directory: regression/jbmc-strings/StringConcatenation01
 * The benchmark was taken from the repo: 24 January 2018
 */
//import org.sosy_lab.sv_benchmarks.Verifier;

public class Main {
  public static void main() {
    String s1 = Verifier.nondetString();
    String s2 = Verifier.nondetString();

    if (s2.equals("hello")) {
	assert s2.equals("hello");
	
	String s3 = s1;
	String concat1 = s1.concat(s2);
	String concat2 = s3.concat("hello");
	assert concat1.equals(concat2);
    }
  }
}
