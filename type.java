import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Scanner;

import javax.swing.*;
public class type {

    public static void main(String[] argv) throws Exception {


        Robot robot = new Robot();


        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter a String: ");
        String n = reader.nextLine();
        Thread.sleep(3 * 1000);
        for(int i = 0;i < n.length();i++)
        {
            if(Character.isUpperCase(n.charAt(i)))
            {
                robot.keyPress (KeyEvent.VK_SHIFT);
            }


            Thread.sleep(10);
            switch(n.charAt(i))
            {
                case '?':
                    System.out.print("Hello");
                    robot.keyPress(KeyEvent.VK_ALT);
                    robot.keyPress(KeyEvent.VK_NUMPAD6);
                    robot.keyPress(KeyEvent.VK_NUMPAD3);
                    robot.keyRelease(KeyEvent.VK_ALT);
                    robot.keyRelease(KeyEvent.VK_NUMPAD6);
                    robot.keyRelease(KeyEvent.VK_NUMPAD3);
                    System.out.print('?');
                    break;
                case ':':
                    robot.keyPress(KeyEvent.VK_ALT);
                    robot.keyPress(KeyEvent.VK_NUMPAD5);
                    robot.keyPress(KeyEvent.VK_NUMPAD8);
                    robot.keyRelease(KeyEvent.VK_ALT);
                    robot.keyRelease(KeyEvent.VK_NUMPAD5);
                    robot.keyRelease(KeyEvent.VK_NUMPAD8);
                    System.out.print(':');
                    break;
                default:
                    int keyCode = KeyEvent.getExtendedKeyCodeForChar(n.charAt(i));
                    robot.keyPress(keyCode);
                    robot.keyRelease(keyCode);
                    System.out.print(n.charAt(i));
            }

            if(Character.isUpperCase(n.charAt(i)))
                {
                    robot.keyRelease (KeyEvent.VK_SHIFT);
            }

        }




    }


} 

   
    
    