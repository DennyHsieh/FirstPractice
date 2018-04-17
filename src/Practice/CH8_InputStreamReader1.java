package Practice;
import java.io.*;

public class CH8_InputStreamReader1 {
    public static void main(String[] args) {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        String name, gender;
        int age;

        try {
            System.out.print("Your name: ");
            name = br.readLine();
            System.out.print("Your name is "+name);

            System.out.print("\nYour age: ");
            age = Integer.parseInt(br.readLine());
            System.out.print("Your age is "+age);

            System.out.print("\nYour gender: ");
            gender = br.readLine();
            System.out.print("Your gender is "+gender);

        }catch(IOException e) {
            System.out.println(e.toString());
        }catch(Exception e) {
            System.out.println(e.toString());
        }

    }

}
