package Qurilish_mollari;
import Boshi.*;
import main_class.*;

import java.util.Scanner;

public class fundament_class implements fundament {
    static Scanner scannerForNumber = new Scanner(System.in);
    static Scanner scannerForString = new Scanner(System.in);

    @Override
    public void Fundament() {
        int xizmat1 = scannerForNumber.nextInt();
        switch (xizmat1) {
            case 1: {
                System.out.println(" 1.Sement \n 2.Qum \n 3.Sheben \n 4.Tosh \n 5.Taxta \n 6.Suv");
                System.out.print("Kerakli bandni kiriting : ");
                int xizmat2 = scannerForNumber.nextInt();
                switch (xizmat2) {
                    case 1: {
                        System.out.println(" 1.50 kg \n 2.25 kg \n 3.Ortga qaytish");
                        System.out.print("Kerakli bandni kiriting : ");
                        int xizmat3 = scannerForNumber.nextInt();
                        switch (xizmat3) {
                            case 1: {
                                System.out.println(" 1.Ozbekiston sifati \n 2.Turkiya sifat");
                                System.out.print("Kerakli bandni kiriting : ");
                                int xizmat4 = scannerForNumber.nextInt();
                                switch (xizmat4) {
                                    case 1: {
                                        System.out.println(" 1.General purpose \n 2.Turon \n 3.Oxangaron cement \n 4.Knauf \n 5.Qorasaroy");
                                        System.out.print("Kerakli bandni kiriting : ");
                                        int xizmat5 = scannerForNumber.nextInt();
                                        switch (xizmat5) {
                                            case 1: {
                                                System.out.println(" 1.NormoCem 400 cement \n 2.ExtraCem 500 cement \n 3.DecoCem 600 white cement");
                                                System.out.print("Kerakli bandni kiriting : ");
                                                int xizmat6 = scannerForString.nextInt();
                                                switch (xizmat6) {
                                                    case 1: {
                                                        System.out.println("Mahsulot narxi : 50.000 UZS");
                                                        System.out.print("Qancha miqdorda buyurtma qilmoqchisiz : ");
                                                        int yechibolish = scannerForNumber.nextInt();
                                                        System.out.println("Buyurtmangiz qabul qilindi :) \n 1.Yana mahsulot harid qilish \n 2.Joylashuvni jonatish");
                                                        System.out.print("Kerakli bandni kiriting : ");
                                                        int xizmat7 = scannerForNumber.nextInt();
                                                        switch (xizmat7) {
                                                            case 1: {
                                                                engboshi();
                                                                break;
                                                            }
                                                            case 2: {
                                                                System.out.println(" 1.Mening joylashuvlarim tarixi \n 2.Joylashuv nuqtasini jonatish");
                                                                System.out.print("Kerakli bandni kiriting : ");
                                                                int xizmat8 = scannerForNumber.nextInt();
                                                                switch (xizmat8) {
                                                                    case 1: {
                                                                        System.out.println(" 1.OLmazor tumani Qamarniso kochasi \n 2.Sergeli tumani PDP School");
                                                                        System.out.print("Joylashuvni tanlang : ");
                                                                        int joylashuv = scannerForNumber.nextInt();
                                                                        switch (joylashuv) {
                                                                            case 1: {
                                                                                System.out.println(" Yolg'on chaqiruv bo'lsa davlat tomonidan berilgan har qanday jazo turiga roziman \n 1.Ha \n 2.Yo'q");
                                                                                System.out.print("Kerakli bandni kiriting : ");
                                                                                int chaqiruv = scannerForNumber.nextInt();
                                                                                switch (chaqiruv) {
                                                                                    case 1: {
                                                                                        System.out.println("Buyurmangiz to'laqonli qabul qilindi :)");
                                                                                        System.out.println("Siz tolashingiz kerak bolgan summa : " + ((yechibolish * 50000) + 0));
                                                                                        System.out.println(" 1.Naqd pul orqali to'lov \n 2.Karta orqali to'lov");
                                                                                        System.out.print("To'lov turini tanlang : ");
                                                                                        int tolov = scannerForNumber.nextInt();
                                                                                        switch (tolov) {
                                                                                            case 1: {
                                                                                                System.out.println("Biroz kuting :)");
                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                break;
                                                                                            }
                                                                                            case 2: {
                                                                                                System.out.println(" 1.Smart Card \n 2.Payme \n 3.Click");
                                                                                                int karta = scannerForNumber.nextInt();
                                                                                                switch (karta) {
                                                                                                    case 1: {
                                                                                                        System.out.println("Agarda sizda Smart Card ilovasi orqali tolov qilsangiz sizga 2% keshbek bonus boladi va sizda bu ilova bolsa manashu:12345 kalit sozini kiriting va avtomatik tarzda tolov qiling :) ");
                                                                                                        System.out.println("Biroz kuting :)");
                                                                                                        System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 2% keshbekka ega boldingiz :)");
                                                                                                        System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                        System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                        break;
                                                                                                    }
                                                                                                    case 2: {
                                                                                                        System.out.println(" 1.UzCard \n 2.Humo Card");
                                                                                                        System.out.print("Karta turini talang :");
                                                                                                        int tur = scannerForNumber.nextInt();
                                                                                                        switch (tur) {
                                                                                                            case 1: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                            case 2: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                            case 3: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 2% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                        }
                                                                                                        break;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    }
                                                                                    case 2: {
                                                                                        System.out.println("Afsusdaman siz buyurtma bera olmaysiz :(");
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            }
                                                                            case 2: {
                                                                                        System.out.println(" Yolg'on chaqiruv bo'lsa davlat tomonidan berilgan har qanday jazo turiga roziman \n 1.Ha \n 2.Yo'q");
                                                                                        System.out.print("Kerakli bandni kiriting : ");
                                                                                        int chaqiruv = scannerForNumber.nextInt();
                                                                                        switch (chaqiruv) {
                                                                                            case 1: {
                                                                                                System.out.println("Buyurmangiz to'laqonli qabul qilindi :)");
                                                                                                System.out.println("Siz tolashingiz kerak bolgan summa :" + ((yechibolish * 300000) + 10000));
                                                                                                System.out.println(" 1.Naqd pul orqali to'lov \n 2.Karta orqali to'lov");
                                                                                                System.out.println("To'lov turini tanlang : ");
                                                                                                int tolov = scannerForNumber.nextInt();
                                                                                                switch (tolov) {
                                                                                                    case 1: {
                                                                                                        System.out.println("Biroz kuting :)");
                                                                                                        System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                        System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                        System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                        break;
                                                                                                    }
                                                                                                    case 2: {
                                                                                                        System.out.println(" 1.Smart Card \n 2.Payme \n 3.Click");
                                                                                                        int karta = scannerForNumber.nextInt();
                                                                                                        switch (karta) {
                                                                                                            case 1: {
                                                                                                                System.out.println("Agarda sizda Smart Card ilovasi orqali tolov qilsangiz sizga 2% keshbek bonus boladi va sizda bu ilova bolsa manashu:12345 kalit sozini kiriting va avtomatik tarzda tolov qiling :) ");
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 2% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                                break;
                                                                                                            }
                                                                                                            case 2: {
                                                                                                                System.out.println(" 1.UzCard \n 2.Humo Card");
                                                                                                                System.out.print("Karta turini talang :");
                                                                                                                int tur = scannerForNumber.nextInt();
                                                                                                                switch (tur) {
                                                                                                                    case 1: {
                                                                                                                        System.out.println("Biroz kuting :)");
                                                                                                                        System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                                        System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                        System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                                    }
                                                                                                                    case 2: {
                                                                                                                        System.out.println("Biroz kuting :)");
                                                                                                                        System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                                        System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                        System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                                    }
                                                                                                                    case 3: {
                                                                                                                        System.out.println("Biroz kuting :)");
                                                                                                                        System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 2% keshbekka ega boldingiz :)");
                                                                                                                        System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                        System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                                    }
                                                                                                                }
                                                                                                                break;
                                                                                                            }
                                                                                                        }
                                                                                                        break;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            }
                                                                                            case 2: {
                                                                                                System.out.println("Afsusdaman siz buyurtma bera olmaysiz :(");
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        break;
                                                    }
                                                    case 2: {
                                                        System.out.println("Mahsulot narxi : 340.000 UZS");
                                                        System.out.println("Yetkazib berish haqqi 10.000 UZS");
                                                        System.out.print("Qancha miqdorda buyurtma qilmoqchisiz : ");
                                                        int yechibolish = scannerForNumber.nextInt();
                                                        System.out.println("Buyurtmangiz qabul qilindi :) \n 1.Yana mahsulot harid qilish \n 2.Joylashuvni jonatish");
                                                        System.out.print("Kerakli bandni kiriting : ");
                                                        int xizmat7 = scannerForNumber.nextInt();
                                                        switch (xizmat7) {
                                                            case 1: {
                                                                engboshi();
                                                                break;
                                                            }
                                                            case 2: {
                                                                System.out.println(" 1.Mening joylashuvlarim tarixi \n 2.Joylashuv nuqtasini jonatish");
                                                                System.out.print("Kerakli bandni kiriting : ");
                                                                int xizmat8 = scannerForNumber.nextInt();
                                                                switch (xizmat8) {
                                                                    case 1: {
                                                                        System.out.println(" 1.OLmazor tumani Qamarniso kochasi \n 2.Sergeli tumani PDP School");
                                                                        System.out.print("Joylashuvni tanlang : ");
                                                                        int joylashuv = scannerForNumber.nextInt();
                                                                        switch (joylashuv) {
                                                                            case 1: {
                                                                                System.out.println(" Yolg'on chaqiruv bo'lsa davlat tomonidan berilgan har qanday jazo turiga roziman \n 1.Ha \n 2.Yo'q");
                                                                                System.out.print("Kerakli bandni kiriting : ");
                                                                                int chaqiruv = scannerForNumber.nextInt();
                                                                                switch (chaqiruv) {
                                                                                    case 1: {
                                                                                        System.out.println("Buyurmangiz to'laqonli qabul qilindi :)");
                                                                                        System.out.println("Siz tolashingiz kerak bolgan summa : " + ((yechibolish * 300000) + 10000));
                                                                                        System.out.println(" 1.Naqd pul orqali to'lov \n 2.Karta orqali to'lov");
                                                                                        System.out.print("To'lov turini tanlang : ");
                                                                                        int tolov = scannerForNumber.nextInt();
                                                                                        switch (tolov) {
                                                                                            case 1: {
                                                                                                System.out.println("Biroz kuting :)");
                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                break;
                                                                                            }
                                                                                            case 2: {
                                                                                                System.out.println(" 1.Smart Card \n 2.Payme \n 3.Click");
                                                                                                int karta = scannerForNumber.nextInt();
                                                                                                switch (karta) {
                                                                                                    case 1: {
                                                                                                        System.out.println("Agarda sizda Smart Card ilovasi orqali tolov qilsangiz sizga 2% keshbek bonus boladi va sizda bu ilova bolsa manashu:12345 kalit sozini kiriting va avtomatik tarzda tolov qiling :) ");
                                                                                                        System.out.println("Biroz kuting :)");
                                                                                                        System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 2% keshbekka ega boldingiz :)");
                                                                                                        System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                        System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                        break;
                                                                                                    }
                                                                                                    case 2: {
                                                                                                        System.out.println(" 1.UzCard \n 2.Humo Card");
                                                                                                        System.out.print("Karta turini talang :");
                                                                                                        int tur = scannerForNumber.nextInt();
                                                                                                        switch (tur) {
                                                                                                            case 1: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                            case 2: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                            case 3: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 2% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                        }
                                                                                                        break;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    }
                                                                                    case 2: {
                                                                                        System.out.println("Afsusdaman siz buyurtma bera olmaysiz :(");
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            }
                                                                            case 2: {
                                                                                System.out.println(" Yolg'on chaqiruv bo'lsa davlat tomonidan berilgan har qanday jazo turiga roziman \n 1.Ha \n 2.Yo'q");
                                                                                System.out.print("Kerakli bandni kiriting : ");
                                                                                int chaqiruv = scannerForNumber.nextInt();
                                                                                switch (chaqiruv) {
                                                                                    case 1: {
                                                                                        System.out.println("Buyurmangiz to'laqonli qabul qilindi :)");
                                                                                        System.out.println("Siz tolashingiz kerak bolgan summa :" + ((yechibolish * 300000) + 10000));
                                                                                        System.out.println(" 1.Naqd pul orqali to'lov \n 2.Karta orqali to'lov");
                                                                                        System.out.println("To'lov turini tanlang : ");
                                                                                        int tolov = scannerForNumber.nextInt();
                                                                                        switch (tolov) {
                                                                                            case 1: {
                                                                                                System.out.println("Biroz kuting :)");
                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                break;
                                                                                            }
                                                                                            case 2: {
                                                                                                System.out.println(" 1.Smart Card \n 2.Payme \n 3.Click");
                                                                                                int karta = scannerForNumber.nextInt();
                                                                                                switch (karta) {
                                                                                                    case 1: {
                                                                                                        System.out.println("Agarda sizda Smart Card ilovasi orqali tolov qilsangiz sizga 2% keshbek bonus boladi va sizda bu ilova bolsa manashu:12345 kalit sozini kiriting va avtomatik tarzda tolov qiling :) ");
                                                                                                        System.out.println("Biroz kuting :)");
                                                                                                        System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 2% keshbekka ega boldingiz :)");
                                                                                                        System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                        System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                        break;
                                                                                                    }
                                                                                                    case 2: {
                                                                                                        System.out.println(" 1.UzCard \n 2.Humo Card");
                                                                                                        System.out.print("Karta turini talang :");
                                                                                                        int tur = scannerForNumber.nextInt();
                                                                                                        switch (tur) {
                                                                                                            case 1: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                            case 2: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                            case 3: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 2% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                        }
                                                                                                        break;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    }
                                                                                    case 2: {
                                                                                        System.out.println("Afsusdaman siz buyurtma bera olmaysiz :(");
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        break;
                                                    }
                                                    case 3: {
                                                        System.out.println("Mahsulot narxi : 390.000 UZS");
                                                        System.out.println("Yetkazib berish haqqi 10.000 UZS");
                                                        System.out.print("Qancha miqdorda buyurtma qilmoqchisiz : ");
                                                        int yechibolish = scannerForNumber.nextInt();
                                                        System.out.println("Buyurtmangiz qabul qilindi :) \n 1.Yana mahsulot harid qilish \n 2.Joylashuvni jonatish");
                                                        System.out.print("Kerakli bandni kiriting : ");
                                                        int xizmat7 = scannerForNumber.nextInt();
                                                        switch (xizmat7) {
                                                            case 1: {
                                                                engboshi();
                                                                break;
                                                            }
                                                            case 2: {
                                                                System.out.println(" 1.Mening joylashuvlarim tarixi \n 2.Joylashuv nuqtasini jonatish");
                                                                System.out.print("Kerakli bandni kiriting : ");
                                                                int xizmat8 = scannerForNumber.nextInt();
                                                                switch (xizmat8) {
                                                                    case 1: {
                                                                        System.out.println(" 1.OLmazor tumani Qamarniso kochasi \n 2.Sergeli tumani PDP School");
                                                                        System.out.print("Joylashuvni tanlang : ");
                                                                        int joylashuv = scannerForNumber.nextInt();
                                                                        switch (joylashuv) {
                                                                            case 1: {
                                                                                System.out.println(" Yolg'on chaqiruv bo'lsa davlat tomonidan berilgan har qanday jazo turiga roziman \n 1.Ha \n 2.Yo'q");
                                                                                System.out.print("Kerakli bandni kiriting : ");
                                                                                int chaqiruv = scannerForNumber.nextInt();
                                                                                switch (chaqiruv) {
                                                                                    case 1: {
                                                                                        System.out.println("Buyurmangiz to'laqonli qabul qilindi :)");
                                                                                        System.out.println("Siz tolashingiz kerak bolgan summa : " + ((yechibolish * 300000) + 10000));
                                                                                        System.out.println(" 1.Naqd pul orqali to'lov \n 2.Karta orqali to'lov");
                                                                                        System.out.print("To'lov turini tanlang : ");
                                                                                        int tolov = scannerForNumber.nextInt();
                                                                                        switch (tolov) {
                                                                                            case 1: {
                                                                                                System.out.println("Biroz kuting :)");
                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                break;
                                                                                            }
                                                                                            case 2: {
                                                                                                System.out.println(" 1.Smart Card \n 2.Payme \n 3.Click");
                                                                                                int karta = scannerForNumber.nextInt();
                                                                                                switch (karta) {
                                                                                                    case 1: {
                                                                                                        System.out.println("Agarda sizda Smart Card ilovasi orqali tolov qilsangiz sizga 2% keshbek bonus boladi va sizda bu ilova bolsa manashu:12345 kalit sozini kiriting va avtomatik tarzda tolov qiling :) ");
                                                                                                        System.out.println("Biroz kuting :)");
                                                                                                        System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 2% keshbekka ega boldingiz :)");
                                                                                                        System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                        System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                        break;
                                                                                                    }
                                                                                                    case 2: {
                                                                                                        System.out.println(" 1.UzCard \n 2.Humo Card");
                                                                                                        System.out.print("Karta turini talang :");
                                                                                                        int tur = scannerForNumber.nextInt();
                                                                                                        switch (tur) {
                                                                                                            case 1: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                            case 2: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                            case 3: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 2% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                        }
                                                                                                        break;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    }
                                                                                    case 2: {
                                                                                        System.out.println("Afsusdaman siz buyurtma bera olmaysiz :(");
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            }
                                                                            case 2: {
                                                                                System.out.println(" Yolg'on chaqiruv bo'lsa davlat tomonidan berilgan har qanday jazo turiga roziman \n 1.Ha \n 2.Yo'q");
                                                                                System.out.print("Kerakli bandni kiriting : ");
                                                                                int chaqiruv = scannerForNumber.nextInt();
                                                                                switch (chaqiruv) {
                                                                                    case 1: {
                                                                                        System.out.println("Buyurmangiz to'laqonli qabul qilindi :)");
                                                                                        System.out.println("Siz tolashingiz kerak bolgan summa :" + ((yechibolish * 300000) + 10000));
                                                                                        System.out.println(" 1.Naqd pul orqali to'lov \n 2.Karta orqali to'lov");
                                                                                        System.out.println("To'lov turini tanlang : ");
                                                                                        int tolov = scannerForNumber.nextInt();
                                                                                        switch (tolov) {
                                                                                            case 1: {
                                                                                                System.out.println("Biroz kuting :)");
                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                break;
                                                                                            }
                                                                                            case 2: {
                                                                                                System.out.println(" 1.Smart Card \n 2.Payme \n 3.Click");
                                                                                                int karta = scannerForNumber.nextInt();
                                                                                                switch (karta) {
                                                                                                    case 1: {
                                                                                                        System.out.println("Agarda sizda Smart Card ilovasi orqali tolov qilsangiz sizga 2% keshbek bonus boladi va sizda bu ilova bolsa manashu:12345 kalit sozini kiriting va avtomatik tarzda tolov qiling :) ");
                                                                                                        System.out.println("Biroz kuting :)");
                                                                                                        System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 2% keshbekka ega boldingiz :)");
                                                                                                        System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                        System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                        break;
                                                                                                    }
                                                                                                    case 2: {
                                                                                                        System.out.println(" 1.UzCard \n 2.Humo Card");
                                                                                                        System.out.print("Karta turini talang :");
                                                                                                        int tur = scannerForNumber.nextInt();
                                                                                                        switch (tur) {
                                                                                                            case 1: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                            case 2: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                            case 3: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 2% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                        }
                                                                                                        break;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    }
                                                                                    case 2: {
                                                                                        System.out.println("Afsusdaman siz buyurtma bera olmaysiz :(");
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        break;
                                                    }
                                                }
                                                break;
                                            }
                                            case 2:{
                                                System.out.println(" 1.NormoCem 400 cement \n 2.ExtraCem 500 cement \n 3.DecoCem 600 white cement");
                                                System.out.print("Kerakli bandni kiriting : ");
                                                int xizmat6 = scannerForString.nextInt();
                                                switch (xizmat6) {
                                                    case 1: {
                                                        System.out.println("Mahsulot narxi : 305.000 UZS");
                                                        System.out.println("Yetkazib berish haqqi 10.000 UZS");
                                                        System.out.print("Qancha miqdorda buyurtma qilmoqchisiz : ");
                                                        int yechibolish = scannerForNumber.nextInt();
                                                        System.out.println("Buyurtmangiz qabul qilindi :) \n 1.Yana mahsulot harid qilish \n 2.Joylashuvni jonatish");
                                                        System.out.print("Kerakli bandni kiriting : ");
                                                        int xizmat7 = scannerForNumber.nextInt();
                                                        switch (xizmat7) {
                                                            case 1: {
                                                                engboshi();
                                                                break;
                                                            }
                                                            case 2: {
                                                                System.out.println(" 1.Mening joylashuvlarim tarixi \n 2.Joylashuv nuqtasini jonatish");
                                                                System.out.print("Kerakli bandni kiriting : ");
                                                                int xizmat8 = scannerForNumber.nextInt();
                                                                switch (xizmat8) {
                                                                    case 1: {
                                                                        System.out.println(" 1.OLmazor tumani Qamarniso kochasi \n 2.Sergeli tumani PDP School");
                                                                        System.out.print("Joylashuvni tanlang : ");
                                                                        int joylashuv = scannerForNumber.nextInt();
                                                                        switch (joylashuv) {
                                                                            case 1: {
                                                                                System.out.println(" Yolg'on chaqiruv bo'lsa davlat tomonidan berilgan har qanday jazo turiga roziman \n 1.Ha \n 2.Yo'q");
                                                                                System.out.print("Kerakli bandni kiriting : ");
                                                                                int chaqiruv = scannerForNumber.nextInt();
                                                                                switch (chaqiruv) {
                                                                                    case 1: {
                                                                                        System.out.println("Buyurmangiz to'laqonli qabul qilindi :)");
                                                                                        System.out.println("Siz tolashingiz kerak bolgan summa : " + ((yechibolish * 300000) + 10000));
                                                                                        System.out.println(" 1.Naqd pul orqali to'lov \n 2.Karta orqali to'lov");
                                                                                        System.out.print("To'lov turini tanlang : ");
                                                                                        int tolov = scannerForNumber.nextInt();
                                                                                        switch (tolov) {
                                                                                            case 1: {
                                                                                                System.out.println("Biroz kuting :)");
                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                break;
                                                                                            }
                                                                                            case 2: {
                                                                                                System.out.println(" 1.Smart Card \n 2.Payme \n 3.Click");
                                                                                                int karta = scannerForNumber.nextInt();
                                                                                                switch (karta) {
                                                                                                    case 1: {
                                                                                                        System.out.println("Agarda sizda Smart Card ilovasi orqali tolov qilsangiz sizga 2% keshbek bonus boladi va sizda bu ilova bolsa manashu:12345 kalit sozini kiriting va avtomatik tarzda tolov qiling :) ");
                                                                                                        System.out.println("Biroz kuting :)");
                                                                                                        System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 2% keshbekka ega boldingiz :)");
                                                                                                        System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                        System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                        break;
                                                                                                    }
                                                                                                    case 2: {
                                                                                                        System.out.println(" 1.UzCard \n 2.Humo Card");
                                                                                                        System.out.print("Karta turini talang :");
                                                                                                        int tur = scannerForNumber.nextInt();
                                                                                                        switch (tur) {
                                                                                                            case 1: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                            case 2: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                            case 3: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 2% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                        }
                                                                                                        break;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    }
                                                                                    case 2: {
                                                                                        System.out.println("Afsusdaman siz buyurtma bera olmaysiz :(");
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            }
                                                                            case 2: {
                                                                                System.out.println(" Yolg'on chaqiruv bo'lsa davlat tomonidan berilgan har qanday jazo turiga roziman \n 1.Ha \n 2.Yo'q");
                                                                                System.out.print("Kerakli bandni kiriting : ");
                                                                                int chaqiruv = scannerForNumber.nextInt();
                                                                                switch (chaqiruv) {
                                                                                    case 1: {
                                                                                        System.out.println("Buyurmangiz to'laqonli qabul qilindi :)");
                                                                                        System.out.println("Siz tolashingiz kerak bolgan summa :" + ((yechibolish * 300000) + 10000));
                                                                                        System.out.println(" 1.Naqd pul orqali to'lov \n 2.Karta orqali to'lov");
                                                                                        System.out.println("To'lov turini tanlang : ");
                                                                                        int tolov = scannerForNumber.nextInt();
                                                                                        switch (tolov) {
                                                                                            case 1: {
                                                                                                System.out.println("Biroz kuting :)");
                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                break;
                                                                                            }
                                                                                            case 2: {
                                                                                                System.out.println(" 1.Smart Card \n 2.Payme \n 3.Click");
                                                                                                int karta = scannerForNumber.nextInt();
                                                                                                switch (karta) {
                                                                                                    case 1: {
                                                                                                        System.out.println("Agarda sizda Smart Card ilovasi orqali tolov qilsangiz sizga 2% keshbek bonus boladi va sizda bu ilova bolsa manashu:12345 kalit sozini kiriting va avtomatik tarzda tolov qiling :) ");
                                                                                                        System.out.println("Biroz kuting :)");
                                                                                                        System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 2% keshbekka ega boldingiz :)");
                                                                                                        System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                        System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                        break;
                                                                                                    }
                                                                                                    case 2: {
                                                                                                        System.out.println(" 1.UzCard \n 2.Humo Card");
                                                                                                        System.out.print("Karta turini talang :");
                                                                                                        int tur = scannerForNumber.nextInt();
                                                                                                        switch (tur) {
                                                                                                            case 1: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                            case 2: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                            case 3: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 2% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                        }
                                                                                                        break;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    }
                                                                                    case 2: {
                                                                                        System.out.println("Afsusdaman siz buyurtma bera olmaysiz :(");
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        break;
                                                    }
                                                    case 2: {
                                                        System.out.println("Mahsulot narxi : 315.000 UZS");
                                                        System.out.println("Yetkazib berish haqqi 10.000 UZS");
                                                        System.out.print("Qancha miqdorda buyurtma qilmoqchisiz : ");
                                                        int yechibolish = scannerForNumber.nextInt();
                                                        System.out.println("Buyurtmangiz qabul qilindi :) \n 1.Yana mahsulot harid qilish \n 2.Joylashuvni jonatish");
                                                        System.out.print("Kerakli bandni kiriting : ");
                                                        int xizmat7 = scannerForNumber.nextInt();
                                                        switch (xizmat7) {
                                                            case 1: {
                                                                engboshi();
                                                                break;
                                                            }
                                                            case 2: {
                                                                System.out.println(" 1.Mening joylashuvlarim tarixi \n 2.Joylashuv nuqtasini jonatish");
                                                                System.out.print("Kerakli bandni kiriting : ");
                                                                int xizmat8 = scannerForNumber.nextInt();
                                                                switch (xizmat8) {
                                                                    case 1: {
                                                                        System.out.println(" 1.OLmazor tumani Qamarniso kochasi \n 2.Sergeli tumani PDP School");
                                                                        System.out.print("Joylashuvni tanlang : ");
                                                                        int joylashuv = scannerForNumber.nextInt();
                                                                        switch (joylashuv) {
                                                                            case 1: {
                                                                                System.out.println(" Yolg'on chaqiruv bo'lsa davlat tomonidan berilgan har qanday jazo turiga roziman \n 1.Ha \n 2.Yo'q");
                                                                                System.out.print("Kerakli bandni kiriting : ");
                                                                                int chaqiruv = scannerForNumber.nextInt();
                                                                                switch (chaqiruv) {
                                                                                    case 1: {
                                                                                        System.out.println("Buyurmangiz to'laqonli qabul qilindi :)");
                                                                                        System.out.println("Siz tolashingiz kerak bolgan summa : " + ((yechibolish * 300000) + 10000));
                                                                                        System.out.println(" 1.Naqd pul orqali to'lov \n 2.Karta orqali to'lov");
                                                                                        System.out.print("To'lov turini tanlang : ");
                                                                                        int tolov = scannerForNumber.nextInt();
                                                                                        switch (tolov) {
                                                                                            case 1: {
                                                                                                System.out.println("Biroz kuting :)");
                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                break;
                                                                                            }
                                                                                            case 2: {
                                                                                                System.out.println(" 1.Smart Card \n 2.Payme \n 3.Click");
                                                                                                int karta = scannerForNumber.nextInt();
                                                                                                switch (karta) {
                                                                                                    case 1: {
                                                                                                        System.out.println("Agarda sizda Smart Card ilovasi orqali tolov qilsangiz sizga 2% keshbek bonus boladi va sizda bu ilova bolsa manashu:12345 kalit sozini kiriting va avtomatik tarzda tolov qiling :) ");
                                                                                                        System.out.println("Biroz kuting :)");
                                                                                                        System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 2% keshbekka ega boldingiz :)");
                                                                                                        System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                        System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                        break;
                                                                                                    }
                                                                                                    case 2: {
                                                                                                        System.out.println(" 1.UzCard \n 2.Humo Card");
                                                                                                        System.out.print("Karta turini talang :");
                                                                                                        int tur = scannerForNumber.nextInt();
                                                                                                        switch (tur) {
                                                                                                            case 1: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                            case 2: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                            case 3: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 2% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                        }
                                                                                                        break;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    }
                                                                                    case 2: {
                                                                                        System.out.println("Afsusdaman siz buyurtma bera olmaysiz :(");
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            }
                                                                            case 2: {
                                                                                System.out.println(" Yolg'on chaqiruv bo'lsa davlat tomonidan berilgan har qanday jazo turiga roziman \n 1.Ha \n 2.Yo'q");
                                                                                System.out.print("Kerakli bandni kiriting : ");
                                                                                int chaqiruv = scannerForNumber.nextInt();
                                                                                switch (chaqiruv) {
                                                                                    case 1: {
                                                                                        System.out.println("Buyurmangiz to'laqonli qabul qilindi :)");
                                                                                        System.out.println("Siz tolashingiz kerak bolgan summa :" + ((yechibolish * 300000) + 10000));
                                                                                        System.out.println(" 1.Naqd pul orqali to'lov \n 2.Karta orqali to'lov");
                                                                                        System.out.println("To'lov turini tanlang : ");
                                                                                        int tolov = scannerForNumber.nextInt();
                                                                                        switch (tolov) {
                                                                                            case 1: {
                                                                                                System.out.println("Biroz kuting :)");
                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                break;
                                                                                            }
                                                                                            case 2: {
                                                                                                System.out.println(" 1.Smart Card \n 2.Payme \n 3.Click");
                                                                                                int karta = scannerForNumber.nextInt();
                                                                                                switch (karta) {
                                                                                                    case 1: {
                                                                                                        System.out.println("Agarda sizda Smart Card ilovasi orqali tolov qilsangiz sizga 2% keshbek bonus boladi va sizda bu ilova bolsa manashu:12345 kalit sozini kiriting va avtomatik tarzda tolov qiling :) ");
                                                                                                        System.out.println("Biroz kuting :)");
                                                                                                        System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 2% keshbekka ega boldingiz :)");
                                                                                                        System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                        System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                        break;
                                                                                                    }
                                                                                                    case 2: {
                                                                                                        System.out.println(" 1.UzCard \n 2.Humo Card");
                                                                                                        System.out.print("Karta turini talang :");
                                                                                                        int tur = scannerForNumber.nextInt();
                                                                                                        switch (tur) {
                                                                                                            case 1: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                            case 2: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                            case 3: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 2% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                        }
                                                                                                        break;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    }
                                                                                    case 2: {
                                                                                        System.out.println("Afsusdaman siz buyurtma bera olmaysiz :(");
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        break;
                                                    }
                                                    case 3: {
                                                        System.out.println("Mahsulot narxi : 325.000 UZS");
                                                        System.out.println("Yetkazib berish haqqi 10.000 UZS");
                                                        System.out.print("Qancha miqdorda buyurtma qilmoqchisiz : ");
                                                        int yechibolish = scannerForNumber.nextInt();
                                                        System.out.println("Buyurtmangiz qabul qilindi :) \n 1.Yana mahsulot harid qilish \n 2.Joylashuvni jonatish");
                                                        System.out.print("Kerakli bandni kiriting : ");
                                                        int xizmat7 = scannerForNumber.nextInt();
                                                        switch (xizmat7) {
                                                            case 1: {
                                                                engboshi();
                                                                break;
                                                            }
                                                            case 2: {
                                                                System.out.println(" 1.Mening joylashuvlarim tarixi \n 2.Joylashuv nuqtasini jonatish");
                                                                System.out.print("Kerakli bandni kiriting : ");
                                                                int xizmat8 = scannerForNumber.nextInt();
                                                                switch (xizmat8) {
                                                                    case 1: {
                                                                        System.out.println(" 1.OLmazor tumani Qamarniso kochasi \n 2.Sergeli tumani PDP School");
                                                                        System.out.print("Joylashuvni tanlang : ");
                                                                        int joylashuv = scannerForNumber.nextInt();
                                                                        switch (joylashuv) {
                                                                            case 1: {
                                                                                System.out.println(" Yolg'on chaqiruv bo'lsa davlat tomonidan berilgan har qanday jazo turiga roziman \n 1.Ha \n 2.Yo'q");
                                                                                System.out.print("Kerakli bandni kiriting : ");
                                                                                int chaqiruv = scannerForNumber.nextInt();
                                                                                switch (chaqiruv) {
                                                                                    case 1: {
                                                                                        System.out.println("Buyurmangiz to'laqonli qabul qilindi :)");
                                                                                        System.out.println("Siz tolashingiz kerak bolgan summa : " + ((yechibolish * 300000) + 10000));
                                                                                        System.out.println(" 1.Naqd pul orqali to'lov \n 2.Karta orqali to'lov");
                                                                                        System.out.print("To'lov turini tanlang : ");
                                                                                        int tolov = scannerForNumber.nextInt();
                                                                                        switch (tolov) {
                                                                                            case 1: {
                                                                                                System.out.println("Biroz kuting :)");
                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                break;
                                                                                            }
                                                                                            case 2: {
                                                                                                System.out.println(" 1.Smart Card \n 2.Payme \n 3.Click");
                                                                                                int karta = scannerForNumber.nextInt();
                                                                                                switch (karta) {
                                                                                                    case 1: {
                                                                                                        System.out.println("Agarda sizda Smart Card ilovasi orqali tolov qilsangiz sizga 2% keshbek bonus boladi va sizda bu ilova bolsa manashu:12345 kalit sozini kiriting va avtomatik tarzda tolov qiling :) ");
                                                                                                        System.out.println("Biroz kuting :)");
                                                                                                        System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 2% keshbekka ega boldingiz :)");
                                                                                                        System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                        System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                        break;
                                                                                                    }
                                                                                                    case 2: {
                                                                                                        System.out.println(" 1.UzCard \n 2.Humo Card");
                                                                                                        System.out.print("Karta turini talang :");
                                                                                                        int tur = scannerForNumber.nextInt();
                                                                                                        switch (tur) {
                                                                                                            case 1: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                            case 2: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                            case 3: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 2% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                        }
                                                                                                        break;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    }
                                                                                    case 2: {
                                                                                        System.out.println("Afsusdaman siz buyurtma bera olmaysiz :(");
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            }
                                                                            case 2: {
                                                                                System.out.println(" Yolg'on chaqiruv bo'lsa davlat tomonidan berilgan har qanday jazo turiga roziman \n 1.Ha \n 2.Yo'q");
                                                                                System.out.print("Kerakli bandni kiriting : ");
                                                                                int chaqiruv = scannerForNumber.nextInt();
                                                                                switch (chaqiruv) {
                                                                                    case 1: {
                                                                                        System.out.println("Buyurmangiz to'laqonli qabul qilindi :)");
                                                                                        System.out.println("Siz tolashingiz kerak bolgan summa :" + ((yechibolish * 300000) + 10000));
                                                                                        System.out.println(" 1.Naqd pul orqali to'lov \n 2.Karta orqali to'lov");
                                                                                        System.out.println("To'lov turini tanlang : ");
                                                                                        int tolov = scannerForNumber.nextInt();
                                                                                        switch (tolov) {
                                                                                            case 1: {
                                                                                                System.out.println("Biroz kuting :)");
                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                break;
                                                                                            }
                                                                                            case 2: {
                                                                                                System.out.println(" 1.Smart Card \n 2.Payme \n 3.Click");
                                                                                                int karta = scannerForNumber.nextInt();
                                                                                                switch (karta) {
                                                                                                    case 1: {
                                                                                                        System.out.println("Agarda sizda Smart Card ilovasi orqali tolov qilsangiz sizga 2% keshbek bonus boladi va sizda bu ilova bolsa manashu:12345 kalit sozini kiriting va avtomatik tarzda tolov qiling :) ");
                                                                                                        System.out.println("Biroz kuting :)");
                                                                                                        System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 2% keshbekka ega boldingiz :)");
                                                                                                        System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                        System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                        break;
                                                                                                    }
                                                                                                    case 2: {
                                                                                                        System.out.println(" 1.UzCard \n 2.Humo Card");
                                                                                                        System.out.print("Karta turini talang :");
                                                                                                        int tur = scannerForNumber.nextInt();
                                                                                                        switch (tur) {
                                                                                                            case 1: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                            case 2: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                            case 3: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 2% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                        }
                                                                                                        break;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    }
                                                                                    case 2: {
                                                                                        System.out.println("Afsusdaman siz buyurtma bera olmaysiz :(");
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        break;
                                                    }
                                                }
                                                break;
                                            }
                                            case 3:{
                                                System.out.println(" 1.NormoCem 400 cement \n 2.ExtraCem 500 cement \n 3.DecoCem 600 white cement");
                                                System.out.print("Kerakli bandni kiriting : ");
                                                int xizmat6 = scannerForString.nextInt();
                                                switch (xizmat6) {
                                                    case 1: {
                                                        System.out.println("Mahsulot narxi : 310.000 UZS");
                                                        System.out.println("Yetkazib berish haqqi 10.000 UZS");
                                                        System.out.print("Qancha miqdorda buyurtma qilmoqchisiz : ");
                                                        int yechibolish = scannerForNumber.nextInt();
                                                        System.out.println("Buyurtmangiz qabul qilindi :) \n 1.Yana mahsulot harid qilish \n 2.Joylashuvni jonatish");
                                                        System.out.print("Kerakli bandni kiriting : ");
                                                        int xizmat7 = scannerForNumber.nextInt();
                                                        switch (xizmat7) {
                                                            case 1: {
                                                                engboshi();
                                                                break;
                                                            }
                                                            case 2: {
                                                                System.out.println(" 1.Mening joylashuvlarim tarixi \n 2.Joylashuv nuqtasini jonatish");
                                                                System.out.print("Kerakli bandni kiriting : ");
                                                                int xizmat8 = scannerForNumber.nextInt();
                                                                switch (xizmat8) {
                                                                    case 1: {
                                                                        System.out.println(" 1.OLmazor tumani Qamarniso kochasi \n 2.Sergeli tumani PDP School");
                                                                        System.out.print("Joylashuvni tanlang : ");
                                                                        int joylashuv = scannerForNumber.nextInt();
                                                                        switch (joylashuv) {
                                                                            case 1: {
                                                                                System.out.println(" Yolg'on chaqiruv bo'lsa davlat tomonidan berilgan har qanday jazo turiga roziman \n 1.Ha \n 2.Yo'q");
                                                                                System.out.print("Kerakli bandni kiriting : ");
                                                                                int chaqiruv = scannerForNumber.nextInt();
                                                                                switch (chaqiruv) {
                                                                                    case 1: {
                                                                                        System.out.println("Buyurmangiz to'laqonli qabul qilindi :)");
                                                                                        System.out.println("Siz tolashingiz kerak bolgan summa : " + ((yechibolish * 300000) + 10000));
                                                                                        System.out.println(" 1.Naqd pul orqali to'lov \n 2.Karta orqali to'lov");
                                                                                        System.out.print("To'lov turini tanlang : ");
                                                                                        int tolov = scannerForNumber.nextInt();
                                                                                        switch (tolov) {
                                                                                            case 1: {
                                                                                                System.out.println("Biroz kuting :)");
                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                break;
                                                                                            }
                                                                                            case 2: {
                                                                                                System.out.println(" 1.Smart Card \n 2.Payme \n 3.Click");
                                                                                                int karta = scannerForNumber.nextInt();
                                                                                                switch (karta) {
                                                                                                    case 1: {
                                                                                                        System.out.println("Agarda sizda Smart Card ilovasi orqali tolov qilsangiz sizga 2% keshbek bonus boladi va sizda bu ilova bolsa manashu:12345 kalit sozini kiriting va avtomatik tarzda tolov qiling :) ");
                                                                                                        System.out.println("Biroz kuting :)");
                                                                                                        System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 2% keshbekka ega boldingiz :)");
                                                                                                        System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                        System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                        break;
                                                                                                    }
                                                                                                    case 2: {
                                                                                                        System.out.println(" 1.UzCard \n 2.Humo Card");
                                                                                                        System.out.print("Karta turini talang :");
                                                                                                        int tur = scannerForNumber.nextInt();
                                                                                                        switch (tur) {
                                                                                                            case 1: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                            case 2: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                            case 3: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 2% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                        }
                                                                                                        break;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    }
                                                                                    case 2: {
                                                                                        System.out.println("Afsusdaman siz buyurtma bera olmaysiz :(");
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            }
                                                                            case 2: {
                                                                                System.out.println(" Yolg'on chaqiruv bo'lsa davlat tomonidan berilgan har qanday jazo turiga roziman \n 1.Ha \n 2.Yo'q");
                                                                                System.out.print("Kerakli bandni kiriting : ");
                                                                                int chaqiruv = scannerForNumber.nextInt();
                                                                                switch (chaqiruv) {
                                                                                    case 1: {
                                                                                        System.out.println("Buyurmangiz to'laqonli qabul qilindi :)");
                                                                                        System.out.println("Siz tolashingiz kerak bolgan summa :" + ((yechibolish * 300000) + 10000));
                                                                                        System.out.println(" 1.Naqd pul orqali to'lov \n 2.Karta orqali to'lov");
                                                                                        System.out.println("To'lov turini tanlang : ");
                                                                                        int tolov = scannerForNumber.nextInt();
                                                                                        switch (tolov) {
                                                                                            case 1: {
                                                                                                System.out.println("Biroz kuting :)");
                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                break;
                                                                                            }
                                                                                            case 2: {
                                                                                                System.out.println(" 1.Smart Card \n 2.Payme \n 3.Click");
                                                                                                int karta = scannerForNumber.nextInt();
                                                                                                switch (karta) {
                                                                                                    case 1: {
                                                                                                        System.out.println("Agarda sizda Smart Card ilovasi orqali tolov qilsangiz sizga 2% keshbek bonus boladi va sizda bu ilova bolsa manashu:12345 kalit sozini kiriting va avtomatik tarzda tolov qiling :) ");
                                                                                                        System.out.println("Biroz kuting :)");
                                                                                                        System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 2% keshbekka ega boldingiz :)");
                                                                                                        System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                        System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                        break;
                                                                                                    }
                                                                                                    case 2: {
                                                                                                        System.out.println(" 1.UzCard \n 2.Humo Card");
                                                                                                        System.out.print("Karta turini talang :");
                                                                                                        int tur = scannerForNumber.nextInt();
                                                                                                        switch (tur) {
                                                                                                            case 1: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                            case 2: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                            case 3: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 2% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                        }
                                                                                                        break;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    }
                                                                                    case 2: {
                                                                                        System.out.println("Afsusdaman siz buyurtma bera olmaysiz :(");
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        break;
                                                    }
                                                    case 2: {
                                                        System.out.println("Mahsulot narxi : 320.000 UZS");
                                                        System.out.println("Yetkazib berish haqqi 10.000 UZS");
                                                        System.out.print("Qancha miqdorda buyurtma qilmoqchisiz : ");
                                                        int yechibolish = scannerForNumber.nextInt();
                                                        System.out.println("Buyurtmangiz qabul qilindi :) \n 1.Yana mahsulot harid qilish \n 2.Joylashuvni jonatish");
                                                        System.out.print("Kerakli bandni kiriting : ");
                                                        int xizmat7 = scannerForNumber.nextInt();
                                                        switch (xizmat7) {
                                                            case 1: {
                                                                engboshi();
                                                                break;
                                                            }
                                                            case 2: {
                                                                System.out.println(" 1.Mening joylashuvlarim tarixi \n 2.Joylashuv nuqtasini jonatish");
                                                                System.out.print("Kerakli bandni kiriting : ");
                                                                int xizmat8 = scannerForNumber.nextInt();
                                                                switch (xizmat8) {
                                                                    case 1: {
                                                                        System.out.println(" 1.OLmazor tumani Qamarniso kochasi \n 2.Sergeli tumani PDP School");
                                                                        System.out.print("Joylashuvni tanlang : ");
                                                                        int joylashuv = scannerForNumber.nextInt();
                                                                        switch (joylashuv) {
                                                                            case 1: {
                                                                                System.out.println(" Yolg'on chaqiruv bo'lsa davlat tomonidan berilgan har qanday jazo turiga roziman \n 1.Ha \n 2.Yo'q");
                                                                                System.out.print("Kerakli bandni kiriting : ");
                                                                                int chaqiruv = scannerForNumber.nextInt();
                                                                                switch (chaqiruv) {
                                                                                    case 1: {
                                                                                        System.out.println("Buyurmangiz to'laqonli qabul qilindi :)");
                                                                                        System.out.println("Siz tolashingiz kerak bolgan summa : " + ((yechibolish * 300000) + 10000));
                                                                                        System.out.println(" 1.Naqd pul orqali to'lov \n 2.Karta orqali to'lov");
                                                                                        System.out.print("To'lov turini tanlang : ");
                                                                                        int tolov = scannerForNumber.nextInt();
                                                                                        switch (tolov) {
                                                                                            case 1: {
                                                                                                System.out.println("Biroz kuting :)");
                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                break;
                                                                                            }
                                                                                            case 2: {
                                                                                                System.out.println(" 1.Smart Card \n 2.Payme \n 3.Click");
                                                                                                int karta = scannerForNumber.nextInt();
                                                                                                switch (karta) {
                                                                                                    case 1: {
                                                                                                        System.out.println("Agarda sizda Smart Card ilovasi orqali tolov qilsangiz sizga 2% keshbek bonus boladi va sizda bu ilova bolsa manashu:12345 kalit sozini kiriting va avtomatik tarzda tolov qiling :) ");
                                                                                                        System.out.println("Biroz kuting :)");
                                                                                                        System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 2% keshbekka ega boldingiz :)");
                                                                                                        System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                        System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                        break;
                                                                                                    }
                                                                                                    case 2: {
                                                                                                        System.out.println(" 1.UzCard \n 2.Humo Card");
                                                                                                        System.out.print("Karta turini talang :");
                                                                                                        int tur = scannerForNumber.nextInt();
                                                                                                        switch (tur) {
                                                                                                            case 1: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                            case 2: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                            case 3: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 2% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                        }
                                                                                                        break;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    }
                                                                                    case 2: {
                                                                                        System.out.println("Afsusdaman siz buyurtma bera olmaysiz :(");
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            }
                                                                            case 2: {
                                                                                System.out.println(" Yolg'on chaqiruv bo'lsa davlat tomonidan berilgan har qanday jazo turiga roziman \n 1.Ha \n 2.Yo'q");
                                                                                System.out.print("Kerakli bandni kiriting : ");
                                                                                int chaqiruv = scannerForNumber.nextInt();
                                                                                switch (chaqiruv) {
                                                                                    case 1: {
                                                                                        System.out.println("Buyurmangiz to'laqonli qabul qilindi :)");
                                                                                        System.out.println("Siz tolashingiz kerak bolgan summa :" + ((yechibolish * 300000) + 10000));
                                                                                        System.out.println(" 1.Naqd pul orqali to'lov \n 2.Karta orqali to'lov");
                                                                                        System.out.println("To'lov turini tanlang : ");
                                                                                        int tolov = scannerForNumber.nextInt();
                                                                                        switch (tolov) {
                                                                                            case 1: {
                                                                                                System.out.println("Biroz kuting :)");
                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                break;
                                                                                            }
                                                                                            case 2: {
                                                                                                System.out.println(" 1.Smart Card \n 2.Payme \n 3.Click");
                                                                                                int karta = scannerForNumber.nextInt();
                                                                                                switch (karta) {
                                                                                                    case 1: {
                                                                                                        System.out.println("Agarda sizda Smart Card ilovasi orqali tolov qilsangiz sizga 2% keshbek bonus boladi va sizda bu ilova bolsa manashu:12345 kalit sozini kiriting va avtomatik tarzda tolov qiling :) ");
                                                                                                        System.out.println("Biroz kuting :)");
                                                                                                        System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 2% keshbekka ega boldingiz :)");
                                                                                                        System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                        System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                        break;
                                                                                                    }
                                                                                                    case 2: {
                                                                                                        System.out.println(" 1.UzCard \n 2.Humo Card");
                                                                                                        System.out.print("Karta turini talang :");
                                                                                                        int tur = scannerForNumber.nextInt();
                                                                                                        switch (tur) {
                                                                                                            case 1: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                            case 2: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                            case 3: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 2% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                        }
                                                                                                        break;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    }
                                                                                    case 2: {
                                                                                        System.out.println("Afsusdaman siz buyurtma bera olmaysiz :(");
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        break;
                                                    }
                                                    case 3: {
                                                        System.out.println("Mahsulot narxi : 330.000 UZS");
                                                        System.out.println("Yetkazib berish haqqi 10.000 UZS");
                                                        System.out.print("Qancha miqdorda buyurtma qilmoqchisiz : ");
                                                        int yechibolish = scannerForNumber.nextInt();
                                                        System.out.println("Buyurtmangiz qabul qilindi :) \n 1.Yana mahsulot harid qilish \n 2.Joylashuvni jonatish");
                                                        System.out.print("Kerakli bandni kiriting : ");
                                                        int xizmat7 = scannerForNumber.nextInt();
                                                        switch (xizmat7) {
                                                            case 1: {
                                                                engboshi();
                                                                break;
                                                            }
                                                            case 2: {
                                                                System.out.println(" 1.Mening joylashuvlarim tarixi \n 2.Joylashuv nuqtasini jonatish");
                                                                System.out.print("Kerakli bandni kiriting : ");
                                                                int xizmat8 = scannerForNumber.nextInt();
                                                                switch (xizmat8) {
                                                                    case 1: {
                                                                        System.out.println(" 1.OLmazor tumani Qamarniso kochasi \n 2.Sergeli tumani PDP School");
                                                                        System.out.print("Joylashuvni tanlang : ");
                                                                        int joylashuv = scannerForNumber.nextInt();
                                                                        switch (joylashuv) {
                                                                            case 1: {
                                                                                System.out.println(" Yolg'on chaqiruv bo'lsa davlat tomonidan berilgan har qanday jazo turiga roziman \n 1.Ha \n 2.Yo'q");
                                                                                System.out.print("Kerakli bandni kiriting : ");
                                                                                int chaqiruv = scannerForNumber.nextInt();
                                                                                switch (chaqiruv) {
                                                                                    case 1: {
                                                                                        System.out.println("Buyurmangiz to'laqonli qabul qilindi :)");
                                                                                        System.out.println("Siz tolashingiz kerak bolgan summa : " + ((yechibolish * 300000) + 10000));
                                                                                        System.out.println(" 1.Naqd pul orqali to'lov \n 2.Karta orqali to'lov");
                                                                                        System.out.print("To'lov turini tanlang : ");
                                                                                        int tolov = scannerForNumber.nextInt();
                                                                                        switch (tolov) {
                                                                                            case 1: {
                                                                                                System.out.println("Biroz kuting :)");
                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                break;
                                                                                            }
                                                                                            case 2: {
                                                                                                System.out.println(" 1.Smart Card \n 2.Payme \n 3.Click");
                                                                                                int karta = scannerForNumber.nextInt();
                                                                                                switch (karta) {
                                                                                                    case 1: {
                                                                                                        System.out.println("Agarda sizda Smart Card ilovasi orqali tolov qilsangiz sizga 2% keshbek bonus boladi va sizda bu ilova bolsa manashu:12345 kalit sozini kiriting va avtomatik tarzda tolov qiling :) ");
                                                                                                        System.out.println("Biroz kuting :)");
                                                                                                        System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 2% keshbekka ega boldingiz :)");
                                                                                                        System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                        System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                        break;
                                                                                                    }
                                                                                                    case 2: {
                                                                                                        System.out.println(" 1.UzCard \n 2.Humo Card");
                                                                                                        System.out.print("Karta turini talang :");
                                                                                                        int tur = scannerForNumber.nextInt();
                                                                                                        switch (tur) {
                                                                                                            case 1: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                            case 2: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                            case 3: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 2% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                        }
                                                                                                        break;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    }
                                                                                    case 2: {
                                                                                        System.out.println("Afsusdaman siz buyurtma bera olmaysiz :(");
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            }
                                                                            case 2: {
                                                                                System.out.println(" Yolg'on chaqiruv bo'lsa davlat tomonidan berilgan har qanday jazo turiga roziman \n 1.Ha \n 2.Yo'q");
                                                                                System.out.print("Kerakli bandni kiriting : ");
                                                                                int chaqiruv = scannerForNumber.nextInt();
                                                                                switch (chaqiruv) {
                                                                                    case 1: {
                                                                                        System.out.println("Buyurmangiz to'laqonli qabul qilindi :)");
                                                                                        System.out.println("Siz tolashingiz kerak bolgan summa :" + ((yechibolish * 300000) + 10000));
                                                                                        System.out.println(" 1.Naqd pul orqali to'lov \n 2.Karta orqali to'lov");
                                                                                        System.out.println("To'lov turini tanlang : ");
                                                                                        int tolov = scannerForNumber.nextInt();
                                                                                        switch (tolov) {
                                                                                            case 1: {
                                                                                                System.out.println("Biroz kuting :)");
                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                break;
                                                                                            }
                                                                                            case 2: {
                                                                                                System.out.println(" 1.Smart Card \n 2.Payme \n 3.Click");
                                                                                                int karta = scannerForNumber.nextInt();
                                                                                                switch (karta) {
                                                                                                    case 1: {
                                                                                                        System.out.println("Agarda sizda Smart Card ilovasi orqali tolov qilsangiz sizga 2% keshbek bonus boladi va sizda bu ilova bolsa manashu:12345 kalit sozini kiriting va avtomatik tarzda tolov qiling :) ");
                                                                                                        System.out.println("Biroz kuting :)");
                                                                                                        System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 2% keshbekka ega boldingiz :)");
                                                                                                        System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                        System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                        break;
                                                                                                    }
                                                                                                    case 2: {
                                                                                                        System.out.println(" 1.UzCard \n 2.Humo Card");
                                                                                                        System.out.print("Karta turini talang :");
                                                                                                        int tur = scannerForNumber.nextInt();
                                                                                                        switch (tur) {
                                                                                                            case 1: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                            case 2: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                            case 3: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 2% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                        }
                                                                                                        break;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    }
                                                                                    case 2: {
                                                                                        System.out.println("Afsusdaman siz buyurtma bera olmaysiz :(");
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        break;
                                                    }
                                                }
                                                break;
                                            }
                                            case 4:{
                                                System.out.println(" 1.NormoCem 400 cement \n 2.ExtraCem 500 cement \n 3.DecoCem 600 white cement");
                                                System.out.print("Kerakli bandni kiriting : ");
                                                int xizmat6 = scannerForString.nextInt();
                                                switch (xizmat6) {
                                                    case 1: {
                                                        System.out.println("Mahsulot narxi : 325.000 UZS");
                                                        System.out.println("Yetkazib berish haqqi 10.000 UZS");
                                                        System.out.print("Qancha miqdorda buyurtma qilmoqchisiz : ");
                                                        int yechibolish = scannerForNumber.nextInt();
                                                        System.out.println("Buyurtmangiz qabul qilindi :) \n 1.Yana mahsulot harid qilish \n 2.Joylashuvni jonatish");
                                                        System.out.print("Kerakli bandni kiriting : ");
                                                        int xizmat7 = scannerForNumber.nextInt();
                                                        switch (xizmat7) {
                                                            case 1: {
                                                                engboshi();
                                                                break;
                                                            }
                                                            case 2: {
                                                                System.out.println(" 1.Mening joylashuvlarim tarixi \n 2.Joylashuv nuqtasini jonatish");
                                                                System.out.print("Kerakli bandni kiriting : ");
                                                                int xizmat8 = scannerForNumber.nextInt();
                                                                switch (xizmat8) {
                                                                    case 1: {
                                                                        System.out.println(" 1.OLmazor tumani Qamarniso kochasi \n 2.Sergeli tumani PDP School");
                                                                        System.out.print("Joylashuvni tanlang : ");
                                                                        int joylashuv = scannerForNumber.nextInt();
                                                                        switch (joylashuv) {
                                                                            case 1: {
                                                                                System.out.println(" Yolg'on chaqiruv bo'lsa davlat tomonidan berilgan har qanday jazo turiga roziman \n 1.Ha \n 2.Yo'q");
                                                                                System.out.print("Kerakli bandni kiriting : ");
                                                                                int chaqiruv = scannerForNumber.nextInt();
                                                                                switch (chaqiruv) {
                                                                                    case 1: {
                                                                                        System.out.println("Buyurmangiz to'laqonli qabul qilindi :)");
                                                                                        System.out.println("Siz tolashingiz kerak bolgan summa : " + ((yechibolish * 300000) + 10000));
                                                                                        System.out.println(" 1.Naqd pul orqali to'lov \n 2.Karta orqali to'lov");
                                                                                        System.out.print("To'lov turini tanlang : ");
                                                                                        int tolov = scannerForNumber.nextInt();
                                                                                        switch (tolov) {
                                                                                            case 1: {
                                                                                                System.out.println("Biroz kuting :)");
                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                break;
                                                                                            }
                                                                                            case 2: {
                                                                                                System.out.println(" 1.Smart Card \n 2.Payme \n 3.Click");
                                                                                                int karta = scannerForNumber.nextInt();
                                                                                                switch (karta) {
                                                                                                    case 1: {
                                                                                                        System.out.println("Agarda sizda Smart Card ilovasi orqali tolov qilsangiz sizga 2% keshbek bonus boladi va sizda bu ilova bolsa manashu:12345 kalit sozini kiriting va avtomatik tarzda tolov qiling :) ");
                                                                                                        System.out.println("Biroz kuting :)");
                                                                                                        System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 2% keshbekka ega boldingiz :)");
                                                                                                        System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                        System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                        break;
                                                                                                    }
                                                                                                    case 2: {
                                                                                                        System.out.println(" 1.UzCard \n 2.Humo Card");
                                                                                                        System.out.print("Karta turini talang :");
                                                                                                        int tur = scannerForNumber.nextInt();
                                                                                                        switch (tur) {
                                                                                                            case 1: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                            case 2: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                            case 3: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 2% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                        }
                                                                                                        break;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    }
                                                                                    case 2: {
                                                                                        System.out.println("Afsusdaman siz buyurtma bera olmaysiz :(");
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            }
                                                                            case 2: {
                                                                                System.out.println(" Yolg'on chaqiruv bo'lsa davlat tomonidan berilgan har qanday jazo turiga roziman \n 1.Ha \n 2.Yo'q");
                                                                                System.out.print("Kerakli bandni kiriting : ");
                                                                                int chaqiruv = scannerForNumber.nextInt();
                                                                                switch (chaqiruv) {
                                                                                    case 1: {
                                                                                        System.out.println("Buyurmangiz to'laqonli qabul qilindi :)");
                                                                                        System.out.println("Siz tolashingiz kerak bolgan summa :" + ((yechibolish * 300000) + 10000));
                                                                                        System.out.println(" 1.Naqd pul orqali to'lov \n 2.Karta orqali to'lov");
                                                                                        System.out.println("To'lov turini tanlang : ");
                                                                                        int tolov = scannerForNumber.nextInt();
                                                                                        switch (tolov) {
                                                                                            case 1: {
                                                                                                System.out.println("Biroz kuting :)");
                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                break;
                                                                                            }
                                                                                            case 2: {
                                                                                                System.out.println(" 1.Smart Card \n 2.Payme \n 3.Click");
                                                                                                int karta = scannerForNumber.nextInt();
                                                                                                switch (karta) {
                                                                                                    case 1: {
                                                                                                        System.out.println("Agarda sizda Smart Card ilovasi orqali tolov qilsangiz sizga 2% keshbek bonus boladi va sizda bu ilova bolsa manashu:12345 kalit sozini kiriting va avtomatik tarzda tolov qiling :) ");
                                                                                                        System.out.println("Biroz kuting :)");
                                                                                                        System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 2% keshbekka ega boldingiz :)");
                                                                                                        System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                        System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                        break;
                                                                                                    }
                                                                                                    case 2: {
                                                                                                        System.out.println(" 1.UzCard \n 2.Humo Card");
                                                                                                        System.out.print("Karta turini talang :");
                                                                                                        int tur = scannerForNumber.nextInt();
                                                                                                        switch (tur) {
                                                                                                            case 1: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                            case 2: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                            case 3: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 2% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                        }
                                                                                                        break;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    }
                                                                                    case 2: {
                                                                                        System.out.println("Afsusdaman siz buyurtma bera olmaysiz :(");
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        break;
                                                    }
                                                    case 2: {
                                                        System.out.println("Mahsulot narxi : 335.000 UZS");
                                                        System.out.println("Yetkazib berish haqqi 10.000 UZS");
                                                        System.out.print("Qancha miqdorda buyurtma qilmoqchisiz : ");
                                                        int yechibolish = scannerForNumber.nextInt();
                                                        System.out.println("Buyurtmangiz qabul qilindi :) \n 1.Yana mahsulot harid qilish \n 2.Joylashuvni jonatish");
                                                        System.out.print("Kerakli bandni kiriting : ");
                                                        int xizmat7 = scannerForNumber.nextInt();
                                                        switch (xizmat7) {
                                                            case 1: {
                                                                engboshi();
                                                                break;
                                                            }
                                                            case 2: {
                                                                System.out.println(" 1.Mening joylashuvlarim tarixi \n 2.Joylashuv nuqtasini jonatish");
                                                                System.out.print("Kerakli bandni kiriting : ");
                                                                int xizmat8 = scannerForNumber.nextInt();
                                                                switch (xizmat8) {
                                                                    case 1: {
                                                                        System.out.println(" 1.OLmazor tumani Qamarniso kochasi \n 2.Sergeli tumani PDP School");
                                                                        System.out.print("Joylashuvni tanlang : ");
                                                                        int joylashuv = scannerForNumber.nextInt();
                                                                        switch (joylashuv) {
                                                                            case 1: {
                                                                                System.out.println(" Yolg'on chaqiruv bo'lsa davlat tomonidan berilgan har qanday jazo turiga roziman \n 1.Ha \n 2.Yo'q");
                                                                                System.out.print("Kerakli bandni kiriting : ");
                                                                                int chaqiruv = scannerForNumber.nextInt();
                                                                                switch (chaqiruv) {
                                                                                    case 1: {
                                                                                        System.out.println("Buyurmangiz to'laqonli qabul qilindi :)");
                                                                                        System.out.println("Siz tolashingiz kerak bolgan summa : " + ((yechibolish * 300000) + 10000));
                                                                                        System.out.println(" 1.Naqd pul orqali to'lov \n 2.Karta orqali to'lov");
                                                                                        System.out.print("To'lov turini tanlang : ");
                                                                                        int tolov = scannerForNumber.nextInt();
                                                                                        switch (tolov) {
                                                                                            case 1: {
                                                                                                System.out.println("Biroz kuting :)");
                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                break;
                                                                                            }
                                                                                            case 2: {
                                                                                                System.out.println(" 1.Smart Card \n 2.Payme \n 3.Click");
                                                                                                int karta = scannerForNumber.nextInt();
                                                                                                switch (karta) {
                                                                                                    case 1: {
                                                                                                        System.out.println("Agarda sizda Smart Card ilovasi orqali tolov qilsangiz sizga 2% keshbek bonus boladi va sizda bu ilova bolsa manashu:12345 kalit sozini kiriting va avtomatik tarzda tolov qiling :) ");
                                                                                                        System.out.println("Biroz kuting :)");
                                                                                                        System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 2% keshbekka ega boldingiz :)");
                                                                                                        System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                        System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                        break;
                                                                                                    }
                                                                                                    case 2: {
                                                                                                        System.out.println(" 1.UzCard \n 2.Humo Card");
                                                                                                        System.out.print("Karta turini talang :");
                                                                                                        int tur = scannerForNumber.nextInt();
                                                                                                        switch (tur) {
                                                                                                            case 1: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                            case 2: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                            case 3: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 2% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                        }
                                                                                                        break;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    }
                                                                                    case 2: {
                                                                                        System.out.println("Afsusdaman siz buyurtma bera olmaysiz :(");
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            }
                                                                            case 2: {
                                                                                System.out.println(" Yolg'on chaqiruv bo'lsa davlat tomonidan berilgan har qanday jazo turiga roziman \n 1.Ha \n 2.Yo'q");
                                                                                System.out.print("Kerakli bandni kiriting : ");
                                                                                int chaqiruv = scannerForNumber.nextInt();
                                                                                switch (chaqiruv) {
                                                                                    case 1: {
                                                                                        System.out.println("Buyurmangiz to'laqonli qabul qilindi :)");
                                                                                        System.out.println("Siz tolashingiz kerak bolgan summa :" + ((yechibolish * 300000) + 10000));
                                                                                        System.out.println(" 1.Naqd pul orqali to'lov \n 2.Karta orqali to'lov");
                                                                                        System.out.println("To'lov turini tanlang : ");
                                                                                        int tolov = scannerForNumber.nextInt();
                                                                                        switch (tolov) {
                                                                                            case 1: {
                                                                                                System.out.println("Biroz kuting :)");
                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                break;
                                                                                            }
                                                                                            case 2: {
                                                                                                System.out.println(" 1.Smart Card \n 2.Payme \n 3.Click");
                                                                                                int karta = scannerForNumber.nextInt();
                                                                                                switch (karta) {
                                                                                                    case 1: {
                                                                                                        System.out.println("Agarda sizda Smart Card ilovasi orqali tolov qilsangiz sizga 2% keshbek bonus boladi va sizda bu ilova bolsa manashu:12345 kalit sozini kiriting va avtomatik tarzda tolov qiling :) ");
                                                                                                        System.out.println("Biroz kuting :)");
                                                                                                        System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 2% keshbekka ega boldingiz :)");
                                                                                                        System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                        System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                        break;
                                                                                                    }
                                                                                                    case 2: {
                                                                                                        System.out.println(" 1.UzCard \n 2.Humo Card");
                                                                                                        System.out.print("Karta turini talang :");
                                                                                                        int tur = scannerForNumber.nextInt();
                                                                                                        switch (tur) {
                                                                                                            case 1: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                            case 2: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                            case 3: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 2% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                        }
                                                                                                        break;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    }
                                                                                    case 2: {
                                                                                        System.out.println("Afsusdaman siz buyurtma bera olmaysiz :(");
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        break;
                                                    }
                                                    case 3: {
                                                        System.out.println("Mahsulot narxi : 345.000 UZS");
                                                        System.out.println("Yetkazib berish haqqi 10.000 UZS");
                                                        System.out.print("Qancha miqdorda buyurtma qilmoqchisiz : ");
                                                        int yechibolish = scannerForNumber.nextInt();
                                                        System.out.println("Buyurtmangiz qabul qilindi :) \n 1.Yana mahsulot harid qilish \n 2.Joylashuvni jonatish");
                                                        System.out.print("Kerakli bandni kiriting : ");
                                                        int xizmat7 = scannerForNumber.nextInt();
                                                        switch (xizmat7) {
                                                            case 1: {
                                                                engboshi();
                                                                break;
                                                            }
                                                            case 2: {
                                                                System.out.println(" 1.Mening joylashuvlarim tarixi \n 2.Joylashuv nuqtasini jonatish");
                                                                System.out.print("Kerakli bandni kiriting : ");
                                                                int xizmat8 = scannerForNumber.nextInt();
                                                                switch (xizmat8) {
                                                                    case 1: {
                                                                        System.out.println(" 1.OLmazor tumani Qamarniso kochasi \n 2.Sergeli tumani PDP School");
                                                                        System.out.print("Joylashuvni tanlang : ");
                                                                        int joylashuv = scannerForNumber.nextInt();
                                                                        switch (joylashuv) {
                                                                            case 1: {
                                                                                System.out.println(" Yolg'on chaqiruv bo'lsa davlat tomonidan berilgan har qanday jazo turiga roziman \n 1.Ha \n 2.Yo'q");
                                                                                System.out.print("Kerakli bandni kiriting : ");
                                                                                int chaqiruv = scannerForNumber.nextInt();
                                                                                switch (chaqiruv) {
                                                                                    case 1: {
                                                                                        System.out.println("Buyurmangiz to'laqonli qabul qilindi :)");
                                                                                        System.out.println("Siz tolashingiz kerak bolgan summa : " + ((yechibolish * 300000) + 10000));
                                                                                        System.out.println(" 1.Naqd pul orqali to'lov \n 2.Karta orqali to'lov");
                                                                                        System.out.print("To'lov turini tanlang : ");
                                                                                        int tolov = scannerForNumber.nextInt();
                                                                                        switch (tolov) {
                                                                                            case 1: {
                                                                                                System.out.println("Biroz kuting :)");
                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                break;
                                                                                            }
                                                                                            case 2: {
                                                                                                System.out.println(" 1.Smart Card \n 2.Payme \n 3.Click");
                                                                                                int karta = scannerForNumber.nextInt();
                                                                                                switch (karta) {
                                                                                                    case 1: {
                                                                                                        System.out.println("Agarda sizda Smart Card ilovasi orqali tolov qilsangiz sizga 2% keshbek bonus boladi va sizda bu ilova bolsa manashu:12345 kalit sozini kiriting va avtomatik tarzda tolov qiling :) ");
                                                                                                        System.out.println("Biroz kuting :)");
                                                                                                        System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 2% keshbekka ega boldingiz :)");
                                                                                                        System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                        System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                        break;
                                                                                                    }
                                                                                                    case 2: {
                                                                                                        System.out.println(" 1.UzCard \n 2.Humo Card");
                                                                                                        System.out.print("Karta turini talang :");
                                                                                                        int tur = scannerForNumber.nextInt();
                                                                                                        switch (tur) {
                                                                                                            case 1: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                            case 2: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                            case 3: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 2% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                        }
                                                                                                        break;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    }
                                                                                    case 2: {
                                                                                        System.out.println("Afsusdaman siz buyurtma bera olmaysiz :(");
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            }
                                                                            case 2: {
                                                                                System.out.println(" Yolg'on chaqiruv bo'lsa davlat tomonidan berilgan har qanday jazo turiga roziman \n 1.Ha \n 2.Yo'q");
                                                                                System.out.print("Kerakli bandni kiriting : ");
                                                                                int chaqiruv = scannerForNumber.nextInt();
                                                                                switch (chaqiruv) {
                                                                                    case 1: {
                                                                                        System.out.println("Buyurmangiz to'laqonli qabul qilindi :)");
                                                                                        System.out.println("Siz tolashingiz kerak bolgan summa :" + ((yechibolish * 300000) + 10000));
                                                                                        System.out.println(" 1.Naqd pul orqali to'lov \n 2.Karta orqali to'lov");
                                                                                        System.out.println("To'lov turini tanlang : ");
                                                                                        int tolov = scannerForNumber.nextInt();
                                                                                        switch (tolov) {
                                                                                            case 1: {
                                                                                                System.out.println("Biroz kuting :)");
                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                break;
                                                                                            }
                                                                                            case 2: {
                                                                                                System.out.println(" 1.Smart Card \n 2.Payme \n 3.Click");
                                                                                                int karta = scannerForNumber.nextInt();
                                                                                                switch (karta) {
                                                                                                    case 1: {
                                                                                                        System.out.println("Agarda sizda Smart Card ilovasi orqali tolov qilsangiz sizga 2% keshbek bonus boladi va sizda bu ilova bolsa manashu:12345 kalit sozini kiriting va avtomatik tarzda tolov qiling :) ");
                                                                                                        System.out.println("Biroz kuting :)");
                                                                                                        System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 2% keshbekka ega boldingiz :)");
                                                                                                        System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                        System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                        break;
                                                                                                    }
                                                                                                    case 2: {
                                                                                                        System.out.println(" 1.UzCard \n 2.Humo Card");
                                                                                                        System.out.print("Karta turini talang :");
                                                                                                        int tur = scannerForNumber.nextInt();
                                                                                                        switch (tur) {
                                                                                                            case 1: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                            case 2: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                            case 3: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 2% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                        }
                                                                                                        break;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    }
                                                                                    case 2: {
                                                                                        System.out.println("Afsusdaman siz buyurtma bera olmaysiz :(");
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        break;
                                                    }
                                                }
                                                break;
                                            }
                                            case 5:{
                                                System.out.println(" 1.NormoCem 400 cement \n 2.ExtraCem 500 cement \n 3.DecoCem 600 white cement");
                                                System.out.print("Kerakli bandni kiriting : ");
                                                int xizmat6 = scannerForString.nextInt();
                                                switch (xizmat6) {
                                                    case 1: {
                                                        System.out.println("Mahsulot narxi : 330.000 UZS");
                                                        System.out.println("Yetkazib berish haqqi 10.000 UZS");
                                                        System.out.print("Qancha miqdorda buyurtma qilmoqchisiz : ");
                                                        int yechibolish = scannerForNumber.nextInt();
                                                        System.out.println("Buyurtmangiz qabul qilindi :) \n 1.Yana mahsulot harid qilish \n 2.Joylashuvni jonatish");
                                                        System.out.print("Kerakli bandni kiriting : ");
                                                        int xizmat7 = scannerForNumber.nextInt();
                                                        switch (xizmat7) {
                                                            case 1: {
                                                                engboshi();
                                                                break;
                                                            }
                                                            case 2: {
                                                                System.out.println(" 1.Mening joylashuvlarim tarixi \n 2.Joylashuv nuqtasini jonatish");
                                                                System.out.print("Kerakli bandni kiriting : ");
                                                                int xizmat8 = scannerForNumber.nextInt();
                                                                switch (xizmat8) {
                                                                    case 1: {
                                                                        System.out.println(" 1.OLmazor tumani Qamarniso kochasi \n 2.Sergeli tumani PDP School");
                                                                        System.out.print("Joylashuvni tanlang : ");
                                                                        int joylashuv = scannerForNumber.nextInt();
                                                                        switch (joylashuv) {
                                                                            case 1: {
                                                                                System.out.println(" Yolg'on chaqiruv bo'lsa davlat tomonidan berilgan har qanday jazo turiga roziman \n 1.Ha \n 2.Yo'q");
                                                                                System.out.print("Kerakli bandni kiriting : ");
                                                                                int chaqiruv = scannerForNumber.nextInt();
                                                                                switch (chaqiruv) {
                                                                                    case 1: {
                                                                                        System.out.println("Buyurmangiz to'laqonli qabul qilindi :)");
                                                                                        System.out.println("Siz tolashingiz kerak bolgan summa : " + ((yechibolish * 300000) + 10000));
                                                                                        System.out.println(" 1.Naqd pul orqali to'lov \n 2.Karta orqali to'lov");
                                                                                        System.out.print("To'lov turini tanlang : ");
                                                                                        int tolov = scannerForNumber.nextInt();
                                                                                        switch (tolov) {
                                                                                            case 1: {
                                                                                                System.out.println("Biroz kuting :)");
                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                break;
                                                                                            }
                                                                                            case 2: {
                                                                                                System.out.println(" 1.Smart Card \n 2.Payme \n 3.Click");
                                                                                                int karta = scannerForNumber.nextInt();
                                                                                                switch (karta) {
                                                                                                    case 1: {
                                                                                                        System.out.println("Agarda sizda Smart Card ilovasi orqali tolov qilsangiz sizga 2% keshbek bonus boladi va sizda bu ilova bolsa manashu:12345 kalit sozini kiriting va avtomatik tarzda tolov qiling :) ");
                                                                                                        System.out.println("Biroz kuting :)");
                                                                                                        System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 2% keshbekka ega boldingiz :)");
                                                                                                        System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                        System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                        break;
                                                                                                    }
                                                                                                    case 2: {
                                                                                                        System.out.println(" 1.UzCard \n 2.Humo Card");
                                                                                                        System.out.print("Karta turini talang :");
                                                                                                        int tur = scannerForNumber.nextInt();
                                                                                                        switch (tur) {
                                                                                                            case 1: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                            case 2: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                            case 3: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 2% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                        }
                                                                                                        break;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    }
                                                                                    case 2: {
                                                                                        System.out.println("Afsusdaman siz buyurtma bera olmaysiz :(");
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            }
                                                                            case 2: {
                                                                                System.out.println(" Yolg'on chaqiruv bo'lsa davlat tomonidan berilgan har qanday jazo turiga roziman \n 1.Ha \n 2.Yo'q");
                                                                                System.out.print("Kerakli bandni kiriting : ");
                                                                                int chaqiruv = scannerForNumber.nextInt();
                                                                                switch (chaqiruv) {
                                                                                    case 1: {
                                                                                        System.out.println("Buyurmangiz to'laqonli qabul qilindi :)");
                                                                                        System.out.println("Siz tolashingiz kerak bolgan summa :" + ((yechibolish * 300000) + 10000));
                                                                                        System.out.println(" 1.Naqd pul orqali to'lov \n 2.Karta orqali to'lov");
                                                                                        System.out.println("To'lov turini tanlang : ");
                                                                                        int tolov = scannerForNumber.nextInt();
                                                                                        switch (tolov) {
                                                                                            case 1: {
                                                                                                System.out.println("Biroz kuting :)");
                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                break;
                                                                                            }
                                                                                            case 2: {
                                                                                                System.out.println(" 1.Smart Card \n 2.Payme \n 3.Click");
                                                                                                int karta = scannerForNumber.nextInt();
                                                                                                switch (karta) {
                                                                                                    case 1: {
                                                                                                        System.out.println("Agarda sizda Smart Card ilovasi orqali tolov qilsangiz sizga 2% keshbek bonus boladi va sizda bu ilova bolsa manashu:12345 kalit sozini kiriting va avtomatik tarzda tolov qiling :) ");
                                                                                                        System.out.println("Biroz kuting :)");
                                                                                                        System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 2% keshbekka ega boldingiz :)");
                                                                                                        System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                        System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                        break;
                                                                                                    }
                                                                                                    case 2: {
                                                                                                        System.out.println(" 1.UzCard \n 2.Humo Card");
                                                                                                        System.out.print("Karta turini talang :");
                                                                                                        int tur = scannerForNumber.nextInt();
                                                                                                        switch (tur) {
                                                                                                            case 1: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                            case 2: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                            case 3: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 2% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                        }
                                                                                                        break;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    }
                                                                                    case 2: {
                                                                                        System.out.println("Afsusdaman siz buyurtma bera olmaysiz :(");
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        break;
                                                    }
                                                    case 2: {
                                                        System.out.println("Mahsulot narxi : 340.000 UZS");
                                                        System.out.println("Yetkazib berish haqqi 10.000 UZS");
                                                        System.out.print("Qancha miqdorda buyurtma qilmoqchisiz : ");
                                                        int yechibolish = scannerForNumber.nextInt();
                                                        System.out.println("Buyurtmangiz qabul qilindi :) \n 1.Yana mahsulot harid qilish \n 2.Joylashuvni jonatish");
                                                        System.out.print("Kerakli bandni kiriting : ");
                                                        int xizmat7 = scannerForNumber.nextInt();
                                                        switch (xizmat7) {
                                                            case 1: {
                                                                engboshi();
                                                                break;
                                                            }
                                                            case 2: {
                                                                System.out.println(" 1.Mening joylashuvlarim tarixi \n 2.Joylashuv nuqtasini jonatish");
                                                                System.out.print("Kerakli bandni kiriting : ");
                                                                int xizmat8 = scannerForNumber.nextInt();
                                                                switch (xizmat8) {
                                                                    case 1: {
                                                                        System.out.println(" 1.OLmazor tumani Qamarniso kochasi \n 2.Sergeli tumani PDP School");
                                                                        System.out.print("Joylashuvni tanlang : ");
                                                                        int joylashuv = scannerForNumber.nextInt();
                                                                        switch (joylashuv) {
                                                                            case 1: {
                                                                                System.out.println(" Yolg'on chaqiruv bo'lsa davlat tomonidan berilgan har qanday jazo turiga roziman \n 1.Ha \n 2.Yo'q");
                                                                                System.out.print("Kerakli bandni kiriting : ");
                                                                                int chaqiruv = scannerForNumber.nextInt();
                                                                                switch (chaqiruv) {
                                                                                    case 1: {
                                                                                        System.out.println("Buyurmangiz to'laqonli qabul qilindi :)");
                                                                                        System.out.println("Siz tolashingiz kerak bolgan summa : " + ((yechibolish * 300000) + 10000));
                                                                                        System.out.println(" 1.Naqd pul orqali to'lov \n 2.Karta orqali to'lov");
                                                                                        System.out.print("To'lov turini tanlang : ");
                                                                                        int tolov = scannerForNumber.nextInt();
                                                                                        switch (tolov) {
                                                                                            case 1: {
                                                                                                System.out.println("Biroz kuting :)");
                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                break;
                                                                                            }
                                                                                            case 2: {
                                                                                                System.out.println(" 1.Smart Card \n 2.Payme \n 3.Click");
                                                                                                int karta = scannerForNumber.nextInt();
                                                                                                switch (karta) {
                                                                                                    case 1: {
                                                                                                        System.out.println("Agarda sizda Smart Card ilovasi orqali tolov qilsangiz sizga 2% keshbek bonus boladi va sizda bu ilova bolsa manashu:12345 kalit sozini kiriting va avtomatik tarzda tolov qiling :) ");
                                                                                                        System.out.println("Biroz kuting :)");
                                                                                                        System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 2% keshbekka ega boldingiz :)");
                                                                                                        System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                        System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                        break;
                                                                                                    }
                                                                                                    case 2: {
                                                                                                        System.out.println(" 1.UzCard \n 2.Humo Card");
                                                                                                        System.out.print("Karta turini talang :");
                                                                                                        int tur = scannerForNumber.nextInt();
                                                                                                        switch (tur) {
                                                                                                            case 1: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                            case 2: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                            case 3: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 2% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                        }
                                                                                                        break;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    }
                                                                                    case 2: {
                                                                                        System.out.println("Afsusdaman siz buyurtma bera olmaysiz :(");
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            }
                                                                            case 2: {
                                                                                System.out.println(" Yolg'on chaqiruv bo'lsa davlat tomonidan berilgan har qanday jazo turiga roziman \n 1.Ha \n 2.Yo'q");
                                                                                System.out.print("Kerakli bandni kiriting : ");
                                                                                int chaqiruv = scannerForNumber.nextInt();
                                                                                switch (chaqiruv) {
                                                                                    case 1: {
                                                                                        System.out.println("Buyurmangiz to'laqonli qabul qilindi :)");
                                                                                        System.out.println("Siz tolashingiz kerak bolgan summa :" + ((yechibolish * 300000) + 10000));
                                                                                        System.out.println(" 1.Naqd pul orqali to'lov \n 2.Karta orqali to'lov");
                                                                                        System.out.println("To'lov turini tanlang : ");
                                                                                        int tolov = scannerForNumber.nextInt();
                                                                                        switch (tolov) {
                                                                                            case 1: {
                                                                                                System.out.println("Biroz kuting :)");
                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                break;
                                                                                            }
                                                                                            case 2: {
                                                                                                System.out.println(" 1.Smart Card \n 2.Payme \n 3.Click");
                                                                                                int karta = scannerForNumber.nextInt();
                                                                                                switch (karta) {
                                                                                                    case 1: {
                                                                                                        System.out.println("Agarda sizda Smart Card ilovasi orqali tolov qilsangiz sizga 2% keshbek bonus boladi va sizda bu ilova bolsa manashu:12345 kalit sozini kiriting va avtomatik tarzda tolov qiling :) ");
                                                                                                        System.out.println("Biroz kuting :)");
                                                                                                        System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 2% keshbekka ega boldingiz :)");
                                                                                                        System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                        System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                        break;
                                                                                                    }
                                                                                                    case 2: {
                                                                                                        System.out.println(" 1.UzCard \n 2.Humo Card");
                                                                                                        System.out.print("Karta turini talang :");
                                                                                                        int tur = scannerForNumber.nextInt();
                                                                                                        switch (tur) {
                                                                                                            case 1: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                            case 2: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                            case 3: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 2% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                        }
                                                                                                        break;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    }
                                                                                    case 2: {
                                                                                        System.out.println("Afsusdaman siz buyurtma bera olmaysiz :(");
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        break;
                                                    }
                                                    case 3: {
                                                        System.out.println("Mahsulot narxi : 350.000 UZS");
                                                        System.out.println("Yetkazib berish haqqi 10.000 UZS");
                                                        System.out.print("Qancha miqdorda buyurtma qilmoqchisiz : ");
                                                        int yechibolish = scannerForNumber.nextInt();
                                                        System.out.println("Buyurtmangiz qabul qilindi :) \n 1.Yana mahsulot harid qilish \n 2.Joylashuvni jonatish");
                                                        System.out.print("Kerakli bandni kiriting : ");
                                                        int xizmat7 = scannerForNumber.nextInt();
                                                        switch (xizmat7) {
                                                            case 1: {
                                                                engboshi();
                                                                break;
                                                            }
                                                            case 2: {
                                                                System.out.println(" 1.Mening joylashuvlarim tarixi \n 2.Joylashuv nuqtasini jonatish");
                                                                System.out.print("Kerakli bandni kiriting : ");
                                                                int xizmat8 = scannerForNumber.nextInt();
                                                                switch (xizmat8) {
                                                                    case 1: {
                                                                        System.out.println(" 1.OLmazor tumani Qamarniso kochasi \n 2.Sergeli tumani PDP School");
                                                                        System.out.print("Joylashuvni tanlang : ");
                                                                        int joylashuv = scannerForNumber.nextInt();
                                                                        switch (joylashuv) {
                                                                            case 1: {
                                                                                System.out.println(" Yolg'on chaqiruv bo'lsa davlat tomonidan berilgan har qanday jazo turiga roziman \n 1.Ha \n 2.Yo'q");
                                                                                System.out.print("Kerakli bandni kiriting : ");
                                                                                int chaqiruv = scannerForNumber.nextInt();
                                                                                switch (chaqiruv) {
                                                                                    case 1: {
                                                                                        System.out.println("Buyurmangiz to'laqonli qabul qilindi :)");
                                                                                        System.out.println("Siz tolashingiz kerak bolgan summa : " + ((yechibolish * 300000) + 10000));
                                                                                        System.out.println(" 1.Naqd pul orqali to'lov \n 2.Karta orqali to'lov");
                                                                                        System.out.print("To'lov turini tanlang : ");
                                                                                        int tolov = scannerForNumber.nextInt();
                                                                                        switch (tolov) {
                                                                                            case 1: {
                                                                                                System.out.println("Biroz kuting :)");
                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                break;
                                                                                            }
                                                                                            case 2: {
                                                                                                System.out.println(" 1.Smart Card \n 2.Payme \n 3.Click");
                                                                                                int karta = scannerForNumber.nextInt();
                                                                                                switch (karta) {
                                                                                                    case 1: {
                                                                                                        System.out.println("Agarda sizda Smart Card ilovasi orqali tolov qilsangiz sizga 2% keshbek bonus boladi va sizda bu ilova bolsa manashu:12345 kalit sozini kiriting va avtomatik tarzda tolov qiling :) ");
                                                                                                        System.out.println("Biroz kuting :)");
                                                                                                        System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 2% keshbekka ega boldingiz :)");
                                                                                                        System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                        System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                        break;
                                                                                                    }
                                                                                                    case 2: {
                                                                                                        System.out.println(" 1.UzCard \n 2.Humo Card");
                                                                                                        System.out.print("Karta turini talang :");
                                                                                                        int tur = scannerForNumber.nextInt();
                                                                                                        switch (tur) {
                                                                                                            case 1: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                            case 2: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                            case 3: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 2% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                        }
                                                                                                        break;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    }
                                                                                    case 2: {
                                                                                        System.out.println("Afsusdaman siz buyurtma bera olmaysiz :(");
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            }
                                                                            case 2: {
                                                                                System.out.println(" Yolg'on chaqiruv bo'lsa davlat tomonidan berilgan har qanday jazo turiga roziman \n 1.Ha \n 2.Yo'q");
                                                                                System.out.print("Kerakli bandni kiriting : ");
                                                                                int chaqiruv = scannerForNumber.nextInt();
                                                                                switch (chaqiruv) {
                                                                                    case 1: {
                                                                                        System.out.println("Buyurmangiz to'laqonli qabul qilindi :)");
                                                                                        System.out.println("Siz tolashingiz kerak bolgan summa :" + ((yechibolish * 300000) + 10000));
                                                                                        System.out.println(" 1.Naqd pul orqali to'lov \n 2.Karta orqali to'lov");
                                                                                        System.out.println("To'lov turini tanlang : ");
                                                                                        int tolov = scannerForNumber.nextInt();
                                                                                        switch (tolov) {
                                                                                            case 1: {
                                                                                                System.out.println("Biroz kuting :)");
                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                break;
                                                                                            }
                                                                                            case 2: {
                                                                                                System.out.println(" 1.Smart Card \n 2.Payme \n 3.Click");
                                                                                                int karta = scannerForNumber.nextInt();
                                                                                                switch (karta) {
                                                                                                    case 1: {
                                                                                                        System.out.println("Agarda sizda Smart Card ilovasi orqali tolov qilsangiz sizga 2% keshbek bonus boladi va sizda bu ilova bolsa manashu:12345 kalit sozini kiriting va avtomatik tarzda tolov qiling :) ");
                                                                                                        System.out.println("Biroz kuting :)");
                                                                                                        System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 2% keshbekka ega boldingiz :)");
                                                                                                        System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                        System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                        break;
                                                                                                    }
                                                                                                    case 2: {
                                                                                                        System.out.println(" 1.UzCard \n 2.Humo Card");
                                                                                                        System.out.print("Karta turini talang :");
                                                                                                        int tur = scannerForNumber.nextInt();
                                                                                                        switch (tur) {
                                                                                                            case 1: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                            case 2: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                            case 3: {
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 2% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                            }
                                                                                                        }
                                                                                                        break;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    }
                                                                                    case 2: {
                                                                                        System.out.println("Afsusdaman siz buyurtma bera olmaysiz :(");
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        break;
                                                    }
                                                }
                                                break;
                                            }
                                        }
                                        break;
                                    }
                                            case 2: {
                                                System.out.println(" 1.Aziya-Sement \n 2.Holcim \n 3.Lafarge \n 4.Euro-Cement \n 5.Flex \n 6.Ortga qaytish");
                                                System.out.print("Kerakli bandni kiriting : ");
                                                int xizmat6 = scannerForNumber.nextInt();
                                                switch (xizmat6) {
                                                    case 1: {
                                                        System.out.println(" 1.NormoCem 400 cement \n 2.ExtraCem 500 cement \n 3.DecoCem 600 white cement");
                                                        System.out.print("Kerakli bandni kiriting : ");
                                                        int xizmat9 = scannerForString.nextInt();
                                                        switch (xizmat9) {
                                                            case 1: {
                                                                System.out.println("Mahsulot narxi : 400.000 UZS");
                                                                System.out.println("Yetkazib berish haqqi 10.000 UZS");
                                                                System.out.print("Qancha miqdorda buyurtma qilmoqchisiz : ");
                                                                int yechibolish = scannerForNumber.nextInt();
                                                                System.out.println("Buyurtmangiz qabul qilindi :) \n 1.Yana mahsulot harid qilish \n 2.Joylashuvni jonatish");
                                                                System.out.print("Kerakli bandni kiriting : ");
                                                                int xizmat7 = scannerForNumber.nextInt();
                                                                switch (xizmat7) {
                                                                    case 1: {
                                                                        engboshi();
                                                                        break;
                                                                    }
                                                                    case 2: {
                                                                        System.out.println(" 1.Mening joylashuvlarim tarixi \n 2.Joylashuv nuqtasini jonatish");
                                                                        System.out.print("Kerakli bandni kiriting : ");
                                                                        int xizmat8 = scannerForNumber.nextInt();
                                                                        switch (xizmat8) {
                                                                            case 1: {
                                                                                System.out.println(" 1.OLmazor tumani Qamarniso kochasi \n 2.Sergeli tumani PDP School");
                                                                                System.out.print("Joylashuvni tanlang : ");
                                                                                int joylashuv = scannerForNumber.nextInt();
                                                                                switch (joylashuv) {
                                                                                    case 1: {
                                                                                        System.out.println(" Yolg'on chaqiruv bo'lsa davlat tomonidan berilgan har qanday jazo turiga roziman \n 1.Ha \n 2.Yo'q");
                                                                                        System.out.print("Kerakli bandni kiriting : ");
                                                                                        int chaqiruv = scannerForNumber.nextInt();
                                                                                        switch (chaqiruv) {
                                                                                            case 1: {
                                                                                                System.out.println("Buyurmangiz to'laqonli qabul qilindi :)");
                                                                                                System.out.println("Siz tolashingiz kerak bolgan summa : " + ((yechibolish * 300000) + 10000));
                                                                                                System.out.println(" 1.Naqd pul orqali to'lov \n 2.Karta orqali to'lov");
                                                                                                System.out.print("To'lov turini tanlang : ");
                                                                                                int tolov = scannerForNumber.nextInt();
                                                                                                switch (tolov) {
                                                                                                    case 1: {
                                                                                                        System.out.println("Biroz kuting :)");
                                                                                                        System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                        System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                        System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                        break;
                                                                                                    }
                                                                                                    case 2: {
                                                                                                        System.out.println(" 1.Smart Card \n 2.Payme \n 3.Click");
                                                                                                        int karta = scannerForNumber.nextInt();
                                                                                                        switch (karta) {
                                                                                                            case 1: {
                                                                                                                System.out.println("Agarda sizda Smart Card ilovasi orqali tolov qilsangiz sizga 2% keshbek bonus boladi va sizda bu ilova bolsa manashu:12345 kalit sozini kiriting va avtomatik tarzda tolov qiling :) ");
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 2% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                                break;
                                                                                                            }
                                                                                                            case 2: {
                                                                                                                System.out.println(" 1.UzCard \n 2.Humo Card");
                                                                                                                System.out.print("Karta turini talang :");
                                                                                                                int tur = scannerForNumber.nextInt();
                                                                                                                switch (tur) {
                                                                                                                    case 1: {
                                                                                                                        System.out.println("Biroz kuting :)");
                                                                                                                        System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                                        System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                        System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                                    }
                                                                                                                    case 2: {
                                                                                                                        System.out.println("Biroz kuting :)");
                                                                                                                        System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                                        System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                        System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                                    }
                                                                                                                    case 3: {
                                                                                                                        System.out.println("Biroz kuting :)");
                                                                                                                        System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 2% keshbekka ega boldingiz :)");
                                                                                                                        System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                        System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                                    }
                                                                                                                }
                                                                                                                break;
                                                                                                            }
                                                                                                        }
                                                                                                        break;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            }
                                                                                            case 2: {
                                                                                                System.out.println("Afsusdaman siz buyurtma bera olmaysiz :(");
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    }
                                                                                    case 2: {
                                                                                        System.out.println(" Yolg'on chaqiruv bo'lsa davlat tomonidan berilgan har qanday jazo turiga roziman \n 1.Ha \n 2.Yo'q");
                                                                                        System.out.print("Kerakli bandni kiriting : ");
                                                                                        int chaqiruv = scannerForNumber.nextInt();
                                                                                        switch (chaqiruv) {
                                                                                            case 1: {
                                                                                                System.out.println("Buyurmangiz to'laqonli qabul qilindi :)");
                                                                                                System.out.println("Siz tolashingiz kerak bolgan summa :" + ((yechibolish * 300000) + 10000));
                                                                                                System.out.println(" 1.Naqd pul orqali to'lov \n 2.Karta orqali to'lov");
                                                                                                System.out.println("To'lov turini tanlang : ");
                                                                                                int tolov = scannerForNumber.nextInt();
                                                                                                switch (tolov) {
                                                                                                    case 1: {
                                                                                                        System.out.println("Biroz kuting :)");
                                                                                                        System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                        System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                        System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                        break;
                                                                                                    }
                                                                                                    case 2: {
                                                                                                        System.out.println(" 1.Smart Card \n 2.Payme \n 3.Click");
                                                                                                        int karta = scannerForNumber.nextInt();
                                                                                                        switch (karta) {
                                                                                                            case 1: {
                                                                                                                System.out.println("Agarda sizda Smart Card ilovasi orqali tolov qilsangiz sizga 2% keshbek bonus boladi va sizda bu ilova bolsa manashu:12345 kalit sozini kiriting va avtomatik tarzda tolov qiling :) ");
                                                                                                                System.out.println("Biroz kuting :)");
                                                                                                                System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 2% keshbekka ega boldingiz :)");
                                                                                                                System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                                break;
                                                                                                            }
                                                                                                            case 2: {
                                                                                                                System.out.println(" 1.UzCard \n 2.Humo Card");
                                                                                                                System.out.print("Karta turini talang :");
                                                                                                                int tur = scannerForNumber.nextInt();
                                                                                                                switch (tur) {
                                                                                                                    case 1: {
                                                                                                                        System.out.println("Biroz kuting :)");
                                                                                                                        System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                                        System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                        System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                                    }
                                                                                                                    case 2: {
                                                                                                                        System.out.println("Biroz kuting :)");
                                                                                                                        System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 1% keshbekka ega boldingiz :)");
                                                                                                                        System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                        System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                                    }
                                                                                                                    case 3: {
                                                                                                                        System.out.println("Biroz kuting :)");
                                                                                                                        System.out.println("Tolovingiz muvoffaqiyatli bajarildi va siz 2% keshbekka ega boldingiz :)");
                                                                                                                        System.out.println("Buyutmangiz 30 daqiqada yetkazilib beriladi");
                                                                                                                        System.out.println("Buyurtmangiz uchun rahmat :)");
                                                                                                                    }
                                                                                                                }
                                                                                                                break;
                                                                                                            }
                                                                                                        }
                                                                                                        break;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            }
                                                                                            case 2: {
                                                                                                System.out.println("Afsusdaman siz buyurtma bera olmaysiz :(");
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                break;
                                                            }
                                                            case 2: {

                                                                break;
                                                            }
                                                            case 3: {
                                                                System.out.println();
                                                                break;
                                                            }
                                                        }
                                                        break;
                                                    }
                                                }
                                                break;
                                            }
                                }
                                        break;
                            }
                        }
                                break;
                    }
                }
                        break;
            }
                    case 2: {
                        break;
                    }
        }

    }





    private void engboshi() {
        menyu_class menyuClass = new menyu_class();
        menyuClass.menyu();
    }
}
