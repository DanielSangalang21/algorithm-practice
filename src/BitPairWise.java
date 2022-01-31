import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BitPairWise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		performSelectionSort();
		
	}
	public static void performSelectionSort() {
		System.out.println("length of num array");
		int length = readInputInt();
		int numbers[] = new int[length];
		int i = 0;
		System.out.println("Enter numbers to be sorted");
		for (String number : readInput().toString().split(" ")) {
			numbers[i] = Integer.parseInt(number);
			i++;
		}
		
		int temp = 0;
		for (int x = 0; x < numbers.length - 1; x++) {
			int minIndex = x;
			for (int y = x+1; y < numbers.length; y++) {
				if (numbers[minIndex] > numbers[y]){
					minIndex = y;
				}
			}
			temp = numbers[minIndex];
			numbers[minIndex] = numbers[x];
			numbers[x] = temp;
		}
		
		for (int num : numbers) {
			System.out.println(num);
		}
	}
	
	public static void performBubbleSort() {
		System.out.println("length of num array");
		int length = readInputInt();
		int numbers[] = new int[length];
		int i = 0;
		System.out.println("Enter numbers to be sorted");
		for (String number : readInput().toString().split(" ")) {
			numbers[i] = Integer.parseInt(number);
			i++;
		}
		
		int temp = 0;
		for (int x = 0; x < numbers.length; x++) {
			for (int y = 0; y < numbers.length; y++) {
				if (numbers[x] < numbers[y]) {
					temp = numbers[x];
					numbers[x] = numbers[y];
					numbers[y] = temp;
				}
			}
		}

		for (int num : numbers) {
			System.out.println(num);
		}
	}

	public static StringBuilder readInput() {
		StringBuilder sb = new StringBuilder();
		Scanner in = new Scanner(System.in);
		return sb.append(in.nextLine());
	}
	
	public static int readInputInt() {
		Scanner in = new Scanner(System.in);
		return in.nextInt();
	}
	
	public static void doSomething(){	
		List<Student> studs = populateList().stream()
				// .filter(stud -> stud.getId() > 2)
				.sorted(Comparator.comparing(stud -> stud.id)).collect(Collectors.toList());
		studs.forEach(student -> System.out.println(student.getId()));
	}
	public static List<Student> populateList(){
		
		List<Student> studs = new ArrayList<Student>();
		
		studs.add(new Student(3,"Daniel"));
		studs.add(new Student(4,"Leinad"));
		studs.add(new Student(2,"Sangie"));
		studs.add(new Student(1,"Boos"));
	
		return studs;
	}

}

class Student {
	int id;
	String name;
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
