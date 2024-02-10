package Boshi;
import Boshi.*;
import java.util.Scanner;

public class menyu_class implements menyu{
    static Scanner scannerForNumber=new Scanner(System.in);
    static Scanner scannerForString=new Scanner(System.in);
    @Override
    public void menyu() {
        int language = 1;
        switch (language) {
            case 1: {
                System.out.println(" 1. Qurilish Mollari");
                System.out.println(" 2. Qurilish Jixozlari");
                System.out.println(" 3. Uy Jixozlari");
                System.out.println(" 4. Maishiy Texnikalar");
                System.out.println(" 5. Suvinerlar");
                System.out.println(" 6. Ortga qaytish");
                System.out.print("Kerakli bandni kiriting : ");
                building_materials_class buildingMaterialsClass=new building_materials_class();
                buildingMaterialsClass.qurilishmollari();
                System.exit(0);
                break;
            }
            case 2:{
                construction_materials_class constructionMaterialsClass=new construction_materials_class();
                constructionMaterialsClass.qurilishjixozlari();
                System.exit(0);
                break;
            }
            case 3:{
                home_materials_class homeMaterialsClass=new home_materials_class();
                homeMaterialsClass.uyjixozlari();
                System.exit(0);
                break;
            }
            case 4:{
                household_appliances_class householdAppliancesClass=new household_appliances_class();
                householdAppliancesClass.maishiytexnikalari();
                System.exit(0);
                break;
            }
            case 5:{
                kitchen_appliances_class kitchenAppliancesClass=new kitchen_appliances_class();
                kitchenAppliancesClass.oshxonajixozlari();
                System.exit(0);
                break;
            }
            case 6:{
                suviners_class suviners_class=new suviners_class();
                suviners_class.suvinerlar();
                System.exit(0);
                break;
            }
            case 7:{
                back_class backClass=new back_class();
                backClass.Ortgaqaytish();
                System.exit(0);
                break;
            }
        }
    }
    }
