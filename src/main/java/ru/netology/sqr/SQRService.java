package ru.netology.sqr;

public class SQRService {
    public int calcul(int start,int end){
        int count = 0;
        for(int i=10; i<=99; i++){
            int cvadr=i*i;
            if(cvadr >= start){
                if(cvadr <= end) {
                    count ++;
                }
            }
        }
        return count;
    }
}
