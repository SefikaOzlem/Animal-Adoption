import java.util.Hashtable;
import java.util.Scanner;

public class Menu {
	static Hashtable<Integer, Queue> list = new Hashtable<Integer, Queue>();
	Scanner sc = new Scanner(System.in);

	public void DeletMembership(int key) throws QueueEmpty {
		System.out.println("What's your name?");
		String name = sc.next();
		System.out.println("What's your surname?");
		String surname = sc.next();
		System.out.println("What is your phone number? \nE.g '05009009090'");
		String phonenumber = sc.next();
		if (list.containsKey(key)) {
			Queue temp = list.get(key);
			Queue temp2 = new Queue();
			if (key == 1) {
				VolunteredVeterinarianType a;
				boolean flag = false;
				while (!temp.isEmpty()) {
					a = (VolunteredVeterinarianType) temp.peek();
					if (a.getName().equalsIgnoreCase(name) && a.getSurname().equalsIgnoreCase(surname)
							&& a.getPhoneNumber().equalsIgnoreCase(phonenumber)) {
						System.out.println(a.getName() + " " + a.getSurname() + " " + a.getPhoneNumber());
						temp.dequeue();
						System.out.println("Deleted SUCCESSFULLY");
						flag = true;
					} else
						temp2.enqueue(temp.dequeue());
				}
				if (flag == false)
					System.out.println("Deletion is UNSUCCESSFUL!!!\nUSER NOT FOUND!!!");
				while (!temp2.isEmpty()) {
					temp.enqueue(temp2.dequeue());
				}
				list.put(1, temp);
			} else if (key == 2) {
				AnimalOwnerType a;
				boolean flag = false;
				while (!temp.isEmpty()) {
					a = (AnimalOwnerType) temp.peek();
					if (a.getName().equalsIgnoreCase(name) && a.getSurname().equalsIgnoreCase(surname)
							&& a.getPhoneNumber().equalsIgnoreCase(phonenumber)) {
						System.out.println(a.getName() + " " + a.getSurname() + " " + a.getPhoneNumber());
						temp.dequeue();
						System.out.println("Deleted SUCCESSFULLY");
						flag = true;
					} else
						temp2.enqueue(temp.dequeue());
				}
				if (flag == false)
					System.out.println("Deletion is UNSUCCESSFUL!!!\nUSER NOT FOUND!!!");
				while (!temp2.isEmpty()) {
					temp.enqueue(temp2.dequeue());
				}
				list.put(2, temp);
			} else if (key == 3) {
				WantsToOwnUsers a;
				Boolean flag = false;
				while (!temp.isEmpty()) {
					a = (WantsToOwnUsers) temp.peek();
					if (a.getName().equalsIgnoreCase(name) && a.getSurname().equalsIgnoreCase(surname)
							&& a.getPhoneNumber().equalsIgnoreCase(phonenumber)) {
						System.out.println(a.getName() + " " + a.getSurname() + " " + a.getPhoneNumber());
						temp.dequeue();
						flag = true;
						System.out.println("Deleted SUCCESSFULLY");
					} else
						temp2.enqueue(temp.dequeue());
				}
				if (flag == false)
					System.out.println("Deletion is UNSUCCESSFUL!!!\nUSER NOT FOUND!!!");
				while (!temp2.isEmpty()) {
					temp.enqueue(temp2.dequeue());
				}
				list.put(3, temp);
			} else if (key == 4) {
				NormalTypeUser a;
				Boolean flag = false;
				while (!temp.isEmpty()) {
					a = (NormalTypeUser) temp.peek();
					if (a.getName().equalsIgnoreCase(name) && a.getSurname().equalsIgnoreCase(surname)
							&& a.getPhoneNumber().equalsIgnoreCase(phonenumber)) {
						System.out.println(a.getName() + " " + a.getSurname() + " " + a.getPhoneNumber());
						temp.dequeue();
						flag = true;
						System.out.println("Deleted SUCCESSFULLY");
					} else
						temp2.enqueue(temp.dequeue());
				}
				if (flag == false)
					System.out.println("Deletion is UNSUCCESSFUL!!!\nUSER NOT FOUND!!!");
				while (!temp2.isEmpty()) {
					temp.enqueue(temp2.dequeue());
				}
				list.put(4, temp);
			} else if (key == 5) {
				KeeperUser a;
				Boolean flag = false;
				while (!temp.isEmpty()) {
					a = (KeeperUser) temp.peek();
					if (a.getName().equalsIgnoreCase(name) && a.getSurname().equalsIgnoreCase(surname)
							&& a.getPhoneNumber().equalsIgnoreCase(phonenumber)) {
						System.out.println(a.getName() + " " + a.getSurname() + " " + a.getPhoneNumber());
						temp.dequeue();
						flag = true;
						System.out.println("Deleted SUCCESSFULLY");
					} else
						temp2.enqueue(temp.dequeue());
				}
				if (flag == false)
					System.out.println("Deletion is UNSUCCESSFUL!!!\nUSER NOT FOUND!!!");
				while (!temp2.isEmpty()) {
					temp.enqueue(temp2.dequeue());
				}
				list.put(5, temp);
			}
		}

	}

