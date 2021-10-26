
public class ReverseStringArray {

    public static void main(String[] args) {

        String[] anotherArray = new String[] { "New Yourk", "London", "Paris" };
        MyArray(anotherArray);
        String[] ReverseArr = reversingArray(anotherArray);
        MyArray(ReverseArr);

        reversingArray(anotherArray);

    }

    public static String[] reversingArray(String[] anotherArray) {
        String[] tempArray = new String[anotherArray.length];
        int z = 0;
        for (int i = anotherArray.length; i > 0; i--) {
            tempArray[z] = anotherArray[i - 1];
            z++;
        }
        return tempArray;
    }

    public static void MyArray(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}