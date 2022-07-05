package Zsgs.Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.Stack;

public class StackImplementation {
    static int level = 0;
    static int previousTable = 0;
    private Stack<Integer> stacklist = new Stack();
    public static void main(String[] args) {
        new StackImplementation().initial();
    }
    void initial() {
        int option;
        stacklist.push(level);
        getUserOption(level, 0);
        do {
            Scanner input = new Scanner(System.in);
            System.out.println();
            System.out.println("Enter your option : ");
            option = input.nextInt();
            if (option == 9) {
                stacklist.pop();
                level--;
                if (stacklist.isEmpty()) {
                    break;
                }
            } else {
                level++;
                stacklist.push(level);
            }
            getUserOption(level, option);
        } while (option != 0);
        System.out.println("Thanks for visiting");

    }
    void getUserOption(int categoryLevel, int options)  {
        Connection con=null;
        java.sql.Statement smt=null;
        ResultSet rs=null;
        try {
            String url = "jdbc:mysql://localhost:3306/zsgs";
            String username = "root";
            String pwd = "Prema@12345";
            con = DriverManager.getConnection(url, username, pwd);
            smt = con.createStatement();


            if (categoryLevel == 0) {
                String query = "select * from level_0";
                rs = smt.executeQuery(query);
                while (rs.next()) {
                    int id = rs.getInt(1);
                    String optionsFromTable = rs.getString(2);
                    System.out.println(id + "." + optionsFromTable);
                }
                System.out.println("0.Exit\n9.Back");

            }
            else if (categoryLevel == 1) {
                if (options != 9)
                    previousTable = options;

                String query = "select * from level_1 where user_Option=" + previousTable;
                rs = smt.executeQuery(query);
                int num=1;
                while (rs.next()) {
                    String optionsFromTable = rs.getString(2);
                    System.out.println(num++ + "." + optionsFromTable);
                }
                System.out.println("0.Exit\n9.Back");
            }
            else if (categoryLevel == 2) {
                String query = "select * from level_2 where user_options=" + options + " and previous_table=" + previousTable;
                rs = smt.executeQuery(query);
                while (rs.next()) {
                    String optionsFromTable = rs.getString(4);
                    System.out.println( optionsFromTable);
                }
                System.out.println("0.Exit\n9.Back");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        finally {
            try {
                con.close();
                smt.close();
                rs.close();
            } catch (SQLException e) {
                System.out.println("Error in closing connection");
            }
        }
    }
}