	public void Add(int key) {
		System.out.println("What's your name?");
		String name = sc.next();
		System.out.println("What's your surname?");
		String surname = sc.next();
		System.out.println("What's your address?");
		System.out.println("What is your city?");
		String city = sc.next();
		System.out.println("What is your town?");
		String town = sc.next();
		System.out.println("What is your street?");
		String street = sc.next();
		Address ad;
		if (key != 4) {
			System.out.println("What is your door number?");
			int doornum = sc.nextInt();
			System.out.println("What is your flat number?");
			int flatnum = sc.nextInt();
			ad = new Address(city, town, street, doornum, flatnum);
		} else
			ad = new Address(city, town, street);
		System.out.println("What is your phone number?\n E.g '05009009090'");
		String phone = sc.next();
		System.out.println("What is your age?");
		int age = sc.nextInt();
		System.out.println("What is your gender? \n 'm' for male and 'f' for female");
		String gender = sc.next();
		Queue temp;
		if (!list.containsKey(key)) {
			temp = new Queue();
		} else
			temp = list.get(key);

		if (key == 1) {// Veterinarian Type
			System.out.println("What is your mail address? \n E.g info@gmail.com");
			String mail = sc.next();
			System.out.println("What is your working hours? \n E.g 08:30-13:00");
			String workHours = sc.next();
			VolunteredVeterinarianType obj = new VolunteredVeterinarianType(name, surname, ad, phone, age, gender, mail,
					workHours);
			temp.enqueue(obj);
			System.out.println(obj.Name + " " + obj.Surname + " " + obj.PhoneNumber);
			System.out.println("Added SUCCESSFULLY");
			list.put(1, temp);
		} else if (key == 2) {// Animal Owner
			System.out.println("Where the animal is coming from?");
			System.out.println("0 - From a human");
			System.out.println("1 - From a shelter");
			int OwnerType = sc.nextInt();
			System.out.println("How long do you want to give animal away?");
			System.out.println("1 - Permanently");
			System.out.println("2 - For some period of time");
			int period = sc.nextInt();
			System.out.println("What is your animal? \n You can write the kind of your animal E.g 'cat'");
			String typeAn = sc.next();
			AnimalOwnerType obj = new AnimalOwnerType(name, surname, ad, phone, age, gender, typeAn);
			if (period == 2) {
				obj.setFlag(false);
				System.out.println("How many days will you give the animal? \n E.g '5'");
				int days = sc.nextInt();
				obj.setHowManyDays(days);
				System.out.println("How many hours will you give the animal? \n E.g '6'");
				int hours = sc.nextInt();
				obj.setHowManyHours(hours);
			} else
				obj.setFlag(true);
			temp.enqueue(obj);
			System.out.println(obj.Name + " " + obj.Surname + " " + obj.PhoneNumber);
			System.out.println("Added SUCCESSFULLY");
			list.put(2, temp);
		} else if (key == 3) {// WantsToOwn
			System.out.println("What is the animal type?\n You can write the kind of your animal E.g 'cat'");
			String type = sc.next();
			WantsToOwnUsers obj = new WantsToOwnUsers(name, surname, ad, phone, age, gender, type);
			temp.enqueue(obj);
			System.out.println(obj.Name + " " + obj.Surname + " " + obj.PhoneNumber);
			System.out.println("Added SUCCESSFULLY");
			list.put(3, temp);
		} else if (key == 4) {// Normal User
			NormalTypeUser obj = new NormalTypeUser(name, surname, ad, phone, age, gender);
			temp.enqueue(obj);
			System.out.println(obj.Name + " " + obj.Surname + " " + obj.PhoneNumber);
			System.out.println("Added SUCCESSFULLY");
			list.put(4, temp);
		} else {// Keeper User
			System.out.println("What is the animal type?\n You can write the kind of your animal E.g 'cat'");
			String typeAn = sc.next();
			KeeperUser obj = new KeeperUser(name, surname, ad, phone, age, gender, typeAn);
			temp.enqueue(obj);
			System.out.println(obj.Name + " " + obj.Surname + " " + obj.PhoneNumber);
			System.out.println("Added SUCCESSFULLY");
			list.put(5, temp);
		}
	}

