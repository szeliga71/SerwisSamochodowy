package com.GUI;



import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception{

        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println(LocalDate.now());
        LocalDate.now();




        Service s1 = new Service("Zielona 6");
        System.out.println();
        System.out.println(s1);


        System.out.println();
        ConsumerWarehouse cw1 = new ConsumerWarehouse("Zielona 6",110,true);
        ConsumerWarehouse cw2 = new ConsumerWarehouse("Zielona 6",90,false);
        ConsumerWarehouse cw3 =new ConsumerWarehouse("Zielona 6",80,false);
        ConsumerWarehouse cw4 = new ConsumerWarehouse("Zielona 6",110,true);
        ConsumerWarehouse cw5 = new ConsumerWarehouse("Zielona 6",110,false);
        ConsumerWarehouse cw6 =new ConsumerWarehouse("Zielona 6",80,false);
        ConsumerWarehouse cw7 =new ConsumerWarehouse("Zielona 6",130,false);
        ConsumerWarehouse cw8 =new ConsumerWarehouse("Zielona 6",70,false);
        ConsumerWarehouse cw9 =new ConsumerWarehouse("Zielona 6",50,true);
        ConsumerWarehouse cw10=new ConsumerWarehouse("Zielona 6",150,true);


        ParkingSpace park1 =new ParkingSpace(10,true);
        ParkingSpace park2 =new ParkingSpace(10,true);
        ParkingSpace park3 =new ParkingSpace(10,true);
        ParkingSpace park4 =new ParkingSpace(10,true);
        ParkingSpace park5 =new ParkingSpace(10,true);
        ParkingSpace park6 =new ParkingSpace(10,true);

        CarServiceSpot cs1 = new CarServiceSpot(5, true);
        CarServiceSpot cs2=new CarServiceSpot(10,true);
        CarServiceSpot cs3=new CarServiceSpot(15,true);
        CarServiceSpot cs4=new CarServiceSpot(20,true);
        CarServiceSpot cs5=new CarServiceSpot(25,true);
        IndependentCarServiceSpot ics=new IndependentCarServiceSpot(25);
        ServiceWarehouse sw=new ServiceWarehouse((s1.getArea()*5)/100);


        Person p1 = new Person("Jan", "Kowalski", 111111222, "Wroclaw", 1980, 2020);
        Person p2 = new Person("Franciszek", "Nowak", 222221111, "Poznan", 1985, 2019);
        Person p3 = new Person("Zygmunt", "Piekarczyk", 5555566, "Katowice", 1999, 2018);
        Person p4 = new Person("Emil", "Zajaczkiewicz", 444499966, "Szczecin", 2001, 2018);
        Person p5 = new Person("Przemyslaw", "Talar", 777766321, "Pabianice", 1992, 2017);

        Person[] osoby = {p1, p2, p3, p4, p5};
        ConsumerWarehouse[] consWare = {cw1,cw2,cw3,cw4,cw5,cw6,cw7,cw8,cw9,cw10};// zrobic z tego seta
        ParkingSpace[] parking={park1,park2,park3,park4,park5,park6};
        CarServiceSpot[] serviceSpots={cs1,cs2,cs3,cs4,cs5};
        IndependentCarServiceSpot[]independentCarServiceSpot={ics};


        Pojazd pojazd1=new Wieloslad(100,"BMW","Z 3",RodzajNapedu.BENZYNA,false,true);
        Pojazd pojazd2=new Wieloslad(100,"Peugeot","508",RodzajNapedu.DIESEL,false,true);
        Pojazd pojazd3=new Jednoslad(50,"Jamaha", "Samuraj",RodzajNapedu.BENZYNA,true);
        Pojazd pojazd4=new Wieloslad(120,"Suzuki","Grand Vitara",RodzajNapedu.DIESEL,true,false);
        Pojazd pojazd5=new Wieloslad(100,"Skoda","Octavia",RodzajNapedu.BENZYNA,false,true);
        Pojazd pojazd6=new Wieloslad(80,"Reanault","ZOE",RodzajNapedu.ELEKTRYCZNY,false,true);
            Pojazd pojazd7=new Jednoslad(70,"Harley Davidson", "Bizon",RodzajNapedu.BENZYNA,true);
            Pojazd pojazd8=new Jednoslad(40,"CROSS","Sport",RodzajNapedu.BENZYNA,false);


            CustomerItem item1=new CustomerItem(5,"grabie");
            CustomerItem item2=new CustomerItem(20,"kociol");
        CustomerItem item3=new CustomerItem(30,"rower");
        CustomerItem item4=new CustomerItem(5,"lopata");
        CustomerItem item5=new CustomerItem(15,"taczka");
        CustomerItem item6=new CustomerItem(5,"narty");
        CustomerItem item7=new CustomerItem(20,"motorower");
        CustomerItem item8=new CustomerItem(15,"kosiarka");
        CustomerItem item9=new CustomerItem(5,"lezak");
        CustomerItem item10=new CustomerItem(10,"stol ogrodowy");
        CustomerItem item11=new CustomerItem(15,"krzesla ogrodowe");
        CustomerItem item212=new CustomerItem(10,"parasol odrodowy");



        p1.addWrehouse(cw2);
        p1.addWrehouse(cw3);
        p1.addItems(pojazd2);
        p1.addItems(item1);
        p3.addItems(pojazd1);
        p4.addItems(pojazd4);
        p2.addItems(pojazd6);
        p2.addWrehouse(cw5);
        p3.addWrehouse(cw6);
p1.addCar(pojazd5);


        System.out.println();

        menu();
        System.out.println();

        int opcja = 0;
        Person user=null;

        while (opcja != 16) {

            System.out.println();
            System.out.println("MENU GLOWNE");
            System.out.print("Wybierz opcje :");
            System.out.println();

            opcja = scan.nextInt();


            switch (opcja) {
                case 1:

                    System.out.println("  Zaloguj sie ,podaj numer personalny  (nr osoby)");
                    System.out.println("podaj nr osoby");
                    int numer = scan.nextInt();
                    if(numer>osoby.length){
                        System.out.println("nie ma takiego uzytkownika");}
                         if (numer<=0){
                            System.out.println("nie ma takiego uzytkownika");
                         }
                        else{
                    for (int i = 0; i < osoby.length; i++) {
                        if (i + 1 == numer) {
                            user=osoby[i];
                            System.out.println(" Jestes zalogowany jako  "+ osoby[i].imie+" "+osoby[i].nazwisko );}
                    }}
                        break;
                        case 2:
                            if(user==null){
                                System.out.println("Prosze sie zalogowac !");
                            }else{
                            System.out.println(" Dane osobowe uzytkownika ");
                                System.out.println();
                            for (int i = 0; i < osoby.length; i++) {
                                if (i+1  == user.id) {
                                    System.out.println(osoby[i]);
                                }}}
                            break;
                        case 3:
                            System.out.println(" 3: wyswietlenie wolnych pomieszczen ");
                            int warehouseNr;
                            System.out.println(" podaj numer magazynu lub wcisnij  0 (ZERO)  aby wyswietlic wszystkie wolne pomieszczenia  ");
                            warehouseNr= scan.nextInt();
                            if(warehouseNr==0)
                            {
                                for(int i=0;i<consWare.length;i++){
                                    if(consWare[i].czyWolne){
                                        System.out.println(consWare[i]);
                                    }
                                }}else
                            sprawdzCzyWolne(consWare,warehouseNr);

                            break;
                        case 4:
                            System.out.println(" 4: wynajecie nowego pomieszczenia( po uprzednim wybraniu) ");
                            System.out.println();
                            System.out.println("Wolne magazyny do wynajecia");
                            System.out.println();
                            for(int i=0;i<consWare.length;i++){
                                if(consWare[i].czyWolne){
                                    System.out.println(consWare[i]);
                                }}
                            System.out.println();
                            System.out.println(" podaj numer magazynu :");
                            warehouseNr = scan.nextInt()-1;

                            if(user==null){
                                System.out.println(" Prosze sie zalogowac ");
                            }
                            else if((user!=null)&&(sprawdzCzyWolne(consWare,warehouseNr))){
                                System.out.println();
                                System.out.println(" Czy wynajmujemy ? (1) TAK , (kazdy inny znak) NIE ");
                                int a=scan.nextInt();
                                if(a==1)
                                {
                                    RentWarehouse rw=new RentWarehouse(user,consWare[warehouseNr]);
                                    Thread thread1 = new Thread(rw);
                                    thread1.start();
                                }
                                else{
                                    break;}
                            }

                            break;

                case 5:
                    System.out.println(" 5 :  udostepnianie kluczy ");

                    System.out.println("podaj nr osoby ktorej udostepnimy pomieszczenie ");
                    System.out.println();
                    for(int i=0;i< osoby.length;i++){
                        if(i==user.id-1){
                            System.out.println((user.id)+".");}
                        else{
                    System.out.print((i+1)+"."+" ");
                    System.out.println(osoby[i]);}}
                    System.out.println();
                    int p= scan.nextInt()-1;
                    Person osoba=null;
                    for(int i=0;i< osoby.length;i++){
                        if(i==p)
                            osoba=osoby[i];}
                    System.out.println(osoba);
                    System.out.println("Ktore pomieszczenie chcesz udostepnic ?");
                    user.showUserWarehouse1();
                    int m= scan.nextInt()-1;
                    assert osoba != null;
                    osoba.addWrehouse(user.getConsumerWarehouse(m));
                    System.out.println();
                    osoba.showUserWarehouse();;

                    break;
                        case 6:
                            System.out.println(" 6: wynajecie miejsca parkingowego");
                            System.out.println();

                            System.out.println( " Niewynajete wolne miejsca parkingowe ");
                            System.out.println();
                            for(int i =0;i< parking.length;i++){
                                if(parking[i].isFreee){
                                    System.out.print((i+1)+"."+" ");
                                System.out.print( parking[i]+"\n");
                            }}
                            System.out.println();
                            System.out.println("Prosze podac numer miejsca  parkingowego");
                            int nrPark;
                            nrPark=scan.nextInt();
                            if(user==null){
                                System.out.println(" Prosze sie zalogowac ");
                            }
                            else if((user!=null)&&(sprawdzCzyWolnyParking(parking,nrPark))){
                                System.out.println();
                                System.out.println(" Czy wynajmujemy ? (1) TAK , (kazdy inny znak) NIE ");
                                int a=scan.nextInt();
                                if(a==1){
                                    user.addParking(parking[nrPark-1]);
                                    parking[nrPark-1].isFreee=false;
                                    System.out.println(" Miejsce parkingowe nr "+ nrPark + " " +"zostalo wynajete "+" " +user.imie+" "+user.nazwisko);}
                                else{
                                    break;}
                            }

                            break;
                        case 7:
                            System.out.println(" 7: pokazanie pomieszczenia ktore wynajmuje dana osoba i wyswietlenie jego zawartosci");
                            if(user!=null){
                                System.out.println(" pomieszczenia wynajmowane ");
                                System.out.println();
                                user.showUserWarehouse1();
                                System.out.println(" prosze podac numer pomieszczenia ");
                                int a;
                                a=scan.nextInt()-1;
                                System.out.println(user.getConsumerWarehouse(a));
                                        System.out.println(" wyswietlenie zawartosci wybranego pomieszczenia ");

                                System.out.println(user.getConsumerWarehouse(a).getItemWarehouseList());
                            }else{
                                System.out.println(" Prosze sie zalogowac ");}
                            break;
                        case 8:
                            System.out.println(" 8: wlozenie nowych przedmiotow do pomieszczenia");
                            System.out.println();
                            System.out.println("Posiadasz nastepujace przedmioty ");
                            if(user!=null){
                            user.showUserItem1();
                            System.out.println();
                            System.out.println(" podaj numer przedmiotu");
                            int a;
                            a= scan.nextInt()-1;
                            System.out.println(user.getItemFromItemList(a));


                                System.out.println("Dostepne magazyny ");
                            user.showUserWarehouse1();
                                System.out.println();
                                System.out.println("podaj nr magazynu do ktorego wlozyc wybrany przedmiot ");
                                int b;
                                b=scan.nextInt()-1;
                                System.out.println(user.getConsumerWarehouse(b));

    if(user.checkSize((ConsumerWarehouse)user.getConsumerWarehouse(b),user.getItemFromItemList(a))){
        System.out.println("Remove some old items to insert a new item");
   break; }
                //throw new ToManyThingsException("Remove some old items to insert a new item");}




                           user.addItemsToWarehouse(user.getItemFromItemList(a),user.getConsumerWarehouse(b));
                            user.getConsumerItemsList().remove(user.getItemFromItemList(a));
                            }else{
                                System.out.println(" Prosze sie zalogowac ");}


                            break;
                        case 9:
                            System.out.println(" 9: zaparkowanie pojazdu");






                            break;
                        case 10:
                            System.out.println(" 10: wyjecie przedmiotow z magazynu");
                            if(user!=null){
                                System.out.println();
                                user.showUserItemInWarehouse();
                                System.out.println();

                                System.out.println();
                                System.out.println(" podaj numer magazynu ");
                                int a;
                                a= scan.nextInt()-1;
                                System.out.println();
                                System.out.println(user.getConsumerWarehouse(a));
                                System.out.println();
                                ConsumerWarehouse lager=(ConsumerWarehouse)user.getConsumerWarehouse(a);
                                System.out.println(user.getConsumerWarehouse(a).getItemWarehouseList());
                                System.out.println();
                                System.out.println(" wybierz przedmiot ktory chcesz usunac z tego magazynu ");
                                System.out.println();
                                int b;
                                b=scan.nextInt()-1;
                                lager.itemWarehouseList.get(b);
                                lager.itemWarehouseList.remove(lager.itemWarehouseList.get(b));
                               // Item thing=lager.itemWarehouseList.get(b);
                                //user.addItems(thing);


                            }else{
                                System.out.println(" Prosze sie zalogowac ");}



                            break;
                        case 11:
                            System.out.println(" 11: naprawa samochodu wlasnorecznie na stanowisku samoobslugowym");
                            if(user!=null) {
                                if (user.consumerCarList.isEmpty()) {
                                    System.out.println(" nie posiadasz samochodu");
                                    break;
                                }
                                System.out.println(" prosze podac pojazd ");
                                user.showUserCars();

                                System.out.println("podaj auto");
                                int x = scan.nextInt() - 1;
                                user.getCarFromItemList(x);
                                Item pojazd = user.getCarFromItemList(x);
                                System.out.println("sprawdzenie czy sa wolne miejsca w serwisie ");
if(ics.selflift[0]==null) {
    System.out.println("Stanowisko jest wolne ");
}else{
        System.out.println("prosze sprobowac pozniej ");
        break;}
    IndependentRepair icr=new IndependentRepair(ics,pojazd);
    Thread thread2 = new Thread(icr);
    thread2.start();
                            }else{
                                    System.out.println(" prosze sie zalogowac ");}
                            break;
                        case 12:
                            System.out.println(" 12: rozpoczecie naprawy");
                            if(user!=null){
                                if(user.consumerCarList.isEmpty()){
                                    System.out.println(" nie posiadasz samochodu");
                                    break;
                                }
                                System.out.println(" prosze podac pojazd ");
                                user.showUserCars();

                                System.out.println("podaj auto");
                                int x= scan.nextInt()-1;
                                user.getCarFromItemList(x);
                                Item pojazd=user.getCarFromItemList(x);



                                System.out.println("sprawdzenie czy sa wolne miejsca w serwisie ");
                                for(int i=0;i<serviceSpots.length;i++){
                                    if(serviceSpots[i].lift[0]==null )//isFree=true)
                                    System.out.println((i+1)+" "+serviceSpots[i]+'\n');}

                                System.out.println(" podaj nr stanowiska");
                                int stan = scan.nextInt()-1;
                                CarServiceSpot cs=serviceSpots[stan];

                               // sprawdzCzyWolneStanowiskoSerwisowe(serviceSpots,stan);




                                System.out.println();

                                for(int j=0;j<serviceSpots.length;j++){
                                    if(serviceSpots[j].isFree=false){
                                        System.out.println((j+1)+" "+serviceSpots[j]+'\n');}}
                                System.out.println();
                                System.out.println(serviceSpots[stan]);




                            CarRepair cr=new CarRepair(cs,pojazd);
                            Thread thread = new Thread(cr);
                            thread.start();}

                            else{
                                System.out.println(" prosze sie zalogowac ");}

                            break;
                        case 13:
                            System.out.println(" 13: zapis stanu aplikacji do pliku");

                            int choice=0;

                            while(choice!=3){
                            System.out.println();
                            System.out.println(" 1.  Zapis do pliku warehouses.txt  informacji o stanie magazynow.");
                            System.out.println();
                            System.out.println(" 2.  Zapis do pliku services.txt informacji o stanie serwisu. ");
                                System.out.println();
                                System.out.println(" 3. Wyjscie do menu glownego ");
                            choice = scan.nextInt();
                            switch (choice) {
                                case 1:

                                    PrintWriter pw = null;

                                    try {
                                        pw = new PrintWriter("warehouse.txt");
                                        pw.print(user.showUserWarehouse2());
                                    } finally {
                                        if (pw != null) {
                                            pw.close();
                                        }
                                    }
                                    break;
                                case 2:

                                    PrintWriter pw1 = null;
                                    System.out.println(serviceSpots[0]);
                                    try {
                                        pw1 = new PrintWriter("services.txt");
                                        pw1.print(serviceSpots[0]);
                                    } finally {
                                        if (pw1 != null) {
                                            pw1.close();
                                        }
                                    }
                                    break;
                                case 3:
                                    choice=3;
                                default:
                                    System.out.println("prosze podac wlasciwa opcje");
                                    System.out.println();

                            }}




                        case 14:
                            System.out.println(" 14: wyswietlenie menu");
                            menu();
                            System.out.println();
                            break;
                case 15:
                    user=null;
                    System.out.println(" Zostales wylogowany ");
                    break;
                        case 16:
                            System.out.println(" 16: zakonczenie programu");
                            opcja=16;
                            break;

                        default:
                            System.out.println("prosze podac wlasciwa opcje");

                    }


            }


        }
        public static void menu () {

            System.out.println();

            System.out.println();
            System.out.println("Prosze wybrac nastepujaca opcje :");
            System.out.println(" 1: wskazanie osoby (nr personalny) ");
            System.out.println(" 2: wypisanie danych osobowych uzytkownika ");
            System.out.println(" 3: wyswietlenie wolnych pomieszczen ");
            System.out.println(" 4: wynajecie nowego pomieszczenia( po uprzednim wybraniu) ");
            System.out.println(" 5: udostepnianie pomieszczenia innej osobie niz wynajmujacy ");
            System.out.println(" 6: wynajecie miejsca parkingowego " );
            System.out.println(" 7: pokazanie pomieszczenia ktore wynajmuje dana osoba i wyswietlenie jego zawartosci ");
            System.out.println(" 8: wlozenie nowych przedmiotow do pomieszczenia ");
            System.out.println(" 9: zaparkowanie pojazdu ");
            System.out.println(" 10: wyjecie przedmiotow z magazynu ");
            System.out.println(" 11: naprawa samochodu wlasnorecznie");
            System.out.println(" 12: rozpoczecie naprawy");
            System.out.println(" 13: zapis stanu aplikacji do pliku");
            System.out.println(" 14: wyswietlenie menu");
            System.out.println(" 15: wylogowanie ");
            System.out.println(" 16: zakonczenie programu");
            System.out.println();
        }

