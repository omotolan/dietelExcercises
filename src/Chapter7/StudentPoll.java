package Chapter7;

public class StudentPoll {
    public static void main(String[] args) {
        int[] studentPoll = {1, 2, 4, 5, 2, 5, 2, 1, 2, 2, 1, 4, 3, 5, 1, 3, 2, 4, 5, 1, 3, 3, 2, 4, 4, 4};
        int[] frequency = new int[6];

        for (int i = 0; i < studentPoll.length; i++) {
            //frequency is taking and counting the values of studentPoll
            frequency[studentPoll[i]]++;

        }
        System.out.println("rating " + " studentPoll");
        for (int i = 0; i < frequency.length; i++) {
            System.out.println(i + " \t\t\t" + frequency[i]);
        }


    }
}
