import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

public class Main{
    public static void main(String[] args) throws Exception{
        Reader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.println("Введите курс доллара в рублях");
        double scale  = Double.parseDouble(bufferedReader.readLine());
        System.out.println("Введите сумму в рублях");
        double summ = Double.parseDouble(bufferedReader.readLine());
        bufferedReader.close();
        System.out.println(String.format("%,.2f", summ/scale));
    }
}