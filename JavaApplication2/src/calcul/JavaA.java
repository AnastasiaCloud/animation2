/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcul;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class JavaA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("������� ��������: ");
        System.out.println("1. ��������");
        System.out.println("2. ���������");
        System.out.println("3. ���������");
        System.out.println("4. �������");
        
        Scanner scanner = new Scanner(System.in);
        int operation = scanner.nextInt();
        
        System.out.println("������� ������ �����: ");
        int x = scanner.nextInt();
        System.out.println("������� ������ �����: ");
        int y = scanner.nextInt();
        
        int res = 0;
        
        if(operation == 1)
            res = x+y;
        else if(operation == 2)
            res = x-y;
        else if(operation == 3)
            res = x*y;
        else if(operation == 4)
            res = x/y;
        System.out.println("��������� = "+res);
        
    }
    
}
