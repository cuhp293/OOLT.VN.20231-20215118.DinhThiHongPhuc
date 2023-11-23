// Example 2.6
import javax.swing.JOptionPane;
import java.lang.Math;

public class equation {

    public void FirstDegree(){
        String strNum1, strNum2;
        String strNotification = "Nghiem duy nhat la : ";
        strNum1 = JOptionPane.showInputDialog(null, "Please input the first number : ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        strNum2 = JOptionPane.showInputDialog(null, "Please input the second number : ", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
        double a = Double.parseDouble(strNum1);
        double b = Double.parseDouble(strNum2);
        if ( a == 0){
            if ( b == 0 )
            JOptionPane.showMessageDialog(null, "Phuong trinh vo so nghiem");
            else 
            JOptionPane.showMessageDialog(null,  "Phuong trinh vo nghiem");
        }
        else {
            strNotification += -1 * b/a;
            JOptionPane.showMessageDialog(null, strNotification, "Phuong trinh bac nhat", JOptionPane.INFORMATION_MESSAGE);

        }
    }

    public void secondDegree(){
        String strNum1, strNum2, strNum3;
        String strNotification = "Nghiem la : ";
        strNum1 = JOptionPane.showInputDialog(null, "Please input the first number : ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        strNum2 = JOptionPane.showInputDialog(null, "Please input the second number : ", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
        strNum3 = JOptionPane.showInputDialog(null, "Please input the third number : ", "Input the third number", JOptionPane.INFORMATION_MESSAGE);

        double a = Double.parseDouble(strNum1);
        double b = Double.parseDouble(strNum2);
        double c = Double.parseDouble(strNum3);
        if ( a == 0 ){
            if ( b == 0){
                if ( c == 0 )
                JOptionPane.showMessageDialog(null, "Phuong trinh vo so nghiem");
                else 
                JOptionPane.showMessageDialog(null,  "Phuong trinh vo nghiem");
                }
                else {
                    strNotification += -1 * c/b;
                    JOptionPane.showMessageDialog(null, strNotification, "Suy bien thanh phuong trinh bac nhat", JOptionPane.INFORMATION_MESSAGE);
                }
        }
        else {
            double delta = b*b - 4*a*c;
            if (delta > 0){
                strNotification += Math.sqrt(-1*b + delta)/(4*a) + " and " + Math.sqrt(-1*b - delta)/(4*a);
                JOptionPane.showMessageDialog(null, strNotification, "Phuong trinh bac hai", JOptionPane.INFORMATION_MESSAGE);
            }
            else if (delta == 0 ){
                strNotification += -1*b/(2*a);
                JOptionPane.showMessageDialog(null, strNotification, "Phuong trinh bac hai", JOptionPane.INFORMATION_MESSAGE);
            }
            else JOptionPane.showMessageDialog(null,  "Phuong trinh vo nghiem");

        }
    }


    public void Linearsystem(){
        String strNum1, strNum2, strNum3, strNum4, strNum5, strNum6;
        String strNotification = "Nghiem la : ";
        strNum1 = JOptionPane.showInputDialog(null, "Please input the first number : ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        strNum2 = JOptionPane.showInputDialog(null, "Please input the second number : ", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
        strNum3 = JOptionPane.showInputDialog(null, "Please input the third number : ", "Input the third number", JOptionPane.INFORMATION_MESSAGE);
        strNum4 = JOptionPane.showInputDialog(null, "Please input the forth number : ", "Input the forth number", JOptionPane.INFORMATION_MESSAGE);
        strNum5 = JOptionPane.showInputDialog(null, "Please input the fifth number : ", "Input the fifth number", JOptionPane.INFORMATION_MESSAGE);
        strNum6 = JOptionPane.showInputDialog(null, "Please input the sixth number : ", "Input the sixth number", JOptionPane.INFORMATION_MESSAGE);
        
        double a11 = Double.parseDouble(strNum1);
        double a12 = Double.parseDouble(strNum2);
        double a21 = Double.parseDouble(strNum3);
        double a22 = Double.parseDouble(strNum4);
        double b1 = Double.parseDouble(strNum5);
        double b2 = Double.parseDouble(strNum6);
        double D = Math.abs(a11*a22 - a12 * a21);
        double D1 = Math.abs(b1*a22 - b1*a12);
        double D2 = Math.abs(b2*a11 - a22*b1);
        // if ( D == 0 ){
        //     if (D1 == 0 || D2 == 0){
        //         JOptionPane.showMessageDialog(null, "Phuong trinh vo so nghiem");
        //     }
        //     else JOptionPane.showMessageDialog(null,  "Phuong trinh vo nghiem");
        // }
        
    }

    public static void main(String[] args){
       
    }
}
