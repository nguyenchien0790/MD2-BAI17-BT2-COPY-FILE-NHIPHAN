package reikkei.academy;

public class Main {
    public static void main(String[] args) {
        String path1 = "D:\\java\\GIT\\MODULE 2\\W4\\L17\\copyFileAndCountByte\\source.txt";
        String path2 = "D:\\java\\GIT\\MODULE 2\\W4\\L17\\copyFileAndCountByte\\target.txt";

        ConfigReadAndWrite.read(path1);
        ConfigReadAndWrite.write(path2,ConfigReadAndWrite.read(path1));
        System.out.println(ConfigReadAndWrite.cnt);
        System.out.println(ConfigReadAndWrite.read(path1));
    }
}
