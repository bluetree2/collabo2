//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        System.out.println("팀원이 작성한 코드");
        System.out.println("Hello World");
        System.out.println("Hello Java");
        System.out.println("Hello React");
        System.out.println("Hello Spring");
        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");

        for (int i = 0; i < 5; i++) {
            System.out.println("random" + Math.random());
        }

    }
}