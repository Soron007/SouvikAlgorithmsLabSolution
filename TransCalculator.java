package services;

public class TransCalculator {
    public static int calcTargetNumberOfTransaction(int[] transactionsArray, int target) {
        int i, sumOfTransactions = 0;

        for (i = 0; i < transactionsArray.length; i++) {
            sumOfTransactions += transactionsArray[i];

            if (sumOfTransactions >= target) {	//the instance when the target is achieved, we return the value
                return i+1;		//array index starts from 0, so adding 1
            }
        }

        return -1;		//solution not possible
    }
}
