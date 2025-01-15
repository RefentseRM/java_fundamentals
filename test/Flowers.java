import java.util.Scanner;
public class Flowers{
	
	public void printRoses(){
	String flowers = "Roses are red, With thorns sharp and keen, They bloom in the garden, A beautiful scene! \n By Refentje Mkhabela" ;
	System.out.println(flowers);
	}

	public void printMrWH(){
		String shakespeare = "Title: Mr.W.H., the dedicatee \n Author: by Shakespeare \n The identity of Mr. W.H., the only begetter of Shakespeare's Sonnets, is not known for certain. His identity has been the subject of a great amount of speculation: That he was the author's patron, that he was both patron and the faire youth who is addressed in the sonnets, that the faire youth is based on Mr. W.H. in some sonnets but not others, and a number of other ideas. William Herbert, the Earl of Pembroke, is seen as perhaps the most likely identity of Mr. W.H. and the young man. He was the dedicatee of the First Folio. Thorpe would have been unlikely to have addressed a lord as Mr,[15] but there may be an explanation, perhaps that form of address came from the author, who wanted to refer to Herbert at an earlier time—when Herbert was a younger man.[16] There is a later dedication to Herbert in another quarto of verse, Ben Jonson's Epigrammes (1616), in which the text of Jonson's dedication begins, MY LORD, While you cannot change your merit, I dare not change your title …  Jonson's emphasis on Pembroke's title, and his comment, seem to be chiding someone else who had the audacity to use the wrong title, as perhaps is the case in Shakespeare's dedication. ";
		System.out.println(shakespeare);
	}

	public void printGrandchild(){
		String Grandchild = "Title: A Grandchild's Guide to Using Grandpa's Computer \n Author: by Gene Ziegler \n If a packet hits a pocket on a socket on a port,\n And the bus is interrupted as a very last resort,\n And the address of the memory makes your floppy disk abort\n Then the socket packet pocket has an error to report! ";
		System.out.println(Grandchild);
	}
	public void printMenu(){
		System.out.println("1. printRoses:");
		System.out.println("2. printMrWH:");
		System.out.println("3. printGrandchild:");
	}

	public static void main(String [] args){
	Flowers obj = new Flowers();
	Scanner scan = new Scanner(System.in);
	obj.printMenu();
	System.out.println("Choose from the list below: ");
	String getInput = scan.nextLine();

	switch(getInput){
	case "1":
		obj.printRoses();
		break;
	case "2":
		obj.printMrWH();
		break;
	case "3":
	 	obj.printGrandchild();
	 	break;
		default:
			System.out.println("input not found");
		}
	}
}