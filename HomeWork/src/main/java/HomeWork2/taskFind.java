package HomeWork2;

import java.io.File;


public class taskFind {
    public static void main(String[] args) {

        String[] pathnames;


        File f = new File("C:\\Users\\Igor\\Desktop\\DZJava\\HomeWork\\src\\main\\java\\HomeWork2\\filesFolder");

        pathnames = f.list();

        for (String pathname : pathnames) {
            System.out.println(pathname);
        }
    }

}
