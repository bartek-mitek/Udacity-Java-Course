public class question3 {

    public int indexOfFirstOccurrence(String[] stringArray, String target) {
        for( int i = 0 ; i < stringArray.length ; i++){
            if (stringArray[i].equals(target)){
                System.out.println("1");
                break;
            } else {
                System.out.println("-1");
            }
        }
    }

}
