import java.io.File;
import java.util.Scanner;

public  class  Test {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Sakura\\IdeaProjects\\CmdShop\\src\\Users.xlsx");
        ReadExcel readExcel = new ReadExcel();
        User users[] = readExcel.readExcel(file);

        System.out.println("请输入用户名");

        Scanner sc = new Scanner(System.in);
        String username = sc.next();//阻塞方法
        System.out.println("你输入的用户名为" + username);

        System.out.println("请输入用密码");
        String password = sc.next();
        System.out.println("你输入的密码为" + password);



        System.out.println(users.length);
        for (User user : users) {
            if (username.equals(user.getUsername()) && password.equals(user.getPassword())){
                System.out.println("登入成功");
            }
        }
    }
}


