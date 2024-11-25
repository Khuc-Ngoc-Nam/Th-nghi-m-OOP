package hust.soict.dsai.test.disc;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class TestPassingParameter {
    public static void main(String[] args) {
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

        DigitalVideoDisc[] dvds = {jungleDVD, cinderellaDVD};
        // swap(dvds);
        swap(jungleDVD, cinderellaDVD);
        //jungleDVD = dvds[0];
        //cinderellaDVD = dvds[1];
        System.out.println("jungle dvd title: " + dvds[0].getTitle());
        System.out.println("cinderella dvd title: " + dvds[1].getTitle());

        changeTitle(jungleDVD, cinderellaDVD.getTitle());
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
    }

    public static void swap(Object o1, Object o2){
        Object tmp = o1;
        o1 = o2;
        o2 = tmp;
    }

    /* Swap method code can correctly swap two objects
    public static void swap (hust.soict.cybersec.aims.disc.DigitalVideoDisc o1, hust.soict.cybersec.aims.disc.DigitalVideoDisc o2){
        String tmp = o1.getTitle();
        o1.setTitle(o2.getTitle());
        o2.setTitle(tmp);
    }
    */
    
    public static void changeTitle(DigitalVideoDisc dvd, String title) {
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle);
    }
}
