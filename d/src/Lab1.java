import java.io.*;
import java.util.*;
public class Lab1 {
    public static void main(String[] args) throws
            IOException /*отказ от обработки исключения в main()*/ {
//с объектом типа File ассоциируется файл на диске
      File fp = new File( "kz/FileTest.java" );
// другие способы создания объекта
//File fp = new File("\\com\\learn", "FileTest.java");
//File fp=new File("d:\\temp\\demo.txt");
//File fp=new File("demo.txt");
        if(fp.isFile()){//если объект дисковый файл
            System.out.println("Имя файла:\t" + fp.getName());
            System.out.println("Путь к файлу:\t" + fp.getPath());
            System.out.println("Абсолютный путь:\t" + fp.getAbsolutePath());
            System.out.println("Канонический путь:\t" + fp.getCanonicalPath());
            System.out.println("Размер файла:\t" + fp.length());
            System.out.println("Последняя модификация файла:\t" + fp.lastModified());
            System.out.println("Файл доступен для чтения:\t" + fp.canRead());
            System.out.println("Файл доступен для записи:\t" + fp.canWrite());
            System.out.println("Файл удален:\t" + fp.delete()); }
        if(fp.createNewFile()){
            System.out.println("Файл " + fp.getName() + " создан");
        }
        if(fp.exists()){
            System.out.println("temp файл "+ fp.getName() + " существует");
        }
        else
            System.out.println("temp файл " + fp.getName() + " не существует");
//в объект типа File помещается каталог\директория
        File dir = new File( "com\\learn" );
        if (dir.isDirectory())/*если объект объявлен как каталог на диске*/
            System.out.println("Директория!");
        if(dir.exists()){//если каталог существует
            System.out.println( "Dir " + dir.getName() + " существует " );
            File [] files = dir.listFiles();
            System.out.println("");
            for(int i=0; i < files.length; i++){
                Date date = new Date(files[i].lastModified());
                System.out.println(files[i].getPath() + " \t| " + files[i].length() + "\t| " + date.toString());//toLocaleString());//toGMTString())
            }
        }
    }
}