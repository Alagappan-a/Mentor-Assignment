package Zsgs.Practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueImplementation {
    private  Queue mainHall = new LinkedList();
    private  Queue waitingHall = new LinkedList();
    private  Scanner input = new Scanner(System.in);
    void start() {
        System.out.print("Enter Total candidates appear for Interview :");
        int totalCandidates = input.nextInt();
        addCandidates(totalCandidates);
        System.out.print("Enter waiting Hall capacity :");
        int capacity = input.nextInt();
        addToWaitingHall(capacity);
        while (waitingHall.size()>0) {
            callInterviewee();
        }
        System.out.println();
        System.out.println("Interview completed for all the candidates");
    }
     void addCandidates(int totalCandidates) {
        for (int i = 1; i <= totalCandidates; i++) {
            mainHall.add(i);
        }
    }
    void addToWaitingHall(int capacity) {
        for (int i = 1; i <= capacity; i++) {
            waitingHall.add(mainHall.poll());
        }
        System.out.println("Total Candidates waiting on main Hall "+mainHall.size());
        System.out.println("Candidates waiting on waiting Hall "+waitingHall);
    }
    void callInterviewee() {
        System.out.println("Interview compeletd for candidate " + waitingHall.remove());
        if (mainHall.peek() != null) {
            waitingHall.add(mainHall.poll());
            System.out.println("candidates on the waiting Hall :" + waitingHall);
        }
    }
    public static void main(String[] args) {
        new QueueImplementation().start();
    }
}

