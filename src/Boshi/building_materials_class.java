package Boshi;
import java.util.Scanner;
import Qurilish_mollari.*;

public class building_materials_class implements building_materials {
    static Scanner scannerForNumber = new Scanner(System.in);
    static Scanner scannerForString = new Scanner(System.in);
    @Override
    public void qurilishmollari() {
                int xizmat1 = scannerForNumber.nextInt();
                switch (xizmat1) {
                    case 1: {
                        System.out.println(" 1. Fundament qismi");
                        System.out.println(" 2. Devor kotarish qismi");
                        System.out.println(" 3. Tom qismi");
                        System.out.println(" 4. Fasad qismi");
                        System.out.println(" 5. Santexnik qismi");
                        System.out.println(" 6. Pol qismi");
                        System.out.println(" 7. Malyar qismi");
                        System.out.println(" 8. Deraza va Eshik qismi");
                        System.out.println(" 9. Ortga qaytish");
                        System.out.print("Kerakli bandni kiriting : ");
                        fundament_class fundamentClass=new fundament_class();
                        fundamentClass.Fundament();
                        System.exit(0);
                        break;
                    }
                    case 2:{
                      raising_the_wall_class raisingTheWallClass=new raising_the_wall_class();
                      raisingTheWallClass.devorkotarish();
                      System.exit(0);
                        break;
                    }
                    case 3:{
                        roof_section_class roofSectionClass=new roof_section_class();
                        roofSectionClass.Tomqismi();
                      System.exit(0);
                        break;
                    }
                    case 4:{
                        part_of_the_facade_class partOfTheFacadeClass=new part_of_the_facade_class();
                        partOfTheFacadeClass.Fasadqismi();
                        System.exit(0);
                        break;
                    }
                    case 5:{
                        plumbing_class plumbingClass=new plumbing_class();
                        plumbingClass.Santexnikqismi();
                        System.exit(0);
                        break;
                    }
                    case 6:{
                        floor_class floorClass=new floor_class();
                        floorClass.Polqismi();
                        System.exit(0);
                        break;
                    }
                    case 7:{
                        painter_class painterClass=new painter_class();
                        painterClass.Malyarqismi();
                        System.exit(0);
                        break;
                    }
                    case 8:{
                        window_door windowDoor=new window_door_class();
                        windowDoor.DerazaEshikqismi();
                        System.exit(0);
                        break;
                    }
                    case 9:{
                        back_class1 backClass1=new back_class1();
                        backClass1.Ortgaqaytish();
                        System.exit(0);
                        break;
                    }
                }
            }

        }

