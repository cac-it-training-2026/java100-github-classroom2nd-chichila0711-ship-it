package lesson09.challenge01.Nurserry.logic;

public class Nurse {
	private String name;

	public Nurse(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//ここに適切な処理を記述
	public void takeAttendance(NurserySchoolChild[] childs, int num) {
		try {
			System.out.println(childs[num - 1].getName() + "は来ています。");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("その番号の園児は出席してません。");

		}
	}

}
