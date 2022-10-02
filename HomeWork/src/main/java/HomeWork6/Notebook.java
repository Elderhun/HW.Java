package HomeWork6;

import java.util.*;

public class Notebook{

private int RAM, HardDiskCapacity;
private String OS, Color;

    public Notebook(int RAM, int HardDiskCapacity, String OS, String Color) {
        this.RAM = RAM;
        this.HardDiskCapacity = HardDiskCapacity;
        this.OS = OS;
        this.Color = Color;
    }

    public Notebook(int RAM, int HardDiskCapacity) {
        this(RAM, HardDiskCapacity, null, null);
    }

    public Notebook() {

    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getHardDiskCapacity() {
        return HardDiskCapacity;
    }

    public void setHardDiskCapacity(int hardDiskCapacity) {
        HardDiskCapacity = hardDiskCapacity;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notebook notebook = (Notebook) o;
        return RAM == notebook.RAM && HardDiskCapacity == notebook.HardDiskCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(RAM, HardDiskCapacity);
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "RAM=" + RAM +
                ", HardDiskCapacity=" + HardDiskCapacity +
                ", OS='" + OS + '\'' +
                ", Color='" + Color + '\'' +
                '}';
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

          System.out.println( "Выберите критерий:\n" +
                            "1 - ОЗУ\n" +
                            "2 - Объем ЖД\n" +
                            "3 - Операционная система\n" +
                            "4 - Цвет\n" +
                            "5 - Все существующие");



        int ram, hardDiskCapacity;
        String os, color;





        Set<Notebook> set = new HashSet<>();
        set.add(new Notebook(8, 512,"Mac", "Blue"));
        set.add(new Notebook(8, 1024,"Windows", "Green"));
        set.add(new Notebook(4, 256,"Windows", "Yellow"));
        set.add(new Notebook(12, 512,"Linux", "Green"));
        set.add(new Notebook(16, 256,"Mac", "Blue"));
        set.add(new Notebook(32, 1024,"Windows", "Green"));
        set.add(new Notebook(16, 512,"Windows", "Yellow"));
        set.add(new Notebook(4, 128,"Linux", "Green"));



        switch (sc.nextInt()){
            case 1:
                System.out.println("Минимальное - 4, максимальное -  32");
                ram = sc.nextInt();

                for (Notebook n:set) {
                    if(n.getRAM() >= ram) {
                        System.out.println(n);
                    }
                }
                break;
            case 2:
                System.out.println("Минимальное - 128, максимальное - 1024");
                hardDiskCapacity = sc.nextInt();

                for (Notebook n:set) {
                    if (n.getHardDiskCapacity() >= hardDiskCapacity) {
                        System.out.println(n);
                    }
                }
                break;
            case 3:

                System.out.println("Mac, Windows или Linux ?");
                os = sc.next();

                for (Notebook n:set) {
                    if(n.getOS().equals(os)){
                        System.out.println(n);
                    }

                }
                break;
            case 4:
                System.out.println("Цвета: Blue, Green, Yellow");
                color = sc.nextLine();

                for (Notebook n:set) {
                    if(n.getOS().equals(color)){
                        System.out.println(n);
                    }

                }
                break;

            case 5:
                for (Notebook n:set) {
                    System.out.println(n);
                }
            default:
                System.out.println("Есть только 5 команд)");
        }

    }

}