public static boolean sprawdzCzyWolne(ConsumerWarehouse consWare[],int warehouseNr) {

boolean czyDostepne=true;
        if (warehouseNr<0){
        System.out.println("nie ma takiego pomieszczenia");
        czyDostepne=false;}
             else if (warehouseNr > consWare.length){
        System.out.println("nie ma takiego pomieszczenia");
    czyDostepne=false;}
    else if (consWare[warehouseNr].czyWolne) {
        System.out.println("Pomieszczenie numer : " + consWare[warehouseNr]);
            czyDostepne=true;
    } else {
        System.out.println(" Pomieszczenie wynajete");
            czyDostepne=false;
    }
return czyDostepne;}


    public static boolean sprawdzCzyWolnyParking(ParkingSpace []parking,int nrPark) {

        boolean czyDostepne=true;
        if (nrPark<=0){
            System.out.println("nie ma takiego miejsca parkingowego !");
            czyDostepne=false;}
        else if (nrPark > parking.length){
            System.out.println("nie ma takiego miejsca parkingowego !");
            czyDostepne=false;}
        else if (parking[nrPark - 1].isFreee) {
            System.out.println("Dostepne " + parking[nrPark - 1]);
            czyDostepne=true;
        } else {
            System.out.println("Miejsce parkingowe zajete ");
            czyDostepne=false;
        }
        return czyDostepne;}


    public static boolean sprawdzCzyWolneStanowiskoSerwisowe(CarServiceSpot []serviceSpots,int nrStan) {

        boolean czyDostepne=true;
        if (nrStan<=0){
            System.out.println("nie ma takiego miejsca parkingowego ");
            czyDostepne=false;}
        else if (nrStan > serviceSpots.length){
            System.out.println("nie ma takiego miejsca parkingowego ");
            czyDostepne=false;}
        else if (serviceSpots[nrStan - 1].isFree) {
            System.out.println("Miejsce parkingowe dostepne :" + serviceSpots[nrStan - 1]);
            czyDostepne=true;
        } else {
            System.out.println("Miejsce parkingowe zajete ");
            czyDostepne=false;
        }
        return czyDostepne;}

}
