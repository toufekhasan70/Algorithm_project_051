package algorithm_project;
import Algorithm.MatrixChainMult;
import Algorithm.BFS;
import Algorithm.BellmanFord;
import Algorithm.Kruskals;
import Algorithm.TopologicalSort;
import Algorithm.LCS;
import Algorithm.FloydWarshall;
import Algorithm.DFS;

import java.util.Scanner;
/**
 * @author toufekhasan_051
 */
public class Algorithms_2019_051 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("================ (Algorithm) ===============");
        System.out.println("""
                           01. Data Structure 
                           02. Algorithms""");
        System.out.print("Enter your choice: ");
        int choice = s.nextInt();
        System.out.println("============================================");

        if (choice == 1) {
            boolean t = true;
            while(t){
            System.out.println("================ (Data Structure) ===============");
            System.out.println("""
                               01.Bubble sort
                               02.Insertion sort
                               03.Selection sort
                               04.Merge sort
                               05.Quick sort
                               06.Counting sort
                               07.Radix sort
                               08.Heap sort
                               09.Bin sort
                               10.Shell sort
                               11.Linear search
                               12.Binary search
                               13.Euclidean GCD Algorithm
                               14.Universal hashing
                               15.Stack
                               16.Queue
                               17.Linked List
                               18.Fibonacci Numbers
                               19.Recurrence""");
            System.out.print("Enter your choice: ");
            int c1 = s.nextInt(); // to input

            switch (c1) {
                case 0:
                    t = false;
                    break;
                case 1:
                   
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    
                    break;
                case 7:
                    
                    break;
                case 8:
                    
                    break;
                case 9:
                    break;
                case 10:
                    
                    break;
                case 11:
                    
                    break;
                case 12:
                    
                    break;
                case 13:
                    
                    break;
                case 14:
                    break;
                case 15:
                    
                    break;
                case 16:
                   
                    break;
                case 17:
                    break;
                case 18:
                   
                    break;
                case 19:
                    
                    break;
                default:
                    System.out.println("Invalid input!!! Please enter valid input");
                    break;

            }
            }
        }
        if (choice == 2) {
            System.out.println("================ (Algorithm) ===============");
            System.out.println("""
                               01.Largest common subsequence 
                               02.Optimal Binary Search Tree 
                               03.Matrix chain multiplication 
                               04.Strassens's matrix multiplication 
                               05.BFS 
                               06.DFS 
                               07.DAG 
                               08.Longest increasing subsequence 
                               09.Topological sort 
                               10.Krushkal's algorithm 
                               11.Prim's algorithm 
                               12.Dijkastra's algorithm 
                               13.Bellman ford's algorithm 
                               14.Warshall's algorithm 
                               15.(0,1) Knapsack problem 
                               16.Naive string matching algorithm 
                               17.Rabin krap string matching algorithm 
                               18.Activity selection problem 
                               19.Recurrence 
                               20.Max flow min cut""");
            System.out.print("Enter your choice: ");
            int c1 = s.nextInt();

            switch (c1) {
                case 1:
                   
                    break;
                case 2:
                    
                    break;
                case 3:
                    MatrixChainMult cMult = new MatrixChainMult();
                    cMult.run();
                    
                    break;
                case 4:
                    break;
                case 5:
                  BFS gbfs = new BFS();
                    gbfs.gBFS();
                    break;
                case 6:
                    
                    break;
                case 7:
                    break;
                case 8:
                    
                    break;
                case 9:TopologicalSort tSort = new TopologicalSort(0);
                    tSort.run();
                    
                    break;
                case 10:
                    Kruskals krus = new Kruskals(0,0);
                    krus.run();
                    break;
                case 11:
                 
                    break;
                case 12:
                   
                    break;
                case 13:
                    BellmanFord bFord = new BellmanFord();
                    bFord.run();
                    
                    break;
                case 14:
                    FloydWarshall fWarshall = new FloydWarshall();
                    fWarshall.run();
                    
                    break;
                case 15:
                   
                    break;
                case 16:
               
                    break;
                case 17:
                    break;
                case 18:
                    break;
                case 19:
                    break;
                case 20:
                    break;
                default:
                    break;
            }

        } else {
            System.out.println("Invalid");
        }
    }
    
}
