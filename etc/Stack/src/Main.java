import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// ���� �迭 ����
		System.out.println("������ ���� �޸��� ���� �Է��Ͻÿ� >> ");
		int num = scan.nextInt();
		Stack[] stackArray = new Stack[num];

		// �޴�
		for (int i = 1; i <= stackArray.length; i++) {

			System.out.print("(" + i + ")�� ���� ");
			if (i % 3 == 0)
				System.out.println();
		}
		System.out.println("������ ������ ��ȣ�� �Է� >> ");
		int n = scan.nextInt();

		// n�� ���� ����

	}

}
