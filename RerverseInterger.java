class RerverseInterger {
    /*
     * param number: A 3-digit number.
     * return: Reversed number.
     */
    public int reverseInteger(int number) {

        if(number >= 100 && number < 1000 ){
            // 123
            int digit =  number % 10 ; // 3
            int digit2 = number % 100 / 10; // 2
            int digit3 = number / 100 ; // 1
            int result = digit * 100 + digit2 * 10 + digit3; // 321
            return result;

        }else{

            return -1;
        }
    }
};
