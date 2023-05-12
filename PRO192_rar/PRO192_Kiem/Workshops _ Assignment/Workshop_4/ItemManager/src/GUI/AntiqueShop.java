/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author Truc Nguyen
 */
import DTO.Item;
import DTO.Painting;
import DTO.Statue;
import DTO.Vase;

public class AntiqueShop {

	public static void main(String[] args) {
		String[] options = { "Create a Vase", "Create a Statue", "Create a Painting", "Display the item" };
		Item item = null;
		int choice = 0;
		System.out.println(" MENU OF THE ANTIQUESHOP ");
		System.out.println("Choose ops ( 1 - 4 )");
		System.out.println("(Choose op 0 to stop menu)");
		do {
			choice = Menu.getChoice(options);
			switch (choice) {
			case 1:
				item = new Vase();
				((Vase) item).inputVase();
				break;
			case 2:
				item = new Statue();
				((Statue) item).inputStatue();
				break;
			case 3:
				item = new Painting();
				((Painting) item).inputPainting();
				break;
			case 4:
				if (item != null) {
					if (item instanceof Vase)
						((Vase) item).outputVase();
					else if (item instanceof Statue)
						((Statue) item).outputStatue();
					else if (item instanceof Painting)
						((Painting) item).outputPainting();
				} else
					System.out.println(" You need to create an object ");
				break;
			default:
				System.out.println("THANK YOU SO MUCH ");
			}
		} while ((choice >0 ) && (choice <=4 ));
	}
}