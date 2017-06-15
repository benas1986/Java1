package septintaPaskaita;

import com.sun.org.apache.xpath.internal.SourceTree;
import utils.NumberUtils;

import java.util.Scanner;

/**
 * Created by Lina on 2017.06.14.
 */
public class MyMainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numb = 0;
        String vartotojoVardas = "";

        do {
            StringBuilder sb = new StringBuilder();
            sb.append("_____________________________\n")
                    .append("| 1. IVESTI VARTOTOJA        |\n")
                    .append("| 2. IVESTI STUDENTO ADRESA  | \n")
                    .append("| 0. PROGRAMOS PABAIGA       | \n")
                    .append("|____________________________|\n");

            System.out.println(sb.toString());
            System.out.println("IVESKITE SAVO PASIRINKIMA");
            numb = NumberUtils.getCorrectNumber(sc);

            switch (numb) {
                case 1:
                   // System.out.println("IVESTI VARTOTOJA");
                    CreateNewStudent createNewStudent = new CreateNewStudent(sc);
                    createNewStudent.createNewStudent();
                    break;
                case 0:
                    System.out.println("PROGRAMA BAIGIA DARBA");
                    break;
                case 2:
                  //  System.out.println("IRASYTI STUDENTO ADRESA");
                    WriteStudentAddress writeStudentAddress = new WriteStudentAddress(sc);
                    writeStudentAddress.writeStudentAddress();
                    break;
                default:
                    System.out.println("TOKIO MENU PUNKTO NERA");
                    break;
            }
        } while (numb != 0);

    }


}
