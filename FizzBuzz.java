class FizzBuzz {
    /**
     * param n: As description.
     * return: A list of strings.
     * Given number n. Print number from 1 to n. But:
     * when number is divided by 3, print "fizz".
     * when number is divided by 5, print "buzz".
     * when number is divided by both 3 and 5, print "fizz buzz".
     */
    public ArrayList<String> fizzBuzz(int n) {
        ArrayList<String> results = new ArrayList<String>();
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                results.add("fizz buzz");
            } else if (i % 5 == 0) {
                results.add("buzz");
            } else if (i % 3 == 0) {
                results.add("fizz");
            } else {
                results.add(String.valueOf(i));
            }
        }
        return results;
    }
}
