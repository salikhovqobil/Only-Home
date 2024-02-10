package main_class;
import Boshi.*;
import Qurilish_mollari.*;
public class first implements boshi {
    @Override
    public void hammasi() {
        language_class languageClass=new language_class();
        languageClass.til();
        menyu();
        building_materials_class();
        construction_materials_class();
        home_materials_class();
        household_appliances_class();
        kitchen_appliances_class();
        suviners_class();
        back_class();
        fundament_class();
        raising_the_wall_class();
        roof_section_class();
        part_of_the_facade_class();
        plumbing_class();
        floor_class();
        painter_class();
        window_door_class();
        back_class1();
    }

    @Override
    public void menyu() {
        menyu_class menyuClass=new menyu_class();
        menyuClass.menyu();
    }

    @Override
    public void building_materials_class() {
        building_materials_class buildingMaterialsClass=new building_materials_class();
        buildingMaterialsClass.qurilishmollari();
    }

    @Override
    public void construction_materials_class() {
        construction_materials_class constructionMaterialsClass = new construction_materials_class();
        constructionMaterialsClass.qurilishjixozlari();
    }

    @Override
    public void home_materials_class() {
        home_materials_class homeMaterialsClass=new home_materials_class();
        homeMaterialsClass.uyjixozlari();
    }

    @Override
    public void household_appliances_class() {
        household_appliances_class householdAppliancesClass=new household_appliances_class();
        householdAppliancesClass.maishiytexnikalari();
    }

    @Override
    public void kitchen_appliances_class() {
        kitchen_appliances_class kitchenAppliancesClass=new kitchen_appliances_class();
        kitchenAppliancesClass.oshxonajixozlari();
    }

    @Override
    public void suviners_class() {
        suviners_class suvinerSclass=new suviners_class();
        suvinerSclass.suvinerlar();
    }

    @Override
    public void back_class() {
        back_class backClass=new back_class();
        backClass.Ortgaqaytish();
    }

    @Override
    public void fundament_class() {
        fundament_class fundamentClass=new fundament_class();
        fundamentClass.Fundament();
    }

    @Override
    public void raising_the_wall_class() {
        raising_the_wall_class raisingTheWallClass=new raising_the_wall_class();
        raisingTheWallClass.devorkotarish();
    }

    @Override
    public void roof_section_class() {
        roof_section_class roofSectionClass=new roof_section_class();
        roofSectionClass.Tomqismi();
    }

    @Override
    public void part_of_the_facade_class() {
        part_of_the_facade_class partOfTheFacadeClass=new part_of_the_facade_class();
        partOfTheFacadeClass.Fasadqismi();
    }

    @Override
    public void plumbing_class() {
        plumbing_class plumbingClass=new plumbing_class();
        plumbingClass.Santexnikqismi();
    }

    @Override
    public void floor_class() {
        floor_class floorClass=new floor_class();
        floorClass.Polqismi();
    }

    @Override
    public void painter_class() {
        painter_class painterClass=new painter_class();
        painterClass.Malyarqismi();
    }

    @Override
    public void window_door_class() {
        window_door_class windowDoorClass=new window_door_class();
        windowDoorClass.DerazaEshikqismi();
    }

    @Override
    public void back_class1() {
        back_class1 backClass1=new back_class1();
        backClass1.Ortgaqaytish();
    }

}