	public void Screen() throws QueueEmpty {
		TxtFiles.readtxt();
		int key = 0;
		do {
			try {
				do {
					System.out.println("Which User Type are you?");
					System.out.println("1 - Veterinarian User");
					System.out.println("2 - Animal Owner Type User");
					System.out.println("3 - Wants To Own User");
					System.out.println("4 - Normal Type User");
					System.out.println("5 - Keeper User");
					System.out.println("'-1' - For Exit");
					key = sc.nextInt();
					if (key == -1)
						break;
					if (key < 6 && key > 0)
						break;
				} while (true);
				if (key == 2 || key == 4) {
					System.out.println(" Choose what you want to do?");
					System.out.println("1- Add a new user");
					System.out.println("2- Delete a user");
					int choice = sc.nextInt();
					switch (choice) {
					case 1:
						Add(key);
						break;
					case 2:
						DeletMembership(key);
						break;
					default:
						break;
					}
				} else if (key == -1)
					break;
				else if (key == 1 || key == 3 || key == 5) {
					System.out.println(" Choose what you want to do?");
					System.out.println("1- Add a new user");
					System.out.println("2- Delete a user");
					System.out.println("3- Search for a animals in your location");
					System.out.println("0 - For return to the menu");
					int choice = sc.nextInt();
					switch (choice) {
					case 1:
						Add(key);
						break;
					case 2:
						DeletMembership(key);
						break;
					case 3: {
						System.out.println("What's your name?");
						String name = sc.next();
						System.out.println("What's your surname?");
						String surname = sc.next();
						search(name, surname, key);
						break;
					}
					case 0:
						break;
					default:
						break;
					}
				}
			} catch (Exception e) {
			}
		} while (key < 6 && key > 0 && key != -1);
		TxtFiles.writetxt();

	}

	public void search(String name, String surname, int usertype) throws QueueEmpty {
		if (list.containsKey(usertype)) {
			Queue temp = list.get(usertype);
			Queue temp2 = new Queue();
			if (usertype == 1) {
				Boolean flag = false;
				VolunteredVeterinarianType a;
				while (!temp.isEmpty()) {
					a = (VolunteredVeterinarianType) temp.peek();
					if (a.getName().equalsIgnoreCase(name) && a.getSurname().equalsIgnoreCase(surname)) {
						NormalTypeUser norm;
						Queue temptemp = list.get(4);
						Queue temptemp2 = new Queue();
						while (!temptemp.isEmpty()) {
							norm = (NormalTypeUser) temptemp.peek();
							if ((a.getAddress().getCity().equalsIgnoreCase(norm.getAddress().getCity()))
									&& (a.getAddress().getTown().equalsIgnoreCase(norm.getAddress().getTown()))) {
								System.out.println(norm.Display());
								flag = true;
							}
							temptemp2.enqueue(temptemp.dequeue());
						}
						list.put(4, temptemp2);
					}
					temp2.enqueue(temp.dequeue());
				}
				if (flag == false)
					System.out.println("COULDN'T FOUND NEAR REPORTED ANIMAL");
				list.put(1, temp2);
			} else if (usertype == 3) {
				WantsToOwnUsers a;
				boolean flag1 = false;
				while (!temp.isEmpty()) {
					a = (WantsToOwnUsers) temp.peek();
					if (a.getName().equalsIgnoreCase(name) && a.getSurname().equalsIgnoreCase(surname)) {
						AnimalOwnerType norm;
						Queue temptemp = list.get(2);
						Queue temptemp2 = new Queue();
						while (!temptemp.isEmpty()) {
							norm = (AnimalOwnerType) temptemp.peek();
							if ((a.getAddress().getCity().equalsIgnoreCase(norm.getAddress().getCity()))
									&& (a.getAddress().getTown().equalsIgnoreCase(norm.getAddress().getTown()))) {
								System.out.println(norm.Display());
								flag1 = true;
							}
							temptemp2.enqueue(temptemp.dequeue());
						}
						list.put(2, temptemp2);
					}
					temp2.enqueue(temp.dequeue());
				}
				if (flag1 == false)
					System.out.println("ANIMAL COULD NOT FOUND");
				list.put(3, temp2);
			} else if (usertype == 5) {
				KeeperUser a;
				Boolean flag = false;
				while (!temp.isEmpty()) {
					a = (KeeperUser) temp.peek();
					if (a.getName().equalsIgnoreCase(name) && a.getSurname().equalsIgnoreCase(surname)) {
						AnimalOwnerType norm;
						Queue temptemp = list.get(2);
						Queue temptemp2 = new Queue();
						while (!temptemp.isEmpty()) {
							norm = (AnimalOwnerType) temptemp.peek();
							if ((a.getAddress().getCity().equalsIgnoreCase(norm.getAddress().getCity()))
									&& (a.getAddress().getTown().equalsIgnoreCase(norm.getAddress().getTown()))) {
								System.out.println(norm.Display());
								flag = true;
							}
							temptemp2.enqueue(temptemp.dequeue());
						}
						list.put(2, temptemp2);
					}
					temp2.enqueue(temp.dequeue());
				}
				if (flag == false)
					System.out.println("ANIMAL COULD NOT FOUND");
				list.put(5, temp2);
			}
		}
	}
}
