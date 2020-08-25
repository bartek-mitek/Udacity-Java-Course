public class question6 {

    public int findRange(int[] intArray) {

        if (intArray.length == 0){
            return -1;
        }

        int min = intArray[0];
        for ( int i = 1 ; i < intArray.length ; i++) {
            if (intArray[i] < min ) {
                min = intArray[i];
            }
        }

        int max = intArray[0];
        for ( int i = 1 ; i < intArray.length ; i++) {
            if (intArray[i] > min ) {
                max = intArray[i];
            }
        }
        int diff = max - min;
        return diff;

    }

}
